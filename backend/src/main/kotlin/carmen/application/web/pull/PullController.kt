package carmen.application.web.pull

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/pulls")
class PullController {
    @GetMapping("/list")
    fun list(): String = "plop"
}