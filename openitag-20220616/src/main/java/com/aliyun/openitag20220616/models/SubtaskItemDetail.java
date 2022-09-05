// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class SubtaskItemDetail extends TeaModel {
    @NameInMap("Annotations")
    public java.util.List<SubtaskItemDetailAnnotations> annotations;

    @NameInMap("DataSource")
    public java.util.Map<String, ?> dataSource;

    @NameInMap("ItemId")
    public Long itemId;

    public static SubtaskItemDetail build(java.util.Map<String, ?> map) throws Exception {
        SubtaskItemDetail self = new SubtaskItemDetail();
        return TeaModel.build(map, self);
    }

    public SubtaskItemDetail setAnnotations(java.util.List<SubtaskItemDetailAnnotations> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.List<SubtaskItemDetailAnnotations> getAnnotations() {
        return this.annotations;
    }

    public SubtaskItemDetail setDataSource(java.util.Map<String, ?> dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public java.util.Map<String, ?> getDataSource() {
        return this.dataSource;
    }

    public SubtaskItemDetail setItemId(Long itemId) {
        this.itemId = itemId;
        return this;
    }
    public Long getItemId() {
        return this.itemId;
    }

    public static class SubtaskItemDetailAnnotations extends TeaModel {
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

        public static SubtaskItemDetailAnnotations build(java.util.Map<String, ?> map) throws Exception {
            SubtaskItemDetailAnnotations self = new SubtaskItemDetailAnnotations();
            return TeaModel.build(map, self);
        }

        public SubtaskItemDetailAnnotations setAbandonFlag(Boolean abandonFlag) {
            this.abandonFlag = abandonFlag;
            return this;
        }
        public Boolean getAbandonFlag() {
            return this.abandonFlag;
        }

        public SubtaskItemDetailAnnotations setAbandonRemark(String abandonRemark) {
            this.abandonRemark = abandonRemark;
            return this;
        }
        public String getAbandonRemark() {
            return this.abandonRemark;
        }

        public SubtaskItemDetailAnnotations setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public SubtaskItemDetailAnnotations setFeedbackFlag(Boolean feedbackFlag) {
            this.feedbackFlag = feedbackFlag;
            return this;
        }
        public Boolean getFeedbackFlag() {
            return this.feedbackFlag;
        }

        public SubtaskItemDetailAnnotations setFeedbackRemark(String feedbackRemark) {
            this.feedbackRemark = feedbackRemark;
            return this;
        }
        public String getFeedbackRemark() {
            return this.feedbackRemark;
        }

        public SubtaskItemDetailAnnotations setFixedFlag(Boolean fixedFlag) {
            this.fixedFlag = fixedFlag;
            return this;
        }
        public Boolean getFixedFlag() {
            return this.fixedFlag;
        }

        public SubtaskItemDetailAnnotations setMine(Long mine) {
            this.mine = mine;
            return this;
        }
        public Long getMine() {
            return this.mine;
        }

        public SubtaskItemDetailAnnotations setRejectFlag(Boolean rejectFlag) {
            this.rejectFlag = rejectFlag;
            return this;
        }
        public Boolean getRejectFlag() {
            return this.rejectFlag;
        }

        public SubtaskItemDetailAnnotations setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public SubtaskItemDetailAnnotations setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

    }

}
