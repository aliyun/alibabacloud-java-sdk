// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class MaxComputeExportConfiguration extends TeaModel {
    @NameInMap("fromTime")
    public Long fromTime;

    @NameInMap("logstore")
    public String logstore;

    @NameInMap("roleArn")
    public String roleArn;

    @NameInMap("sink")
    public MaxComputeExportConfigurationSink sink;

    @NameInMap("toTime")
    public Long toTime;

    public static MaxComputeExportConfiguration build(java.util.Map<String, ?> map) throws Exception {
        MaxComputeExportConfiguration self = new MaxComputeExportConfiguration();
        return TeaModel.build(map, self);
    }

    public MaxComputeExportConfiguration setFromTime(Long fromTime) {
        this.fromTime = fromTime;
        return this;
    }
    public Long getFromTime() {
        return this.fromTime;
    }

    public MaxComputeExportConfiguration setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public MaxComputeExportConfiguration setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public MaxComputeExportConfiguration setSink(MaxComputeExportConfigurationSink sink) {
        this.sink = sink;
        return this;
    }
    public MaxComputeExportConfigurationSink getSink() {
        return this.sink;
    }

    public MaxComputeExportConfiguration setToTime(Long toTime) {
        this.toTime = toTime;
        return this;
    }
    public Long getToTime() {
        return this.toTime;
    }

}
