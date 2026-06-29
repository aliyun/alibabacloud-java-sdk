// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class FlowJobInfo extends TeaModel {
    /**
     * <p>Whether to display. Possible values are:</p>
     * <ul>
     * <li>true: Display.</li>
     * <li>false: Do not display.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Display")
    public Boolean display;

    /**
     * <p>Job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1475***441221943296</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>Task Type. Currently, only DOWNLOWD_MARKRESULT_FLOW is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>DOWNLOWD_MARKRESULT_FLOW</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>Message ID.</p>
     * 
     * <strong>example:</strong>
     * <p>792B76F4000E681A95155146A002D5F8</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    /**
     * <p>Processing information.</p>
     * 
     * <strong>example:</strong>
     * <p>NEW_INIT</p>
     */
    @NameInMap("ProcessType")
    public String processType;

    /**
     * <p>Job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1543***518306500608</p>
     */
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
