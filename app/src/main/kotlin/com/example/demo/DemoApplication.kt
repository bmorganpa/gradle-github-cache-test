package com.example.demo

import com.example.modulea.ModuleA
import com.example.moduleb.ModuleB
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
	println(ModuleA("1"))
	println(ModuleB("1"))
	println("CHANGE!")
	runApplication<DemoApplication>(*args)
}
