package carmen.application.web.pull

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/pulls")
class PullController(private val pullRepository: PullRepository) {
    @GetMapping("/list")
    fun list(): List<Pull> = pullRepository.listPulls()
}