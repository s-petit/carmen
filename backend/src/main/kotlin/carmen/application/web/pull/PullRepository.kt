package carmen.application.web.pull

import org.kohsuke.github.GHIssueState
import org.kohsuke.github.GitHubBuilder
import org.springframework.stereotype.Component


@Component
class PullRepository {

    fun listPulls(): List<Pull> {
        val github = GitHubBuilder()
                .withOAuthToken("", "s-petit").build()


        val repo = "softwarevidal/mono-pocket"
        val repository = github.getRepository(repo)

        val pullRequests = repository.getPullRequests(GHIssueState.OPEN)

        return pullRequests.map { Pull(it.title, it.repository.name) }
    }

}