node("migscicd") {
    git url: "https://github.com/migspulido/${serviceName}.git"
    dockerFlow(serviceName, ["scale", "proxy"], ["--scale=\"" + scale + "\""])
}