// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidsubscribeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("Email")
    public String email;

    @NameInMap("Id")
    public Long id;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("SubscribableId")
    public Long subscribableId;

    @NameInMap("SubscribableType")
    public String subscribableType;

    @NameInMap("Subscribed")
    public Boolean subscribed;

    @NameInMap("UpdatedAt")
    public String updatedAt;

    @NameInMap("UserId")
    public Long userId;

    public static QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidsubscribeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidsubscribeResponseBody self = new QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidsubscribeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidsubscribeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidsubscribeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidsubscribeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidsubscribeResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidsubscribeResponseBody setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidsubscribeResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidsubscribeResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidsubscribeResponseBody setSubscribableId(Long subscribableId) {
        this.subscribableId = subscribableId;
        return this;
    }
    public Long getSubscribableId() {
        return this.subscribableId;
    }

    public QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidsubscribeResponseBody setSubscribableType(String subscribableType) {
        this.subscribableType = subscribableType;
        return this;
    }
    public String getSubscribableType() {
        return this.subscribableType;
    }

    public QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidsubscribeResponseBody setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
        return this;
    }
    public Boolean getSubscribed() {
        return this.subscribed;
    }

    public QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidsubscribeResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidsubscribeResponseBody setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
