// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateOssBucketScanTaskRequest extends TeaModel {
    /**
     * <p>Specifies whether to match all prefixes. If this parameter is set to true, the KeyPrefixList parameter does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllKeyPrefix")
    public Boolean allKeyPrefix;

    /**
     * <p>The list of bucket names.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BucketNameList")
    public java.util.List<String> bucketNameList;

    /**
     * <p>The maximum number of files to decompress. The minimum value is 1 and the maximum value is 1000. When the maximum number of decompressed files is exceeded, the decompression operation ends immediately. The detection of files that have already been decompressed is not affected.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DecompressMaxFileCount")
    public Integer decompressMaxFileCount;

    /**
     * <p>The maximum number of decompression layers when multiple levels of compressed packages are nested. The minimum value is 1 and the maximum value is 5. When the maximum number of decompression layers is exceeded, the decompression operation ends immediately. The detection of files that have already been decompressed is not affected.</p>
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
     * <p>The list of file suffixes to exclude from detection.</p>
     */
    @NameInMap("ExcludeKeySuffixList")
    public java.util.List<String> excludeKeySuffixList;

    /**
     * <p>The prefix list of files.</p>
     */
    @NameInMap("KeyPrefixList")
    public java.util.List<String> keyPrefixList;

    /**
     * <p>The list of file suffixes.</p>
     */
    @NameInMap("KeySuffixList")
    public java.util.List<String> keySuffixList;

    /**
     * <p>Specifies that only files whose last modification time is after the specified timestamp are detected. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1724301769834</p>
     */
    @NameInMap("LastModifiedStartTime")
    public Long lastModifiedStartTime;

    /**
     * <p>The detection mode. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: Full file detection.</p>
     * </li>
     * <li><p><strong>2</strong>: Incremental file detection.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScanMode")
    public Integer scanMode;

    /**
     * <p>The business source. Valid values:</p>
     * <ul>
     * <li><strong>OSS</strong>: OSS</li>
     * <li><strong>NAS</strong>: NAS</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("Source")
    public String source;

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

    public CreateOssBucketScanTaskRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
