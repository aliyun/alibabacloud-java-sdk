// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyIPAclConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetPolicyIPAclConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetPolicyIPAclConfigResponseBody self = new SetPolicyIPAclConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetPolicyIPAclConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
