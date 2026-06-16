// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class DeleteAppNotificationSceneRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>WS20250801154628000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>1000006921</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    public static DeleteAppNotificationSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppNotificationSceneRequest self = new DeleteAppNotificationSceneRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppNotificationSceneRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DeleteAppNotificationSceneRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
