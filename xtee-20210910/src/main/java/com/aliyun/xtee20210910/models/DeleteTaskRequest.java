// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DeleteTaskRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("regId")
    public String regId;

    public static DeleteTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTaskRequest self = new DeleteTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DeleteTaskRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
