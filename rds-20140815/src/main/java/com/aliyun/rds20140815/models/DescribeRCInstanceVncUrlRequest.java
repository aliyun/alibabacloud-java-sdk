// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInstanceVncUrlRequest extends TeaModel {
    /**
     * <p>The database engine. Valid values:</p>
     * <ul>
     * <li><strong>mssql</strong>: SQL Server</li>
     * <li><strong>mysql</strong>: MySQL</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>mysql</p>
     */
    @NameInMap("DbType")
    public String dbType;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rc-e6e3757b8px27oa5****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-chengdu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeRCInstanceVncUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCInstanceVncUrlRequest self = new DescribeRCInstanceVncUrlRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRCInstanceVncUrlRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public DescribeRCInstanceVncUrlRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeRCInstanceVncUrlRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
