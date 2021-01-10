// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinkaTurnoffonlysummaryandrecreatetaskRequest extends TeaModel {
    @NameInMap("CoverageId")
    public String coverageId;

    @NameInMap("TaskId")
    public String taskId;

    public static ExecLinkeLinkaTurnoffonlysummaryandrecreatetaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinkaTurnoffonlysummaryandrecreatetaskRequest self = new ExecLinkeLinkaTurnoffonlysummaryandrecreatetaskRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinkaTurnoffonlysummaryandrecreatetaskRequest setCoverageId(String coverageId) {
        this.coverageId = coverageId;
        return this;
    }
    public String getCoverageId() {
        return this.coverageId;
    }

    public ExecLinkeLinkaTurnoffonlysummaryandrecreatetaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
