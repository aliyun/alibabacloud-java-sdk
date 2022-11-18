// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAccessGatewayPortRouteProtocolResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateSmartAccessGatewayPortRouteProtocolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmartAccessGatewayPortRouteProtocolResponseBody self = new UpdateSmartAccessGatewayPortRouteProtocolResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSmartAccessGatewayPortRouteProtocolResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateSmartAccessGatewayPortRouteProtocolResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateSmartAccessGatewayPortRouteProtocolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSmartAccessGatewayPortRouteProtocolResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
