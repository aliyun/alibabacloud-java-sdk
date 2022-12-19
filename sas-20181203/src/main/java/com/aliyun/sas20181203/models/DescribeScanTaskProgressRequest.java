// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeScanTaskProgressRequest extends TeaModel {
    // The ID of the virus scan task.
    // 
    // >  You can call the [StartVirusScanTask](~~StartVirusScanTask~~) operation to query the IDs of virus scan tasks.
    @NameInMap("TaskId")
    public Long taskId;

    public static DescribeScanTaskProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScanTaskProgressRequest self = new DescribeScanTaskProgressRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScanTaskProgressRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
