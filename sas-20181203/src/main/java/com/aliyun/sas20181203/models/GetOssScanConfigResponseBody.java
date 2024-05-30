// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOssScanConfigResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetOssScanConfigResponseBodyData data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetOssScanConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOssScanConfigResponseBody self = new GetOssScanConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOssScanConfigResponseBody setData(GetOssScanConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOssScanConfigResponseBodyData getData() {
        return this.data;
    }

    public GetOssScanConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetOssScanConfigResponseBodyData extends TeaModel {
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
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The names of the buckets.</p>
         */
        @NameInMap("BucketNameList")
        public java.util.List<String> bucketNameList;

        /**
         * <p>The maximum number of files for decompression. The minimum value is 1, and the maximum value is 1000. If the decompression level exceeds the maximum, the decompression operation will be terminated, but the detection of decompressed files will not be affected.</p>
         */
        @NameInMap("DecompressMaxFileCount")
        public Integer decompressMaxFileCount;

        /**
         * <p>The maximum level of decompression when dealing with nested compressed files with multiple levels. The minimum value is 1, and the maximum value is 5. If the decompression level exceeds the maximum, the decompression operation will be terminated, but the detection of decompressed files will not be affected.</p>
         */
        @NameInMap("DecompressMaxLayer")
        public Integer decompressMaxLayer;

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
        public String id;

        /**
         * <p>The prefixes of the object that you want to check.</p>
         */
        @NameInMap("KeyPrefixList")
        public java.util.List<String> keyPrefixList;

        /**
         * <p>The suffixes of the objects that are checked.</p>
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
         * <p>The days when the check is performed. The value indicates the days of the week.</p>
         */
        @NameInMap("ScanDayList")
        public java.util.List<Integer> scanDayList;

        /**
         * <p>The start time of the check. The time is in the HH:mm:ss format.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static GetOssScanConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOssScanConfigResponseBodyData self = new GetOssScanConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOssScanConfigResponseBodyData setAllKeyPrefix(Boolean allKeyPrefix) {
            this.allKeyPrefix = allKeyPrefix;
            return this;
        }
        public Boolean getAllKeyPrefix() {
            return this.allKeyPrefix;
        }

        public GetOssScanConfigResponseBodyData setBucketCount(Integer bucketCount) {
            this.bucketCount = bucketCount;
            return this;
        }
        public Integer getBucketCount() {
            return this.bucketCount;
        }

        public GetOssScanConfigResponseBodyData setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GetOssScanConfigResponseBodyData setBucketNameList(java.util.List<String> bucketNameList) {
            this.bucketNameList = bucketNameList;
            return this;
        }
        public java.util.List<String> getBucketNameList() {
            return this.bucketNameList;
        }

        public GetOssScanConfigResponseBodyData setDecompressMaxFileCount(Integer decompressMaxFileCount) {
            this.decompressMaxFileCount = decompressMaxFileCount;
            return this;
        }
        public Integer getDecompressMaxFileCount() {
            return this.decompressMaxFileCount;
        }

        public GetOssScanConfigResponseBodyData setDecompressMaxLayer(Integer decompressMaxLayer) {
            this.decompressMaxLayer = decompressMaxLayer;
            return this;
        }
        public Integer getDecompressMaxLayer() {
            return this.decompressMaxLayer;
        }

        public GetOssScanConfigResponseBodyData setEnable(Integer enable) {
            this.enable = enable;
            return this;
        }
        public Integer getEnable() {
            return this.enable;
        }

        public GetOssScanConfigResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetOssScanConfigResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetOssScanConfigResponseBodyData setKeyPrefixList(java.util.List<String> keyPrefixList) {
            this.keyPrefixList = keyPrefixList;
            return this;
        }
        public java.util.List<String> getKeyPrefixList() {
            return this.keyPrefixList;
        }

        public GetOssScanConfigResponseBodyData setKeySuffixList(java.util.List<String> keySuffixList) {
            this.keySuffixList = keySuffixList;
            return this;
        }
        public java.util.List<String> getKeySuffixList() {
            return this.keySuffixList;
        }

        public GetOssScanConfigResponseBodyData setLastUpdateTime(Long lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }
        public Long getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        public GetOssScanConfigResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetOssScanConfigResponseBodyData setScanDayList(java.util.List<Integer> scanDayList) {
            this.scanDayList = scanDayList;
            return this;
        }
        public java.util.List<Integer> getScanDayList() {
            return this.scanDayList;
        }

        public GetOssScanConfigResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
