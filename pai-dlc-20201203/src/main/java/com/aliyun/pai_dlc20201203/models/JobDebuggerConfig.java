// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class JobDebuggerConfig extends TeaModel {
    // debugger配置信息
    @NameInMap("DebuggerConfigContent")
    public String debuggerConfigContent;

    // debugger配置项ID
    @NameInMap("DebuggerConfigId")
    public String debuggerConfigId;

    // debugger配置创建的时间
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    // 作业ID
    @NameInMap("JobId")
    public String jobId;

    public static JobDebuggerConfig build(java.util.Map<String, ?> map) throws Exception {
        JobDebuggerConfig self = new JobDebuggerConfig();
        return TeaModel.build(map, self);
    }

    public JobDebuggerConfig setDebuggerConfigContent(String debuggerConfigContent) {
        this.debuggerConfigContent = debuggerConfigContent;
        return this;
    }
    public String getDebuggerConfigContent() {
        return this.debuggerConfigContent;
    }

    public JobDebuggerConfig setDebuggerConfigId(String debuggerConfigId) {
        this.debuggerConfigId = debuggerConfigId;
        return this;
    }
    public String getDebuggerConfigId() {
        return this.debuggerConfigId;
    }

    public JobDebuggerConfig setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public JobDebuggerConfig setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
