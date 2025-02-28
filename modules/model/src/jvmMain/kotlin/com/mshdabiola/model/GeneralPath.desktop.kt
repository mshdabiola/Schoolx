package com.mshdabiola.model

actual val generalPath: String
    get() = System.getProperty("java.io.tmpdir") + "/schoolxs" // "${System.getProperty("user.home")}/AppData/Local/schoolx"
