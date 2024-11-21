// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class LogGroup extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LogItems")
    public java.util.List<LogItem> logItems;

    @NameInMap("LogTags")
    public java.util.List<LogTag> logTags;

    /**
     * <strong>example:</strong>
     * <p>192.1.1.1</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <strong>example:</strong>
     * <p>topic-test</p>
     */
    @NameInMap("Topic")
    public String topic;

    public static LogGroup build(java.util.Map<String, ?> map) throws Exception {
        LogGroup self = new LogGroup();
        return TeaModel.build(map, self);
    }

    public LogGroup setLogItems(java.util.List<LogItem> logItems) {
        this.logItems = logItems;
        return this;
    }
    public java.util.List<LogItem> getLogItems() {
        return this.logItems;
    }

    public LogGroup setLogTags(java.util.List<LogTag> logTags) {
        this.logTags = logTags;
        return this;
    }
    public java.util.List<LogTag> getLogTags() {
        return this.logTags;
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
