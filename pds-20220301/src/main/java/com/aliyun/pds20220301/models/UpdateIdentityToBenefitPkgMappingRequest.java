// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UpdateIdentityToBenefitPkgMappingRequest extends TeaModel {
    /**
     * <p>The number of benefit packages.</p>
     * <br>
     * <p>This parameter specifies the number of benefit packages of the resource type. Default value: 1.</p>
     */
    @NameInMap("amount")
    public Long amount;

    /**
     * <p>The unique identifier of the benefit package.</p>
     */
    @NameInMap("benefit_pkg_id")
    public String benefitPkgId;

    /**
     * <p>The expiration time of the benefit package. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <br>
     * <p>By default, the benefit package never expires.</p>
     */
    @NameInMap("expire_time")
    public Long expireTime;

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

    public static UpdateIdentityToBenefitPkgMappingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIdentityToBenefitPkgMappingRequest self = new UpdateIdentityToBenefitPkgMappingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIdentityToBenefitPkgMappingRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public UpdateIdentityToBenefitPkgMappingRequest setBenefitPkgId(String benefitPkgId) {
        this.benefitPkgId = benefitPkgId;
        return this;
    }
    public String getBenefitPkgId() {
        return this.benefitPkgId;
    }

    public UpdateIdentityToBenefitPkgMappingRequest setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public UpdateIdentityToBenefitPkgMappingRequest setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public UpdateIdentityToBenefitPkgMappingRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

}
