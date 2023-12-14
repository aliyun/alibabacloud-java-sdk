// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListOssBucketScanInfoResponseBody extends TeaModel {
    /**
     * <p>The data that is returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListOssBucketScanInfoResponseBodyData> data;

    /**
     * <p>The page information.</p>
     */
    @NameInMap("PageInfo")
    public ListOssBucketScanInfoResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListOssBucketScanInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOssBucketScanInfoResponseBody self = new ListOssBucketScanInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOssBucketScanInfoResponseBody setData(java.util.List<ListOssBucketScanInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListOssBucketScanInfoResponseBodyData> getData() {
        return this.data;
    }

    public ListOssBucketScanInfoResponseBody setPageInfo(ListOssBucketScanInfoResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListOssBucketScanInfoResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListOssBucketScanInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListOssBucketScanInfoResponseBodyData extends TeaModel {
        /**
         * <p>The name of the bucket.</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>Configuration status, valid values:</p>
         * <br>
         * <p>- **0**: No Configuration.</p>
         * <p>- **1**: Not Open.</p>
         * <p>- **2**: Open.</p>
         */
        @NameInMap("ConfigStatus")
        public Integer configStatus;

        /**
         * <p>The number of high-risk objects.</p>
         */
        @NameInMap("HighRisk")
        public Long highRisk;

        /**
         * <p>The time when the most recent check ended. Unit: milliseconds.</p>
         */
        @NameInMap("LastScanEndTime")
        public Long lastScanEndTime;

        /**
         * <p>The time when the bucket was last checked. Unit: milliseconds.</p>
         */
        @NameInMap("LastScanTime")
        public Long lastScanTime;

        /**
         * <p>The number of low-risk objects.</p>
         */
        @NameInMap("LowRisk")
        public Long lowRisk;

        /**
         * <p>The number of medium-risk objects.</p>
         */
        @NameInMap("MediumRisk")
        public Long mediumRisk;

        /**
         * <p>The reason why the bucket cannot be checked.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of objects that are checked.</p>
         */
        @NameInMap("ScanObject")
        public Long scanObject;

        /**
         * <p>Indicates whether the bucket is checked. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Scanned")
        public Boolean scanned;

        /**
         * <p>The check status of the bucket. Valid values:</p>
         * <br>
         * <p>*   **1**: The bucket is not checked.</p>
         * <p>*   **2**: All objects in the bucket are being checked.</p>
         * <p>*   **3**: Only new objects are being checked.</p>
         * <p>*   **4**: The bucket is checked.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The storage class of the bucket. Valid values:</p>
         * <br>
         * <p>*   **Standard**</p>
         * <p>*   **IA**</p>
         * <p>*   **Archive**</p>
         * <p>*   **ColdArchive**</p>
         */
        @NameInMap("StorageClass")
        public String storageClass;

        /**
         * <p>Indicates whether the bucket can be checked. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("Support")
        public Boolean support;

        /**
         * <p>The total number of objects in the bucket.</p>
         */
        @NameInMap("TotalObject")
        public Long totalObject;

        public static ListOssBucketScanInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOssBucketScanInfoResponseBodyData self = new ListOssBucketScanInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOssBucketScanInfoResponseBodyData setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public ListOssBucketScanInfoResponseBodyData setConfigStatus(Integer configStatus) {
            this.configStatus = configStatus;
            return this;
        }
        public Integer getConfigStatus() {
            return this.configStatus;
        }

        public ListOssBucketScanInfoResponseBodyData setHighRisk(Long highRisk) {
            this.highRisk = highRisk;
            return this;
        }
        public Long getHighRisk() {
            return this.highRisk;
        }

        public ListOssBucketScanInfoResponseBodyData setLastScanEndTime(Long lastScanEndTime) {
            this.lastScanEndTime = lastScanEndTime;
            return this;
        }
        public Long getLastScanEndTime() {
            return this.lastScanEndTime;
        }

        public ListOssBucketScanInfoResponseBodyData setLastScanTime(Long lastScanTime) {
            this.lastScanTime = lastScanTime;
            return this;
        }
        public Long getLastScanTime() {
            return this.lastScanTime;
        }

        public ListOssBucketScanInfoResponseBodyData setLowRisk(Long lowRisk) {
            this.lowRisk = lowRisk;
            return this;
        }
        public Long getLowRisk() {
            return this.lowRisk;
        }

        public ListOssBucketScanInfoResponseBodyData setMediumRisk(Long mediumRisk) {
            this.mediumRisk = mediumRisk;
            return this;
        }
        public Long getMediumRisk() {
            return this.mediumRisk;
        }

        public ListOssBucketScanInfoResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListOssBucketScanInfoResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListOssBucketScanInfoResponseBodyData setScanObject(Long scanObject) {
            this.scanObject = scanObject;
            return this;
        }
        public Long getScanObject() {
            return this.scanObject;
        }

        public ListOssBucketScanInfoResponseBodyData setScanned(Boolean scanned) {
            this.scanned = scanned;
            return this;
        }
        public Boolean getScanned() {
            return this.scanned;
        }

        public ListOssBucketScanInfoResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListOssBucketScanInfoResponseBodyData setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

        public ListOssBucketScanInfoResponseBodyData setSupport(Boolean support) {
            this.support = support;
            return this;
        }
        public Boolean getSupport() {
            return this.support;
        }

        public ListOssBucketScanInfoResponseBodyData setTotalObject(Long totalObject) {
            this.totalObject = totalObject;
            return this;
        }
        public Long getTotalObject() {
            return this.totalObject;
        }

    }

    public static class ListOssBucketScanInfoResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The page number.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListOssBucketScanInfoResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListOssBucketScanInfoResponseBodyPageInfo self = new ListOssBucketScanInfoResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListOssBucketScanInfoResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListOssBucketScanInfoResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListOssBucketScanInfoResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
