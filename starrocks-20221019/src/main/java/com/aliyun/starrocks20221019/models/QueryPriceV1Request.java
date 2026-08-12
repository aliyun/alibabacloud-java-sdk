// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class QueryPriceV1Request extends TeaModel {
    /**
     * <p>Agent compute group.</p>
     */
    @NameInMap("AgentNodeGroup")
    public QueryPriceV1RequestAgentNodeGroup agentNodeGroup;

    /**
     * <p>BE or CN compute group information.</p>
     */
    @NameInMap("BackendNodeGroups")
    public java.util.List<QueryPriceV1RequestBackendNodeGroups> backendNodeGroups;

    /**
     * <p>Subscription duration. Valid only when PayType is prePaid.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>FE node group information.</p>
     */
    @NameInMap("FrontendNodeGroups")
    public java.util.List<QueryPriceV1RequestFrontendNodeGroups> frontendNodeGroups;

    /**
     * <p>Observer compute group information.</p>
     */
    @NameInMap("ObserverNodeGroups")
    public java.util.List<QueryPriceV1RequestObserverNodeGroups> observerNodeGroups;

    /**
     * <p>Instance edition:</p>
     * <ul>
     * <li><p>Trial Edition (trial).</p>
     * </li>
     * <li><p>Standard Edition (official).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>official</p>
     */
    @NameInMap("PackageType")
    public String packageType;

    /**
     * <p>Payment type:</p>
     * <ol>
     * <li><p>Subscription (prePaid).</p>
     * </li>
     * <li><p>Pay-as-you-go (postPaid).</p>
     * </li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>prePaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>Subscription duration unit:</p>
     * <ul>
     * <li><p>Month (Month)</p>
     * </li>
     * <li><p>Year (Year)</p>
     * </li>
     * </ul>
     * <p>Valid only when PayType is prePaid.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>Coupon ID.</p>
     * 
     * <strong>example:</strong>
     * <p>youhuiquan_12378dfj6</p>
     */
    @NameInMap("PromotionOptionNo")
    public String promotionOptionNo;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Cluster run mode:</p>
     * <ul>
     * <li><p>Shared-nothing (shared_nothing).</p>
     * </li>
     * <li><p>Shared-data (shared_data).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>shared_data</p>
     */
    @NameInMap("RunMode")
    public String runMode;

    public static QueryPriceV1Request build(java.util.Map<String, ?> map) throws Exception {
        QueryPriceV1Request self = new QueryPriceV1Request();
        return TeaModel.build(map, self);
    }

    public QueryPriceV1Request setAgentNodeGroup(QueryPriceV1RequestAgentNodeGroup agentNodeGroup) {
        this.agentNodeGroup = agentNodeGroup;
        return this;
    }
    public QueryPriceV1RequestAgentNodeGroup getAgentNodeGroup() {
        return this.agentNodeGroup;
    }

    public QueryPriceV1Request setBackendNodeGroups(java.util.List<QueryPriceV1RequestBackendNodeGroups> backendNodeGroups) {
        this.backendNodeGroups = backendNodeGroups;
        return this;
    }
    public java.util.List<QueryPriceV1RequestBackendNodeGroups> getBackendNodeGroups() {
        return this.backendNodeGroups;
    }

    public QueryPriceV1Request setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public QueryPriceV1Request setFrontendNodeGroups(java.util.List<QueryPriceV1RequestFrontendNodeGroups> frontendNodeGroups) {
        this.frontendNodeGroups = frontendNodeGroups;
        return this;
    }
    public java.util.List<QueryPriceV1RequestFrontendNodeGroups> getFrontendNodeGroups() {
        return this.frontendNodeGroups;
    }

    public QueryPriceV1Request setObserverNodeGroups(java.util.List<QueryPriceV1RequestObserverNodeGroups> observerNodeGroups) {
        this.observerNodeGroups = observerNodeGroups;
        return this;
    }
    public java.util.List<QueryPriceV1RequestObserverNodeGroups> getObserverNodeGroups() {
        return this.observerNodeGroups;
    }

    public QueryPriceV1Request setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public QueryPriceV1Request setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public QueryPriceV1Request setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public QueryPriceV1Request setPromotionOptionNo(String promotionOptionNo) {
        this.promotionOptionNo = promotionOptionNo;
        return this;
    }
    public String getPromotionOptionNo() {
        return this.promotionOptionNo;
    }

    public QueryPriceV1Request setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryPriceV1Request setRunMode(String runMode) {
        this.runMode = runMode;
        return this;
    }
    public String getRunMode() {
        return this.runMode;
    }

    public static class QueryPriceV1RequestAgentNodeGroup extends TeaModel {
        /**
         * <p>Number of CUs. A Compute Unit (CU) is the basic billing unit. One CU equals one vCPU plus 4 GiB of memory.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("cu")
        public Integer cu;

        public static QueryPriceV1RequestAgentNodeGroup build(java.util.Map<String, ?> map) throws Exception {
            QueryPriceV1RequestAgentNodeGroup self = new QueryPriceV1RequestAgentNodeGroup();
            return TeaModel.build(map, self);
        }

        public QueryPriceV1RequestAgentNodeGroup setCu(Integer cu) {
            this.cu = cu;
            return this;
        }
        public Integer getCu() {
            return this.cu;
        }

    }

    public static class QueryPriceV1RequestBackendNodeGroups extends TeaModel {
        /**
         * <p>Number of CUs. A Compute Unit (CU) is the basic billing unit. One CU equals one vCPU plus 4 GiB of memory. For ramEnhanced instances, one CU equals one vCPU plus 8 GiB of memory.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("cu")
        public String cu;

        /**
         * <p>Number of disks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("diskNumber")
        public Integer diskNumber;

        /**
         * <p>Local SSD instance type for the node group. This field applies only to ECS-based instances with specType set to localSSD or bigData.</p>
         * 
         * <strong>example:</strong>
         * <p>local_ssd_4_4xlarge</p>
         */
        @NameInMap("localStorageInstanceType")
        public String localStorageInstanceType;

        /**
         * <p>Number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("residentNodeNumber")
        public Integer residentNodeNumber;

        /**
         * <p>Compute group specification type. Supported types include the following:</p>
         * <ul>
         * <li><p>standard: Standard Edition.</p>
         * </li>
         * <li><p>localSSD: Local SSD.</p>
         * </li>
         * <li><p>bigData: Large-storage Edition.</p>
         * </li>
         * <li><p>ramEnhanced: Memory-enhanced instance family.</p>
         * </li>
         * <li><p>networkEnhanced: Network-enhanced instance family.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("specType")
        public String specType;

        /**
         * <p>Disk performance level. Supported values include the following:</p>
         * <ul>
         * <li><p>pl0: Maximum random read/write IOPS per disk is 10,000.</p>
         * </li>
         * <li><p>pl1: Maximum random read/write IOPS per disk is 50,000.</p>
         * </li>
         * <li><p>pl2: Maximum random read/write IOPS per disk is 100,000.</p>
         * </li>
         * <li><p>pl3: Maximum random read/write IOPS per disk is 1,000,000.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pl1</p>
         */
        @NameInMap("storagePerformanceLevel")
        public String storagePerformanceLevel;

        /**
         * <p>Storage size in GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("storageSize")
        public Integer storageSize;

        public static QueryPriceV1RequestBackendNodeGroups build(java.util.Map<String, ?> map) throws Exception {
            QueryPriceV1RequestBackendNodeGroups self = new QueryPriceV1RequestBackendNodeGroups();
            return TeaModel.build(map, self);
        }

        public QueryPriceV1RequestBackendNodeGroups setCu(String cu) {
            this.cu = cu;
            return this;
        }
        public String getCu() {
            return this.cu;
        }

        public QueryPriceV1RequestBackendNodeGroups setDiskNumber(Integer diskNumber) {
            this.diskNumber = diskNumber;
            return this;
        }
        public Integer getDiskNumber() {
            return this.diskNumber;
        }

        public QueryPriceV1RequestBackendNodeGroups setLocalStorageInstanceType(String localStorageInstanceType) {
            this.localStorageInstanceType = localStorageInstanceType;
            return this;
        }
        public String getLocalStorageInstanceType() {
            return this.localStorageInstanceType;
        }

        public QueryPriceV1RequestBackendNodeGroups setResidentNodeNumber(Integer residentNodeNumber) {
            this.residentNodeNumber = residentNodeNumber;
            return this;
        }
        public Integer getResidentNodeNumber() {
            return this.residentNodeNumber;
        }

        public QueryPriceV1RequestBackendNodeGroups setSpecType(String specType) {
            this.specType = specType;
            return this;
        }
        public String getSpecType() {
            return this.specType;
        }

        public QueryPriceV1RequestBackendNodeGroups setStoragePerformanceLevel(String storagePerformanceLevel) {
            this.storagePerformanceLevel = storagePerformanceLevel;
            return this;
        }
        public String getStoragePerformanceLevel() {
            return this.storagePerformanceLevel;
        }

        public QueryPriceV1RequestBackendNodeGroups setStorageSize(Integer storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Integer getStorageSize() {
            return this.storageSize;
        }

    }

    public static class QueryPriceV1RequestFrontendNodeGroups extends TeaModel {
        /**
         * <p>Number of CUs. A Compute Unit (CU) is the basic billing unit. One CU equals one vCPU plus 4 GiB of memory.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("cu")
        public String cu;

        /**
         * <p>Number of disks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("diskNumber")
        public Integer diskNumber;

        /**
         * <p>Local SSD instance type. Do not set this field for FE compute groups.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("localStorageInstanceType")
        public String localStorageInstanceType;

        /**
         * <p>Number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("residentNodeNumber")
        public Integer residentNodeNumber;

        /**
         * <p>Compute group specification type. Only standard is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("specType")
        public String specType;

        /**
         * <p>Disk performance level. Only pl1 is supported. Maximum random read/write IOPS per disk is 50,000.</p>
         * 
         * <strong>example:</strong>
         * <p>pl1</p>
         */
        @NameInMap("storagePerformanceLevel")
        public String storagePerformanceLevel;

        /**
         * <p>Storage size in GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("storageSize")
        public Integer storageSize;

        public static QueryPriceV1RequestFrontendNodeGroups build(java.util.Map<String, ?> map) throws Exception {
            QueryPriceV1RequestFrontendNodeGroups self = new QueryPriceV1RequestFrontendNodeGroups();
            return TeaModel.build(map, self);
        }

        public QueryPriceV1RequestFrontendNodeGroups setCu(String cu) {
            this.cu = cu;
            return this;
        }
        public String getCu() {
            return this.cu;
        }

        public QueryPriceV1RequestFrontendNodeGroups setDiskNumber(Integer diskNumber) {
            this.diskNumber = diskNumber;
            return this;
        }
        public Integer getDiskNumber() {
            return this.diskNumber;
        }

        public QueryPriceV1RequestFrontendNodeGroups setLocalStorageInstanceType(String localStorageInstanceType) {
            this.localStorageInstanceType = localStorageInstanceType;
            return this;
        }
        public String getLocalStorageInstanceType() {
            return this.localStorageInstanceType;
        }

        public QueryPriceV1RequestFrontendNodeGroups setResidentNodeNumber(Integer residentNodeNumber) {
            this.residentNodeNumber = residentNodeNumber;
            return this;
        }
        public Integer getResidentNodeNumber() {
            return this.residentNodeNumber;
        }

        public QueryPriceV1RequestFrontendNodeGroups setSpecType(String specType) {
            this.specType = specType;
            return this;
        }
        public String getSpecType() {
            return this.specType;
        }

        public QueryPriceV1RequestFrontendNodeGroups setStoragePerformanceLevel(String storagePerformanceLevel) {
            this.storagePerformanceLevel = storagePerformanceLevel;
            return this;
        }
        public String getStoragePerformanceLevel() {
            return this.storagePerformanceLevel;
        }

        public QueryPriceV1RequestFrontendNodeGroups setStorageSize(Integer storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Integer getStorageSize() {
            return this.storageSize;
        }

    }

    public static class QueryPriceV1RequestObserverNodeGroups extends TeaModel {
        /**
         * <p>Number of CUs. A Compute Unit (CU) is the basic billing unit. One CU equals one vCPU plus 4 GiB of memory.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("cu")
        public String cu;

        /**
         * <p>Number of disks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("diskNumber")
        public Integer diskNumber;

        /**
         * <p>Local SSD instance type. Do not set this field for Observer compute groups.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("localStorageInstanceType")
        public String localStorageInstanceType;

        /**
         * <p>Number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("residentNodeNumber")
        public Integer residentNodeNumber;

        /**
         * <p>Compute group specification type. Only standard is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("specType")
        public String specType;

        /**
         * <p>Disk performance level. Only pl1 is supported. Maximum random read/write IOPS per disk is 50,000.</p>
         * 
         * <strong>example:</strong>
         * <p>pl1</p>
         */
        @NameInMap("storagePerformanceLevel")
        public String storagePerformanceLevel;

        /**
         * <p>Storage size in GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("storageSize")
        public Integer storageSize;

        public static QueryPriceV1RequestObserverNodeGroups build(java.util.Map<String, ?> map) throws Exception {
            QueryPriceV1RequestObserverNodeGroups self = new QueryPriceV1RequestObserverNodeGroups();
            return TeaModel.build(map, self);
        }

        public QueryPriceV1RequestObserverNodeGroups setCu(String cu) {
            this.cu = cu;
            return this;
        }
        public String getCu() {
            return this.cu;
        }

        public QueryPriceV1RequestObserverNodeGroups setDiskNumber(Integer diskNumber) {
            this.diskNumber = diskNumber;
            return this;
        }
        public Integer getDiskNumber() {
            return this.diskNumber;
        }

        public QueryPriceV1RequestObserverNodeGroups setLocalStorageInstanceType(String localStorageInstanceType) {
            this.localStorageInstanceType = localStorageInstanceType;
            return this;
        }
        public String getLocalStorageInstanceType() {
            return this.localStorageInstanceType;
        }

        public QueryPriceV1RequestObserverNodeGroups setResidentNodeNumber(Integer residentNodeNumber) {
            this.residentNodeNumber = residentNodeNumber;
            return this;
        }
        public Integer getResidentNodeNumber() {
            return this.residentNodeNumber;
        }

        public QueryPriceV1RequestObserverNodeGroups setSpecType(String specType) {
            this.specType = specType;
            return this;
        }
        public String getSpecType() {
            return this.specType;
        }

        public QueryPriceV1RequestObserverNodeGroups setStoragePerformanceLevel(String storagePerformanceLevel) {
            this.storagePerformanceLevel = storagePerformanceLevel;
            return this;
        }
        public String getStoragePerformanceLevel() {
            return this.storagePerformanceLevel;
        }

        public QueryPriceV1RequestObserverNodeGroups setStorageSize(Integer storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Integer getStorageSize() {
            return this.storageSize;
        }

    }

}
