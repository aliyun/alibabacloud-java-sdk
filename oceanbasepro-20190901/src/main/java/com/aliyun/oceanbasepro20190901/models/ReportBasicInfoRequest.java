// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ReportBasicInfoRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    public static ReportBasicInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportBasicInfoRequest self = new ReportBasicInfoRequest();
        return TeaModel.build(map, self);
    }

    public ReportBasicInfoRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
