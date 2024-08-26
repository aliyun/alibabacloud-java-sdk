// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class StartNisInspectionTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ni-8svmpe0yso****r7fh79</p>
     */
    @NameInMap("InspectionTaskId")
    public String inspectionTaskId;

    public static StartNisInspectionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StartNisInspectionTaskRequest self = new StartNisInspectionTaskRequest();
        return TeaModel.build(map, self);
    }

    public StartNisInspectionTaskRequest setInspectionTaskId(String inspectionTaskId) {
        this.inspectionTaskId = inspectionTaskId;
        return this;
    }
    public String getInspectionTaskId() {
        return this.inspectionTaskId;
    }

}
