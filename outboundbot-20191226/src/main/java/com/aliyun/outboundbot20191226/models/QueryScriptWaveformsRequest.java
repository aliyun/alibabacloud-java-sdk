// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class QueryScriptWaveformsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ScriptContent")
    public String scriptContent;

    /**
     * <p>This parameter is required.</p>
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
