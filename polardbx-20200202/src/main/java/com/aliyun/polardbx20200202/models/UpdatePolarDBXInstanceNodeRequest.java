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
    public Integer CNNodeCount;

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
    public Integer DNNodeCount;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("DbInstanceNodeCount")
    public Integer dbInstanceNodeCount;

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

    public UpdatePolarDBXInstanceNodeRequest setCNNodeCount(Integer CNNodeCount) {
        this.CNNodeCount = CNNodeCount;
        return this;
    }
    public Integer getCNNodeCount() {
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

    public UpdatePolarDBXInstanceNodeRequest setDNNodeCount(Integer DNNodeCount) {
        this.DNNodeCount = DNNodeCount;
        return this;
    }
    public Integer getDNNodeCount() {
        return this.DNNodeCount;
    }

    public UpdatePolarDBXInstanceNodeRequest setDbInstanceNodeCount(Integer dbInstanceNodeCount) {
        this.dbInstanceNodeCount = dbInstanceNodeCount;
        return this;
    }
    public Integer getDbInstanceNodeCount() {
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
