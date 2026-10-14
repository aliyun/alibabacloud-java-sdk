// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetAifgUrlRequest extends TeaModel {
    /**
     * <p>The task identifier.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9cd7aee5-d365-4d4e-8236-58a110a4ea09</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static GetAifgUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAifgUrlRequest self = new GetAifgUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetAifgUrlRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
