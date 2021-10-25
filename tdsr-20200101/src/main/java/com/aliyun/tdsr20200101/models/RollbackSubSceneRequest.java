// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class RollbackSubSceneRequest extends TeaModel {
    // 子场景ID
    @NameInMap("Id")
    public String id;

    public static RollbackSubSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackSubSceneRequest self = new RollbackSubSceneRequest();
        return TeaModel.build(map, self);
    }

    public RollbackSubSceneRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
