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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E10BAF1C-A6C5-51E2-866C-76D5922E****</p>
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
         * <p>Indicates whether the prefixes of all objects are matched.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllKeyPrefix")
        public Boolean allKeyPrefix;

        /**
         * <p>The number of buckets.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("BucketCount")
        public Integer bucketCount;

        /**
         * <p>The names of the buckets.</p>
         */
        @NameInMap("BucketNameList")
        public java.util.List<String> bucketNameList;

        /**
         * <p>The maximum number of objects that can be extracted during decompression. Valid values: 1 to 1000. If the maximum number of objects that can be extracted is reached, the decompression operation immediately ends and the detection of extracted objects is not affected.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DecompressMaxFileCount")
        public Integer decompressMaxFileCount;

        /**
         * <p>The maximum number of decompression levels when multi-level packages are decompressed. Valid values: 1 to 5. If the maximum number of decompression levels is reached, the decompression operation immediately ends and the detection of extracted objects is not affected.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DecompressMaxLayer")
        public Integer decompressMaxLayer;

        /**
         * <p>The decryption methods.</p>
         */
        @NameInMap("DecryptionList")
        public java.util.List<String> decryptionList;

        /**
         * <p>Indicates whether the policy is enabled. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Enable")
        public Integer enable;

        /**
         * <p>The time when the scan ends. The time is in the HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>06:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>443496</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The prefixes of the objects that are scanned.</p>
         */
        @NameInMap("KeyPrefixList")
        public java.util.List<String> keyPrefixList;

        /**
         * <p>The suffixes of the objects that are scanned.</p>
         */
        @NameInMap("KeySuffixList")
        public java.util.List<String> keySuffixList;

        /**
         * <p>The timestamp when the object was last modified. The time must be later than the timestamp that you specify. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1724301769834</p>
         */
        @NameInMap("LastModifiedStartTime")
        public Long lastModifiedStartTime;

        /**
         * <p>The timestamp when the configuration was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1698388233883</p>
         */
        @NameInMap("LastUpdateTime")
        public Long lastUpdateTime;

        /**
         * <p>The configuration name.</p>
         * 
         * <strong>example:</strong>
         * <p>test****</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The days on which the scan is executed in a week.</p>
         */
        @NameInMap("ScanDayList")
        public java.util.List<Integer> scanDayList;

        /**
         * <p>The time when the scan starts. The time is in the HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
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

        public ListOssScanConfigResponseBodyData setDecompressMaxFileCount(Integer decompressMaxFileCount) {
            this.decompressMaxFileCount = decompressMaxFileCount;
            return this;
        }
        public Integer getDecompressMaxFileCount() {
            return this.decompressMaxFileCount;
        }

        public ListOssScanConfigResponseBodyData setDecompressMaxLayer(Integer decompressMaxLayer) {
            this.decompressMaxLayer = decompressMaxLayer;
            return this;
        }
        public Integer getDecompressMaxLayer() {
            return this.decompressMaxLayer;
        }

        public ListOssScanConfigResponseBodyData setDecryptionList(java.util.List<String> decryptionList) {
            this.decryptionList = decryptionList;
            return this;
        }
        public java.util.List<String> getDecryptionList() {
            return this.decryptionList;
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

        public ListOssScanConfigResponseBodyData setLastModifiedStartTime(Long lastModifiedStartTime) {
            this.lastModifiedStartTime = lastModifiedStartTime;
            return this;
        }
        public Long getLastModifiedStartTime() {
            return this.lastModifiedStartTime;
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
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
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
