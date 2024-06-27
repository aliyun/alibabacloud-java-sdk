// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeExistSceneRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("SceneName")
    public String sceneName;

    @NameInMap("regId")
    public String regId;

    public static DescribeExistSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExistSceneRequest self = new DescribeExistSceneRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExistSceneRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeExistSceneRequest setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public DescribeExistSceneRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
