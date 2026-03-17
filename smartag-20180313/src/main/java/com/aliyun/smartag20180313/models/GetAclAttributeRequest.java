// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GetAclAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the ACL.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acl-xhwhyuo43l0n*****</p>
     */
    @NameInMap("AclId")
    public String aclId;

    /**
     * <p>The ID of the region where the ACL is deployed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetAclAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAclAttributeRequest self = new GetAclAttributeRequest();
        return TeaModel.build(map, self);
    }

    public GetAclAttributeRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public GetAclAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
