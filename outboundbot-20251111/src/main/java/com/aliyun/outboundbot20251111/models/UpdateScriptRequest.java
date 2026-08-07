// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class UpdateScriptRequest extends TeaModel {
    /**
     * <p>描述</p>
     * 
     * <strong>example:</strong>
     * <p>询问客户对本次服务的意见和建议</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>实例ID</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>名称</p>
     * 
     * <strong>example:</strong>
     * <p>满意度调研</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>场景ID</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    public static UpdateScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScriptRequest self = new UpdateScriptRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScriptRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateScriptRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateScriptRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateScriptRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

}
