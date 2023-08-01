// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class LogGroup extends TeaModel {
    @NameInMap("LogTags")
    public LogTag logTags;

    @NameInMap("Logs")
    public LogItem logs;

    @NameInMap("Source")
    public String source;

    @NameInMap("Topic")
    public String topic;

    public static LogGroup build(java.util.Map<String, ?> map) throws Exception {
        LogGroup self = new LogGroup();
        return TeaModel.build(map, self);
    }

    public LogGroup setLogTags(LogTag logTags) {
        this.logTags = logTags;
        return this;
    }
    public LogTag getLogTags() {
        return this.logTags;
    }

    public LogGroup setLogs(LogItem logs) {
        this.logs = logs;
        return this;
    }
    public LogItem getLogs() {
        return this.logs;
    }

    public LogGroup setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public LogGroup setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
