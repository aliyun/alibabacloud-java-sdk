// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class SubmitProgressRequest extends TeaModel {
    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("TaskId")
    public String taskId;

    public static SubmitProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitProgressRequest self = new SubmitProgressRequest();
        return TeaModel.build(map, self);
    }

}
