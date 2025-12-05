// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetPtsSceneBaseLineRequest extends TeaModel {
    /**
     * <p>The ID of the scene. For more information, see the <a href="https://help.aliyun.com/document_detail/201321.html">table</a> provided in this topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NB54CV</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    public static GetPtsSceneBaseLineRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPtsSceneBaseLineRequest self = new GetPtsSceneBaseLineRequest();
        return TeaModel.build(map, self);
    }

    public GetPtsSceneBaseLineRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
