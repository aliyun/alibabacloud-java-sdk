// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopCreateLivePortraitModelScopeProjectRequest extends TeaModel {
    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("Intro")
    public String intro;

    @NameInMap("Title")
    public String title;

    public static PopCreateLivePortraitModelScopeProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        PopCreateLivePortraitModelScopeProjectRequest self = new PopCreateLivePortraitModelScopeProjectRequest();
        return TeaModel.build(map, self);
    }

    public PopCreateLivePortraitModelScopeProjectRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public PopCreateLivePortraitModelScopeProjectRequest setIntro(String intro) {
        this.intro = intro;
        return this;
    }
    public String getIntro() {
        return this.intro;
    }

    public PopCreateLivePortraitModelScopeProjectRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
