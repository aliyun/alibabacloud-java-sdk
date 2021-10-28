// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class VerifyIvTokenResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StrCode")
    public String strCode;

    public static VerifyIvTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyIvTokenResponseBody self = new VerifyIvTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyIvTokenResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public VerifyIvTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyIvTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyIvTokenResponseBody setStrCode(String strCode) {
        this.strCode = strCode;
        return this;
    }
    public String getStrCode() {
        return this.strCode;
    }

}
