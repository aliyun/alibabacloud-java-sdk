// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class GetRegisterCodeResponseBody extends TeaModel {
    @NameInMap("RegisterCode")
    public String registerCode;

    @NameInMap("RequestId")
    public String requestId;

    public static GetRegisterCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRegisterCodeResponseBody self = new GetRegisterCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRegisterCodeResponseBody setRegisterCode(String registerCode) {
        this.registerCode = registerCode;
        return this;
    }
    public String getRegisterCode() {
        return this.registerCode;
    }

    public GetRegisterCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
