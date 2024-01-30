fun main(){
    val x = readLine()
    val max = -1000
    while x != 'стоп'{
        if (x.toInt() > max){max = x}
    }
    return max
}
