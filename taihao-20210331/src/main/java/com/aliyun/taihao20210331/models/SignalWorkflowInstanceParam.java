// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class SignalWorkflowInstanceParam extends TeaModel {
    // ActivityEndStatus
    @NameInMap("activityEndStatus")
    public String activityEndStatus;

    // DelayMills
    @NameInMap("delayMills")
    public Long delayMills;

    // SignalBizCodeCollection
    @NameInMap("signalBizCodeCollection")
    public java.util.List<String> signalBizCodeCollection;

    // WorkflowInstanceId
    @NameInMap("workflowInstanceId")
    public Long workflowInstanceId;

    public static SignalWorkflowInstanceParam build(java.util.Map<String, ?> map) throws Exception {
        SignalWorkflowInstanceParam self = new SignalWorkflowInstanceParam();
        return TeaModel.build(map, self);
    }

    public SignalWorkflowInstanceParam setActivityEndStatus(String activityEndStatus) {
        this.activityEndStatus = activityEndStatus;
        return this;
    }
    public String getActivityEndStatus() {
        return this.activityEndStatus;
    }

    public SignalWorkflowInstanceParam setDelayMills(Long delayMills) {
        this.delayMills = delayMills;
        return this;
    }
    public Long getDelayMills() {
        return this.delayMills;
    }

    public SignalWorkflowInstanceParam setSignalBizCodeCollection(java.util.List<String> signalBizCodeCollection) {
        this.signalBizCodeCollection = signalBizCodeCollection;
        return this;
    }
    public java.util.List<String> getSignalBizCodeCollection() {
        return this.signalBizCodeCollection;
    }

    public SignalWorkflowInstanceParam setWorkflowInstanceId(Long workflowInstanceId) {
        this.workflowInstanceId = workflowInstanceId;
        return this;
    }
    public Long getWorkflowInstanceId() {
        return this.workflowInstanceId;
    }

}
