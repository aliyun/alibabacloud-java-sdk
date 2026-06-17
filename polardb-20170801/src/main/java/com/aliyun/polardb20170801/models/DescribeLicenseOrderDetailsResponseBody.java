// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeLicenseOrderDetailsResponseBody extends TeaModel {
    /**
     * <p>The number of activation codes that have been generated.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ActivatedCodeCount")
    public Integer activatedCodeCount;

    /**
     * <p>The quota for requesting activation codes.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("ActivationCodeQuota")
    public Integer activationCodeQuota;

    /**
     * <p>The ID of the Alibaba Cloud order, including the virtual order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>239618016570503</p>
     */
    @NameInMap("AliyunOrderId")
    public String aliyunOrderId;

    /**
     * <p>Indicates whether you can leave the System Identifier parameter empty when you generate an activation code.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AllowEmptySystemIdentifier")
    public Boolean allowEmptySystemIdentifier;

    /**
     * <p>The database type, such as PG, Oracle, or MySQL.</p>
     * 
     * <strong>example:</strong>
     * <p>PG</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The time when the order was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-10-19 01:13:45</p>
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
     * <p>Indicates whether the order is a virtual order. You can pre-generate activation codes for virtual orders.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsVirtualOrder")
    public Boolean isVirtualOrder;

    /**
     * <p>Indicates whether the virtual order is frozen. If a virtual order is frozen, you can no longer generate activation codes.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsVirtualOrderFrozen")
    public Boolean isVirtualOrderFrozen;

    /**
     * <p>The package type. Valid values:</p>
     * <ul>
     * <li><p>single_node_subscribe: single-node (subscription)</p>
     * </li>
     * <li><p>single_node_long_term: single-node (long-term)</p>
     * </li>
     * <li><p>primary_backup_subscribe: primary/standby (subscription)</p>
     * </li>
     * <li><p>primary_backup_long_term: primary/standby (long-term)</p>
     * </li>
     * <li><p>pre_generation_long_term: pre-generation (long-term)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pre_generation_long_term</p>
     */
    @NameInMap("PackageType")
    public String packageType;

    /**
     * <p>The validity period of the package. The validity period is typically one year or a long-term period of 30 years.</p>
     * 
     * <strong>example:</strong>
     * <p>1 year</p>
     */
    @NameInMap("PackageValidity")
    public String packageValidity;

    /**
     * <p>The purchase channel. Valid values: \<code>aliyun_market\\</code> (Alibaba Cloud Marketplace) and \<code>aliyun_public\\</code> (standard purchase page).</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun_market</p>
     */
    @NameInMap("PurchaseChannel")
    public String purchaseChannel;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>22C0ACF0-DD29-4B67-9190-B7A48C******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The virtual order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>239618016570503</p>
     */
    @NameInMap("VirtualOrderId")
    public String virtualOrderId;

    public static DescribeLicenseOrderDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLicenseOrderDetailsResponseBody self = new DescribeLicenseOrderDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLicenseOrderDetailsResponseBody setActivatedCodeCount(Integer activatedCodeCount) {
        this.activatedCodeCount = activatedCodeCount;
        return this;
    }
    public Integer getActivatedCodeCount() {
        return this.activatedCodeCount;
    }

    public DescribeLicenseOrderDetailsResponseBody setActivationCodeQuota(Integer activationCodeQuota) {
        this.activationCodeQuota = activationCodeQuota;
        return this;
    }
    public Integer getActivationCodeQuota() {
        return this.activationCodeQuota;
    }

    public DescribeLicenseOrderDetailsResponseBody setAliyunOrderId(String aliyunOrderId) {
        this.aliyunOrderId = aliyunOrderId;
        return this;
    }
    public String getAliyunOrderId() {
        return this.aliyunOrderId;
    }

    public DescribeLicenseOrderDetailsResponseBody setAllowEmptySystemIdentifier(Boolean allowEmptySystemIdentifier) {
        this.allowEmptySystemIdentifier = allowEmptySystemIdentifier;
        return this;
    }
    public Boolean getAllowEmptySystemIdentifier() {
        return this.allowEmptySystemIdentifier;
    }

    public DescribeLicenseOrderDetailsResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeLicenseOrderDetailsResponseBody setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    public DescribeLicenseOrderDetailsResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public DescribeLicenseOrderDetailsResponseBody setIsVirtualOrder(Boolean isVirtualOrder) {
        this.isVirtualOrder = isVirtualOrder;
        return this;
    }
    public Boolean getIsVirtualOrder() {
        return this.isVirtualOrder;
    }

    public DescribeLicenseOrderDetailsResponseBody setIsVirtualOrderFrozen(Boolean isVirtualOrderFrozen) {
        this.isVirtualOrderFrozen = isVirtualOrderFrozen;
        return this;
    }
    public Boolean getIsVirtualOrderFrozen() {
        return this.isVirtualOrderFrozen;
    }

    public DescribeLicenseOrderDetailsResponseBody setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public DescribeLicenseOrderDetailsResponseBody setPackageValidity(String packageValidity) {
        this.packageValidity = packageValidity;
        return this;
    }
    public String getPackageValidity() {
        return this.packageValidity;
    }

    public DescribeLicenseOrderDetailsResponseBody setPurchaseChannel(String purchaseChannel) {
        this.purchaseChannel = purchaseChannel;
        return this;
    }
    public String getPurchaseChannel() {
        return this.purchaseChannel;
    }

    public DescribeLicenseOrderDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLicenseOrderDetailsResponseBody setVirtualOrderId(String virtualOrderId) {
        this.virtualOrderId = virtualOrderId;
        return this;
    }
    public String getVirtualOrderId() {
        return this.virtualOrderId;
    }

}
