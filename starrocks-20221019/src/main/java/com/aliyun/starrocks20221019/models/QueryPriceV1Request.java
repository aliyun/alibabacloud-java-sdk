// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class QueryPriceV1Request extends TeaModel {
    @NameInMap("AgentNodeGroup")
    public QueryPriceV1RequestAgentNodeGroup agentNodeGroup;

    @NameInMap("BackendNodeGroups")
    public java.util.List<QueryPriceV1RequestBackendNodeGroups> backendNodeGroups;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("FrontendNodeGroups")
    public java.util.List<QueryPriceV1RequestFrontendNodeGroups> frontendNodeGroups;

    @NameInMap("ObserverNodeGroups")
    public java.util.List<QueryPriceV1RequestObserverNodeGroups> observerNodeGroups;

    /**
     * <strong>example:</strong>
     * <p>official</p>
     */
    @NameInMap("PackageType")
    public String packageType;

    /**
     * <strong>example:</strong>
     * <p>prePaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <strong>example:</strong>
     * <p>youhuiquan_12378dfj6</p>
     */
    @NameInMap("PromotionOptionNo")
    public String promotionOptionNo;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
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
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("cu")
        public String cu;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("diskNumber")
        public Integer diskNumber;

        /**
         * <strong>example:</strong>
         * <p>local_ssd_4_4xlarge</p>
         */
        @NameInMap("localStorageInstanceType")
        public String localStorageInstanceType;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("residentNodeNumber")
        public Integer residentNodeNumber;

        /**
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("specType")
        public String specType;

        /**
         * <strong>example:</strong>
         * <p>pl1</p>
         */
        @NameInMap("storagePerformanceLevel")
        public String storagePerformanceLevel;

        /**
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
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("cu")
        public String cu;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("diskNumber")
        public Integer diskNumber;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("localStorageInstanceType")
        public String localStorageInstanceType;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("residentNodeNumber")
        public Integer residentNodeNumber;

        /**
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("specType")
        public String specType;

        /**
         * <strong>example:</strong>
         * <p>pl1</p>
         */
        @NameInMap("storagePerformanceLevel")
        public String storagePerformanceLevel;

        /**
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
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("cu")
        public String cu;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("diskNumber")
        public Integer diskNumber;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("localStorageInstanceType")
        public String localStorageInstanceType;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("residentNodeNumber")
        public Integer residentNodeNumber;

        /**
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("specType")
        public String specType;

        /**
         * <strong>example:</strong>
         * <p>pl1</p>
         */
        @NameInMap("storagePerformanceLevel")
        public String storagePerformanceLevel;

        /**
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
