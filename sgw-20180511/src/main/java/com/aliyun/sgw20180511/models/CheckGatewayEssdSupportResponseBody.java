// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CheckGatewayEssdSupportResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("IsServiceAffect")
    public Boolean isServiceAffect;

    @NameInMap("IsSupportEssd")
    public Boolean isSupportEssd;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CheckGatewayEssdSupportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckGatewayEssdSupportResponseBody self = new CheckGatewayEssdSupportResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckGatewayEssdSupportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckGatewayEssdSupportResponseBody setIsServiceAffect(Boolean isServiceAffect) {
        this.isServiceAffect = isServiceAffect;
        return this;
    }
    public Boolean getIsServiceAffect() {
        return this.isServiceAffect;
    }

    public CheckGatewayEssdSupportResponseBody setIsSupportEssd(Boolean isSupportEssd) {
        this.isSupportEssd = isSupportEssd;
        return this;
    }
    public Boolean getIsSupportEssd() {
        return this.isSupportEssd;
    }

    public CheckGatewayEssdSupportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckGatewayEssdSupportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckGatewayEssdSupportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
