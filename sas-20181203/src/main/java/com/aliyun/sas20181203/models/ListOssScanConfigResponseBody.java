// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListOssScanConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListOssScanConfigResponseBodyData> data;

    @NameInMap("PageInfo")
    public ListOssScanConfigResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static ListOssScanConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOssScanConfigResponseBody self = new ListOssScanConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOssScanConfigResponseBody setData(java.util.List<ListOssScanConfigResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListOssScanConfigResponseBodyData> getData() {
        return this.data;
    }

    public ListOssScanConfigResponseBody setPageInfo(ListOssScanConfigResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListOssScanConfigResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListOssScanConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListOssScanConfigResponseBodyData extends TeaModel {
        @NameInMap("AllKeyPrefix")
        public Boolean allKeyPrefix;

        @NameInMap("BucketCount")
        public Integer bucketCount;

        @NameInMap("BucketNameList")
        public java.util.List<String> bucketNameList;

        @NameInMap("Enable")
        public Integer enable;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Id")
        public Long id;

        @NameInMap("KeyPrefixList")
        public java.util.List<String> keyPrefixList;

        @NameInMap("KeySuffixList")
        public java.util.List<String> keySuffixList;

        @NameInMap("LastUpdateTime")
        public Long lastUpdateTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("ScanDayList")
        public java.util.List<Integer> scanDayList;

        @NameInMap("StartTime")
        public String startTime;

        public static ListOssScanConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOssScanConfigResponseBodyData self = new ListOssScanConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOssScanConfigResponseBodyData setAllKeyPrefix(Boolean allKeyPrefix) {
            this.allKeyPrefix = allKeyPrefix;
            return this;
        }
        public Boolean getAllKeyPrefix() {
            return this.allKeyPrefix;
        }

        public ListOssScanConfigResponseBodyData setBucketCount(Integer bucketCount) {
            this.bucketCount = bucketCount;
            return this;
        }
        public Integer getBucketCount() {
            return this.bucketCount;
        }

        public ListOssScanConfigResponseBodyData setBucketNameList(java.util.List<String> bucketNameList) {
            this.bucketNameList = bucketNameList;
            return this;
        }
        public java.util.List<String> getBucketNameList() {
            return this.bucketNameList;
        }

        public ListOssScanConfigResponseBodyData setEnable(Integer enable) {
            this.enable = enable;
            return this;
        }
        public Integer getEnable() {
            return this.enable;
        }

        public ListOssScanConfigResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListOssScanConfigResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListOssScanConfigResponseBodyData setKeyPrefixList(java.util.List<String> keyPrefixList) {
            this.keyPrefixList = keyPrefixList;
            return this;
        }
        public java.util.List<String> getKeyPrefixList() {
            return this.keyPrefixList;
        }

        public ListOssScanConfigResponseBodyData setKeySuffixList(java.util.List<String> keySuffixList) {
            this.keySuffixList = keySuffixList;
            return this;
        }
        public java.util.List<String> getKeySuffixList() {
            return this.keySuffixList;
        }

        public ListOssScanConfigResponseBodyData setLastUpdateTime(Long lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }
        public Long getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        public ListOssScanConfigResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListOssScanConfigResponseBodyData setScanDayList(java.util.List<Integer> scanDayList) {
            this.scanDayList = scanDayList;
            return this;
        }
        public java.util.List<Integer> getScanDayList() {
            return this.scanDayList;
        }

        public ListOssScanConfigResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class ListOssScanConfigResponseBodyPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListOssScanConfigResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListOssScanConfigResponseBodyPageInfo self = new ListOssScanConfigResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListOssScanConfigResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListOssScanConfigResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListOssScanConfigResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
