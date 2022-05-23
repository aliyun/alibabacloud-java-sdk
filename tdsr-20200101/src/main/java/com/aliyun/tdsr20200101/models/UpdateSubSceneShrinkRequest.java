// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class UpdateSubSceneShrinkRequest extends TeaModel {
    // 子场景ID
    @NameInMap("Id")
    public String id;

    // 子场景名称
    @NameInMap("Name")
    public String name;

    // 视角坐标，目前支持3元坐标，4元坐标，例如：[0.94005,0.13397,-0.3136,0.782992]
    @NameInMap("ViewPoint")
    public String viewPointShrink;

    public static UpdateSubSceneShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubSceneShrinkRequest self = new UpdateSubSceneShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSubSceneShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateSubSceneShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateSubSceneShrinkRequest setViewPointShrink(String viewPointShrink) {
        this.viewPointShrink = viewPointShrink;
        return this;
    }
    public String getViewPointShrink() {
        return this.viewPointShrink;
    }

}
