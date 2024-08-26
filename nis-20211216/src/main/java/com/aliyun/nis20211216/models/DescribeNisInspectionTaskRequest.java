// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DescribeNisInspectionTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ni-8svmpe0yso2bhzr7fh79</p>
     */
    @NameInMap("InspectionTaskId")
    public String inspectionTaskId;

    public static DescribeNisInspectionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNisInspectionTaskRequest self = new DescribeNisInspectionTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNisInspectionTaskRequest setInspectionTaskId(String inspectionTaskId) {
        this.inspectionTaskId = inspectionTaskId;
        return this;
    }
    public String getInspectionTaskId() {
        return this.inspectionTaskId;
    }

}
