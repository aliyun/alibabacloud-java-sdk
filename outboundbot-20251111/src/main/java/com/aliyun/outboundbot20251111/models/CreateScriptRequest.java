// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class CreateScriptRequest extends TeaModel {
    /**
     * <p>描述</p>
     * 
     * <strong>example:</strong>
     * <p>用于测试</p>
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
     * <p>测试场景</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>NLU引擎类型</p>
     * 
     * <strong>example:</strong>
     * <p>BEEBOT</p>
     */
    @NameInMap("NluEngine")
    public String nluEngine;

    public static CreateScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScriptRequest self = new CreateScriptRequest();
        return TeaModel.build(map, self);
    }

    public CreateScriptRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateScriptRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateScriptRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateScriptRequest setNluEngine(String nluEngine) {
        this.nluEngine = nluEngine;
        return this;
    }
    public String getNluEngine() {
        return this.nluEngine;
    }

}
