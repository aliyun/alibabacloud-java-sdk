// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateAccessControlListResponseBody extends TeaModel {
    /**
     * <p>The IP version. Valid values: <strong>ipv4</strong> and <strong>ipv6</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>acl-rj9xpxzcwxrukois****</p>
     */
    @NameInMap("AclId")
    public String aclId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>988CB45E-1643-48C0-87B4-928DDF77EA49</p>
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
