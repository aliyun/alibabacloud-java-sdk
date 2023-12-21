// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListOssScanConfigResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListOssScanConfigResponseBodyData> data;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListOssScanConfigResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
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
        /**
         * <p>Whether to match all file prefixes.</p>
         */
        @NameInMap("AllKeyPrefix")
        public Boolean allKeyPrefix;

        /**
         * <p>The number of the buckets.</p>
         */
        @NameInMap("BucketCount")
        public Integer bucketCount;

        /**
         * <p>The name of the bucket.</p>
         */
        @NameInMap("BucketNameList")
        public java.util.List<String> bucketNameList;

        /**
         * <p>Indicates whether the check policy is enabled. Valid values:</p>
         * <br>
         * <p>*   **1**: enabled.</p>
         * <p>*   **0**: disabled.</p>
         */
        @NameInMap("Enable")
        public Integer enable;

        /**
         * <p>The end time of the check. The time is in the HH:mm:ss format.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The ID of the policy.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The prefix of the object that you want to check.</p>
         */
        @NameInMap("KeyPrefixList")
        public java.util.List<String> keyPrefixList;

        /**
         * <p>The suffix of the object that is checked.</p>
         */
        @NameInMap("KeySuffixList")
        public java.util.List<String> keySuffixList;

        /**
         * <p>The time when the policy last update.</p>
         */
        @NameInMap("LastUpdateTime")
        public Long lastUpdateTime;

        /**
         * <p>The name of the policy.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The day when the check is performed. The value indicates the day of the week.</p>
         */
        @NameInMap("ScanDayList")
        public java.util.List<Integer> scanDayList;

        /**
         * <p>The start time of the check. The time is in the HH:mm:ss format.</p>
         */
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
        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
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
