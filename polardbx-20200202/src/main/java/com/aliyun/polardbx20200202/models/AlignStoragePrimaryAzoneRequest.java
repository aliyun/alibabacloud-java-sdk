// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class AlignStoragePrimaryAzoneRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StorageInstanceName")
    public String storageInstanceName;

    @NameInMap("SwitchTime")
    public String switchTime;

    @NameInMap("SwitchTimeMode")
    public String switchTimeMode;

    public static AlignStoragePrimaryAzoneRequest build(java.util.Map<String, ?> map) throws Exception {
        AlignStoragePrimaryAzoneRequest self = new AlignStoragePrimaryAzoneRequest();
        return TeaModel.build(map, self);
    }

    public AlignStoragePrimaryAzoneRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public AlignStoragePrimaryAzoneRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AlignStoragePrimaryAzoneRequest setStorageInstanceName(String storageInstanceName) {
        this.storageInstanceName = storageInstanceName;
        return this;
    }
    public String getStorageInstanceName() {
        return this.storageInstanceName;
    }

    public AlignStoragePrimaryAzoneRequest setSwitchTime(String switchTime) {
        this.switchTime = switchTime;
        return this;
    }
    public String getSwitchTime() {
        return this.switchTime;
    }

    public AlignStoragePrimaryAzoneRequest setSwitchTimeMode(String switchTimeMode) {
        this.switchTimeMode = switchTimeMode;
        return this;
    }
    public String getSwitchTimeMode() {
        return this.switchTimeMode;
    }

}
