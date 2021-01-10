// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaPmdtaskfilecontentRequest extends TeaModel {
    @NameInMap("Filename")
    public String filename;

    @NameInMap("TaskId")
    public String taskId;

    public static QueryLinkeLinkaPmdtaskfilecontentRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaPmdtaskfilecontentRequest self = new QueryLinkeLinkaPmdtaskfilecontentRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaPmdtaskfilecontentRequest setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public QueryLinkeLinkaPmdtaskfilecontentRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
