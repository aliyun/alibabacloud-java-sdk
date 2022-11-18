// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAccessGatewayWanSnatResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateSmartAccessGatewayWanSnatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmartAccessGatewayWanSnatResponseBody self = new UpdateSmartAccessGatewayWanSnatResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSmartAccessGatewayWanSnatResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateSmartAccessGatewayWanSnatResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateSmartAccessGatewayWanSnatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSmartAccessGatewayWanSnatResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
