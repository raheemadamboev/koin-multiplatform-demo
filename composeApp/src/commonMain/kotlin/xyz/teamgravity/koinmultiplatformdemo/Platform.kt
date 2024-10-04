package xyz.teamgravity.koinmultiplatformdemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform