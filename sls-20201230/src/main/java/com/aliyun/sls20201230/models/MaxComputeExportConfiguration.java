// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class MaxComputeExportConfiguration extends TeaModel {
    /**
     * <p>The beginning of the time range to ship data. The value 1 specifies that the data shipping job ships data from the first log in the Logstore.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1718380800</p>
     */
    @NameInMap("fromTime")
    public Long fromTime;

    /**
     * <p>The name of the Logstore.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-logstore</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the Resource Access Management (RAM) role that is used to read data from Simple Log Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1234567890:role/aliyunlogdefaultrole</p>
     */
    @NameInMap("roleArn")
    public String roleArn;

    /**
     * <p>The configuration of the MaxCompute data shipping job.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("sink")
    public MaxComputeExportConfigurationSink sink;

    /**
     * <p>The end of the time range to ship data. The value 0 specifies that the data shipping job continuously ships data until the job is manually stopped.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1718390800</p>
     */
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
