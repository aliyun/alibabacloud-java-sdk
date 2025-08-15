// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossmfd20231017.models;

import com.aliyun.tea.*;

public class ListOssBucketScanInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListOssBucketScanInfoResponseBodyData> data;

    @NameInMap("PageInfo")
    public ListOssBucketScanInfoResponseBodyPageInfo pageInfo;

    /**
     * <strong>example:</strong>
     * <p>2220FE66-76EF-5D9D-A0EE-3221CC******</p>
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
         * <strong>example:</strong>
         * <p>testBucket******</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ConfigStatus")
        public Integer configStatus;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DecompressStatus")
        public Integer decompressStatus;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HighRisk")
        public Long highRisk;

        /**
         * <strong>example:</strong>
         * <p>1698388233884</p>
         */
        @NameInMap("LastScanEndTime")
        public Long lastScanEndTime;

        /**
         * <strong>example:</strong>
         * <p>1698388233883</p>
         */
        @NameInMap("LastScanTime")
        public Long lastScanTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LowRisk")
        public Long lowRisk;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MediumRisk")
        public Long mediumRisk;

        /**
         * <strong>example:</strong>
         * <p>Unsupported Region。</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScanObject")
        public Long scanObject;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Scanned")
        public Boolean scanned;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>IA</p>
         */
        @NameInMap("StorageClass")
        public String storageClass;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Support")
        public Boolean support;

        /**
         * <strong>example:</strong>
         * <p>2</p>
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

        public ListOssBucketScanInfoResponseBodyData setDecompressStatus(Integer decompressStatus) {
            this.decompressStatus = decompressStatus;
            return this;
        }
        public Integer getDecompressStatus() {
            return this.decompressStatus;
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

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
