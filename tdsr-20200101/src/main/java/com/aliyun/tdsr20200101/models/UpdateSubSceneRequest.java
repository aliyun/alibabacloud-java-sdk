// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class UpdateSubSceneRequest extends TeaModel {
    // 子场景ID
    @NameInMap("Id")
    public String id;

    // 子场景名称
    @NameInMap("Name")
    public String name;

    // 视角坐标，目前支持3元坐标，4元坐标，例如：[0.94005,0.13397,-0.3136,0.782992]
    @NameInMap("ViewPoint")
    public java.util.List<Double> viewPoint;

    public static UpdateSubSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubSceneRequest self = new UpdateSubSceneRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSubSceneRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateSubSceneRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateSubSceneRequest setViewPoint(java.util.List<Double> viewPoint) {
        this.viewPoint = viewPoint;
        return this;
    }
    public java.util.List<Double> getViewPoint() {
        return this.viewPoint;
    }

}
