// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateContextDBRequest extends TeaModel {
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
     * <p>The name of the PolarDB-X Search instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxs-********</p>
     */
    @NameInMap("OpenSearchInstanceName")
    public String openSearchInstanceName;

    /**
     * <p>The ID of the region where the instance resides. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196841.html">DescribeRegions</a> operation to query the regions supported by PolarDB-X, including region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateContextDBRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContextDBRequest self = new CreateContextDBRequest();
        return TeaModel.build(map, self);
    }

    public CreateContextDBRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CreateContextDBRequest setOpenSearchInstanceName(String openSearchInstanceName) {
        this.openSearchInstanceName = openSearchInstanceName;
        return this;
    }
    public String getOpenSearchInstanceName() {
        return this.openSearchInstanceName;
    }

    public CreateContextDBRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
