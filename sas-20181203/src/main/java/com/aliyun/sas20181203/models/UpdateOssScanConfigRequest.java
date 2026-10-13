// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateOssScanConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to match all file prefixes.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllKeyPrefix")
    public Boolean allKeyPrefix;

    /**
     * <p>Specifies whether to automatically add new buckets to the scan policy. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Disabled.</li>
     * <li><strong>1</strong>: Enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AutoAdd")
    public Integer autoAdd;

    /**
     * <p>The list of bucket names.</p>
     */
    @NameInMap("BucketNameList")
    public java.util.List<String> bucketNameList;

    /**
     * <p>The maximum number of files to decompress. Valid values: 1 to 1000. If the number of files exceeds the maximum value, the decompression stops. The scan of the decompressed files is not affected.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DecompressMaxFileCount")
    public Integer decompressMaxFileCount;

    /**
     * <p>The maximum number of decompression layers for nested compressed files. Valid values: 1 to 5. If the number of layers exceeds the maximum value, the decompression stops. The scan of the decompressed files is not affected.</p>
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
     * <p>Specifies whether to enable the feature. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Enabled.</li>
     * <li><strong>0</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Enable")
    public Integer enable;

    /**
     * <p>The end time of the scan. Format: HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>00:00:01</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the scan policy.</p>
     * 
     * <strong>example:</strong>
     * <p>1141****</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The file prefix list.</p>
     */
    @NameInMap("KeyPrefixList")
    public java.util.List<String> keyPrefixList;

    /**
     * <p>The list of file name extensions.</p>
     */
    @NameInMap("KeySuffixList")
    public java.util.List<String> keySuffixList;

    /**
     * <p>The start timestamp for the last modification time of the files to be scanned. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1724301769834</p>
     */
    @NameInMap("LastModifiedStartTime")
    public Long lastModifiedStartTime;

    /**
     * <p>The configuration policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>testStrategy</p>
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
     * <p>The days of the week when scans are performed. A number represents a day of the week.</p>
     */
    @NameInMap("ScanDayList")
    public java.util.List<Integer> scanDayList;

    /**
     * <p>The service source. Valid values:</p>
     * <ul>
     * <li><strong>OSS</strong>: OSS.</li>
     * <li><strong>NAS</strong>: NAS.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The start time of the scan. Format: HH:mm:ss.</p>
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

    public UpdateOssScanConfigRequest setAutoAdd(Integer autoAdd) {
        this.autoAdd = autoAdd;
        return this;
    }
    public Integer getAutoAdd() {
        return this.autoAdd;
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

    public UpdateOssScanConfigRequest setRealTimeIncr(Boolean realTimeIncr) {
        this.realTimeIncr = realTimeIncr;
        return this;
    }
    public Boolean getRealTimeIncr() {
        return this.realTimeIncr;
    }

    public UpdateOssScanConfigRequest setScanDayList(java.util.List<Integer> scanDayList) {
        this.scanDayList = scanDayList;
        return this;
    }
    public java.util.List<Integer> getScanDayList() {
        return this.scanDayList;
    }

    public UpdateOssScanConfigRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public UpdateOssScanConfigRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
