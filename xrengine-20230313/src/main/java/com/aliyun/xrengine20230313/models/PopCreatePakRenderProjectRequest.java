// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopCreatePakRenderProjectRequest extends TeaModel {
    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("Intro")
    public String intro;

    @NameInMap("Title")
    public String title;

    public static PopCreatePakRenderProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        PopCreatePakRenderProjectRequest self = new PopCreatePakRenderProjectRequest();
        return TeaModel.build(map, self);
    }

    public PopCreatePakRenderProjectRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public PopCreatePakRenderProjectRequest setIntro(String intro) {
        this.intro = intro;
        return this;
    }
    public String getIntro() {
        return this.intro;
    }

    public PopCreatePakRenderProjectRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
