// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class LogConfig extends TeaModel {
    @NameInMap("enableInstanceMetrics")
    public Boolean enableInstanceMetrics;

    @NameInMap("enableRequestMetrics")
    public Boolean enableRequestMetrics;

    @NameInMap("logBeginRule")
    public String logBeginRule;

    @NameInMap("logstore")
    public String logstore;

    @NameInMap("project")
    public String project;

    @NameInMap("pushToUserSLS")
    public Boolean pushToUserSLS;

    public static LogConfig build(java.util.Map<String, ?> map) throws Exception {
        LogConfig self = new LogConfig();
        return TeaModel.build(map, self);
    }

    public LogConfig setEnableInstanceMetrics(Boolean enableInstanceMetrics) {
        this.enableInstanceMetrics = enableInstanceMetrics;
        return this;
    }
    public Boolean getEnableInstanceMetrics() {
        return this.enableInstanceMetrics;
    }

    public LogConfig setEnableRequestMetrics(Boolean enableRequestMetrics) {
        this.enableRequestMetrics = enableRequestMetrics;
        return this;
    }
    public Boolean getEnableRequestMetrics() {
        return this.enableRequestMetrics;
    }

    public LogConfig setLogBeginRule(String logBeginRule) {
        this.logBeginRule = logBeginRule;
        return this;
    }
    public String getLogBeginRule() {
        return this.logBeginRule;
    }

    public LogConfig setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public LogConfig setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public LogConfig setPushToUserSLS(Boolean pushToUserSLS) {
        this.pushToUserSLS = pushToUserSLS;
        return this;
    }
    public Boolean getPushToUserSLS() {
        return this.pushToUserSLS;
    }

}
