// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class PutWebtrackingRequest extends TeaModel {
    @NameInMap("__logs__")
    public java.util.List<java.util.Map<String, String>> logs;

    @NameInMap("__source__")
    public String source;

    @NameInMap("__tags__")
    public java.util.Map<String, String> tags;

    @NameInMap("__topic__")
    public String topic;

    public static PutWebtrackingRequest build(java.util.Map<String, ?> map) throws Exception {
        PutWebtrackingRequest self = new PutWebtrackingRequest();
        return TeaModel.build(map, self);
    }

    public PutWebtrackingRequest setLogs(java.util.List<java.util.Map<String, String>> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<java.util.Map<String, String>> getLogs() {
        return this.logs;
    }

    public PutWebtrackingRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public PutWebtrackingRequest setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, String> getTags() {
        return this.tags;
    }

    public PutWebtrackingRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
