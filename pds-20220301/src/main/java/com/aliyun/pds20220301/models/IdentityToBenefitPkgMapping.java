// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class IdentityToBenefitPkgMapping extends TeaModel {
    /**
     * <p>The rule for calculating the benefits within the package.</p>
     * <p>For a user-level benefit package, this parameter is empty. The effective benefit quota is calculated based only on the priority.</p>
     * <p>For a user-resource benefit package, this parameter can be empty or have a value. If a value is returned, the package is used to append the quota of existing benefits in other packages. This applies only to quota-based benefits. For example, if a user-level benefit package includes 10 GB of user storage capacity, you can define one or more user-resource benefit packages to increase the storage capacity for specific users.</p>
     * <p>Supported append rules include the following:</p>
     * <p>sum: If multiple packages have the same benefit, their values are added together.</p>
     * <p>max: If multiple packages have the same benefit, the maximum value is used.</p>
     * <p>min: If multiple packages have the same benefit, the minimum value is used.</p>
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
     * 
     * <strong>example:</strong>
     * <p>高级会员</p>
     */
    @NameInMap("benefit_pkg_name")
    public String benefitPkgName;

    /**
     * <p>The ID of the benefit package owner.</p>
     * 
     * <strong>example:</strong>
     * <p>bj1</p>
     */
    @NameInMap("benefit_pkg_owner_id")
    public String benefitPkgOwnerId;

    /**
     * <p>The priority of the benefit package.</p>
     * <p>For a user-level benefit package, a smaller value indicates a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("benefit_pkg_priority")
    public Long benefitPkgPriority;

    /**
     * <p>The type of the benefit package.</p>
     * <p>Valid values:</p>
     * <p>user_identity: A benefit package for user levels.</p>
     * <p>user_resource: A benefit package for user resources.</p>
     * 
     * <strong>example:</strong>
     * <p>user_identity</p>
     */
    @NameInMap("benefit_pkg_type")
    public String benefitPkgType;

    /**
     * <p>The time when the entity was associated with the benefit package.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-08-20T06:51:27.292Z</p>
     */
    @NameInMap("created_at")
    public String createdAt;

    /**
     * <p>A list of delivery information for the benefit package.</p>
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
     * <p>The time when the association between the entity and the benefit package was last updated.</p>
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
