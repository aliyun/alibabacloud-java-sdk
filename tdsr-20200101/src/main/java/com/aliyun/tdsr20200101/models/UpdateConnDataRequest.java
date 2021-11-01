// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class UpdateConnDataRequest extends TeaModel {
    // 关联数据
    @NameInMap("ConnData")
    public String connData;

    // 场景ID
    @NameInMap("SceneId")
    public String sceneId;

    public static UpdateConnDataRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConnDataRequest self = new UpdateConnDataRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConnDataRequest setConnData(String connData) {
        this.connData = connData;
        return this;
    }
    public String getConnData() {
        return this.connData;
    }

    public UpdateConnDataRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
