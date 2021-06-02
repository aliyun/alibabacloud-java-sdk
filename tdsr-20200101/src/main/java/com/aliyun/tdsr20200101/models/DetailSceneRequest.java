// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class DetailSceneRequest extends TeaModel {
    // 场景Id
    @NameInMap("Id")
    public String id;

    public static DetailSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailSceneRequest self = new DetailSceneRequest();
        return TeaModel.build(map, self);
    }

    public DetailSceneRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
