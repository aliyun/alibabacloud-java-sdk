// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class Identity extends TeaModel {
    /**
     * <p>The ID of the user or the group.</p>
     * 
     * <strong>example:</strong>
     * <p>16435bdf934248b788b7b3771ee9a3dw</p>
     */
    @NameInMap("identity_id")
    public String identityId;

    /**
     * <p>The type of the identity. Valid values:</p>
     * <ul>
     * <li>IT_User</li>
     * <li>IT_Group</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IT_User</p>
     */
    @NameInMap("identity_type")
    public String identityType;

    public static Identity build(java.util.Map<String, ?> map) throws Exception {
        Identity self = new Identity();
        return TeaModel.build(map, self);
    }

    public Identity setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public Identity setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

}
