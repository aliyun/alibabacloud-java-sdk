// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class UpdatePtsSceneBaseLineRequest extends TeaModel {
    @NameInMap("ApiBaselines")
    public java.util.Map<String, ?> apiBaselines;

    @NameInMap("SceneBaseline")
    public java.util.Map<String, ?> sceneBaseline;

    @NameInMap("SceneId")
    public String sceneId;

    public static UpdatePtsSceneBaseLineRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePtsSceneBaseLineRequest self = new UpdatePtsSceneBaseLineRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePtsSceneBaseLineRequest setApiBaselines(java.util.Map<String, ?> apiBaselines) {
        this.apiBaselines = apiBaselines;
        return this;
    }
    public java.util.Map<String, ?> getApiBaselines() {
        return this.apiBaselines;
    }

    public UpdatePtsSceneBaseLineRequest setSceneBaseline(java.util.Map<String, ?> sceneBaseline) {
        this.sceneBaseline = sceneBaseline;
        return this;
    }
    public java.util.Map<String, ?> getSceneBaseline() {
        return this.sceneBaseline;
    }

    public UpdatePtsSceneBaseLineRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
