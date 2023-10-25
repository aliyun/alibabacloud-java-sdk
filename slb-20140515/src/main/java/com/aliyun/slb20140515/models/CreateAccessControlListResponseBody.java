// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateAccessControlListResponseBody extends TeaModel {
    /**
     * <p>The IP version. Valid values: **ipv4** and **ipv6**.</p>
     */
    @NameInMap("AclId")
    public String aclId;

    /**
     * <p>The ID of the resource group to which the ACL belongs.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAccessControlListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessControlListResponseBody self = new CreateAccessControlListResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAccessControlListResponseBody setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public CreateAccessControlListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
