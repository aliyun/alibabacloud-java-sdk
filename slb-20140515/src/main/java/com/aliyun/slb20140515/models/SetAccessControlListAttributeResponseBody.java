// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetAccessControlListAttributeResponseBody extends TeaModel {
    @NameInMap("AclId")
    public String aclId;

    @NameInMap("RequestId")
    public String requestId;

    public static SetAccessControlListAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetAccessControlListAttributeResponseBody self = new SetAccessControlListAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public SetAccessControlListAttributeResponseBody setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public SetAccessControlListAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
