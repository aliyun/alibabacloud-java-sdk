// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GenerateTrafficControlTaskCodeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("RequestId")
    public String requestId;

    public static GenerateTrafficControlTaskCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateTrafficControlTaskCodeResponseBody self = new GenerateTrafficControlTaskCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateTrafficControlTaskCodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateTrafficControlTaskCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
