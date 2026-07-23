// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListLaboratoriesRequest extends TeaModel {
    /**
     * <p>The laboratory environment.</p>
     * <ul>
     * <li><p><code>Daily</code>: the daily environment</p>
     * </li>
     * <li><p><code>Pre</code>: the pre-production environment</p>
     * </li>
     * <li><p><code>Prod</code>: the production environment</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Daily</p>
     */
    @NameInMap("Environment")
    public String environment;

    /**
     * <p>The ID of the instance. You can obtain this ID by calling the <code>ListInstances</code> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-test1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the scene. You can obtain this ID by calling the <code>ListScenes</code> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    /**
     * <p>The laboratory status.</p>
     * <ul>
     * <li><p><code>Offline</code>: The laboratory is offline.</p>
     * </li>
     * <li><p><code>Online</code>: The laboratory is online.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Offline</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListLaboratoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLaboratoriesRequest self = new ListLaboratoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListLaboratoriesRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public ListLaboratoriesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListLaboratoriesRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public ListLaboratoriesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
