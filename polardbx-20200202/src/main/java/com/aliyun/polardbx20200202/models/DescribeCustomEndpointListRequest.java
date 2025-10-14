// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeCustomEndpointListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CheckDeleteCN")
    public Boolean checkDeleteCN;

    /**
     * <strong>example:</strong>
     * <p>pxe-b6e****no4pfap1s</p>
     */
    @NameInMap("CustomEndpointIds")
    public String customEndpointIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-xxx</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeCustomEndpointListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomEndpointListRequest self = new DescribeCustomEndpointListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomEndpointListRequest setCheckDeleteCN(Boolean checkDeleteCN) {
        this.checkDeleteCN = checkDeleteCN;
        return this;
    }
    public Boolean getCheckDeleteCN() {
        return this.checkDeleteCN;
    }

    public DescribeCustomEndpointListRequest setCustomEndpointIds(String customEndpointIds) {
        this.customEndpointIds = customEndpointIds;
        return this;
    }
    public String getCustomEndpointIds() {
        return this.customEndpointIds;
    }

    public DescribeCustomEndpointListRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeCustomEndpointListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
