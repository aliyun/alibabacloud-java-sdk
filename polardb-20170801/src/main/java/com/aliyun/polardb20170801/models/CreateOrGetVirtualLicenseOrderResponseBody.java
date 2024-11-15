// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateOrGetVirtualLicenseOrderResponseBody extends TeaModel {
    /**
     * <p>The number of generated activation codes.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ActivatedCodeCount")
    public Integer activatedCodeCount;

    /**
     * <p>The maximum number of activation codes that you can apply for.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ActivationCodeQuota")
    public Integer activationCodeQuota;

    /**
     * <p>The Alibaba Cloud order ID (including the virtual order ID).</p>
     * 
     * <strong>example:</strong>
     * <p>2233****445566</p>
     */
    @NameInMap("AliyunOrderId")
    public String aliyunOrderId;

    /**
     * <p>Indicates whether activation codes can be generated without the system identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AllowEmptySystemIdentifier")
    public Boolean allowEmptySystemIdentifier;

    /**
     * <p>The time when the order was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-10-16 16:46:20</p>
     */
    @NameInMap("GmtCreated")
    public String gmtCreated;

    /**
     * <p>The time when the order was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-10-16 16:46:20</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <p>Indicates whether the order is a virtual order (virtual orders allow pre-generation of activation codes).</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsVirtualOrder")
    public Boolean isVirtualOrder;

    /**
     * <p>Indicates whether the virtual order is frozen (activation codes cannot be generated for a frozen virtual order).</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsVirtualOrderFrozen")
    public Boolean isVirtualOrderFrozen;

    /**
     * <p>The plan type.</p>
     * 
     * <strong>example:</strong>
     * <p>pre_generation_long_term</p>
     */
    @NameInMap("PackageType")
    public String packageType;

    /**
     * <p>The validity period of the plan, which is one year (common) or thirty years (long-term).</p>
     * 
     * <strong>example:</strong>
     * <p>30 years</p>
     */
    @NameInMap("PackageValidity")
    public String packageValidity;

    /**
     * <p>The purchase channel.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun_market</p>
     */
    @NameInMap("PurchaseChannel")
    public String purchaseChannel;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>45D24263-7E3A-4140-9472-************</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the virtual order.</p>
     * 
     * <strong>example:</strong>
     * <p>2024********483</p>
     */
    @NameInMap("VirtualOrderId")
    public String virtualOrderId;

    public static CreateOrGetVirtualLicenseOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrGetVirtualLicenseOrderResponseBody self = new CreateOrGetVirtualLicenseOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrGetVirtualLicenseOrderResponseBody setActivatedCodeCount(Integer activatedCodeCount) {
        this.activatedCodeCount = activatedCodeCount;
        return this;
    }
    public Integer getActivatedCodeCount() {
        return this.activatedCodeCount;
    }

    public CreateOrGetVirtualLicenseOrderResponseBody setActivationCodeQuota(Integer activationCodeQuota) {
        this.activationCodeQuota = activationCodeQuota;
        return this;
    }
    public Integer getActivationCodeQuota() {
        return this.activationCodeQuota;
    }

    public CreateOrGetVirtualLicenseOrderResponseBody setAliyunOrderId(String aliyunOrderId) {
        this.aliyunOrderId = aliyunOrderId;
        return this;
    }
    public String getAliyunOrderId() {
        return this.aliyunOrderId;
    }

    public CreateOrGetVirtualLicenseOrderResponseBody setAllowEmptySystemIdentifier(Boolean allowEmptySystemIdentifier) {
        this.allowEmptySystemIdentifier = allowEmptySystemIdentifier;
        return this;
    }
    public Boolean getAllowEmptySystemIdentifier() {
        return this.allowEmptySystemIdentifier;
    }

    public CreateOrGetVirtualLicenseOrderResponseBody setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    public CreateOrGetVirtualLicenseOrderResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public CreateOrGetVirtualLicenseOrderResponseBody setIsVirtualOrder(Boolean isVirtualOrder) {
        this.isVirtualOrder = isVirtualOrder;
        return this;
    }
    public Boolean getIsVirtualOrder() {
        return this.isVirtualOrder;
    }

    public CreateOrGetVirtualLicenseOrderResponseBody setIsVirtualOrderFrozen(Boolean isVirtualOrderFrozen) {
        this.isVirtualOrderFrozen = isVirtualOrderFrozen;
        return this;
    }
    public Boolean getIsVirtualOrderFrozen() {
        return this.isVirtualOrderFrozen;
    }

    public CreateOrGetVirtualLicenseOrderResponseBody setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public CreateOrGetVirtualLicenseOrderResponseBody setPackageValidity(String packageValidity) {
        this.packageValidity = packageValidity;
        return this;
    }
    public String getPackageValidity() {
        return this.packageValidity;
    }

    public CreateOrGetVirtualLicenseOrderResponseBody setPurchaseChannel(String purchaseChannel) {
        this.purchaseChannel = purchaseChannel;
        return this;
    }
    public String getPurchaseChannel() {
        return this.purchaseChannel;
    }

    public CreateOrGetVirtualLicenseOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOrGetVirtualLicenseOrderResponseBody setVirtualOrderId(String virtualOrderId) {
        this.virtualOrderId = virtualOrderId;
        return this;
    }
    public String getVirtualOrderId() {
        return this.virtualOrderId;
    }

}
