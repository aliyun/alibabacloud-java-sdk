// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateOssScanConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to match all prefixes. If this parameter is set to true, the KeyPrefixList parameter does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllKeyPrefix")
    public Boolean allKeyPrefix;

    /**
     * <p>Specifies whether OSS buckets are automatically added to this policy. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enabled.</li>
     * <li><strong>false</strong>: Disabled.</li>
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
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The maximum number of files to decompress. Minimum value: 1. Maximum value: 1000. When the maximum number of decompressed files is exceeded, the decompression operation stops. The detection of files that have already been decompressed is not affected.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DecompressMaxFileCount")
    public Integer decompressMaxFileCount;

    /**
     * <p>The maximum number of decompression layers when multiple levels of nested compressed files exist. Minimum value: 1. Maximum value: 5. When the maximum number of decompression layers is exceeded, the decompression operation stops. The detection of files that have already been decompressed is not affected.</p>
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
     * <p>Specifies whether to enable the policy. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Enabled.</li>
     * <li><strong>0</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Enable")
    public Integer enable;

    /**
     * <p>The scan stop time, in the HH:mm:ss format.</p>
     * 
     * <strong>example:</strong>
     * <p>01:01:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

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
     * <p>Specifies that only files whose last modification time is after the specified timestamp are scanned. Unit: milliseconds.</p>
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
     * <p>testName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Specifies whether to enable real-time incremental detection. If this parameter is set to true, the ScanDayList, StartTime, and EndTime parameters do not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RealTimeIncr")
    public Boolean realTimeIncr;

    /**
     * <p>The scan schedule. The number represents the day of the week.</p>
     */
    @NameInMap("ScanDayList")
    public java.util.List<Integer> scanDayList;

    /**
     * <p>The business source. Valid values:</p>
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
     * <p>The scan start time, in the HH:mm:ss format.</p>
     * 
     * <strong>example:</strong>
     * <p>00:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static CreateOssScanConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOssScanConfigRequest self = new CreateOssScanConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateOssScanConfigRequest setAllKeyPrefix(Boolean allKeyPrefix) {
        this.allKeyPrefix = allKeyPrefix;
        return this;
    }
    public Boolean getAllKeyPrefix() {
        return this.allKeyPrefix;
    }

    public CreateOssScanConfigRequest setAutoAdd(Integer autoAdd) {
        this.autoAdd = autoAdd;
        return this;
    }
    public Integer getAutoAdd() {
        return this.autoAdd;
    }

    public CreateOssScanConfigRequest setBucketNameList(java.util.List<String> bucketNameList) {
        this.bucketNameList = bucketNameList;
        return this;
    }
    public java.util.List<String> getBucketNameList() {
        return this.bucketNameList;
    }

    public CreateOssScanConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateOssScanConfigRequest setDecompressMaxFileCount(Integer decompressMaxFileCount) {
        this.decompressMaxFileCount = decompressMaxFileCount;
        return this;
    }
    public Integer getDecompressMaxFileCount() {
        return this.decompressMaxFileCount;
    }

    public CreateOssScanConfigRequest setDecompressMaxLayer(Integer decompressMaxLayer) {
        this.decompressMaxLayer = decompressMaxLayer;
        return this;
    }
    public Integer getDecompressMaxLayer() {
        return this.decompressMaxLayer;
    }

    public CreateOssScanConfigRequest setDecryptionList(java.util.List<String> decryptionList) {
        this.decryptionList = decryptionList;
        return this;
    }
    public java.util.List<String> getDecryptionList() {
        return this.decryptionList;
    }

    public CreateOssScanConfigRequest setEnable(Integer enable) {
        this.enable = enable;
        return this;
    }
    public Integer getEnable() {
        return this.enable;
    }

    public CreateOssScanConfigRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateOssScanConfigRequest setKeyPrefixList(java.util.List<String> keyPrefixList) {
        this.keyPrefixList = keyPrefixList;
        return this;
    }
    public java.util.List<String> getKeyPrefixList() {
        return this.keyPrefixList;
    }

    public CreateOssScanConfigRequest setKeySuffixList(java.util.List<String> keySuffixList) {
        this.keySuffixList = keySuffixList;
        return this;
    }
    public java.util.List<String> getKeySuffixList() {
        return this.keySuffixList;
    }

    public CreateOssScanConfigRequest setLastModifiedStartTime(Long lastModifiedStartTime) {
        this.lastModifiedStartTime = lastModifiedStartTime;
        return this;
    }
    public Long getLastModifiedStartTime() {
        return this.lastModifiedStartTime;
    }

    public CreateOssScanConfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateOssScanConfigRequest setRealTimeIncr(Boolean realTimeIncr) {
        this.realTimeIncr = realTimeIncr;
        return this;
    }
    public Boolean getRealTimeIncr() {
        return this.realTimeIncr;
    }

    public CreateOssScanConfigRequest setScanDayList(java.util.List<Integer> scanDayList) {
        this.scanDayList = scanDayList;
        return this;
    }
    public java.util.List<Integer> getScanDayList() {
        return this.scanDayList;
    }

    public CreateOssScanConfigRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateOssScanConfigRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
