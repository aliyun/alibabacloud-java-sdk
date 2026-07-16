// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateServiceAccountRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-*********</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The region in which the instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the service account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>METADATA_READONLY</p>
     */
    @NameInMap("ServiceAccountType")
    public String serviceAccountType;

    public static CreateServiceAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceAccountRequest self = new CreateServiceAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceAccountRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CreateServiceAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateServiceAccountRequest setServiceAccountType(String serviceAccountType) {
        this.serviceAccountType = serviceAccountType;
        return this;
    }
    public String getServiceAccountType() {
        return this.serviceAccountType;
    }

}
