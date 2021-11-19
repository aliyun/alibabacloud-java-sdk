// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class CreatePtsSceneRequest extends TeaModel {
    @NameInMap("Scene")
    public String scene;

    public static CreatePtsSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePtsSceneRequest self = new CreatePtsSceneRequest();
        return TeaModel.build(map, self);
    }

    public CreatePtsSceneRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
