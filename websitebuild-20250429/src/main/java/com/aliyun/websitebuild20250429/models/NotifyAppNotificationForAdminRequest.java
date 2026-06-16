// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class NotifyAppNotificationForAdminRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>WS20260206134746000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>staging</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <strong>example:</strong>
     * <p>8c909373-6c33-41a7-aa38-3650e288a63e</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    public static NotifyAppNotificationForAdminRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyAppNotificationForAdminRequest self = new NotifyAppNotificationForAdminRequest();
        return TeaModel.build(map, self);
    }

    public NotifyAppNotificationForAdminRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public NotifyAppNotificationForAdminRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public NotifyAppNotificationForAdminRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
