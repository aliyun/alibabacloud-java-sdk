// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListIdentityToBenefitPkgMappingRequest extends TeaModel {
    /**
     * <p>The unique identifier of the entity.</p>
     * <br>
     * <p>If you call this operation to manage the benefits of a user, set this parameter to the ID of the user.</p>
     */
    @NameInMap("identity_id")
    public String identityId;

    /**
     * <p>The type of the entity. If you call this operation to manage the benefits of a user, set this parameter to user.</p>
     */
    @NameInMap("identity_type")
    public String identityType;

    /**
     * <p>Specifies whether to return the benefit packages that expire. Default value: false.</p>
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
