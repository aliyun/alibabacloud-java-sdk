// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ScaleOutOpenSearchRequest extends TeaModel {
    /**
     * <p>The name of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-spsil01pww4hfz</p>
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
     * <p>The total number of data nodes after the scale-out. The value must be a positive integer and greater than the current number of data nodes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("SearchNodeCount")
    public String searchNodeCount;

    public static ScaleOutOpenSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleOutOpenSearchRequest self = new ScaleOutOpenSearchRequest();
        return TeaModel.build(map, self);
    }

    public ScaleOutOpenSearchRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public ScaleOutOpenSearchRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ScaleOutOpenSearchRequest setSearchNodeCount(String searchNodeCount) {
        this.searchNodeCount = searchNodeCount;
        return this;
    }
    public String getSearchNodeCount() {
        return this.searchNodeCount;
    }

}
