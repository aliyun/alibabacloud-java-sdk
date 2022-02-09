// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DownloadReportLinkRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    public static DownloadReportLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadReportLinkRequest self = new DownloadReportLinkRequest();
        return TeaModel.build(map, self);
    }

    public DownloadReportLinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
