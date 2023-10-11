// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopCreateTextToAvatarProjectRequest extends TeaModel {
    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("Intro")
    public String intro;

    @NameInMap("Title")
    public String title;

    public static PopCreateTextToAvatarProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        PopCreateTextToAvatarProjectRequest self = new PopCreateTextToAvatarProjectRequest();
        return TeaModel.build(map, self);
    }

    public PopCreateTextToAvatarProjectRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public PopCreateTextToAvatarProjectRequest setIntro(String intro) {
        this.intro = intro;
        return this;
    }
    public String getIntro() {
        return this.intro;
    }

    public PopCreateTextToAvatarProjectRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
