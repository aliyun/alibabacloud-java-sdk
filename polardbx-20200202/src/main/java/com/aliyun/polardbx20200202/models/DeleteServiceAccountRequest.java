// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DeleteServiceAccountRequest extends TeaModel {
    /**
     * <p>The name of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-********</p>
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

    public static DeleteServiceAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceAccountRequest self = new DeleteServiceAccountRequest();
        return TeaModel.build(map, self);
    }

    public DeleteServiceAccountRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DeleteServiceAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteServiceAccountRequest setServiceAccountType(String serviceAccountType) {
        this.serviceAccountType = serviceAccountType;
        return this;
    }
    public String getServiceAccountType() {
        return this.serviceAccountType;
    }

}
