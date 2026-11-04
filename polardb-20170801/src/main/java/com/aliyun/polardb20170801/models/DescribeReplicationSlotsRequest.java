// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeReplicationSlotsRequest extends TeaModel {
    /**
     * <p>The ID of the PolarDB cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-test123456</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The name of the child node of the distributed instance, used to filter replication slots.</p>
     * 
     * <strong>example:</strong>
     * <p>testGroup</p>
     */
    @NameInMap("SubGroupName")
    public String subGroupName;

    public static DescribeReplicationSlotsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeReplicationSlotsRequest self = new DescribeReplicationSlotsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeReplicationSlotsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeReplicationSlotsRequest setSubGroupName(String subGroupName) {
        this.subGroupName = subGroupName;
        return this;
    }
    public String getSubGroupName() {
        return this.subGroupName;
    }

}
