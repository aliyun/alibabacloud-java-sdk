// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetIdentityToBenefitPkgMappingRequest extends TeaModel {
    /**
     * <p>The unique ID of the benefit package.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>40cb7794c9294</p>
     */
    @NameInMap("benefit_pkg_id")
    public String benefitPkgId;

    /**
     * <p>The unique ID of the identity.</p>
     * <p>To manage user benefits, set this parameter to the user ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user123</p>
     */
    @NameInMap("identity_id")
    public String identityId;

    /**
     * <p>The type of the identity. Set the value to <code>user</code> to manage user benefits.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
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
