// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListMultiUserInstancesResponseBody extends TeaModel {
    @NameInMap("DaInstance")
    public ListMultiUserInstancesResponseBodyDaInstance daInstance;

    @NameInMap("PageInfo")
    public ListMultiUserInstancesResponseBodyPageInfo pageInfo;

    /**
     * <strong>example:</strong>
     * <p>88F2A6CD-E500-5038-B992-0107B99AA88C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SaleInstanceList")
    public java.util.List<ListMultiUserInstancesResponseBodySaleInstanceList> saleInstanceList;

    public static ListMultiUserInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMultiUserInstancesResponseBody self = new ListMultiUserInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMultiUserInstancesResponseBody setDaInstance(ListMultiUserInstancesResponseBodyDaInstance daInstance) {
        this.daInstance = daInstance;
        return this;
    }
    public ListMultiUserInstancesResponseBodyDaInstance getDaInstance() {
        return this.daInstance;
    }

    public ListMultiUserInstancesResponseBody setPageInfo(ListMultiUserInstancesResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListMultiUserInstancesResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListMultiUserInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMultiUserInstancesResponseBody setSaleInstanceList(java.util.List<ListMultiUserInstancesResponseBodySaleInstanceList> saleInstanceList) {
        this.saleInstanceList = saleInstanceList;
        return this;
    }
    public java.util.List<ListMultiUserInstancesResponseBodySaleInstanceList> getSaleInstanceList() {
        return this.saleInstanceList;
    }

    public static class ListMultiUserInstancesResponseBodyDaInstanceAntiRansomwareCapacity extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Assigned")
        public Long assigned;

        /**
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Used")
        public Long used;

        public static ListMultiUserInstancesResponseBodyDaInstanceAntiRansomwareCapacity build(java.util.Map<String, ?> map) throws Exception {
            ListMultiUserInstancesResponseBodyDaInstanceAntiRansomwareCapacity self = new ListMultiUserInstancesResponseBodyDaInstanceAntiRansomwareCapacity();
            return TeaModel.build(map, self);
        }

        public ListMultiUserInstancesResponseBodyDaInstanceAntiRansomwareCapacity setAssigned(Long assigned) {
            this.assigned = assigned;
            return this;
        }
        public Long getAssigned() {
            return this.assigned;
        }

        public ListMultiUserInstancesResponseBodyDaInstanceAntiRansomwareCapacity setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListMultiUserInstancesResponseBodyDaInstanceAntiRansomwareCapacity setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

    }

    public static class ListMultiUserInstancesResponseBodyDaInstanceCspmCapacity extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Assigned")
        public Long assigned;

        /**
         * <strong>example:</strong>
         * <p>180000</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>31569</p>
         */
        @NameInMap("Used")
        public Long used;

        public static ListMultiUserInstancesResponseBodyDaInstanceCspmCapacity build(java.util.Map<String, ?> map) throws Exception {
            ListMultiUserInstancesResponseBodyDaInstanceCspmCapacity self = new ListMultiUserInstancesResponseBodyDaInstanceCspmCapacity();
            return TeaModel.build(map, self);
        }

        public ListMultiUserInstancesResponseBodyDaInstanceCspmCapacity setAssigned(Long assigned) {
            this.assigned = assigned;
            return this;
        }
        public Long getAssigned() {
            return this.assigned;
        }

        public ListMultiUserInstancesResponseBodyDaInstanceCspmCapacity setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListMultiUserInstancesResponseBodyDaInstanceCspmCapacity setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

    }

    public static class ListMultiUserInstancesResponseBodyDaInstanceHoneypotCapacity extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Assigned")
        public Long assigned;

        /**
         * <strong>example:</strong>
         * <p>45</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("Used")
        public Long used;

        public static ListMultiUserInstancesResponseBodyDaInstanceHoneypotCapacity build(java.util.Map<String, ?> map) throws Exception {
            ListMultiUserInstancesResponseBodyDaInstanceHoneypotCapacity self = new ListMultiUserInstancesResponseBodyDaInstanceHoneypotCapacity();
            return TeaModel.build(map, self);
        }

        public ListMultiUserInstancesResponseBodyDaInstanceHoneypotCapacity setAssigned(Long assigned) {
            this.assigned = assigned;
            return this;
        }
        public Long getAssigned() {
            return this.assigned;
        }

        public ListMultiUserInstancesResponseBodyDaInstanceHoneypotCapacity setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListMultiUserInstancesResponseBodyDaInstanceHoneypotCapacity setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

    }

    public static class ListMultiUserInstancesResponseBodyDaInstanceImageScanCapacity extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Assigned")
        public Long assigned;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Used")
        public Long used;

        public static ListMultiUserInstancesResponseBodyDaInstanceImageScanCapacity build(java.util.Map<String, ?> map) throws Exception {
            ListMultiUserInstancesResponseBodyDaInstanceImageScanCapacity self = new ListMultiUserInstancesResponseBodyDaInstanceImageScanCapacity();
            return TeaModel.build(map, self);
        }

        public ListMultiUserInstancesResponseBodyDaInstanceImageScanCapacity setAssigned(Long assigned) {
            this.assigned = assigned;
            return this;
        }
        public Long getAssigned() {
            return this.assigned;
        }

        public ListMultiUserInstancesResponseBodyDaInstanceImageScanCapacity setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListMultiUserInstancesResponseBodyDaInstanceImageScanCapacity setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

    }

    public static class ListMultiUserInstancesResponseBodyDaInstanceRaspCapacity extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Assigned")
        public Long assigned;

        /**
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Used")
        public Long used;

        public static ListMultiUserInstancesResponseBodyDaInstanceRaspCapacity build(java.util.Map<String, ?> map) throws Exception {
            ListMultiUserInstancesResponseBodyDaInstanceRaspCapacity self = new ListMultiUserInstancesResponseBodyDaInstanceRaspCapacity();
            return TeaModel.build(map, self);
        }

        public ListMultiUserInstancesResponseBodyDaInstanceRaspCapacity setAssigned(Long assigned) {
            this.assigned = assigned;
            return this;
        }
        public Long getAssigned() {
            return this.assigned;
        }

        public ListMultiUserInstancesResponseBodyDaInstanceRaspCapacity setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListMultiUserInstancesResponseBodyDaInstanceRaspCapacity setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

    }

    public static class ListMultiUserInstancesResponseBodyDaInstanceSdkCapacity extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Assigned")
        public Long assigned;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Used")
        public Long used;

        public static ListMultiUserInstancesResponseBodyDaInstanceSdkCapacity build(java.util.Map<String, ?> map) throws Exception {
            ListMultiUserInstancesResponseBodyDaInstanceSdkCapacity self = new ListMultiUserInstancesResponseBodyDaInstanceSdkCapacity();
            return TeaModel.build(map, self);
        }

        public ListMultiUserInstancesResponseBodyDaInstanceSdkCapacity setAssigned(Long assigned) {
            this.assigned = assigned;
            return this;
        }
        public Long getAssigned() {
            return this.assigned;
        }

        public ListMultiUserInstancesResponseBodyDaInstanceSdkCapacity setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListMultiUserInstancesResponseBodyDaInstanceSdkCapacity setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

    }

    public static class ListMultiUserInstancesResponseBodyDaInstanceSlsCapacity extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Assigned")
        public Long assigned;

        /**
         * <strong>example:</strong>
         * <p>150</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Used")
        public Long used;

        public static ListMultiUserInstancesResponseBodyDaInstanceSlsCapacity build(java.util.Map<String, ?> map) throws Exception {
            ListMultiUserInstancesResponseBodyDaInstanceSlsCapacity self = new ListMultiUserInstancesResponseBodyDaInstanceSlsCapacity();
            return TeaModel.build(map, self);
        }

        public ListMultiUserInstancesResponseBodyDaInstanceSlsCapacity setAssigned(Long assigned) {
            this.assigned = assigned;
            return this;
        }
        public Long getAssigned() {
            return this.assigned;
        }

        public ListMultiUserInstancesResponseBodyDaInstanceSlsCapacity setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListMultiUserInstancesResponseBodyDaInstanceSlsCapacity setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

    }

    public static class ListMultiUserInstancesResponseBodyDaInstanceThreatAnalysisCapacity extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Assigned")
        public Long assigned;

        /**
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>1548</p>
         */
        @NameInMap("Used")
        public Long used;

        public static ListMultiUserInstancesResponseBodyDaInstanceThreatAnalysisCapacity build(java.util.Map<String, ?> map) throws Exception {
            ListMultiUserInstancesResponseBodyDaInstanceThreatAnalysisCapacity self = new ListMultiUserInstancesResponseBodyDaInstanceThreatAnalysisCapacity();
            return TeaModel.build(map, self);
        }

        public ListMultiUserInstancesResponseBodyDaInstanceThreatAnalysisCapacity setAssigned(Long assigned) {
            this.assigned = assigned;
            return this;
        }
        public Long getAssigned() {
            return this.assigned;
        }

        public ListMultiUserInstancesResponseBodyDaInstanceThreatAnalysisCapacity setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListMultiUserInstancesResponseBodyDaInstanceThreatAnalysisCapacity setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

    }

    public static class ListMultiUserInstancesResponseBodyDaInstanceThreatAnalysisFlow extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Assigned")
        public Long assigned;

        /**
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Used")
        public Long used;

        public static ListMultiUserInstancesResponseBodyDaInstanceThreatAnalysisFlow build(java.util.Map<String, ?> map) throws Exception {
            ListMultiUserInstancesResponseBodyDaInstanceThreatAnalysisFlow self = new ListMultiUserInstancesResponseBodyDaInstanceThreatAnalysisFlow();
            return TeaModel.build(map, self);
        }

        public ListMultiUserInstancesResponseBodyDaInstanceThreatAnalysisFlow setAssigned(Long assigned) {
            this.assigned = assigned;
            return this;
        }
        public Long getAssigned() {
            return this.assigned;
        }

        public ListMultiUserInstancesResponseBodyDaInstanceThreatAnalysisFlow setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListMultiUserInstancesResponseBodyDaInstanceThreatAnalysisFlow setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

    }

    public static class ListMultiUserInstancesResponseBodyDaInstanceVersionSummaryCoreCount extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Assigned")
        public Long assigned;

        /**
         * <strong>example:</strong>
         * <p>150</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("Used")
        public Long used;

        public static ListMultiUserInstancesResponseBodyDaInstanceVersionSummaryCoreCount build(java.util.Map<String, ?> map) throws Exception {
            ListMultiUserInstancesResponseBodyDaInstanceVersionSummaryCoreCount self = new ListMultiUserInstancesResponseBodyDaInstanceVersionSummaryCoreCount();
            return TeaModel.build(map, self);
        }

        public ListMultiUserInstancesResponseBodyDaInstanceVersionSummaryCoreCount setAssigned(Long assigned) {
            this.assigned = assigned;
            return this;
        }
        public Long getAssigned() {
            return this.assigned;
        }

        public ListMultiUserInstancesResponseBodyDaInstanceVersionSummaryCoreCount setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListMultiUserInstancesResponseBodyDaInstanceVersionSummaryCoreCount setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

    }

    public static class ListMultiUserInstancesResponseBodyDaInstanceVersionSummaryEcsCount extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Assigned")
        public Long assigned;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("Used")
        public Long used;

        public static ListMultiUserInstancesResponseBodyDaInstanceVersionSummaryEcsCount build(java.util.Map<String, ?> map) throws Exception {
            ListMultiUserInstancesResponseBodyDaInstanceVersionSummaryEcsCount self = new ListMultiUserInstancesResponseBodyDaInstanceVersionSummaryEcsCount();
            return TeaModel.build(map, self);
        }

        public ListMultiUserInstancesResponseBodyDaInstanceVersionSummaryEcsCount setAssigned(Long assigned) {
            this.assigned = assigned;
            return this;
        }
        public Long getAssigned() {
            return this.assigned;
        }

        public ListMultiUserInstancesResponseBodyDaInstanceVersionSummaryEcsCount setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListMultiUserInstancesResponseBodyDaInstanceVersionSummaryEcsCount setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

    }

    public static class ListMultiUserInstancesResponseBodyDaInstanceVersionSummary extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ASSET_AND_CORE</p>
         */
        @NameInMap("AuthBindType")
        public String authBindType;

        @NameInMap("CoreCount")
        public ListMultiUserInstancesResponseBodyDaInstanceVersionSummaryCoreCount coreCount;

        @NameInMap("EcsCount")
        public ListMultiUserInstancesResponseBodyDaInstanceVersionSummaryEcsCount ecsCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static ListMultiUserInstancesResponseBodyDaInstanceVersionSummary build(java.util.Map<String, ?> map) throws Exception {
            ListMultiUserInstancesResponseBodyDaInstanceVersionSummary self = new ListMultiUserInstancesResponseBodyDaInstanceVersionSummary();
            return TeaModel.build(map, self);
        }

        public ListMultiUserInstancesResponseBodyDaInstanceVersionSummary setAuthBindType(String authBindType) {
            this.authBindType = authBindType;
            return this;
        }
        public String getAuthBindType() {
            return this.authBindType;
        }

        public ListMultiUserInstancesResponseBodyDaInstanceVersionSummary setCoreCount(ListMultiUserInstancesResponseBodyDaInstanceVersionSummaryCoreCount coreCount) {
            this.coreCount = coreCount;
            return this;
        }
        public ListMultiUserInstancesResponseBodyDaInstanceVersionSummaryCoreCount getCoreCount() {
            return this.coreCount;
        }

        public ListMultiUserInstancesResponseBodyDaInstanceVersionSummary setEcsCount(ListMultiUserInstancesResponseBodyDaInstanceVersionSummaryEcsCount ecsCount) {
            this.ecsCount = ecsCount;
            return this;
        }
        public ListMultiUserInstancesResponseBodyDaInstanceVersionSummaryEcsCount getEcsCount() {
            return this.ecsCount;
        }

        public ListMultiUserInstancesResponseBodyDaInstanceVersionSummary setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class ListMultiUserInstancesResponseBodyDaInstanceWebLockCapacity extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Assigned")
        public Long assigned;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Used")
        public Long used;

        public static ListMultiUserInstancesResponseBodyDaInstanceWebLockCapacity build(java.util.Map<String, ?> map) throws Exception {
            ListMultiUserInstancesResponseBodyDaInstanceWebLockCapacity self = new ListMultiUserInstancesResponseBodyDaInstanceWebLockCapacity();
            return TeaModel.build(map, self);
        }

        public ListMultiUserInstancesResponseBodyDaInstanceWebLockCapacity setAssigned(Long assigned) {
            this.assigned = assigned;
            return this;
        }
        public Long getAssigned() {
            return this.assigned;
        }

        public ListMultiUserInstancesResponseBodyDaInstanceWebLockCapacity setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListMultiUserInstancesResponseBodyDaInstanceWebLockCapacity setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

    }

    public static class ListMultiUserInstancesResponseBodyDaInstance extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1766185894104675</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("AntiRansomwareCapacity")
        public ListMultiUserInstancesResponseBodyDaInstanceAntiRansomwareCapacity antiRansomwareCapacity;

        @NameInMap("CspmCapacity")
        public ListMultiUserInstancesResponseBodyDaInstanceCspmCapacity cspmCapacity;

        @NameInMap("HoneypotCapacity")
        public ListMultiUserInstancesResponseBodyDaInstanceHoneypotCapacity honeypotCapacity;

        @NameInMap("ImageScanCapacity")
        public ListMultiUserInstancesResponseBodyDaInstanceImageScanCapacity imageScanCapacity;

        /**
         * <strong>example:</strong>
         * <p>i-bp1gmm4pnacse343nqal</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InstancePurchaseType")
        public Integer instancePurchaseType;

        @NameInMap("RaspCapacity")
        public ListMultiUserInstancesResponseBodyDaInstanceRaspCapacity raspCapacity;

        @NameInMap("SdkCapacity")
        public ListMultiUserInstancesResponseBodyDaInstanceSdkCapacity sdkCapacity;

        @NameInMap("SlsCapacity")
        public ListMultiUserInstancesResponseBodyDaInstanceSlsCapacity slsCapacity;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        @NameInMap("ThreatAnalysisCapacity")
        public ListMultiUserInstancesResponseBodyDaInstanceThreatAnalysisCapacity threatAnalysisCapacity;

        @NameInMap("ThreatAnalysisFlow")
        public ListMultiUserInstancesResponseBodyDaInstanceThreatAnalysisFlow threatAnalysisFlow;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UserType")
        public Integer userType;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Version")
        public Integer version;

        @NameInMap("VersionSummary")
        public java.util.List<ListMultiUserInstancesResponseBodyDaInstanceVersionSummary> versionSummary;

        @NameInMap("WebLockCapacity")
        public ListMultiUserInstancesResponseBodyDaInstanceWebLockCapacity webLockCapacity;

        public static ListMultiUserInstancesResponseBodyDaInstance build(java.util.Map<String, ?> map) throws Exception {
            ListMultiUserInstancesResponseBodyDaInstance self = new ListMultiUserInstancesResponseBodyDaInstance();
            return TeaModel.build(map, self);
        }

        public ListMultiUserInstancesResponseBodyDaInstance setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ListMultiUserInstancesResponseBodyDaInstance setAntiRansomwareCapacity(ListMultiUserInstancesResponseBodyDaInstanceAntiRansomwareCapacity antiRansomwareCapacity) {
            this.antiRansomwareCapacity = antiRansomwareCapacity;
            return this;
        }
        public ListMultiUserInstancesResponseBodyDaInstanceAntiRansomwareCapacity getAntiRansomwareCapacity() {
            return this.antiRansomwareCapacity;
        }

        public ListMultiUserInstancesResponseBodyDaInstance setCspmCapacity(ListMultiUserInstancesResponseBodyDaInstanceCspmCapacity cspmCapacity) {
            this.cspmCapacity = cspmCapacity;
            return this;
        }
        public ListMultiUserInstancesResponseBodyDaInstanceCspmCapacity getCspmCapacity() {
            return this.cspmCapacity;
        }

        public ListMultiUserInstancesResponseBodyDaInstance setHoneypotCapacity(ListMultiUserInstancesResponseBodyDaInstanceHoneypotCapacity honeypotCapacity) {
            this.honeypotCapacity = honeypotCapacity;
            return this;
        }
        public ListMultiUserInstancesResponseBodyDaInstanceHoneypotCapacity getHoneypotCapacity() {
            return this.honeypotCapacity;
        }

        public ListMultiUserInstancesResponseBodyDaInstance setImageScanCapacity(ListMultiUserInstancesResponseBodyDaInstanceImageScanCapacity imageScanCapacity) {
            this.imageScanCapacity = imageScanCapacity;
            return this;
        }
        public ListMultiUserInstancesResponseBodyDaInstanceImageScanCapacity getImageScanCapacity() {
            return this.imageScanCapacity;
        }

        public ListMultiUserInstancesResponseBodyDaInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListMultiUserInstancesResponseBodyDaInstance setInstancePurchaseType(Integer instancePurchaseType) {
            this.instancePurchaseType = instancePurchaseType;
            return this;
        }
        public Integer getInstancePurchaseType() {
            return this.instancePurchaseType;
        }

        public ListMultiUserInstancesResponseBodyDaInstance setRaspCapacity(ListMultiUserInstancesResponseBodyDaInstanceRaspCapacity raspCapacity) {
            this.raspCapacity = raspCapacity;
            return this;
        }
        public ListMultiUserInstancesResponseBodyDaInstanceRaspCapacity getRaspCapacity() {
            return this.raspCapacity;
        }

        public ListMultiUserInstancesResponseBodyDaInstance setSdkCapacity(ListMultiUserInstancesResponseBodyDaInstanceSdkCapacity sdkCapacity) {
            this.sdkCapacity = sdkCapacity;
            return this;
        }
        public ListMultiUserInstancesResponseBodyDaInstanceSdkCapacity getSdkCapacity() {
            return this.sdkCapacity;
        }

        public ListMultiUserInstancesResponseBodyDaInstance setSlsCapacity(ListMultiUserInstancesResponseBodyDaInstanceSlsCapacity slsCapacity) {
            this.slsCapacity = slsCapacity;
            return this;
        }
        public ListMultiUserInstancesResponseBodyDaInstanceSlsCapacity getSlsCapacity() {
            return this.slsCapacity;
        }

        public ListMultiUserInstancesResponseBodyDaInstance setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListMultiUserInstancesResponseBodyDaInstance setThreatAnalysisCapacity(ListMultiUserInstancesResponseBodyDaInstanceThreatAnalysisCapacity threatAnalysisCapacity) {
            this.threatAnalysisCapacity = threatAnalysisCapacity;
            return this;
        }
        public ListMultiUserInstancesResponseBodyDaInstanceThreatAnalysisCapacity getThreatAnalysisCapacity() {
            return this.threatAnalysisCapacity;
        }

        public ListMultiUserInstancesResponseBodyDaInstance setThreatAnalysisFlow(ListMultiUserInstancesResponseBodyDaInstanceThreatAnalysisFlow threatAnalysisFlow) {
            this.threatAnalysisFlow = threatAnalysisFlow;
            return this;
        }
        public ListMultiUserInstancesResponseBodyDaInstanceThreatAnalysisFlow getThreatAnalysisFlow() {
            return this.threatAnalysisFlow;
        }

        public ListMultiUserInstancesResponseBodyDaInstance setUserType(Integer userType) {
            this.userType = userType;
            return this;
        }
        public Integer getUserType() {
            return this.userType;
        }

        public ListMultiUserInstancesResponseBodyDaInstance setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

        public ListMultiUserInstancesResponseBodyDaInstance setVersionSummary(java.util.List<ListMultiUserInstancesResponseBodyDaInstanceVersionSummary> versionSummary) {
            this.versionSummary = versionSummary;
            return this;
        }
        public java.util.List<ListMultiUserInstancesResponseBodyDaInstanceVersionSummary> getVersionSummary() {
            return this.versionSummary;
        }

        public ListMultiUserInstancesResponseBodyDaInstance setWebLockCapacity(ListMultiUserInstancesResponseBodyDaInstanceWebLockCapacity webLockCapacity) {
            this.webLockCapacity = webLockCapacity;
            return this;
        }
        public ListMultiUserInstancesResponseBodyDaInstanceWebLockCapacity getWebLockCapacity() {
            return this.webLockCapacity;
        }

    }

    public static class ListMultiUserInstancesResponseBodyPageInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <strong>example:</strong>
         * <p>B604532DEF982B875E8360A6EFA3B***</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>55</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListMultiUserInstancesResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListMultiUserInstancesResponseBodyPageInfo self = new ListMultiUserInstancesResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListMultiUserInstancesResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListMultiUserInstancesResponseBodyPageInfo setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListMultiUserInstancesResponseBodyPageInfo setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListMultiUserInstancesResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMultiUserInstancesResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListMultiUserInstancesResponseBodySaleInstanceListAntiRansomwareCapacity extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Used")
        public Long used;

        public static ListMultiUserInstancesResponseBodySaleInstanceListAntiRansomwareCapacity build(java.util.Map<String, ?> map) throws Exception {
            ListMultiUserInstancesResponseBodySaleInstanceListAntiRansomwareCapacity self = new ListMultiUserInstancesResponseBodySaleInstanceListAntiRansomwareCapacity();
            return TeaModel.build(map, self);
        }

        public ListMultiUserInstancesResponseBodySaleInstanceListAntiRansomwareCapacity setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListMultiUserInstancesResponseBodySaleInstanceListAntiRansomwareCapacity setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

    }

    public static class ListMultiUserInstancesResponseBodySaleInstanceListCspmCapacity extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Used")
        public Long used;

        public static ListMultiUserInstancesResponseBodySaleInstanceListCspmCapacity build(java.util.Map<String, ?> map) throws Exception {
            ListMultiUserInstancesResponseBodySaleInstanceListCspmCapacity self = new ListMultiUserInstancesResponseBodySaleInstanceListCspmCapacity();
            return TeaModel.build(map, self);
        }

        public ListMultiUserInstancesResponseBodySaleInstanceListCspmCapacity setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListMultiUserInstancesResponseBodySaleInstanceListCspmCapacity setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

    }

    public static class ListMultiUserInstancesResponseBodySaleInstanceListHoneypotCapacity extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Used")
        public Long used;

        public static ListMultiUserInstancesResponseBodySaleInstanceListHoneypotCapacity build(java.util.Map<String, ?> map) throws Exception {
            ListMultiUserInstancesResponseBodySaleInstanceListHoneypotCapacity self = new ListMultiUserInstancesResponseBodySaleInstanceListHoneypotCapacity();
            return TeaModel.build(map, self);
        }

        public ListMultiUserInstancesResponseBodySaleInstanceListHoneypotCapacity setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListMultiUserInstancesResponseBodySaleInstanceListHoneypotCapacity setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

    }

    public static class ListMultiUserInstancesResponseBodySaleInstanceListImageScanCapacity extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Used")
        public Long used;

        public static ListMultiUserInstancesResponseBodySaleInstanceListImageScanCapacity build(java.util.Map<String, ?> map) throws Exception {
            ListMultiUserInstancesResponseBodySaleInstanceListImageScanCapacity self = new ListMultiUserInstancesResponseBodySaleInstanceListImageScanCapacity();
            return TeaModel.build(map, self);
        }

        public ListMultiUserInstancesResponseBodySaleInstanceListImageScanCapacity setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListMultiUserInstancesResponseBodySaleInstanceListImageScanCapacity setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

    }

    public static class ListMultiUserInstancesResponseBodySaleInstanceListRaspCapacity extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Used")
        public Long used;

        public static ListMultiUserInstancesResponseBodySaleInstanceListRaspCapacity build(java.util.Map<String, ?> map) throws Exception {
            ListMultiUserInstancesResponseBodySaleInstanceListRaspCapacity self = new ListMultiUserInstancesResponseBodySaleInstanceListRaspCapacity();
            return TeaModel.build(map, self);
        }

        public ListMultiUserInstancesResponseBodySaleInstanceListRaspCapacity setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListMultiUserInstancesResponseBodySaleInstanceListRaspCapacity setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

    }

    public static class ListMultiUserInstancesResponseBodySaleInstanceListSdkCapacity extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Used")
        public Long used;

        public static ListMultiUserInstancesResponseBodySaleInstanceListSdkCapacity build(java.util.Map<String, ?> map) throws Exception {
            ListMultiUserInstancesResponseBodySaleInstanceListSdkCapacity self = new ListMultiUserInstancesResponseBodySaleInstanceListSdkCapacity();
            return TeaModel.build(map, self);
        }

        public ListMultiUserInstancesResponseBodySaleInstanceListSdkCapacity setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListMultiUserInstancesResponseBodySaleInstanceListSdkCapacity setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

    }

    public static class ListMultiUserInstancesResponseBodySaleInstanceListSlsCapacity extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Used")
        public Long used;

        public static ListMultiUserInstancesResponseBodySaleInstanceListSlsCapacity build(java.util.Map<String, ?> map) throws Exception {
            ListMultiUserInstancesResponseBodySaleInstanceListSlsCapacity self = new ListMultiUserInstancesResponseBodySaleInstanceListSlsCapacity();
            return TeaModel.build(map, self);
        }

        public ListMultiUserInstancesResponseBodySaleInstanceListSlsCapacity setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListMultiUserInstancesResponseBodySaleInstanceListSlsCapacity setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

    }

    public static class ListMultiUserInstancesResponseBodySaleInstanceListThreatAnalysisCapacity extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Used")
        public Long used;

        public static ListMultiUserInstancesResponseBodySaleInstanceListThreatAnalysisCapacity build(java.util.Map<String, ?> map) throws Exception {
            ListMultiUserInstancesResponseBodySaleInstanceListThreatAnalysisCapacity self = new ListMultiUserInstancesResponseBodySaleInstanceListThreatAnalysisCapacity();
            return TeaModel.build(map, self);
        }

        public ListMultiUserInstancesResponseBodySaleInstanceListThreatAnalysisCapacity setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListMultiUserInstancesResponseBodySaleInstanceListThreatAnalysisCapacity setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

    }

    public static class ListMultiUserInstancesResponseBodySaleInstanceListThreatAnalysisFlow extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Used")
        public Long used;

        public static ListMultiUserInstancesResponseBodySaleInstanceListThreatAnalysisFlow build(java.util.Map<String, ?> map) throws Exception {
            ListMultiUserInstancesResponseBodySaleInstanceListThreatAnalysisFlow self = new ListMultiUserInstancesResponseBodySaleInstanceListThreatAnalysisFlow();
            return TeaModel.build(map, self);
        }

        public ListMultiUserInstancesResponseBodySaleInstanceListThreatAnalysisFlow setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListMultiUserInstancesResponseBodySaleInstanceListThreatAnalysisFlow setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

    }

    public static class ListMultiUserInstancesResponseBodySaleInstanceListVersionSummaryCoreCount extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Assigned")
        public Long assigned;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Used")
        public Long used;

        public static ListMultiUserInstancesResponseBodySaleInstanceListVersionSummaryCoreCount build(java.util.Map<String, ?> map) throws Exception {
            ListMultiUserInstancesResponseBodySaleInstanceListVersionSummaryCoreCount self = new ListMultiUserInstancesResponseBodySaleInstanceListVersionSummaryCoreCount();
            return TeaModel.build(map, self);
        }

        public ListMultiUserInstancesResponseBodySaleInstanceListVersionSummaryCoreCount setAssigned(Long assigned) {
            this.assigned = assigned;
            return this;
        }
        public Long getAssigned() {
            return this.assigned;
        }

        public ListMultiUserInstancesResponseBodySaleInstanceListVersionSummaryCoreCount setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListMultiUserInstancesResponseBodySaleInstanceListVersionSummaryCoreCount setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

    }

    public static class ListMultiUserInstancesResponseBodySaleInstanceListVersionSummaryEcsCount extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Assigned")
        public Long assigned;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Used")
        public Long used;

        public static ListMultiUserInstancesResponseBodySaleInstanceListVersionSummaryEcsCount build(java.util.Map<String, ?> map) throws Exception {
            ListMultiUserInstancesResponseBodySaleInstanceListVersionSummaryEcsCount self = new ListMultiUserInstancesResponseBodySaleInstanceListVersionSummaryEcsCount();
            return TeaModel.build(map, self);
        }

        public ListMultiUserInstancesResponseBodySaleInstanceListVersionSummaryEcsCount setAssigned(Long assigned) {
            this.assigned = assigned;
            return this;
        }
        public Long getAssigned() {
            return this.assigned;
        }

        public ListMultiUserInstancesResponseBodySaleInstanceListVersionSummaryEcsCount setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListMultiUserInstancesResponseBodySaleInstanceListVersionSummaryEcsCount setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

    }

    public static class ListMultiUserInstancesResponseBodySaleInstanceListVersionSummary extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ASSET_AND_CORE</p>
         */
        @NameInMap("AuthBindType")
        public String authBindType;

        @NameInMap("CoreCount")
        public ListMultiUserInstancesResponseBodySaleInstanceListVersionSummaryCoreCount coreCount;

        @NameInMap("EcsCount")
        public ListMultiUserInstancesResponseBodySaleInstanceListVersionSummaryEcsCount ecsCount;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static ListMultiUserInstancesResponseBodySaleInstanceListVersionSummary build(java.util.Map<String, ?> map) throws Exception {
            ListMultiUserInstancesResponseBodySaleInstanceListVersionSummary self = new ListMultiUserInstancesResponseBodySaleInstanceListVersionSummary();
            return TeaModel.build(map, self);
        }

        public ListMultiUserInstancesResponseBodySaleInstanceListVersionSummary setAuthBindType(String authBindType) {
            this.authBindType = authBindType;
            return this;
        }
        public String getAuthBindType() {
            return this.authBindType;
        }

        public ListMultiUserInstancesResponseBodySaleInstanceListVersionSummary setCoreCount(ListMultiUserInstancesResponseBodySaleInstanceListVersionSummaryCoreCount coreCount) {
            this.coreCount = coreCount;
            return this;
        }
        public ListMultiUserInstancesResponseBodySaleInstanceListVersionSummaryCoreCount getCoreCount() {
            return this.coreCount;
        }

        public ListMultiUserInstancesResponseBodySaleInstanceListVersionSummary setEcsCount(ListMultiUserInstancesResponseBodySaleInstanceListVersionSummaryEcsCount ecsCount) {
            this.ecsCount = ecsCount;
            return this;
        }
        public ListMultiUserInstancesResponseBodySaleInstanceListVersionSummaryEcsCount getEcsCount() {
            return this.ecsCount;
        }

        public ListMultiUserInstancesResponseBodySaleInstanceListVersionSummary setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class ListMultiUserInstancesResponseBodySaleInstanceListWebLockCapacity extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Used")
        public Long used;

        public static ListMultiUserInstancesResponseBodySaleInstanceListWebLockCapacity build(java.util.Map<String, ?> map) throws Exception {
            ListMultiUserInstancesResponseBodySaleInstanceListWebLockCapacity self = new ListMultiUserInstancesResponseBodySaleInstanceListWebLockCapacity();
            return TeaModel.build(map, self);
        }

        public ListMultiUserInstancesResponseBodySaleInstanceListWebLockCapacity setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListMultiUserInstancesResponseBodySaleInstanceListWebLockCapacity setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

    }

    public static class ListMultiUserInstancesResponseBodySaleInstanceList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>103784262032</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("AntiRansomwareCapacity")
        public ListMultiUserInstancesResponseBodySaleInstanceListAntiRansomwareCapacity antiRansomwareCapacity;

        @NameInMap("CspmCapacity")
        public ListMultiUserInstancesResponseBodySaleInstanceListCspmCapacity cspmCapacity;

        @NameInMap("HoneypotCapacity")
        public ListMultiUserInstancesResponseBodySaleInstanceListHoneypotCapacity honeypotCapacity;

        @NameInMap("ImageScanCapacity")
        public ListMultiUserInstancesResponseBodySaleInstanceListImageScanCapacity imageScanCapacity;

        /**
         * <strong>example:</strong>
         * <p>api-service-spec</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InstancePurchaseType")
        public Integer instancePurchaseType;

        @NameInMap("RaspCapacity")
        public ListMultiUserInstancesResponseBodySaleInstanceListRaspCapacity raspCapacity;

        @NameInMap("SdkCapacity")
        public ListMultiUserInstancesResponseBodySaleInstanceListSdkCapacity sdkCapacity;

        @NameInMap("SlsCapacity")
        public ListMultiUserInstancesResponseBodySaleInstanceListSlsCapacity slsCapacity;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        @NameInMap("ThreatAnalysisCapacity")
        public ListMultiUserInstancesResponseBodySaleInstanceListThreatAnalysisCapacity threatAnalysisCapacity;

        @NameInMap("ThreatAnalysisFlow")
        public ListMultiUserInstancesResponseBodySaleInstanceListThreatAnalysisFlow threatAnalysisFlow;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("UserType")
        public Integer userType;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Version")
        public Integer version;

        @NameInMap("VersionSummary")
        public java.util.List<ListMultiUserInstancesResponseBodySaleInstanceListVersionSummary> versionSummary;

        @NameInMap("WebLockCapacity")
        public ListMultiUserInstancesResponseBodySaleInstanceListWebLockCapacity webLockCapacity;

        public static ListMultiUserInstancesResponseBodySaleInstanceList build(java.util.Map<String, ?> map) throws Exception {
            ListMultiUserInstancesResponseBodySaleInstanceList self = new ListMultiUserInstancesResponseBodySaleInstanceList();
            return TeaModel.build(map, self);
        }

        public ListMultiUserInstancesResponseBodySaleInstanceList setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ListMultiUserInstancesResponseBodySaleInstanceList setAntiRansomwareCapacity(ListMultiUserInstancesResponseBodySaleInstanceListAntiRansomwareCapacity antiRansomwareCapacity) {
            this.antiRansomwareCapacity = antiRansomwareCapacity;
            return this;
        }
        public ListMultiUserInstancesResponseBodySaleInstanceListAntiRansomwareCapacity getAntiRansomwareCapacity() {
            return this.antiRansomwareCapacity;
        }

        public ListMultiUserInstancesResponseBodySaleInstanceList setCspmCapacity(ListMultiUserInstancesResponseBodySaleInstanceListCspmCapacity cspmCapacity) {
            this.cspmCapacity = cspmCapacity;
            return this;
        }
        public ListMultiUserInstancesResponseBodySaleInstanceListCspmCapacity getCspmCapacity() {
            return this.cspmCapacity;
        }

        public ListMultiUserInstancesResponseBodySaleInstanceList setHoneypotCapacity(ListMultiUserInstancesResponseBodySaleInstanceListHoneypotCapacity honeypotCapacity) {
            this.honeypotCapacity = honeypotCapacity;
            return this;
        }
        public ListMultiUserInstancesResponseBodySaleInstanceListHoneypotCapacity getHoneypotCapacity() {
            return this.honeypotCapacity;
        }

        public ListMultiUserInstancesResponseBodySaleInstanceList setImageScanCapacity(ListMultiUserInstancesResponseBodySaleInstanceListImageScanCapacity imageScanCapacity) {
            this.imageScanCapacity = imageScanCapacity;
            return this;
        }
        public ListMultiUserInstancesResponseBodySaleInstanceListImageScanCapacity getImageScanCapacity() {
            return this.imageScanCapacity;
        }

        public ListMultiUserInstancesResponseBodySaleInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListMultiUserInstancesResponseBodySaleInstanceList setInstancePurchaseType(Integer instancePurchaseType) {
            this.instancePurchaseType = instancePurchaseType;
            return this;
        }
        public Integer getInstancePurchaseType() {
            return this.instancePurchaseType;
        }

        public ListMultiUserInstancesResponseBodySaleInstanceList setRaspCapacity(ListMultiUserInstancesResponseBodySaleInstanceListRaspCapacity raspCapacity) {
            this.raspCapacity = raspCapacity;
            return this;
        }
        public ListMultiUserInstancesResponseBodySaleInstanceListRaspCapacity getRaspCapacity() {
            return this.raspCapacity;
        }

        public ListMultiUserInstancesResponseBodySaleInstanceList setSdkCapacity(ListMultiUserInstancesResponseBodySaleInstanceListSdkCapacity sdkCapacity) {
            this.sdkCapacity = sdkCapacity;
            return this;
        }
        public ListMultiUserInstancesResponseBodySaleInstanceListSdkCapacity getSdkCapacity() {
            return this.sdkCapacity;
        }

        public ListMultiUserInstancesResponseBodySaleInstanceList setSlsCapacity(ListMultiUserInstancesResponseBodySaleInstanceListSlsCapacity slsCapacity) {
            this.slsCapacity = slsCapacity;
            return this;
        }
        public ListMultiUserInstancesResponseBodySaleInstanceListSlsCapacity getSlsCapacity() {
            return this.slsCapacity;
        }

        public ListMultiUserInstancesResponseBodySaleInstanceList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListMultiUserInstancesResponseBodySaleInstanceList setThreatAnalysisCapacity(ListMultiUserInstancesResponseBodySaleInstanceListThreatAnalysisCapacity threatAnalysisCapacity) {
            this.threatAnalysisCapacity = threatAnalysisCapacity;
            return this;
        }
        public ListMultiUserInstancesResponseBodySaleInstanceListThreatAnalysisCapacity getThreatAnalysisCapacity() {
            return this.threatAnalysisCapacity;
        }

        public ListMultiUserInstancesResponseBodySaleInstanceList setThreatAnalysisFlow(ListMultiUserInstancesResponseBodySaleInstanceListThreatAnalysisFlow threatAnalysisFlow) {
            this.threatAnalysisFlow = threatAnalysisFlow;
            return this;
        }
        public ListMultiUserInstancesResponseBodySaleInstanceListThreatAnalysisFlow getThreatAnalysisFlow() {
            return this.threatAnalysisFlow;
        }

        public ListMultiUserInstancesResponseBodySaleInstanceList setUserType(Integer userType) {
            this.userType = userType;
            return this;
        }
        public Integer getUserType() {
            return this.userType;
        }

        public ListMultiUserInstancesResponseBodySaleInstanceList setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

        public ListMultiUserInstancesResponseBodySaleInstanceList setVersionSummary(java.util.List<ListMultiUserInstancesResponseBodySaleInstanceListVersionSummary> versionSummary) {
            this.versionSummary = versionSummary;
            return this;
        }
        public java.util.List<ListMultiUserInstancesResponseBodySaleInstanceListVersionSummary> getVersionSummary() {
            return this.versionSummary;
        }

        public ListMultiUserInstancesResponseBodySaleInstanceList setWebLockCapacity(ListMultiUserInstancesResponseBodySaleInstanceListWebLockCapacity webLockCapacity) {
            this.webLockCapacity = webLockCapacity;
            return this;
        }
        public ListMultiUserInstancesResponseBodySaleInstanceListWebLockCapacity getWebLockCapacity() {
            return this.webLockCapacity;
        }

    }

}
