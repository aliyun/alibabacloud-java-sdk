// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateOssScanConfigRequest extends TeaModel {
    /**
     * <p>Whether to match all file prefixes.</p>
     */
    @NameInMap("AllKeyPrefix")
    public Boolean allKeyPrefix;

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
     * <p>Specifies whether to enable the bucket check policy. Valid values:</p>
     * <br>
     * <p>*   **1**: enables the bucket check policy.</p>
     * <p>*   **0**: disables the bucket check policy.</p>
     */
    @NameInMap("Enable")
    public Integer enable;

    /**
     * <p>The end time of the check. Specify the time in the HH:mm:ss format.</p>
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
     * <p>The suffixes of the objects that you want to check.</p>
     */
    @NameInMap("KeySuffixList")
    public java.util.List<String> keySuffixList;

    /**
     * <p>The name of the policy.</p>
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
