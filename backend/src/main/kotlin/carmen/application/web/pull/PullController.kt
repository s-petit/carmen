package carmen.application.web.pull

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/pulls")
class PullController {
    @GetMapping("/list")
    fun list(): List<Pull> = listOf(
            Pull("feature lol", "pocket"),
            Pull("feature 2", "vulcain")
    )

}