// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSAcrTempAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("AuthorizationToken")
    public String authorizationToken;

    @NameInMap("ExpireDate")
    public Long expireDate;

    @NameInMap("TempUserName")
    public String tempUserName;

    public static GetAKSAcrTempAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAKSAcrTempAccountResponseBody self = new GetAKSAcrTempAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAKSAcrTempAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAKSAcrTempAccountResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAKSAcrTempAccountResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetAKSAcrTempAccountResponseBody setAuthorizationToken(String authorizationToken) {
        this.authorizationToken = authorizationToken;
        return this;
    }
    public String getAuthorizationToken() {
        return this.authorizationToken;
    }

    public GetAKSAcrTempAccountResponseBody setExpireDate(Long expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public Long getExpireDate() {
        return this.expireDate;
    }

    public GetAKSAcrTempAccountResponseBody setTempUserName(String tempUserName) {
        this.tempUserName = tempUserName;
        return this;
    }
    public String getTempUserName() {
        return this.tempUserName;
    }

}
