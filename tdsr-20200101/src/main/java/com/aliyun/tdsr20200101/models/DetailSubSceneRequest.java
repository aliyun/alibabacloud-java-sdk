// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class DetailSubSceneRequest extends TeaModel {
    // 子场景ID
    @NameInMap("Id")
    public String id;

    public static DetailSubSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailSubSceneRequest self = new DetailSubSceneRequest();
        return TeaModel.build(map, self);
    }

    public DetailSubSceneRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
