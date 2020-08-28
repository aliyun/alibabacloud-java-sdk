// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class DescribeSceneRequest extends TeaModel {
    @NameInMap("SceneId")
    @Validation(required = true)
    public String sceneId;

    public static DescribeSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneRequest self = new DescribeSceneRequest();
        return TeaModel.build(map, self);
    }

}
