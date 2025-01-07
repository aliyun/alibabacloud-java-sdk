// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateOssBucketScanTaskRequest extends TeaModel {
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
     * <p>This parameter is required.</p>
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
     * <p>The suffixes of the objects that you do not want to check.</p>
     */
    @NameInMap("ExcludeKeySuffixList")
    public java.util.List<String> excludeKeySuffixList;

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
     * <p>The timestamp when the object was last modified. The time must be later than the timestamp that you specify. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1724301769834</p>
     */
    @NameInMap("LastModifiedStartTime")
    public Long lastModifiedStartTime;

    /**
     * <p>The check mode. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: checks all objects in the bucket.</li>
     * <li><strong>2</strong>: checks only new objects in the bucket.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScanMode")
    public Integer scanMode;

    public static CreateOssBucketScanTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOssBucketScanTaskRequest self = new CreateOssBucketScanTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateOssBucketScanTaskRequest setAllKeyPrefix(Boolean allKeyPrefix) {
        this.allKeyPrefix = allKeyPrefix;
        return this;
    }
    public Boolean getAllKeyPrefix() {
        return this.allKeyPrefix;
    }

    public CreateOssBucketScanTaskRequest setBucketNameList(java.util.List<String> bucketNameList) {
        this.bucketNameList = bucketNameList;
        return this;
    }
    public java.util.List<String> getBucketNameList() {
        return this.bucketNameList;
    }

    public CreateOssBucketScanTaskRequest setDecompressMaxFileCount(Integer decompressMaxFileCount) {
        this.decompressMaxFileCount = decompressMaxFileCount;
        return this;
    }
    public Integer getDecompressMaxFileCount() {
        return this.decompressMaxFileCount;
    }

    public CreateOssBucketScanTaskRequest setDecompressMaxLayer(Integer decompressMaxLayer) {
        this.decompressMaxLayer = decompressMaxLayer;
        return this;
    }
    public Integer getDecompressMaxLayer() {
        return this.decompressMaxLayer;
    }

    public CreateOssBucketScanTaskRequest setDecryptionList(java.util.List<String> decryptionList) {
        this.decryptionList = decryptionList;
        return this;
    }
    public java.util.List<String> getDecryptionList() {
        return this.decryptionList;
    }

    public CreateOssBucketScanTaskRequest setExcludeKeySuffixList(java.util.List<String> excludeKeySuffixList) {
        this.excludeKeySuffixList = excludeKeySuffixList;
        return this;
    }
    public java.util.List<String> getExcludeKeySuffixList() {
        return this.excludeKeySuffixList;
    }

    public CreateOssBucketScanTaskRequest setKeyPrefixList(java.util.List<String> keyPrefixList) {
        this.keyPrefixList = keyPrefixList;
        return this;
    }
    public java.util.List<String> getKeyPrefixList() {
        return this.keyPrefixList;
    }

    public CreateOssBucketScanTaskRequest setKeySuffixList(java.util.List<String> keySuffixList) {
        this.keySuffixList = keySuffixList;
        return this;
    }
    public java.util.List<String> getKeySuffixList() {
        return this.keySuffixList;
    }

    public CreateOssBucketScanTaskRequest setLastModifiedStartTime(Long lastModifiedStartTime) {
        this.lastModifiedStartTime = lastModifiedStartTime;
        return this;
    }
    public Long getLastModifiedStartTime() {
        return this.lastModifiedStartTime;
    }

    public CreateOssBucketScanTaskRequest setScanMode(Integer scanMode) {
        this.scanMode = scanMode;
        return this;
    }
    public Integer getScanMode() {
        return this.scanMode;
    }

}
