// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateJobDataParsingTaskRequest extends TeaModel {
    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b3865dc3-40fa-4afd-9fe4-dc7cda305a24</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Path to the file that contains the job data.</p>
     * <blockquote>
     * <p>This value is the Folder parameter returned by the GetJobDataUploadParams operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UPLOADED/JOB/024f8cf0-c842-4c01-b74b-c8667e4579c7/e5897675-91f0-4e53-8af8-7e1ce4f2c089_KDC HR- 外呼话术2- 外呼名单模板 - Copy.xlsx</p>
     */
    @NameInMap("JobFilePath")
    public String jobFilePath;

    public static CreateJobDataParsingTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobDataParsingTaskRequest self = new CreateJobDataParsingTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobDataParsingTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateJobDataParsingTaskRequest setJobFilePath(String jobFilePath) {
        this.jobFilePath = jobFilePath;
        return this;
    }
    public String getJobFilePath() {
        return this.jobFilePath;
    }

}
