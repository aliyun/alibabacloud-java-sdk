// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class CreateVmcoreDiagnosisTaskRequest extends TeaModel {
    /**
     * <p>The download URL of the debuginfo-common file. This parameter is optional when the diagnostic type is vmcore.</p>
     * <p>For CentOS or Alinux kernels, the corresponding debuginfo-common file is automatically downloaded, and you do not need to specify this parameter. For other distribution kernels, manually provide the download URL of the debuginfo-common file that corresponds to the kernel version.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://bucket-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/debuginfo-common/file/path">https://bucket-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/debuginfo-common/file/path</a></p>
     */
    @NameInMap("debuginfoCommonUrl")
    public String debuginfoCommonUrl;

    /**
     * <p>The download URL of the debuginfo file. This parameter is optional when the diagnostic type is vmcore.</p>
     * <p>For CentOS or Alinux kernels, the corresponding debuginfo file is automatically downloaded, and you do not need to specify this parameter. For other distribution kernels, manually provide the download URL of the debuginfo file that corresponds to the kernel version.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://bucket-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/debuginfo/file/path">https://bucket-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/debuginfo/file/path</a></p>
     */
    @NameInMap("debuginfoUrl")
    public String debuginfoUrl;

    /**
     * <p>The download URL of the dmesg log file. This parameter is required when the diagnostic type is dmesg.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://bucket-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/dmesg/file/path">https://bucket-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/dmesg/file/path</a></p>
     */
    @NameInMap("dmesgUrl")
    public String dmesgUrl;

    /**
     * <p>The task type. Valid values:</p>
     * <ul>
     * <li>vmcore: vmcore file diagnostic task.</li>
     * <li>dmesg: dmesg log diagnostic task.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vmcore</p>
     */
    @NameInMap("taskType")
    public String taskType;

    /**
     * <p>The download URL of the vmcore file. This parameter is required when the diagnostic type is vmcore.</p>
     * 
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
