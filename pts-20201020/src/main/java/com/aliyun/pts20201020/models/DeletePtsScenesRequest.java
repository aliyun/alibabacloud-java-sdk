// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class DeletePtsScenesRequest extends TeaModel {
    @NameInMap("SceneIds")
    public java.util.List<String> sceneIds;

    public static DeletePtsScenesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePtsScenesRequest self = new DeletePtsScenesRequest();
        return TeaModel.build(map, self);
    }

    public DeletePtsScenesRequest setSceneIds(java.util.List<String> sceneIds) {
        this.sceneIds = sceneIds;
        return this;
    }
    public java.util.List<String> getSceneIds() {
        return this.sceneIds;
    }

}
