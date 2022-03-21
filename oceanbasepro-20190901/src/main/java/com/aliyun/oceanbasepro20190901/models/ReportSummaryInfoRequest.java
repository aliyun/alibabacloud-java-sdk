// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ReportSummaryInfoRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    public static ReportSummaryInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportSummaryInfoRequest self = new ReportSummaryInfoRequest();
        return TeaModel.build(map, self);
    }

    public ReportSummaryInfoRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
