// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAccessGatewayBgpRouteResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateSmartAccessGatewayBgpRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmartAccessGatewayBgpRouteResponseBody self = new UpdateSmartAccessGatewayBgpRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSmartAccessGatewayBgpRouteResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateSmartAccessGatewayBgpRouteResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateSmartAccessGatewayBgpRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSmartAccessGatewayBgpRouteResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
