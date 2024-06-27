// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateReplenishTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClientFileName")
    public String clientFileName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClientPath")
    public String clientPath;

    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("regId")
    public String regId;

    public static CreateReplenishTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateReplenishTaskRequest self = new CreateReplenishTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateReplenishTaskRequest setClientFileName(String clientFileName) {
        this.clientFileName = clientFileName;
        return this;
    }
    public String getClientFileName() {
        return this.clientFileName;
    }

    public CreateReplenishTaskRequest setClientPath(String clientPath) {
        this.clientPath = clientPath;
        return this;
    }
    public String getClientPath() {
        return this.clientPath;
    }

    public CreateReplenishTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateReplenishTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public CreateReplenishTaskRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
