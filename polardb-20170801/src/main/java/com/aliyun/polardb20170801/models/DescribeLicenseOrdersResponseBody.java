// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeLicenseOrdersResponseBody extends TeaModel {
    /**
     * <p>The list of orders.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeLicenseOrdersResponseBodyItems> items;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>34458CD3-33E0-4624-BFEF-840C15******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeLicenseOrdersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLicenseOrdersResponseBody self = new DescribeLicenseOrdersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLicenseOrdersResponseBody setItems(java.util.List<DescribeLicenseOrdersResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeLicenseOrdersResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeLicenseOrdersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLicenseOrdersResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeLicenseOrdersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLicenseOrdersResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeLicenseOrdersResponseBodyItems extends TeaModel {
        /**
         * <p>The number of activation codes that have been generated.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ActivatedCodeCount")
        public Integer activatedCodeCount;

        /**
         * <p>The quota for requesting activation codes.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ActivationCodeQuota")
        public Integer activationCodeQuota;

        /**
         * <p>The Alibaba Cloud order ID or virtual order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>227638319690519</p>
         */
        @NameInMap("AliyunOrderId")
        public String aliyunOrderId;

        /**
         * <p>Specifies whether the System Identifier can be left empty when an activation code is generated.</p>
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
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-11 03:14:15</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-11 03:14:15</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Indicates whether the order is a virtual order. Virtual orders allow for pre-generating activation codes.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsVirtualOrder")
        public Boolean isVirtualOrder;

        /**
         * <p>Indicates whether the virtual order is frozen. No more activation codes can be generated from a frozen order.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsVirtualOrderFrozen")
        public Boolean isVirtualOrderFrozen;

        /**
         * <p>The package type. Valid values:</p>
         * <ul>
         * <li><p>single_node_subscribe: single node (subscription)</p>
         * </li>
         * <li><p>single_node_long_term: single node (long-term)</p>
         * </li>
         * <li><p>primary_backup_subscribe: primary/standby (subscription)</p>
         * </li>
         * <li><p>primary_backup_long_term: primary/standby (long-term)</p>
         * </li>
         * <li><p>pre_generation_long_term: pre-generated (long-term)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>single_node_subscribe</p>
         */
        @NameInMap("PackageType")
        public String packageType;

        /**
         * <p>The validity period of the package. Common options are one year or long-term (30 years).</p>
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
         * <p>aliyun_public</p>
         */
        @NameInMap("PurchaseChannel")
        public String purchaseChannel;

        /**
         * <p>The virtual order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>227638319690519</p>
         */
        @NameInMap("VirtualAliyunOrderId")
        public String virtualAliyunOrderId;

        public static DescribeLicenseOrdersResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeLicenseOrdersResponseBodyItems self = new DescribeLicenseOrdersResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeLicenseOrdersResponseBodyItems setActivatedCodeCount(Integer activatedCodeCount) {
            this.activatedCodeCount = activatedCodeCount;
            return this;
        }
        public Integer getActivatedCodeCount() {
            return this.activatedCodeCount;
        }

        public DescribeLicenseOrdersResponseBodyItems setActivationCodeQuota(Integer activationCodeQuota) {
            this.activationCodeQuota = activationCodeQuota;
            return this;
        }
        public Integer getActivationCodeQuota() {
            return this.activationCodeQuota;
        }

        public DescribeLicenseOrdersResponseBodyItems setAliyunOrderId(String aliyunOrderId) {
            this.aliyunOrderId = aliyunOrderId;
            return this;
        }
        public String getAliyunOrderId() {
            return this.aliyunOrderId;
        }

        public DescribeLicenseOrdersResponseBodyItems setAllowEmptySystemIdentifier(Boolean allowEmptySystemIdentifier) {
            this.allowEmptySystemIdentifier = allowEmptySystemIdentifier;
            return this;
        }
        public Boolean getAllowEmptySystemIdentifier() {
            return this.allowEmptySystemIdentifier;
        }

        public DescribeLicenseOrdersResponseBodyItems setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeLicenseOrdersResponseBodyItems setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeLicenseOrdersResponseBodyItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeLicenseOrdersResponseBodyItems setIsVirtualOrder(Boolean isVirtualOrder) {
            this.isVirtualOrder = isVirtualOrder;
            return this;
        }
        public Boolean getIsVirtualOrder() {
            return this.isVirtualOrder;
        }

        public DescribeLicenseOrdersResponseBodyItems setIsVirtualOrderFrozen(Boolean isVirtualOrderFrozen) {
            this.isVirtualOrderFrozen = isVirtualOrderFrozen;
            return this;
        }
        public Boolean getIsVirtualOrderFrozen() {
            return this.isVirtualOrderFrozen;
        }

        public DescribeLicenseOrdersResponseBodyItems setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public DescribeLicenseOrdersResponseBodyItems setPackageValidity(String packageValidity) {
            this.packageValidity = packageValidity;
            return this;
        }
        public String getPackageValidity() {
            return this.packageValidity;
        }

        public DescribeLicenseOrdersResponseBodyItems setPurchaseChannel(String purchaseChannel) {
            this.purchaseChannel = purchaseChannel;
            return this;
        }
        public String getPurchaseChannel() {
            return this.purchaseChannel;
        }

        public DescribeLicenseOrdersResponseBodyItems setVirtualAliyunOrderId(String virtualAliyunOrderId) {
            this.virtualAliyunOrderId = virtualAliyunOrderId;
            return this;
        }
        public String getVirtualAliyunOrderId() {
            return this.virtualAliyunOrderId;
        }

    }

}
