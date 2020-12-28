// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateAccessControlListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AclId")
    public String aclId;

    public static CreateAccessControlListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessControlListResponseBody self = new CreateAccessControlListResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAccessControlListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAccessControlListResponseBody setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

}
