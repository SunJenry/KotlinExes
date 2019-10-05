fun lables() {
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j > 10) break@loop
        }
    }
}