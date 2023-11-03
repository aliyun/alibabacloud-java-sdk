// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListOssBucketScanInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListOssBucketScanInfoResponseBodyData> data;

    @NameInMap("PageInfo")
    public ListOssBucketScanInfoResponseBodyPageInfo pageInfo;

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
        @NameInMap("BucketName")
        public String bucketName;

        @NameInMap("HighRisk")
        public Long highRisk;

        @NameInMap("LastScanEndTime")
        public Long lastScanEndTime;

        @NameInMap("LastScanTime")
        public Long lastScanTime;

        @NameInMap("LowRisk")
        public Long lowRisk;

        @NameInMap("MediumRisk")
        public Long mediumRisk;

        @NameInMap("Message")
        public String message;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ScanObject")
        public Long scanObject;

        @NameInMap("Scanned")
        public Boolean scanned;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("StorageClass")
        public String storageClass;

        @NameInMap("Support")
        public Boolean support;

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
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

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
