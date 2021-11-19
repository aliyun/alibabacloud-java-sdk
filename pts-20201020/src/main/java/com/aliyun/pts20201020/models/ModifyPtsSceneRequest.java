// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class ModifyPtsSceneRequest extends TeaModel {
    @NameInMap("Scene")
    public String scene;

    public static ModifyPtsSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPtsSceneRequest self = new ModifyPtsSceneRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPtsSceneRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
