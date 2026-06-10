// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class QueryScriptWaveformsRequest extends TeaModel {
    /**
     * <p>Instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Scenario voice name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>抱歉打扰您了,稍后会有客户经理与您联系啊,再见!</p>
     */
    @NameInMap("ScriptContent")
    public String scriptContent;

    /**
     * <p>Scenario ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5ab2d935-306c-478a-88bf-d08e4e25c1b7</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    public static QueryScriptWaveformsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryScriptWaveformsRequest self = new QueryScriptWaveformsRequest();
        return TeaModel.build(map, self);
    }

    public QueryScriptWaveformsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryScriptWaveformsRequest setScriptContent(String scriptContent) {
        this.scriptContent = scriptContent;
        return this;
    }
    public String getScriptContent() {
        return this.scriptContent;
    }

    public QueryScriptWaveformsRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

}
