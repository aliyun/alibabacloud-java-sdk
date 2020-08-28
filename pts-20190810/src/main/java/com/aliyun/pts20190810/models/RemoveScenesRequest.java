// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class RemoveScenesRequest extends TeaModel {
    @NameInMap("SceneIds")
    @Validation(required = true)
    public java.util.Map<String, ?> sceneIds;

    public static RemoveScenesRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveScenesRequest self = new RemoveScenesRequest();
        return TeaModel.build(map, self);
    }

}
