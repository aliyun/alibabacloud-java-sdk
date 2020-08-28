// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class DescribeJMeterSceneRunningStatusRequest extends TeaModel {
    @NameInMap("SceneId")
    @Validation(required = true)
    public String sceneId;

    public static DescribeJMeterSceneRunningStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeJMeterSceneRunningStatusRequest self = new DescribeJMeterSceneRunningStatusRequest();
        return TeaModel.build(map, self);
    }

}
