// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class DescribeJMeterSceneRequest extends TeaModel {
    @NameInMap("SceneId")
    @Validation(required = true)
    public String sceneId;

    public static DescribeJMeterSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeJMeterSceneRequest self = new DescribeJMeterSceneRequest();
        return TeaModel.build(map, self);
    }

}
