// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateAccessControlListResponseBody extends TeaModel {
    /**
     * <p>You can create multiple ACLs. Each ACL can contain one or more IP addresses or CIDR blocks. Before you create an ACL, take note of the following limits:</p>
     * <br>
     * <p>*   An account can have a maximum of 50 ACLs in each region.</p>
     * <p>*   You can add a maximum of 50 IP addresses or CIDR blocks at a time within an account.</p>
     * <p>*   Each ACL can contain a maximum of 300 IP addresses or CIDR blocks.</p>
     */
    @NameInMap("AclId")
    public String aclId;

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
