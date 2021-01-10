// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskSubscribeUserInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("DdMessageNoticeAggregate")
    public java.util.List<GetClriskSubscribeUserInfoResponseBodyDdMessageNoticeAggregate> ddMessageNoticeAggregate;

    @NameInMap("EmailNoticeAggregate")
    public GetClriskSubscribeUserInfoResponseBodyEmailNoticeAggregate emailNoticeAggregate;

    @NameInMap("MessageNoticeAggregate")
    public GetClriskSubscribeUserInfoResponseBodyMessageNoticeAggregate messageNoticeAggregate;

    public static GetClriskSubscribeUserInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClriskSubscribeUserInfoResponseBody self = new GetClriskSubscribeUserInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClriskSubscribeUserInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClriskSubscribeUserInfoResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetClriskSubscribeUserInfoResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetClriskSubscribeUserInfoResponseBody setDdMessageNoticeAggregate(java.util.List<GetClriskSubscribeUserInfoResponseBodyDdMessageNoticeAggregate> ddMessageNoticeAggregate) {
        this.ddMessageNoticeAggregate = ddMessageNoticeAggregate;
        return this;
    }
    public java.util.List<GetClriskSubscribeUserInfoResponseBodyDdMessageNoticeAggregate> getDdMessageNoticeAggregate() {
        return this.ddMessageNoticeAggregate;
    }

    public GetClriskSubscribeUserInfoResponseBody setEmailNoticeAggregate(GetClriskSubscribeUserInfoResponseBodyEmailNoticeAggregate emailNoticeAggregate) {
        this.emailNoticeAggregate = emailNoticeAggregate;
        return this;
    }
    public GetClriskSubscribeUserInfoResponseBodyEmailNoticeAggregate getEmailNoticeAggregate() {
        return this.emailNoticeAggregate;
    }

    public GetClriskSubscribeUserInfoResponseBody setMessageNoticeAggregate(GetClriskSubscribeUserInfoResponseBodyMessageNoticeAggregate messageNoticeAggregate) {
        this.messageNoticeAggregate = messageNoticeAggregate;
        return this;
    }
    public GetClriskSubscribeUserInfoResponseBodyMessageNoticeAggregate getMessageNoticeAggregate() {
        return this.messageNoticeAggregate;
    }

    public static class GetClriskSubscribeUserInfoResponseBodyDdMessageNoticeAggregate extends TeaModel {
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

        public static GetClriskSubscribeUserInfoResponseBodyDdMessageNoticeAggregate build(java.util.Map<String, ?> map) throws Exception {
            GetClriskSubscribeUserInfoResponseBodyDdMessageNoticeAggregate self = new GetClriskSubscribeUserInfoResponseBodyDdMessageNoticeAggregate();
            return TeaModel.build(map, self);
        }

        public GetClriskSubscribeUserInfoResponseBodyDdMessageNoticeAggregate setIsIssueSubscribe(Boolean isIssueSubscribe) {
            this.isIssueSubscribe = isIssueSubscribe;
            return this;
        }
        public Boolean getIsIssueSubscribe() {
            return this.isIssueSubscribe;
        }

        public GetClriskSubscribeUserInfoResponseBodyDdMessageNoticeAggregate setIsModelSubscribe(Boolean isModelSubscribe) {
            this.isModelSubscribe = isModelSubscribe;
            return this;
        }
        public Boolean getIsModelSubscribe() {
            return this.isModelSubscribe;
        }

        public GetClriskSubscribeUserInfoResponseBodyDdMessageNoticeAggregate setIsTaskSubscribe(Boolean isTaskSubscribe) {
            this.isTaskSubscribe = isTaskSubscribe;
            return this;
        }
        public Boolean getIsTaskSubscribe() {
            return this.isTaskSubscribe;
        }

        public GetClriskSubscribeUserInfoResponseBodyDdMessageNoticeAggregate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetClriskSubscribeUserInfoResponseBodyDdMessageNoticeAggregate setSecret(String secret) {
            this.secret = secret;
            return this;
        }
        public String getSecret() {
            return this.secret;
        }

        public GetClriskSubscribeUserInfoResponseBodyDdMessageNoticeAggregate setWebHookAddress(String webHookAddress) {
            this.webHookAddress = webHookAddress;
            return this;
        }
        public String getWebHookAddress() {
            return this.webHookAddress;
        }

    }

    public static class GetClriskSubscribeUserInfoResponseBodyEmailNoticeAggregate extends TeaModel {
        @NameInMap("EmailAddress")
        public String emailAddress;

        @NameInMap("IsIssueSubscribe")
        public Boolean isIssueSubscribe;

        @NameInMap("IsModelSubscribe")
        public Boolean isModelSubscribe;

        @NameInMap("IsTaskSubscribe")
        public Boolean isTaskSubscribe;

        public static GetClriskSubscribeUserInfoResponseBodyEmailNoticeAggregate build(java.util.Map<String, ?> map) throws Exception {
            GetClriskSubscribeUserInfoResponseBodyEmailNoticeAggregate self = new GetClriskSubscribeUserInfoResponseBodyEmailNoticeAggregate();
            return TeaModel.build(map, self);
        }

        public GetClriskSubscribeUserInfoResponseBodyEmailNoticeAggregate setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }
        public String getEmailAddress() {
            return this.emailAddress;
        }

        public GetClriskSubscribeUserInfoResponseBodyEmailNoticeAggregate setIsIssueSubscribe(Boolean isIssueSubscribe) {
            this.isIssueSubscribe = isIssueSubscribe;
            return this;
        }
        public Boolean getIsIssueSubscribe() {
            return this.isIssueSubscribe;
        }

        public GetClriskSubscribeUserInfoResponseBodyEmailNoticeAggregate setIsModelSubscribe(Boolean isModelSubscribe) {
            this.isModelSubscribe = isModelSubscribe;
            return this;
        }
        public Boolean getIsModelSubscribe() {
            return this.isModelSubscribe;
        }

        public GetClriskSubscribeUserInfoResponseBodyEmailNoticeAggregate setIsTaskSubscribe(Boolean isTaskSubscribe) {
            this.isTaskSubscribe = isTaskSubscribe;
            return this;
        }
        public Boolean getIsTaskSubscribe() {
            return this.isTaskSubscribe;
        }

    }

    public static class GetClriskSubscribeUserInfoResponseBodyMessageNoticeAggregate extends TeaModel {
        @NameInMap("IsIssueSubscribe")
        public Boolean isIssueSubscribe;

        @NameInMap("IsModelSubscribe")
        public Boolean isModelSubscribe;

        @NameInMap("IsTaskSubscribe")
        public Boolean isTaskSubscribe;

        @NameInMap("Number")
        public String number;

        public static GetClriskSubscribeUserInfoResponseBodyMessageNoticeAggregate build(java.util.Map<String, ?> map) throws Exception {
            GetClriskSubscribeUserInfoResponseBodyMessageNoticeAggregate self = new GetClriskSubscribeUserInfoResponseBodyMessageNoticeAggregate();
            return TeaModel.build(map, self);
        }

        public GetClriskSubscribeUserInfoResponseBodyMessageNoticeAggregate setIsIssueSubscribe(Boolean isIssueSubscribe) {
            this.isIssueSubscribe = isIssueSubscribe;
            return this;
        }
        public Boolean getIsIssueSubscribe() {
            return this.isIssueSubscribe;
        }

        public GetClriskSubscribeUserInfoResponseBodyMessageNoticeAggregate setIsModelSubscribe(Boolean isModelSubscribe) {
            this.isModelSubscribe = isModelSubscribe;
            return this;
        }
        public Boolean getIsModelSubscribe() {
            return this.isModelSubscribe;
        }

        public GetClriskSubscribeUserInfoResponseBodyMessageNoticeAggregate setIsTaskSubscribe(Boolean isTaskSubscribe) {
            this.isTaskSubscribe = isTaskSubscribe;
            return this;
        }
        public Boolean getIsTaskSubscribe() {
            return this.isTaskSubscribe;
        }

        public GetClriskSubscribeUserInfoResponseBodyMessageNoticeAggregate setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

    }

}
