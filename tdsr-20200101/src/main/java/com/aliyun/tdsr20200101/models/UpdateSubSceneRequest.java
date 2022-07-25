// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class UpdateSubSceneRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

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
