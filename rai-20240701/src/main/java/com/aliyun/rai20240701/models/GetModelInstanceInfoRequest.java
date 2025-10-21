// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class GetModelInstanceInfoRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("ModelInstanceId")
    public Long modelInstanceId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SceneType")
    public Integer sceneType;

    public static GetModelInstanceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetModelInstanceInfoRequest self = new GetModelInstanceInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetModelInstanceInfoRequest setModelInstanceId(Long modelInstanceId) {
        this.modelInstanceId = modelInstanceId;
        return this;
    }
    public Long getModelInstanceId() {
        return this.modelInstanceId;
    }

    public GetModelInstanceInfoRequest setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public Integer getSceneType() {
        return this.sceneType;
    }

}
