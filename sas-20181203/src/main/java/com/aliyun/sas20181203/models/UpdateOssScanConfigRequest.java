// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateOssScanConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to match the prefixes of all objects.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllKeyPrefix")
    public Boolean allKeyPrefix;

    /**
     * <p>The names of the buckets.</p>
     */
    @NameInMap("BucketNameList")
    public java.util.List<String> bucketNameList;

    /**
     * <p>The maximum number of objects that can be extracted from a package. Valid values: 1 to 1000. If the value is reached, the decompression operation immediately finishes. The detection of extracted objects is not affected.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DecompressMaxFileCount")
    public Integer decompressMaxFileCount;

    /**
     * <p>The maximum number of decompression levels when multi-level packages are decompressed. Valid values: 1 to 5. If the value is reached, the decompression operation immediately finishes. The detection of extracted objects is not affected.</p>
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
     * <p>Specifies whether to enable the bucket check policy. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: enables the bucket check policy.</li>
     * <li><strong>0</strong>: disables the bucket check policy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Enable")
    public Integer enable;

    /**
     * <p>The end time of the check. Specify the time in the HH:mm:ss format.</p>
     * 
     * <strong>example:</strong>
     * <p>00:00:01</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>65778</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The prefixes of the objects.</p>
     */
    @NameInMap("KeyPrefixList")
    public java.util.List<String> keyPrefixList;

    /**
     * <p>The suffixes of the objects that you want to check.</p>
     */
    @NameInMap("KeySuffixList")
    public java.util.List<String> keySuffixList;

    /**
     * <p>The timestamp. The objects whose last modification time is later than the specified value are detected. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1724301769834</p>
     */
    @NameInMap("LastModifiedStartTime")
    public Long lastModifiedStartTime;

    /**
     * <p>The policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>nacos****</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The time when the check is performed. The value specifies the days of the week.</p>
     */
    @NameInMap("ScanDayList")
    public java.util.List<Integer> scanDayList;

    /**
     * <p>The start time of the check. Specify the time in the HH:mm:ss format.</p>
     * 
     * <strong>example:</strong>
     * <p>00:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static UpdateOssScanConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOssScanConfigRequest self = new UpdateOssScanConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOssScanConfigRequest setAllKeyPrefix(Boolean allKeyPrefix) {
        this.allKeyPrefix = allKeyPrefix;
        return this;
    }
    public Boolean getAllKeyPrefix() {
        return this.allKeyPrefix;
    }

    public UpdateOssScanConfigRequest setBucketNameList(java.util.List<String> bucketNameList) {
        this.bucketNameList = bucketNameList;
        return this;
    }
    public java.util.List<String> getBucketNameList() {
        return this.bucketNameList;
    }

    public UpdateOssScanConfigRequest setDecompressMaxFileCount(Integer decompressMaxFileCount) {
        this.decompressMaxFileCount = decompressMaxFileCount;
        return this;
    }
    public Integer getDecompressMaxFileCount() {
        return this.decompressMaxFileCount;
    }

    public UpdateOssScanConfigRequest setDecompressMaxLayer(Integer decompressMaxLayer) {
        this.decompressMaxLayer = decompressMaxLayer;
        return this;
    }
    public Integer getDecompressMaxLayer() {
        return this.decompressMaxLayer;
    }

    public UpdateOssScanConfigRequest setDecryptionList(java.util.List<String> decryptionList) {
        this.decryptionList = decryptionList;
        return this;
    }
    public java.util.List<String> getDecryptionList() {
        return this.decryptionList;
    }

    public UpdateOssScanConfigRequest setEnable(Integer enable) {
        this.enable = enable;
        return this;
    }
    public Integer getEnable() {
        return this.enable;
    }

    public UpdateOssScanConfigRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public UpdateOssScanConfigRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateOssScanConfigRequest setKeyPrefixList(java.util.List<String> keyPrefixList) {
        this.keyPrefixList = keyPrefixList;
        return this;
    }
    public java.util.List<String> getKeyPrefixList() {
        return this.keyPrefixList;
    }

    public UpdateOssScanConfigRequest setKeySuffixList(java.util.List<String> keySuffixList) {
        this.keySuffixList = keySuffixList;
        return this;
    }
    public java.util.List<String> getKeySuffixList() {
        return this.keySuffixList;
    }

    public UpdateOssScanConfigRequest setLastModifiedStartTime(Long lastModifiedStartTime) {
        this.lastModifiedStartTime = lastModifiedStartTime;
        return this;
    }
    public Long getLastModifiedStartTime() {
        return this.lastModifiedStartTime;
    }

    public UpdateOssScanConfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateOssScanConfigRequest setScanDayList(java.util.List<Integer> scanDayList) {
        this.scanDayList = scanDayList;
        return this;
    }
    public java.util.List<Integer> getScanDayList() {
        return this.scanDayList;
    }

    public UpdateOssScanConfigRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
