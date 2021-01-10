// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaFilecontentsRequest extends TeaModel {
    @NameInMap("FilenamesRepeatList")
    public java.util.List<String> filenamesRepeatList;

    @NameInMap("TaskId")
    public String taskId;

    public static QueryLinkeLinkaFilecontentsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaFilecontentsRequest self = new QueryLinkeLinkaFilecontentsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaFilecontentsRequest setFilenamesRepeatList(java.util.List<String> filenamesRepeatList) {
        this.filenamesRepeatList = filenamesRepeatList;
        return this;
    }
    public java.util.List<String> getFilenamesRepeatList() {
        return this.filenamesRepeatList;
    }

    public QueryLinkeLinkaFilecontentsRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
