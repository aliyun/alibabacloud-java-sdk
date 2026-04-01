// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeParameterTimedScheduleTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze2za3is7baay****</p>
     */
    @NameInMap("DbInstanceName")
    public String dbInstanceName;

    public static DescribeParameterTimedScheduleTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterTimedScheduleTaskRequest self = new DescribeParameterTimedScheduleTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeParameterTimedScheduleTaskRequest setDbInstanceName(String dbInstanceName) {
        this.dbInstanceName = dbInstanceName;
        return this;
    }
    public String getDbInstanceName() {
        return this.dbInstanceName;
    }

}
