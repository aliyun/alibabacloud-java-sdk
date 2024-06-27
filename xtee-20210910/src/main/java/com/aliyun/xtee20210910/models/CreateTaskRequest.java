// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateTaskRequest extends TeaModel {
    @NameInMap("ClientFileName")
    public String clientFileName;

    @NameInMap("ClientPath")
    public String clientPath;

    @NameInMap("Describe")
    public String describe;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SceneName")
    public String sceneName;

    @NameInMap("regId")
    public String regId;

    public static CreateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskRequest self = new CreateTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateTaskRequest setClientFileName(String clientFileName) {
        this.clientFileName = clientFileName;
        return this;
    }
    public String getClientFileName() {
        return this.clientFileName;
    }

    public CreateTaskRequest setClientPath(String clientPath) {
        this.clientPath = clientPath;
        return this;
    }
    public String getClientPath() {
        return this.clientPath;
    }

    public CreateTaskRequest setDescribe(String describe) {
        this.describe = describe;
        return this;
    }
    public String getDescribe() {
        return this.describe;
    }

    public CreateTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateTaskRequest setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public CreateTaskRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
