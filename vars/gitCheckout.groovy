def call(Map stageParams) {

checkout([
    $class: 'GitSCM',
    branches: [[name: stageParams.branch ]],
    UserRemoteConfig: [[ url: stageParams.url]]
])
}