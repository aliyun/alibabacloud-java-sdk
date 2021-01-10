// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeNsubscribepullrequestResponseBody extends TeaModel {
    @NameInMap("Email")
    public String email;

    @NameInMap("SubscribableId")
    public Long subscribableId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("SubscribableType")
    public String subscribableType;

    @NameInMap("UserId")
    public Long userId;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("Subscribed")
    public Boolean subscribed;

    @NameInMap("Id")
    public Long id;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("UpdatedAt")
    public String updatedAt;

    @NameInMap("ResultCode")
    public String resultCode;

    public static ExecLinkeantcodeAntcodeNsubscribepullrequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeNsubscribepullrequestResponseBody self = new ExecLinkeantcodeAntcodeNsubscribepullrequestResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeNsubscribepullrequestResponseBody setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ExecLinkeantcodeAntcodeNsubscribepullrequestResponseBody setSubscribableId(Long subscribableId) {
        this.subscribableId = subscribableId;
        return this;
    }
    public Long getSubscribableId() {
        return this.subscribableId;
    }

    public ExecLinkeantcodeAntcodeNsubscribepullrequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecLinkeantcodeAntcodeNsubscribepullrequestResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ExecLinkeantcodeAntcodeNsubscribepullrequestResponseBody setSubscribableType(String subscribableType) {
        this.subscribableType = subscribableType;
        return this;
    }
    public String getSubscribableType() {
        return this.subscribableType;
    }

    public ExecLinkeantcodeAntcodeNsubscribepullrequestResponseBody setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public ExecLinkeantcodeAntcodeNsubscribepullrequestResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public ExecLinkeantcodeAntcodeNsubscribepullrequestResponseBody setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
        return this;
    }
    public Boolean getSubscribed() {
        return this.subscribed;
    }

    public ExecLinkeantcodeAntcodeNsubscribepullrequestResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ExecLinkeantcodeAntcodeNsubscribepullrequestResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExecLinkeantcodeAntcodeNsubscribepullrequestResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public ExecLinkeantcodeAntcodeNsubscribepullrequestResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
