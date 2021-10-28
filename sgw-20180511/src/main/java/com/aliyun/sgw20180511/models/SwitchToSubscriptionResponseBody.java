// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class SwitchToSubscriptionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubscriptionURL")
    public String subscriptionURL;

    @NameInMap("Success")
    public Boolean success;

    public static SwitchToSubscriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchToSubscriptionResponseBody self = new SwitchToSubscriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchToSubscriptionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SwitchToSubscriptionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SwitchToSubscriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SwitchToSubscriptionResponseBody setSubscriptionURL(String subscriptionURL) {
        this.subscriptionURL = subscriptionURL;
        return this;
    }
    public String getSubscriptionURL() {
        return this.subscriptionURL;
    }

    public SwitchToSubscriptionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
