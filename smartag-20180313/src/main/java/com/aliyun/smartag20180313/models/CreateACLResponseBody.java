// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateACLResponseBody extends TeaModel {
    /**
     * <p>The ID of the ACL.</p>
     * 
     * <strong>example:</strong>
     * <p>acl-o6yol7zowii5n2****</p>
     */
    @NameInMap("AclId")
    public String aclId;

    /**
     * <p>The type of SAG instance to be associated with the ACL.</p>
     * 
     * <strong>example:</strong>
     * <p>acl-hardware</p>
     */
    @NameInMap("AclType")
    public String aclType;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EE837E9F-BD50-4C2B-9E47-260F9D848480</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the ACL belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2iu4fnc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CreateACLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateACLResponseBody self = new CreateACLResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateACLResponseBody setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public CreateACLResponseBody setAclType(String aclType) {
        this.aclType = aclType;
        return this;
    }
    public String getAclType() {
        return this.aclType;
    }

    public CreateACLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateACLResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
