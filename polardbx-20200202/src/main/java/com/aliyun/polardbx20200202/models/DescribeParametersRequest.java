// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeParametersRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-********</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The parameter level. Valid values:</p>
     * <ul>
     * <li>compute: compute layer</li>
     * <li>storage: storage layer.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>compute</p>
     */
    @NameInMap("ParamLevel")
    public String paramLevel;

    /**
     * <p>The region to which the instance belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeParametersRequest self = new DescribeParametersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeParametersRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeParametersRequest setParamLevel(String paramLevel) {
        this.paramLevel = paramLevel;
        return this;
    }
    public String getParamLevel() {
        return this.paramLevel;
    }

    public DescribeParametersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
