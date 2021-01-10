// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveClriskSubscriberRequest extends TeaModel {
    @NameInMap("DdMessageNoticeAggregate")
    public java.util.List<SaveClriskSubscriberRequestDdMessageNoticeAggregate> ddMessageNoticeAggregate;

    @NameInMap("EmailNoticeAggregateJsonStr")
    public String emailNoticeAggregateJsonStr;

    @NameInMap("EntranceCodesRepeatList")
    public java.util.List<String> entranceCodesRepeatList;

    @NameInMap("MessageNoticeAggregateJsonStr")
    public String messageNoticeAggregateJsonStr;

    public static SaveClriskSubscriberRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveClriskSubscriberRequest self = new SaveClriskSubscriberRequest();
        return TeaModel.build(map, self);
    }

    public SaveClriskSubscriberRequest setDdMessageNoticeAggregate(java.util.List<SaveClriskSubscriberRequestDdMessageNoticeAggregate> ddMessageNoticeAggregate) {
        this.ddMessageNoticeAggregate = ddMessageNoticeAggregate;
        return this;
    }
    public java.util.List<SaveClriskSubscriberRequestDdMessageNoticeAggregate> getDdMessageNoticeAggregate() {
        return this.ddMessageNoticeAggregate;
    }

    public SaveClriskSubscriberRequest setEmailNoticeAggregateJsonStr(String emailNoticeAggregateJsonStr) {
        this.emailNoticeAggregateJsonStr = emailNoticeAggregateJsonStr;
        return this;
    }
    public String getEmailNoticeAggregateJsonStr() {
        return this.emailNoticeAggregateJsonStr;
    }

    public SaveClriskSubscriberRequest setEntranceCodesRepeatList(java.util.List<String> entranceCodesRepeatList) {
        this.entranceCodesRepeatList = entranceCodesRepeatList;
        return this;
    }
    public java.util.List<String> getEntranceCodesRepeatList() {
        return this.entranceCodesRepeatList;
    }

    public SaveClriskSubscriberRequest setMessageNoticeAggregateJsonStr(String messageNoticeAggregateJsonStr) {
        this.messageNoticeAggregateJsonStr = messageNoticeAggregateJsonStr;
        return this;
    }
    public String getMessageNoticeAggregateJsonStr() {
        return this.messageNoticeAggregateJsonStr;
    }

    public static class SaveClriskSubscriberRequestDdMessageNoticeAggregate extends TeaModel {
        @NameInMap("IsIssueSubscribe")
        public Boolean isIssueSubscribe;

        @NameInMap("IsModelSubscribe")
        public Boolean isModelSubscribe;

        @NameInMap("IsTaskSubscribe")
        public Boolean isTaskSubscribe;

        @NameInMap("Name")
        public String name;

        @NameInMap("Secret")
        public String secret;

        @NameInMap("WebHookAddress")
        public String webHookAddress;

        public static SaveClriskSubscriberRequestDdMessageNoticeAggregate build(java.util.Map<String, ?> map) throws Exception {
            SaveClriskSubscriberRequestDdMessageNoticeAggregate self = new SaveClriskSubscriberRequestDdMessageNoticeAggregate();
            return TeaModel.build(map, self);
        }

        public SaveClriskSubscriberRequestDdMessageNoticeAggregate setIsIssueSubscribe(Boolean isIssueSubscribe) {
            this.isIssueSubscribe = isIssueSubscribe;
            return this;
        }
        public Boolean getIsIssueSubscribe() {
            return this.isIssueSubscribe;
        }

        public SaveClriskSubscriberRequestDdMessageNoticeAggregate setIsModelSubscribe(Boolean isModelSubscribe) {
            this.isModelSubscribe = isModelSubscribe;
            return this;
        }
        public Boolean getIsModelSubscribe() {
            return this.isModelSubscribe;
        }

        public SaveClriskSubscriberRequestDdMessageNoticeAggregate setIsTaskSubscribe(Boolean isTaskSubscribe) {
            this.isTaskSubscribe = isTaskSubscribe;
            return this;
        }
        public Boolean getIsTaskSubscribe() {
            return this.isTaskSubscribe;
        }

        public SaveClriskSubscriberRequestDdMessageNoticeAggregate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SaveClriskSubscriberRequestDdMessageNoticeAggregate setSecret(String secret) {
            this.secret = secret;
            return this;
        }
        public String getSecret() {
            return this.secret;
        }

        public SaveClriskSubscriberRequestDdMessageNoticeAggregate setWebHookAddress(String webHookAddress) {
            this.webHookAddress = webHookAddress;
            return this;
        }
        public String getWebHookAddress() {
            return this.webHookAddress;
        }

    }

}
