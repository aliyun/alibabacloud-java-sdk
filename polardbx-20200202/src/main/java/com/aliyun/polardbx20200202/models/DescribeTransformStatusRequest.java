// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeTransformStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pxc-xxx</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("QueryReport")
    public Boolean queryReport;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeTransformStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransformStatusRequest self = new DescribeTransformStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTransformStatusRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeTransformStatusRequest setQueryReport(Boolean queryReport) {
        this.queryReport = queryReport;
        return this;
    }
    public Boolean getQueryReport() {
        return this.queryReport;
    }

    public DescribeTransformStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
