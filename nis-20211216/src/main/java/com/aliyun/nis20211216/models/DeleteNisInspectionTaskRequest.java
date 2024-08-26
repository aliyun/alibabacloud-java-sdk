// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DeleteNisInspectionTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ni-209d****wfirfwc2yl</p>
     */
    @NameInMap("InspectionTaskId")
    public String inspectionTaskId;

    public static DeleteNisInspectionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNisInspectionTaskRequest self = new DeleteNisInspectionTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNisInspectionTaskRequest setInspectionTaskId(String inspectionTaskId) {
        this.inspectionTaskId = inspectionTaskId;
        return this;
    }
    public String getInspectionTaskId() {
        return this.inspectionTaskId;
    }

}
