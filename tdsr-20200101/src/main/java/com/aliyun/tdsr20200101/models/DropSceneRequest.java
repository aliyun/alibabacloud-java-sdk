// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class DropSceneRequest extends TeaModel {
    // 主场景id
    @NameInMap("Id")
    public String id;

    public static DropSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        DropSceneRequest self = new DropSceneRequest();
        return TeaModel.build(map, self);
    }

    public DropSceneRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
