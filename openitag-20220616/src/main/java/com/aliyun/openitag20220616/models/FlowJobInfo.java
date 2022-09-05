// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class FlowJobInfo extends TeaModel {
    @NameInMap("Display")
    public Boolean display;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("JobType")
    public String jobType;

    @NameInMap("MessageId")
    public String messageId;

    @NameInMap("ProcessType")
    public String processType;

    @NameInMap("TaskId")
    public String taskId;

    public static FlowJobInfo build(java.util.Map<String, ?> map) throws Exception {
        FlowJobInfo self = new FlowJobInfo();
        return TeaModel.build(map, self);
    }

    public FlowJobInfo setDisplay(Boolean display) {
        this.display = display;
        return this;
    }
    public Boolean getDisplay() {
        return this.display;
    }

    public FlowJobInfo setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public FlowJobInfo setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public FlowJobInfo setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public FlowJobInfo setProcessType(String processType) {
        this.processType = processType;
        return this;
    }
    public String getProcessType() {
        return this.processType;
    }

    public FlowJobInfo setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
