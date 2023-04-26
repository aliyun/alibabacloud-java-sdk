// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class IdentityToBenefitPkgMapping extends TeaModel {
    @NameInMap("benefit_pkg_computation_rule")
    public String benefitPkgComputationRule;

    @NameInMap("benefit_pkg_id")
    public String benefitPkgId;

    @NameInMap("benefit_pkg_name")
    public String benefitPkgName;

    @NameInMap("benefit_pkg_owner_id")
    public String benefitPkgOwnerId;

    @NameInMap("benefit_pkg_priority")
    public Long benefitPkgPriority;

    @NameInMap("benefit_pkg_type")
    public String benefitPkgType;

    @NameInMap("created_at")
    public String createdAt;

    @NameInMap("delivery_info_list")
    public java.util.List<BenefitPkgDeliveryInfo> deliveryInfoList;

    @NameInMap("identity_id")
    public String identityId;

    @NameInMap("identity_type")
    public String identityType;

    @NameInMap("updated_at")
    public String updatedAt;

    public static IdentityToBenefitPkgMapping build(java.util.Map<String, ?> map) throws Exception {
        IdentityToBenefitPkgMapping self = new IdentityToBenefitPkgMapping();
        return TeaModel.build(map, self);
    }

    public IdentityToBenefitPkgMapping setBenefitPkgComputationRule(String benefitPkgComputationRule) {
        this.benefitPkgComputationRule = benefitPkgComputationRule;
        return this;
    }
    public String getBenefitPkgComputationRule() {
        return this.benefitPkgComputationRule;
    }

    public IdentityToBenefitPkgMapping setBenefitPkgId(String benefitPkgId) {
        this.benefitPkgId = benefitPkgId;
        return this;
    }
    public String getBenefitPkgId() {
        return this.benefitPkgId;
    }

    public IdentityToBenefitPkgMapping setBenefitPkgName(String benefitPkgName) {
        this.benefitPkgName = benefitPkgName;
        return this;
    }
    public String getBenefitPkgName() {
        return this.benefitPkgName;
    }

    public IdentityToBenefitPkgMapping setBenefitPkgOwnerId(String benefitPkgOwnerId) {
        this.benefitPkgOwnerId = benefitPkgOwnerId;
        return this;
    }
    public String getBenefitPkgOwnerId() {
        return this.benefitPkgOwnerId;
    }

    public IdentityToBenefitPkgMapping setBenefitPkgPriority(Long benefitPkgPriority) {
        this.benefitPkgPriority = benefitPkgPriority;
        return this;
    }
    public Long getBenefitPkgPriority() {
        return this.benefitPkgPriority;
    }

    public IdentityToBenefitPkgMapping setBenefitPkgType(String benefitPkgType) {
        this.benefitPkgType = benefitPkgType;
        return this;
    }
    public String getBenefitPkgType() {
        return this.benefitPkgType;
    }

    public IdentityToBenefitPkgMapping setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public IdentityToBenefitPkgMapping setDeliveryInfoList(java.util.List<BenefitPkgDeliveryInfo> deliveryInfoList) {
        this.deliveryInfoList = deliveryInfoList;
        return this;
    }
    public java.util.List<BenefitPkgDeliveryInfo> getDeliveryInfoList() {
        return this.deliveryInfoList;
    }

    public IdentityToBenefitPkgMapping setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public IdentityToBenefitPkgMapping setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public IdentityToBenefitPkgMapping setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}
