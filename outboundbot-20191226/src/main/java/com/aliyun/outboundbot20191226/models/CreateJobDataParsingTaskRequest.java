// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateJobDataParsingTaskRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

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
