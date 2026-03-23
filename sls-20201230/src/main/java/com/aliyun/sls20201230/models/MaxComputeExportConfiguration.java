// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class MaxComputeExportConfiguration extends TeaModel {
    /**
     * <p>时间范围开始，值设为1则表示将从日志库中第一条数据开始</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1718380800</p>
     */
    @NameInMap("fromTime")
    public Long fromTime;

    /**
     * <p>Logstore名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-logstore</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
     * <p>读SLS RAM角色roleArn，请填写您自己的角色roleArn</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1234567890:role/aliyunlogdefaultrole</p>
     */
    @NameInMap("roleArn")
    public String roleArn;

    /**
     * <p>投递MaxCompute配置</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("sink")
    public MaxComputeExportConfigurationSink sink;

    /**
     * <p>时间范围结束，值设为0则表示任务会一直运行，除非任务被手动停止。</p>
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
