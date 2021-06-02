// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class DropSubSceneRequest extends TeaModel {
    // 子场景ID
    @NameInMap("Id")
    public String id;

    public static DropSubSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        DropSubSceneRequest self = new DropSubSceneRequest();
        return TeaModel.build(map, self);
    }

    public DropSubSceneRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
