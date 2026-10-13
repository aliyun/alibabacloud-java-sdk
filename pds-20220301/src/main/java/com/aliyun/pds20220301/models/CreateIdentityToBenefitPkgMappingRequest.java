// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CreateIdentityToBenefitPkgMappingRequest extends TeaModel {
    /**
     * <p>The quantity of the benefit package.</p>
     * <p>This parameter applies only to resource-type benefit packages. It is optional and defaults to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("amount")
    public Long amount;

    /**
     * <p>The unique identifier for the benefit package.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>40cb7794c9294</p>
     */
    @NameInMap("benefit_pkg_id")
    public String benefitPkgId;

    /**
     * <p>The expiration time of the benefit package. This is a Unix timestamp representing the number of milliseconds that have elapsed since 00:00:00 on January 1, 1970, UTC.</p>
     * <p>If this parameter is not specified, the benefit package never expires.</p>
     * 
     * <strong>example:</strong>
     * <p>1633167071000</p>
     */
    @NameInMap("expire_time")
    public Long expireTime;

    /**
     * <p>The unique identifier for the entity.</p>
     * <p>To manage benefits for a user, provide the user ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user123</p>
     */
    @NameInMap("identity_id")
    public String identityId;

    /**
     * <p>The type of the entity.</p>
     * <p>To manage benefits for a user, set this parameter to <code>user</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("identity_type")
    public String identityType;

    public static CreateIdentityToBenefitPkgMappingRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIdentityToBenefitPkgMappingRequest self = new CreateIdentityToBenefitPkgMappingRequest();
        return TeaModel.build(map, self);
    }

    public CreateIdentityToBenefitPkgMappingRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public CreateIdentityToBenefitPkgMappingRequest setBenefitPkgId(String benefitPkgId) {
        this.benefitPkgId = benefitPkgId;
        return this;
    }
    public String getBenefitPkgId() {
        return this.benefitPkgId;
    }

    public CreateIdentityToBenefitPkgMappingRequest setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public CreateIdentityToBenefitPkgMappingRequest setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public CreateIdentityToBenefitPkgMappingRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

}
