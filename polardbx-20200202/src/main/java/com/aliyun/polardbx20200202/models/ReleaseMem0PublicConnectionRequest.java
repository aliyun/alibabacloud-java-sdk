// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ReleaseMem0PublicConnectionRequest extends TeaModel {
    /**
     * <p>The public endpoint to be released. This parameter is optional. If this parameter is not specified, the public endpoint of Mem0 is automatically released.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-hzjasdyuoo.polarx.rds.aliyuncs.com</p>
     */
    @NameInMap("CurrentConnectionString")
    public String currentConnectionString;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-htri0****r4k9p</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The region ID of the instance. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196841.html">DescribeRegions</a> operation to query the details of regions supported by PolarDB-X, including region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ReleaseMem0PublicConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseMem0PublicConnectionRequest self = new ReleaseMem0PublicConnectionRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseMem0PublicConnectionRequest setCurrentConnectionString(String currentConnectionString) {
        this.currentConnectionString = currentConnectionString;
        return this;
    }
    public String getCurrentConnectionString() {
        return this.currentConnectionString;
    }

    public ReleaseMem0PublicConnectionRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public ReleaseMem0PublicConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
