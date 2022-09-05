// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class SimpleSubtask extends TeaModel {
    @NameInMap("Items")
    public java.util.List<SimpleSubtaskItems> items;

    @NameInMap("Status")
    public String status;

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

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("Mine")
        public Long mine;

        @NameInMap("RejectFlag")
        public Boolean rejectFlag;

        @NameInMap("State")
        public String state;

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
