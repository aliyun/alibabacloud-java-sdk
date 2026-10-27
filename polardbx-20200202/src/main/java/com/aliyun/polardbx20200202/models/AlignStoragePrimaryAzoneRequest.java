// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class AlignStoragePrimaryAzoneRequest extends TeaModel {
    /**
     * <p>The name of the PolarDB-X instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-htri0ori2r****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the storage instance whose primary node zone needs to be aligned.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-xdb-m-pxcbjrylg49skcxb17394</p>
     */
    @NameInMap("StorageInstanceName")
    public String storageInstanceName;

    /**
     * <p>The start time of the switch for the storage primary node, in the UTC time format YYYY-MM-DDThh:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-12-11T17:10:00Z</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    /**
     * <p>The switchover mode. Valid values:</p>
     * <ul>
     * <li>0: immediate switchover</li>
     * <li>1: switchover during the O&amp;M window</li>
     * <li>2: switchover at a specified time</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
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
