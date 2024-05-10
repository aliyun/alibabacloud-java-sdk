// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class PutWebtrackingRequest extends TeaModel {
    /**
     * <p>The logs. Each element is a JSON object that indicates a log.</p>
     * <br>
     * <p>>  **Note**: The time in a log that is collected by using the web tracking feature is the time at which Simple Log Service receives the log. You do not need to configure the __time__ field for each log. If this field exists, it is overwritten by the time at which Simple Log Service receives the log.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("__logs__")
    public java.util.List<java.util.Map<String, String>> logs;

    /**
     * <p>The source of the logs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("__source__")
    public String source;

    /**
     * <p>The tags of the logs.</p>
     */
    @NameInMap("__tags__")
    public java.util.Map<String, String> tags;

    /**
     * <p>The topic of the logs.</p>
     */
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
