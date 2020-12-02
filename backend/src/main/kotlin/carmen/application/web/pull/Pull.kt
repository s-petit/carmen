package carmen.application.web.pull

import com.fasterxml.jackson.annotation.JsonProperty

data class Pull(
         val title: String,
         val repo: String
) {

    @JsonProperty("ticket")
    fun ticket(): String {
        val fromLiteral = Regex("""(fix|feat)\((.+)\):""")
        val find = fromLiteral.find(title)
        return find?.groupValues?.get(2) ?:""
    }

    //TODO aggreger les PR qui ont le meme numero de ticket !
    // TODO CSS
    // faire matcher le PR env et le ticket : il ne doit en rester qu'un
    fun prEnv(): String {
        val fromLiteral = Regex("""\[DEPLOY_PR\]\[(.+)\]""")
        val find = fromLiteral.find(title)
        return find?.groupValues?.get(1)?.replace("-", "") ?: ""
    }

    @JsonProperty("jiraUrl")
    fun jiraUrl(): String = if (ticket().isBlank()) "" else "https://bugs.vidal.fr/browse/${ticket()}"

    @JsonProperty("prUrl")
    fun prUrl(): String = if (prEnv().isBlank()) "" else "http://${repo}-${prEnv()}.dockerbo.vidal.net/"
}