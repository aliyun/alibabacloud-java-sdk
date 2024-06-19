// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpdatePolarDBXInstanceNodeRequest extends TeaModel {
    @NameInMap("AddDNSpec")
    public String addDNSpec;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CNNodeCount")
    public String CNNodeCount;

    /**
     * <strong>example:</strong>
     * <p>FEA5DC20-6D8A-5979-97AA-FC57546ADC20</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-hzjasdyuoo</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DNNodeCount")
    public String DNNodeCount;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("DbInstanceNodeCount")
    public String dbInstanceNodeCount;

    @NameInMap("DeleteDNIds")
    public String deleteDNIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StoragePoolName")
    public String storagePoolName;

    public static UpdatePolarDBXInstanceNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolarDBXInstanceNodeRequest self = new UpdatePolarDBXInstanceNodeRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePolarDBXInstanceNodeRequest setAddDNSpec(String addDNSpec) {
        this.addDNSpec = addDNSpec;
        return this;
    }
    public String getAddDNSpec() {
        return this.addDNSpec;
    }

    public UpdatePolarDBXInstanceNodeRequest setCNNodeCount(String CNNodeCount) {
        this.CNNodeCount = CNNodeCount;
        return this;
    }
    public String getCNNodeCount() {
        return this.CNNodeCount;
    }

    public UpdatePolarDBXInstanceNodeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdatePolarDBXInstanceNodeRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public UpdatePolarDBXInstanceNodeRequest setDNNodeCount(String DNNodeCount) {
        this.DNNodeCount = DNNodeCount;
        return this;
    }
    public String getDNNodeCount() {
        return this.DNNodeCount;
    }

    public UpdatePolarDBXInstanceNodeRequest setDbInstanceNodeCount(String dbInstanceNodeCount) {
        this.dbInstanceNodeCount = dbInstanceNodeCount;
        return this;
    }
    public String getDbInstanceNodeCount() {
        return this.dbInstanceNodeCount;
    }

    public UpdatePolarDBXInstanceNodeRequest setDeleteDNIds(String deleteDNIds) {
        this.deleteDNIds = deleteDNIds;
        return this;
    }
    public String getDeleteDNIds() {
        return this.deleteDNIds;
    }

    public UpdatePolarDBXInstanceNodeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdatePolarDBXInstanceNodeRequest setStoragePoolName(String storagePoolName) {
        this.storagePoolName = storagePoolName;
        return this;
    }
    public String getStoragePoolName() {
        return this.storagePoolName;
    }

}
