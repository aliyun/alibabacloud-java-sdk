// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteResourceControlRequest extends TeaModel {
    /**
     * <p>The database cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource control name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-rc</p>
     */
    @NameInMap("ResourceControlName")
    public String resourceControlName;

    public static DeleteResourceControlRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceControlRequest self = new DeleteResourceControlRequest();
        return TeaModel.build(map, self);
    }

    public DeleteResourceControlRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteResourceControlRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteResourceControlRequest setResourceControlName(String resourceControlName) {
        this.resourceControlName = resourceControlName;
        return this;
    }
    public String getResourceControlName() {
        return this.resourceControlName;
    }

}
