// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class ValidateVerifyCodeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("RequestId")
    public String requestId;

    public static ValidateVerifyCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateVerifyCodeResponseBody self = new ValidateVerifyCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateVerifyCodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ValidateVerifyCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
