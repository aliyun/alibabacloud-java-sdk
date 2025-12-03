// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class CreateVmcoreDiagnosisTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://bucket-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/debuginfo-common/file/path">https://bucket-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/debuginfo-common/file/path</a></p>
     */
    @NameInMap("debuginfoCommonUrl")
    public String debuginfoCommonUrl;

    /**
     * <strong>example:</strong>
     * <p><a href="https://bucket-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/debuginfo/file/path">https://bucket-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/debuginfo/file/path</a></p>
     */
    @NameInMap("debuginfoUrl")
    public String debuginfoUrl;

    /**
     * <strong>example:</strong>
     * <p><a href="https://bucket-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/dmesg/file/path">https://bucket-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/dmesg/file/path</a></p>
     */
    @NameInMap("dmesgUrl")
    public String dmesgUrl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vmcore</p>
     */
    @NameInMap("taskType")
    public String taskType;

    /**
     * <strong>example:</strong>
     * <p><a href="https://bucket-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/vmcore/file/path">https://bucket-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/vmcore/file/path</a></p>
     */
    @NameInMap("vmcoreUrl")
    public String vmcoreUrl;

    public static CreateVmcoreDiagnosisTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVmcoreDiagnosisTaskRequest self = new CreateVmcoreDiagnosisTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateVmcoreDiagnosisTaskRequest setDebuginfoCommonUrl(String debuginfoCommonUrl) {
        this.debuginfoCommonUrl = debuginfoCommonUrl;
        return this;
    }
    public String getDebuginfoCommonUrl() {
        return this.debuginfoCommonUrl;
    }

    public CreateVmcoreDiagnosisTaskRequest setDebuginfoUrl(String debuginfoUrl) {
        this.debuginfoUrl = debuginfoUrl;
        return this;
    }
    public String getDebuginfoUrl() {
        return this.debuginfoUrl;
    }

    public CreateVmcoreDiagnosisTaskRequest setDmesgUrl(String dmesgUrl) {
        this.dmesgUrl = dmesgUrl;
        return this;
    }
    public String getDmesgUrl() {
        return this.dmesgUrl;
    }

    public CreateVmcoreDiagnosisTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public CreateVmcoreDiagnosisTaskRequest setVmcoreUrl(String vmcoreUrl) {
        this.vmcoreUrl = vmcoreUrl;
        return this;
    }
    public String getVmcoreUrl() {
        return this.vmcoreUrl;
    }

}
