// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class TaskNameByUserIdRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("RegId")
    public String regId;

    @NameInMap("TaskName")
    public String taskName;

    public static TaskNameByUserIdRequest build(java.util.Map<String, ?> map) throws Exception {
        TaskNameByUserIdRequest self = new TaskNameByUserIdRequest();
        return TeaModel.build(map, self);
    }

    public TaskNameByUserIdRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public TaskNameByUserIdRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public TaskNameByUserIdRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
