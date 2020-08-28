// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class SaveSceneRequest extends TeaModel {
    @NameInMap("Scene")
    @Validation(required = true)
    public String scene;

    public static SaveSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSceneRequest self = new SaveSceneRequest();
        return TeaModel.build(map, self);
    }

}
