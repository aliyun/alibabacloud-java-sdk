// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DeleteScheduledTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>847268a4-196f-416b-aa12-bfe0c115****</p>
     */
    @NameInMap("ScheduledId")
    public String scheduledId;

    public static DeleteScheduledTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteScheduledTaskRequest self = new DeleteScheduledTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteScheduledTaskRequest setScheduledId(String scheduledId) {
        this.scheduledId = scheduledId;
        return this;
    }
    public String getScheduledId() {
        return this.scheduledId;
    }

}
