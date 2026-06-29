// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class SubtaskDetail extends TeaModel {
    /**
     * <p>is discardable</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CanDiscard")
    public Boolean canDiscard;

    /**
     * <p>Can assign</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CanReassign")
    public Boolean canReassign;

    /**
     * <p>is releasable</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CanRelease")
    public Boolean canRelease;

    /**
     * <p>current File Type</p>
     * 
     * <strong>example:</strong>
     * <p>MARK</p>
     */
    @NameInMap("CurrentWorkNode")
    public String currentWorkNode;

    /**
     * <p>extra parameters</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("ExtConfigs")
    public String extConfigs;

    /**
     * <p>List of items in the sub-job</p>
     */
    @NameInMap("Items")
    public java.util.List<SubtaskDetailItems> items;

    /**
     * <p>status</p>
     * 
     * <strong>example:</strong>
     * <p>FINISHED</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Subtask ID</p>
     * 
     * <strong>example:</strong>
     * <p>1500***457270333440</p>
     */
    @NameInMap("SubtaskId")
    public String subtaskId;

    /**
     * <p>parent job ID of the sub-job</p>
     * 
     * <strong>example:</strong>
     * <p>1511***994667356160</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>Job weight</p>
     * 
     * <strong>example:</strong>
     * <p>631548</p>
     */
    @NameInMap("Weight")
    public Long weight;

    /**
     * <p>Current edge zone status</p>
     * 
     * <strong>example:</strong>
     * <p>FINISHED</p>
     */
    @NameInMap("WorkNodeState")
    public String workNodeState;

    /**
     * <p>list of annotators assigned to the sub-job</p>
     */
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
        /**
         * <p>Abandon mark</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("AbandonFlag")
        public Boolean abandonFlag;

        /**
         * <p>discard reason</p>
         * 
         * <strong>example:</strong>
         * <p>原始数据错误</p>
         */
        @NameInMap("AbandonRemark")
        public String abandonRemark;

        /**
         * <p>Date ID</p>
         * 
         * <strong>example:</strong>
         * <p>1957578084</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <p>feedback mark</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("FeedbackFlag")
        public Boolean feedbackFlag;

        /**
         * <p>Validate feedback</p>
         * 
         * <strong>example:</strong>
         * <p>标注内容合格</p>
         */
        @NameInMap("FeedbackRemark")
        public String feedbackRemark;

        /**
         * <p>Failed mark</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("FixedFlag")
        public Boolean fixedFlag;

        /**
         * <p>Is assigned to me</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Mine")
        public Long mine;

        /**
         * <p>skip mark</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("RejectFlag")
        public Boolean rejectFlag;

        /**
         * <p>status</p>
         * 
         * <strong>example:</strong>
         * <p>HANDLING</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>Weight</p>
         * 
         * <strong>example:</strong>
         * <p>311011</p>
         */
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
