// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateContext0Request extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-********</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The name of the PolarDB-X Search instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxs-********</p>
     */
    @NameInMap("OpenSearchInstanceName")
    public String openSearchInstanceName;

    /**
     * <p>The region in which the instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateContext0Request build(java.util.Map<String, ?> map) throws Exception {
        CreateContext0Request self = new CreateContext0Request();
        return TeaModel.build(map, self);
    }

    public CreateContext0Request setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CreateContext0Request setOpenSearchInstanceName(String openSearchInstanceName) {
        this.openSearchInstanceName = openSearchInstanceName;
        return this;
    }
    public String getOpenSearchInstanceName() {
        return this.openSearchInstanceName;
    }

    public CreateContext0Request setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
