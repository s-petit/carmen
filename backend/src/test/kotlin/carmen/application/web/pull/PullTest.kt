package carmen.application.web.pull

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PullTest {

    @Test
    fun `should parse ticket number `() {
        val tit = "feat(NEMO-248): fix this"
        val ticketNumber = Pull(tit, "prout").ticket()
        assertThat(ticketNumber).isEqualTo("NEMO-248")
    }

    @Test
    fun `should parse pr url `() {
        val tit = "feat(NEMO-248): fix this [DEPLOY_PR][pr-env]"
        val prEnv = Pull(tit, "nemo").prUrl()
        assertThat(prEnv).isEqualTo("http://nemo-prenv.dockerbo.vidal.net/")
    }

}