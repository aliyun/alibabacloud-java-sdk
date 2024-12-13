// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class GetRegisterCodeResponseBody extends TeaModel {
    /**
     * <p>The registration code of the CA certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>13274673-8f90-4630-bea1-9cccb25756ad2089******</p>
     */
    @NameInMap("RegisterCode")
    public String registerCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>020F6A43-19E6-4B6E-B846-44EB31DF****</p>
     */
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
