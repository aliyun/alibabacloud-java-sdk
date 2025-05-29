// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StartRenderingSessionShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cap-b06b26edfhytbn b94a75ae1a79efc90eb</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>04c30850-1d91-4da1-b811-66d0ee94af7d</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("ClientParams")
    public String clientParamsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>project-422bc38dfgh5eb44149f135ef76304f63b</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    public static StartRenderingSessionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartRenderingSessionShrinkRequest self = new StartRenderingSessionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartRenderingSessionShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StartRenderingSessionShrinkRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public StartRenderingSessionShrinkRequest setClientParamsShrink(String clientParamsShrink) {
        this.clientParamsShrink = clientParamsShrink;
        return this;
    }
    public String getClientParamsShrink() {
        return this.clientParamsShrink;
    }

    public StartRenderingSessionShrinkRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
