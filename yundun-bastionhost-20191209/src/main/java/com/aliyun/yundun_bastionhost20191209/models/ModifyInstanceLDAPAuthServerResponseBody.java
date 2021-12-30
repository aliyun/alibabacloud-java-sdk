// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyInstanceLDAPAuthServerResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceLDAPAuthServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceLDAPAuthServerResponseBody self = new ModifyInstanceLDAPAuthServerResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceLDAPAuthServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
