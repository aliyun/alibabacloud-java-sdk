// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CreateGatewayResponseBody extends TeaModel {
    @NameInMap("BuyURL")
    public String buyURL;

    @NameInMap("Code")
    public String code;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayResponseBody self = new CreateGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGatewayResponseBody setBuyURL(String buyURL) {
        this.buyURL = buyURL;
        return this;
    }
    public String getBuyURL() {
        return this.buyURL;
    }

    public CreateGatewayResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateGatewayResponseBody setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public CreateGatewayResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGatewayResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
