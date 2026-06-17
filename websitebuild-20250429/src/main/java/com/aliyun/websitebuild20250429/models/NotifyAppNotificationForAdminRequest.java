// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class NotifyAppNotificationForAdminRequest extends TeaModel {
    /**
     * <p>The business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>WS20260206134746000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The environment identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>staging</p>
     */
    @NameInMap("Env")
    public String env;

    @NameInMap("Payload")
    public String payload;

    /**
     * <p>The scene ID.</p>
     * 
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

    public NotifyAppNotificationForAdminRequest setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

    public NotifyAppNotificationForAdminRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
