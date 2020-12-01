package carmen

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [GsonAutoConfiguration::class])
class MainApplication

fun main(args: Array<String>) {
    runApplication<MainApplication>(*args)
}
