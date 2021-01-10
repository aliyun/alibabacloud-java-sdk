// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskSubscriberResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("CurrentUserName")
    public String currentUserName;

    @NameInMap("Subscribe")
    public Boolean subscribe;

    @NameInMap("SubscriberUsers")
    public java.util.List<String> subscriberUsers;

    public static GetClriskSubscriberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClriskSubscriberResponseBody self = new GetClriskSubscriberResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClriskSubscriberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClriskSubscriberResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetClriskSubscriberResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetClriskSubscriberResponseBody setCurrentUserName(String currentUserName) {
        this.currentUserName = currentUserName;
        return this;
    }
    public String getCurrentUserName() {
        return this.currentUserName;
    }

    public GetClriskSubscriberResponseBody setSubscribe(Boolean subscribe) {
        this.subscribe = subscribe;
        return this;
    }
    public Boolean getSubscribe() {
        return this.subscribe;
    }

    public GetClriskSubscriberResponseBody setSubscriberUsers(java.util.List<String> subscriberUsers) {
        this.subscriberUsers = subscriberUsers;
        return this;
    }
    public java.util.List<String> getSubscriberUsers() {
        return this.subscriberUsers;
    }

}
