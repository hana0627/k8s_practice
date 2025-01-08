package hana.k8s.k8s_practice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class K8sPracticeApplication

fun main(args: Array<String>) {
    runApplication<K8sPracticeApplication>(*args)
}
