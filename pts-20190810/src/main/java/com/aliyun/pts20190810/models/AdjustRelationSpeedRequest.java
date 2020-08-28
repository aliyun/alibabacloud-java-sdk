// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class AdjustRelationSpeedRequest extends TeaModel {
    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("Speed")
    public Integer speed;

    @NameInMap("RelationIndex")
    public Integer relationIndex;

    public static AdjustRelationSpeedRequest build(java.util.Map<String, ?> map) throws Exception {
        AdjustRelationSpeedRequest self = new AdjustRelationSpeedRequest();
        return TeaModel.build(map, self);
    }

}
