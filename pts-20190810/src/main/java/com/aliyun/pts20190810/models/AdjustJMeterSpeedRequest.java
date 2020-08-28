// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class AdjustJMeterSpeedRequest extends TeaModel {
    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("LoadMode")
    public String loadMode;

    @NameInMap("Speed")
    public Integer speed;

    public static AdjustJMeterSpeedRequest build(java.util.Map<String, ?> map) throws Exception {
        AdjustJMeterSpeedRequest self = new AdjustJMeterSpeedRequest();
        return TeaModel.build(map, self);
    }

}
