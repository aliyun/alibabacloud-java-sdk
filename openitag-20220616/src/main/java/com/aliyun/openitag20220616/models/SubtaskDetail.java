// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class SubtaskDetail extends TeaModel {
    @NameInMap("CanDiscard")
    public Boolean canDiscard;

    @NameInMap("CanReassign")
    public Boolean canReassign;

    @NameInMap("CanRelease")
    public Boolean canRelease;

    @NameInMap("CurrentWorkNode")
    public String currentWorkNode;

    @NameInMap("ExtConfigs")
    public String extConfigs;

    @NameInMap("Items")
    public java.util.List<SubtaskDetailItems> items;

    @NameInMap("Status")
    public String status;

    @NameInMap("SubtaskId")
    public String subtaskId;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("Weight")
    public Long weight;

    @NameInMap("WorkNodeState")
    public String workNodeState;

    @NameInMap("Workforce")
    public java.util.List<Workforce> workforce;

    public static SubtaskDetail build(java.util.Map<String, ?> map) throws Exception {
        SubtaskDetail self = new SubtaskDetail();
        return TeaModel.build(map, self);
    }

    public SubtaskDetail setCanDiscard(Boolean canDiscard) {
        this.canDiscard = canDiscard;
        return this;
    }
    public Boolean getCanDiscard() {
        return this.canDiscard;
    }

    public SubtaskDetail setCanReassign(Boolean canReassign) {
        this.canReassign = canReassign;
        return this;
    }
    public Boolean getCanReassign() {
        return this.canReassign;
    }

    public SubtaskDetail setCanRelease(Boolean canRelease) {
        this.canRelease = canRelease;
        return this;
    }
    public Boolean getCanRelease() {
        return this.canRelease;
    }

    public SubtaskDetail setCurrentWorkNode(String currentWorkNode) {
        this.currentWorkNode = currentWorkNode;
        return this;
    }
    public String getCurrentWorkNode() {
        return this.currentWorkNode;
    }

    public SubtaskDetail setExtConfigs(String extConfigs) {
        this.extConfigs = extConfigs;
        return this;
    }
    public String getExtConfigs() {
        return this.extConfigs;
    }

    public SubtaskDetail setItems(java.util.List<SubtaskDetailItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<SubtaskDetailItems> getItems() {
        return this.items;
    }

    public SubtaskDetail setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SubtaskDetail setSubtaskId(String subtaskId) {
        this.subtaskId = subtaskId;
        return this;
    }
    public String getSubtaskId() {
        return this.subtaskId;
    }

    public SubtaskDetail setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public SubtaskDetail setWeight(Long weight) {
        this.weight = weight;
        return this;
    }
    public Long getWeight() {
        return this.weight;
    }

    public SubtaskDetail setWorkNodeState(String workNodeState) {
        this.workNodeState = workNodeState;
        return this;
    }
    public String getWorkNodeState() {
        return this.workNodeState;
    }

    public SubtaskDetail setWorkforce(java.util.List<Workforce> workforce) {
        this.workforce = workforce;
        return this;
    }
    public java.util.List<Workforce> getWorkforce() {
        return this.workforce;
    }

    public static class SubtaskDetailItems extends TeaModel {
        @NameInMap("AbandonFlag")
        public Boolean abandonFlag;

        @NameInMap("AbandonRemark")
        public String abandonRemark;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("FeedbackFlag")
        public Boolean feedbackFlag;

        @NameInMap("FeedbackRemark")
        public String feedbackRemark;

        @NameInMap("FixedFlag")
        public Boolean fixedFlag;

        @NameInMap("Mine")
        public Long mine;

        @NameInMap("RejectFlag")
        public Boolean rejectFlag;

        @NameInMap("State")
        public String state;

        @NameInMap("Weight")
        public Long weight;

        public static SubtaskDetailItems build(java.util.Map<String, ?> map) throws Exception {
            SubtaskDetailItems self = new SubtaskDetailItems();
            return TeaModel.build(map, self);
        }

        public SubtaskDetailItems setAbandonFlag(Boolean abandonFlag) {
            this.abandonFlag = abandonFlag;
            return this;
        }
        public Boolean getAbandonFlag() {
            return this.abandonFlag;
        }

        public SubtaskDetailItems setAbandonRemark(String abandonRemark) {
            this.abandonRemark = abandonRemark;
            return this;
        }
        public String getAbandonRemark() {
            return this.abandonRemark;
        }

        public SubtaskDetailItems setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public SubtaskDetailItems setFeedbackFlag(Boolean feedbackFlag) {
            this.feedbackFlag = feedbackFlag;
            return this;
        }
        public Boolean getFeedbackFlag() {
            return this.feedbackFlag;
        }

        public SubtaskDetailItems setFeedbackRemark(String feedbackRemark) {
            this.feedbackRemark = feedbackRemark;
            return this;
        }
        public String getFeedbackRemark() {
            return this.feedbackRemark;
        }

        public SubtaskDetailItems setFixedFlag(Boolean fixedFlag) {
            this.fixedFlag = fixedFlag;
            return this;
        }
        public Boolean getFixedFlag() {
            return this.fixedFlag;
        }

        public SubtaskDetailItems setMine(Long mine) {
            this.mine = mine;
            return this;
        }
        public Long getMine() {
            return this.mine;
        }

        public SubtaskDetailItems setRejectFlag(Boolean rejectFlag) {
            this.rejectFlag = rejectFlag;
            return this;
        }
        public Boolean getRejectFlag() {
            return this.rejectFlag;
        }

        public SubtaskDetailItems setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public SubtaskDetailItems setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

    }

}
