// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class IdentityToBenefitPkgMapping extends TeaModel {
    /**
     * <p>Calculation rules of equity in the benefit package.</p>
     * <p>The user identity benefit package. The return value is empty. Only the quota of the effective equity is calculated based on the priority.</p>
     * <p>The user resource benefit package, which can return null or non-null values. If the return value is not empty, this benefit package is used to append the quota of existing benefits in other benefit packages, which is limited to quota-type benefits. For example, if a user identity benefit package already contains 10 GB of user storage capacity, you can define one or more user resource benefit packages to add additional storage capacity for some users.</p>
     * <p>The following append calculation rules are supported:</p>
     * <p>sum: Multiple benefit packages have the same equity and are accumulated.</p>
     * <p>max: If multiple benefit packages have the same equity, the max value is used.</p>
     * <p>min: If multiple benefit packages have the same equity, the value of min is used.</p>
     * 
     * <strong>example:</strong>
     * <p>sum</p>
     */
    @NameInMap("benefit_pkg_computation_rule")
    public String benefitPkgComputationRule;

    /**
     * <p>The ID of the benefit package.</p>
     * 
     * <strong>example:</strong>
     * <p>40cb7794c9294</p>
     */
    @NameInMap("benefit_pkg_id")
    public String benefitPkgId;

    /**
     * <p>The name of the benefit package.</p>
     */
    @NameInMap("benefit_pkg_name")
    public String benefitPkgName;

    /**
     * <p>The ID of the owner of the benefit package.</p>
     * 
     * <strong>example:</strong>
     * <p>bj1</p>
     */
    @NameInMap("benefit_pkg_owner_id")
    public String benefitPkgOwnerId;

    /**
     * <p>Priority of the benefit package.</p>
     * <p>The priority returned for the user identity benefit package. A smaller number indicates a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("benefit_pkg_priority")
    public Long benefitPkgPriority;

    /**
     * <p>The type of benefit package.</p>
     * <p>Valid values:</p>
     * <p>user_identity : user identity benefit package</p>
     * <p>user_resource: user resource benefit package</p>
     * 
     * <strong>example:</strong>
     * <p>user_identity</p>
     */
    @NameInMap("benefit_pkg_type")
    public String benefitPkgType;

    /**
     * <p>Creation time of the entity and benefit package association.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-08-20T06:51:27.292Z</p>
     */
    @NameInMap("created_at")
    public String createdAt;

    /**
     * <p>The information about the benefit packages that are associated with an entity.</p>
     */
    @NameInMap("delivery_info_list")
    public java.util.List<BenefitPkgDeliveryInfo> deliveryInfoList;

    /**
     * <p>The ID of the entity.</p>
     * 
     * <strong>example:</strong>
     * <p>user123</p>
     */
    @NameInMap("identity_id")
    public String identityId;

    /**
     * <p>The type of the entity.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("identity_type")
    public String identityType;

    /**
     * <p>Update time associated with the entity and benefit package.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-08-20T06:51:27.292Z</p>
     */
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
