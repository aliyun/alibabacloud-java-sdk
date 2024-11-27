// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class VerifyInstanceLDAPAuthServerResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C9E97677-BD74-584B-AFCE-948C2A70BB83</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static VerifyInstanceLDAPAuthServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyInstanceLDAPAuthServerResponseBody self = new VerifyInstanceLDAPAuthServerResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyInstanceLDAPAuthServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
