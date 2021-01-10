// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDSTSpanConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Components")
    public java.util.List<String> components;

    @NameInMap("MiddlewareTagKeys")
    public java.util.List<String> middlewareTagKeys;

    public static GetDSTSpanConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDSTSpanConfigResponseBody self = new GetDSTSpanConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDSTSpanConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDSTSpanConfigResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDSTSpanConfigResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDSTSpanConfigResponseBody setComponents(java.util.List<String> components) {
        this.components = components;
        return this;
    }
    public java.util.List<String> getComponents() {
        return this.components;
    }

    public GetDSTSpanConfigResponseBody setMiddlewareTagKeys(java.util.List<String> middlewareTagKeys) {
        this.middlewareTagKeys = middlewareTagKeys;
        return this;
    }
    public java.util.List<String> getMiddlewareTagKeys() {
        return this.middlewareTagKeys;
    }

}
