// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UpdateIdentityToBenefitPkgMappingRequest extends TeaModel {
    @NameInMap("amount")
    public Long amount;

    @NameInMap("benefit_pkg_id")
    public String benefitPkgId;

    @NameInMap("expire_time")
    public Long expireTime;

    @NameInMap("identity_id")
    public String identityId;

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
