// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ETLConfiguration extends TeaModel {
    @NameInMap("accessKeyId")
    @Deprecated
    public String accessKeyId;

    @NameInMap("accessKeySecret")
    @Deprecated
    public String accessKeySecret;

    @NameInMap("fromTime")
    public Long fromTime;

    @NameInMap("logstore")
    public String logstore;

    @NameInMap("parameters")
    public java.util.Map<String, ?> parameters;

    @NameInMap("roleArn")
    public String roleArn;

    @NameInMap("script")
    public String script;

    @NameInMap("sinks")
    public java.util.List<ETLConfigurationSink> sinks;

    @NameInMap("toTime")
    public Long toTime;

    public static ETLConfiguration build(java.util.Map<String, ?> map) throws Exception {
        ETLConfiguration self = new ETLConfiguration();
        return TeaModel.build(map, self);
    }

    public ETLConfiguration setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public ETLConfiguration setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
        return this;
    }
    public String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    public ETLConfiguration setFromTime(Long fromTime) {
        this.fromTime = fromTime;
        return this;
    }
    public Long getFromTime() {
        return this.fromTime;
    }

    public ETLConfiguration setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public ETLConfiguration setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public ETLConfiguration setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public ETLConfiguration setScript(String script) {
        this.script = script;
        return this;
    }
    public String getScript() {
        return this.script;
    }

    public ETLConfiguration setSinks(java.util.List<ETLConfigurationSink> sinks) {
        this.sinks = sinks;
        return this;
    }
    public java.util.List<ETLConfigurationSink> getSinks() {
        return this.sinks;
    }

    public ETLConfiguration setToTime(Long toTime) {
        this.toTime = toTime;
        return this;
    }
    public Long getToTime() {
        return this.toTime;
    }

}
