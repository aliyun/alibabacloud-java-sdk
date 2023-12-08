// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateOssBucketScanTaskRequest extends TeaModel {
    @NameInMap("AllKeyPrefix")
    public Boolean allKeyPrefix;

    /**
     * <p>The names of the buckets.</p>
     */
    @NameInMap("BucketNameList")
    public java.util.List<String> bucketNameList;

    /**
     * <p>The suffixes of the objects that you do not want to check.</p>
     */
    @NameInMap("ExcludeKeySuffixList")
    public java.util.List<String> excludeKeySuffixList;

    @NameInMap("KeyPrefixList")
    public java.util.List<String> keyPrefixList;

    /**
     * <p>The suffixes of the objects that you want to check.</p>
     */
    @NameInMap("KeySuffixList")
    public java.util.List<String> keySuffixList;

    /**
     * <p>The check mode. Valid values:</p>
     * <br>
     * <p>*   **1**: checks all objects in the bucket.</p>
     * <p>*   **2**: checks only new objects in the bucket.</p>
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

    public CreateOssBucketScanTaskRequest setScanMode(Integer scanMode) {
        this.scanMode = scanMode;
        return this;
    }
    public Integer getScanMode() {
        return this.scanMode;
    }

}
