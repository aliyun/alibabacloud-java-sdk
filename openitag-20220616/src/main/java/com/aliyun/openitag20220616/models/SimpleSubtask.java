// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class SimpleSubtask extends TeaModel {
    /**
     * <p>List of items for subtasks.</p>
     */
    @NameInMap("Items")
    public java.util.List<SimpleSubtaskItems> items;

    /**
     * <p>Status.</p>
     * 
     * <strong>example:</strong>
     * <p>FINISHED</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Subtask ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1500***457270333440</p>
     */
    @NameInMap("SubtaskId")
    public Long subtaskId;

    public static SimpleSubtask build(java.util.Map<String, ?> map) throws Exception {
        SimpleSubtask self = new SimpleSubtask();
        return TeaModel.build(map, self);
    }

    public SimpleSubtask setItems(java.util.List<SimpleSubtaskItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<SimpleSubtaskItems> getItems() {
        return this.items;
    }

    public SimpleSubtask setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SimpleSubtask setSubtaskId(Long subtaskId) {
        this.subtaskId = subtaskId;
        return this;
    }
    public Long getSubtaskId() {
        return this.subtaskId;
    }

    public static class SimpleSubtaskItems extends TeaModel {
        /**
         * <p>Abandon flag.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AbandonFlag")
        public Boolean abandonFlag;

        /**
         * <p>Abandonment remark.</p>
         * 
         * <strong>example:</strong>
         * <p>原始数据有问题</p>
         */
        @NameInMap("AbandonRemark")
        public String abandonRemark;

        /**
         * <p>Date ID.</p>
         * 
         * <strong>example:</strong>
         * <p>175296157992643****</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <p>Feedback flag.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("FeedbackFlag")
        public Boolean feedbackFlag;

        /**
         * <p>Validation feedback.</p>
         * 
         * <strong>example:</strong>
         * <p>验收完成</p>
         */
        @NameInMap("FeedbackRemark")
        public String feedbackRemark;

        /**
         * <p>Failed mark.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("FixedFlag")
        public Boolean fixedFlag;

        /**
         * <p>Data item ID.</p>
         * 
         * <strong>example:</strong>
         * <p>15116***94667356160</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        /**
         * <p>Assigned to me:</p>
         * <ul>
         * <li>0: Not assigned to me.</li>
         * <li>1: Assigned to me.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Mine")
        public Long mine;

        /**
         * <p>Skip flag.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RejectFlag")
        public Boolean rejectFlag;

        /**
         * <p>Status:</p>
         * <ul>
         * <li>INIT: Initial status.</li>
         * <li>TOPUBLISH: Pending publish.</li>
         * <li>CREATED: Created.</li>
         * <li>HANDLING: In progress.</li>
         * <li>VOTING: Voting in progress.</li>
         * <li>FINISHED: Completed.</li>
         * <li>FAIL: Failed.</li>
         * <li>EXPIRE: Timeout.</li>
         * <li>DISCARDED: Passively abandoned.</li>
         * <li>DISABLE: Actively abandoned.</li>
         * <li>LOCKED: Edit Lock.</li>
         * <li>OFFLINE: Unpublished.</li>
         * <li>MERGING: Merging results.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HANDLING</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>Weight.</p>
         * 
         * <strong>example:</strong>
         * <p>311011</p>
         */
        @NameInMap("Weight")
        public Long weight;

        public static SimpleSubtaskItems build(java.util.Map<String, ?> map) throws Exception {
            SimpleSubtaskItems self = new SimpleSubtaskItems();
            return TeaModel.build(map, self);
        }

        public SimpleSubtaskItems setAbandonFlag(Boolean abandonFlag) {
            this.abandonFlag = abandonFlag;
            return this;
        }
        public Boolean getAbandonFlag() {
            return this.abandonFlag;
        }

        public SimpleSubtaskItems setAbandonRemark(String abandonRemark) {
            this.abandonRemark = abandonRemark;
            return this;
        }
        public String getAbandonRemark() {
            return this.abandonRemark;
        }

        public SimpleSubtaskItems setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public SimpleSubtaskItems setFeedbackFlag(Boolean feedbackFlag) {
            this.feedbackFlag = feedbackFlag;
            return this;
        }
        public Boolean getFeedbackFlag() {
            return this.feedbackFlag;
        }

        public SimpleSubtaskItems setFeedbackRemark(String feedbackRemark) {
            this.feedbackRemark = feedbackRemark;
            return this;
        }
        public String getFeedbackRemark() {
            return this.feedbackRemark;
        }

        public SimpleSubtaskItems setFixedFlag(Boolean fixedFlag) {
            this.fixedFlag = fixedFlag;
            return this;
        }
        public Boolean getFixedFlag() {
            return this.fixedFlag;
        }

        public SimpleSubtaskItems setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public SimpleSubtaskItems setMine(Long mine) {
            this.mine = mine;
            return this;
        }
        public Long getMine() {
            return this.mine;
        }

        public SimpleSubtaskItems setRejectFlag(Boolean rejectFlag) {
            this.rejectFlag = rejectFlag;
            return this;
        }
        public Boolean getRejectFlag() {
            return this.rejectFlag;
        }

        public SimpleSubtaskItems setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public SimpleSubtaskItems setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

    }

}
