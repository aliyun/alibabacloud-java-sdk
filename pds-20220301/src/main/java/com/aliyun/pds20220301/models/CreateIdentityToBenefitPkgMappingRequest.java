// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CreateIdentityToBenefitPkgMappingRequest extends TeaModel {
    /**
     * <p>The number of benefit packages.</p>
     * <br>
     * <p>This parameter takes effect only for the benefit packages of the resource type. Default value: 1.</p>
     */
    @NameInMap("amount")
    public Long amount;

    /**
     * <p>The unique identifier of the benefit package.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("benefit_pkg_id")
    public String benefitPkgId;

    /**
     * <p>The time when the benefit package expires. Set the value to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <br>
     * <p>By default, the benefit package never expires.</p>
     */
    @NameInMap("expire_time")
    public Long expireTime;

    /**
     * <p>The unique identifier of the entity.</p>
     * <br>
     * <p>If you want to manage the benefits of a user, set this parameter to a user ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("identity_id")
    public String identityId;

    /**
     * <p>The type of the entity.</p>
     * <br>
     * <p>If you want to manage the benefits of a user, set this parameter to user.</p>
     * <br>
     * <p>This parameter is required.</p>
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
