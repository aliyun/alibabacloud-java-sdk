// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListIdentityToBenefitPkgMappingRequest extends TeaModel {
    /**
     * <p>The unique identifier of the identity.</p>
     * <p>When managing benefits for a user, specify the ID of the user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user123</p>
     */
    @NameInMap("identity_id")
    public String identityId;

    /**
     * <p>The type of the identity. To manage benefits for a user, set this parameter to <code>user</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("identity_type")
    public String identityType;

    /**
     * <p>Specifies whether to return expired benefit packages. The default value is <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("include_expired")
    public Boolean includeExpired;

    public static ListIdentityToBenefitPkgMappingRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIdentityToBenefitPkgMappingRequest self = new ListIdentityToBenefitPkgMappingRequest();
        return TeaModel.build(map, self);
    }

    public ListIdentityToBenefitPkgMappingRequest setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public ListIdentityToBenefitPkgMappingRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public ListIdentityToBenefitPkgMappingRequest setIncludeExpired(Boolean includeExpired) {
        this.includeExpired = includeExpired;
        return this;
    }
    public Boolean getIncludeExpired() {
        return this.includeExpired;
    }

}
