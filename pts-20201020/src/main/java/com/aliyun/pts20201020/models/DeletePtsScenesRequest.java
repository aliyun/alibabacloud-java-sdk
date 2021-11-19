// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class DeletePtsScenesRequest extends TeaModel {
    @NameInMap("SceneIds")
    public java.util.Map<String, ?> sceneIds;

    public static DeletePtsScenesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePtsScenesRequest self = new DeletePtsScenesRequest();
        return TeaModel.build(map, self);
    }

    public DeletePtsScenesRequest setSceneIds(java.util.Map<String, ?> sceneIds) {
        this.sceneIds = sceneIds;
        return this;
    }
    public java.util.Map<String, ?> getSceneIds() {
        return this.sceneIds;
    }

}
