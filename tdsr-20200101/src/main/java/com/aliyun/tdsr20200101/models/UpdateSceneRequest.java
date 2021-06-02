// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class UpdateSceneRequest extends TeaModel {
    // 场景Id
    @NameInMap("Id")
    public String id;

    // 场景名称
    @NameInMap("Name")
    public String name;

    public static UpdateSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSceneRequest self = new UpdateSceneRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSceneRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateSceneRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
