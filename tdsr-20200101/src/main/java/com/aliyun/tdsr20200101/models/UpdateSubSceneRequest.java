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

}
