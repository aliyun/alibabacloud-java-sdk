// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetIdentityToBenefitPkgMappingRequest extends TeaModel {
    /**
     * <p>The unique identifier of the benefit package.</p>
     */
    @NameInMap("benefit_pkg_id")
    public String benefitPkgId;

    /**
     * <p>The unique identifier of the entity.</p>
     * <br>
     * <p>If you want to manage the benefits of a user, set this parameter to a user ID.</p>
     */
    @NameInMap("identity_id")
    public String identityId;

    /**
     * <p>The type of the entity. If you want to manage the benefits of a user, set this parameter to user.</p>
     */
    @NameInMap("identity_type")
    public String identityType;

    public static GetIdentityToBenefitPkgMappingRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIdentityToBenefitPkgMappingRequest self = new GetIdentityToBenefitPkgMappingRequest();
        return TeaModel.build(map, self);
    }

    public GetIdentityToBenefitPkgMappingRequest setBenefitPkgId(String benefitPkgId) {
        this.benefitPkgId = benefitPkgId;
        return this;
    }
    public String getBenefitPkgId() {
        return this.benefitPkgId;
    }

    public GetIdentityToBenefitPkgMappingRequest setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public GetIdentityToBenefitPkgMappingRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

}
