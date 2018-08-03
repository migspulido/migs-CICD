node("migscicd") {
    git url: "https://github.com/migspulido/${serviceName}.git"
    dockerFlow(serviceName, ["deploy", "proxy", "stop-old"])
}