// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetLinkeLinktWorkflowstatusreachableRequest extends TeaModel {
    @NameInMap("FromStatusId")
    public String fromStatusId;

    @NameInMap("Reachable")
    public String reachable;

    @NameInMap("ToStatusId")
    public String toStatusId;

    @NameInMap("WorkflowId")
    public String workflowId;

    public static SetLinkeLinktWorkflowstatusreachableRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLinkeLinktWorkflowstatusreachableRequest self = new SetLinkeLinktWorkflowstatusreachableRequest();
        return TeaModel.build(map, self);
    }

    public SetLinkeLinktWorkflowstatusreachableRequest setFromStatusId(String fromStatusId) {
        this.fromStatusId = fromStatusId;
        return this;
    }
    public String getFromStatusId() {
        return this.fromStatusId;
    }

    public SetLinkeLinktWorkflowstatusreachableRequest setReachable(String reachable) {
        this.reachable = reachable;
        return this;
    }
    public String getReachable() {
        return this.reachable;
    }

    public SetLinkeLinktWorkflowstatusreachableRequest setToStatusId(String toStatusId) {
        this.toStatusId = toStatusId;
        return this;
    }
    public String getToStatusId() {
        return this.toStatusId;
    }

    public SetLinkeLinktWorkflowstatusreachableRequest setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public String getWorkflowId() {
        return this.workflowId;
    }

}
