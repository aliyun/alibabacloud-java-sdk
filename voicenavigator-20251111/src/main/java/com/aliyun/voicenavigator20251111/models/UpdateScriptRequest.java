// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class UpdateScriptRequest extends TeaModel {
    /**
     * <p>The concurrency.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Concurrency")
    public Integer concurrency;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>For testing</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>19ac2375-53e3-477f-abe9-6cd334227981</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The scenario name.</p>
     * 
     * <strong>example:</strong>
     * <p>Navigation test scenario</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The scenario ID.</p>
     * 
     * <strong>example:</strong>
     * <p>64241e64-190c-45d1-af66-06f51c07b090</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    public static UpdateScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScriptRequest self = new UpdateScriptRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScriptRequest setConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
        return this;
    }
    public Integer getConcurrency() {
        return this.concurrency;
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
