// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossmfd20231017.models;

import com.aliyun.tea.*;

public class GetOssScanConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetOssScanConfigResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>E14CECBF-8CAC-520C-ACC3-9503D5******</p>
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
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllKeyPrefix")
        public Boolean allKeyPrefix;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("BucketCount")
        public Integer bucketCount;

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
        @NameInMap("DecompressMaxFileCount")
        public Integer decompressMaxFileCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DecompressMaxLayer")
        public Integer decompressMaxLayer;

        @NameInMap("DecryptionList")
        public java.util.List<String> decryptionList;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Enable")
        public Integer enable;

        /**
         * <strong>example:</strong>
         * <p>01:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>13******</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("KeyPrefixList")
        public java.util.List<String> keyPrefixList;

        @NameInMap("KeySuffixList")
        public java.util.List<String> keySuffixList;

        /**
         * <strong>example:</strong>
         * <p>1702025633079</p>
         */
        @NameInMap("LastModifiedStartTime")
        public Long lastModifiedStartTime;

        /**
         * <strong>example:</strong>
         * <p>1702025633079</p>
         */
        @NameInMap("LastUpdateTime")
        public Long lastUpdateTime;

        /**
         * <strong>example:</strong>
         * <p>testPolicy******</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("RealTimeIncr")
        public Boolean realTimeIncr;

        @NameInMap("ScanDayList")
        public java.util.List<Integer> scanDayList;

        /**
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
