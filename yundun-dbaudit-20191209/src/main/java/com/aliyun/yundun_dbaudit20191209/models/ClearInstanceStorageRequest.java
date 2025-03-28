// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20191209.models;

import com.aliyun.tea.*;

public class ClearInstanceStorageRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbaudit-cn-78v1gc****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbaudit-audit-dbaudit-cn-78v1gc****</p>
     */
    @NameInMap("StorageCategory")
    public String storageCategory;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbaudit-cn-78v1gc****</p>
     */
    @NameInMap("StorageSpace")
    public String storageSpace;

    public static ClearInstanceStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        ClearInstanceStorageRequest self = new ClearInstanceStorageRequest();
        return TeaModel.build(map, self);
    }

    public ClearInstanceStorageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ClearInstanceStorageRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ClearInstanceStorageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ClearInstanceStorageRequest setStorageCategory(String storageCategory) {
        this.storageCategory = storageCategory;
        return this;
    }
    public String getStorageCategory() {
        return this.storageCategory;
    }

    public ClearInstanceStorageRequest setStorageSpace(String storageSpace) {
        this.storageSpace = storageSpace;
        return this;
    }
    public String getStorageSpace() {
        return this.storageSpace;
    }

}
