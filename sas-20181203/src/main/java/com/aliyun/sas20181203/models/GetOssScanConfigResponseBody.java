// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOssScanConfigResponseBody extends TeaModel {
    /**
     * <p>The data details.</p>
     */
    @NameInMap("Data")
    public GetOssScanConfigResponseBodyData data;

    /**
     * <p>The request ID. Alibaba Cloud generates a unique ID for each request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>E10BAF1C-A6C5-51E2-866C-76D5922E****</p>
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
         * <p>Indicates whether all prefixes are matched.</p>
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
         * <p>1</p>
         */
        @NameInMap("BucketCount")
        public Integer bucketCount;

        /**
         * <p>The bucket name.</p>
         * 
         * <strong>example:</strong>
         * <p>hz-new02****</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The list of bucket names.</p>
         */
        @NameInMap("BucketNameList")
        public java.util.List<String> bucketNameList;

        /**
         * <p>The maximum number of files to decompress. Minimum value: 1. Maximum value: 1000. If the number of files exceeds this value, the decompression operation stops. Files that have already been decompressed are still scanned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DecompressMaxFileCount")
        public Integer decompressMaxFileCount;

        /**
         * <p>The maximum number of decompression layers for nested compressed files. Minimum value: 1. Maximum value: 5. If the number of layers exceeds this value, the decompression operation stops. Files that have already been decompressed are still scanned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DecompressMaxLayer")
        public Integer decompressMaxLayer;

        /**
         * <p>The list of decryption types.</p>
         */
        @NameInMap("DecryptionList")
        public java.util.List<String> decryptionList;

        /**
         * <p>Indicates whether the policy is enabled. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enabled</li>
         * <li><strong>0</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Enable")
        public Integer enable;

        /**
         * <p>The scan end time in the HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The file prefix list.</p>
         */
        @NameInMap("KeyPrefixList")
        public java.util.List<String> keyPrefixList;

        /**
         * <p>The list of file suffixes to scan.</p>
         */
        @NameInMap("KeySuffixList")
        public java.util.List<String> keySuffixList;

        /**
         * <p>Scans files whose last modification time is after the specified timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1724301769834</p>
         */
        @NameInMap("LastModifiedStartTime")
        public Long lastModifiedStartTime;

        /**
         * <p>The timestamp of the last update.</p>
         * 
         * <strong>example:</strong>
         * <p>1702025633079</p>
         */
        @NameInMap("LastUpdateTime")
        public Long lastUpdateTime;

        /**
         * <p>The policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>testPolicy****</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Specifies whether to enable real-time incremental scanning. If this parameter is set to true, the ScanDayList, StartTime, and EndTime parameters do not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RealTimeIncr")
        public Boolean realTimeIncr;

        /**
         * <p>The scan days. Each number represents a day of the week.</p>
         */
        @NameInMap("ScanDayList")
        public java.util.List<Integer> scanDayList;

        /**
         * <p>The scan start time in the HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
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

        public GetOssScanConfigResponseBodyData setDecryptionList(java.util.List<String> decryptionList) {
            this.decryptionList = decryptionList;
            return this;
        }
        public java.util.List<String> getDecryptionList() {
            return this.decryptionList;
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

        public GetOssScanConfigResponseBodyData setLastModifiedStartTime(Long lastModifiedStartTime) {
            this.lastModifiedStartTime = lastModifiedStartTime;
            return this;
        }
        public Long getLastModifiedStartTime() {
            return this.lastModifiedStartTime;
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

        public GetOssScanConfigResponseBodyData setRealTimeIncr(Boolean realTimeIncr) {
            this.realTimeIncr = realTimeIncr;
            return this;
        }
        public Boolean getRealTimeIncr() {
            return this.realTimeIncr;
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
