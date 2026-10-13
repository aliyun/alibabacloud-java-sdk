// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListScriptVariablesRequest extends TeaModel {
    /**
     * <p>The instance ID (also known as the business ID).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2e55ad0f-7a07-420e-a9b0-62d66ba7278a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether the environment is a test environment.</p>
     * <ul>
     * <li>true: Test environment.</li>
     * <li>false: Production environment after release.</li>
     * <li>Default value: false.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Sandbox")
    public Boolean sandbox;

    /**
     * <p>The scenario ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>62318d71-1128-4fd7-af15-c852cbe26b93</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    public static ListScriptVariablesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScriptVariablesRequest self = new ListScriptVariablesRequest();
        return TeaModel.build(map, self);
    }

    public ListScriptVariablesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListScriptVariablesRequest setSandbox(Boolean sandbox) {
        this.sandbox = sandbox;
        return this;
    }
    public Boolean getSandbox() {
        return this.sandbox;
    }

    public ListScriptVariablesRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

}
