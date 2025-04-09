// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteGlobalQuestionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>35f1361e-4377-494c-9f10-4274bda0317f</p>
     */
    @NameInMap("GlobalQuestionId")
    public String globalQuestionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>361c8a53-0e29-42f3-8aa7-c7752d010399</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aa279896-64a6-4182-864c-4f2b04ec8d17</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    public static DeleteGlobalQuestionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGlobalQuestionRequest self = new DeleteGlobalQuestionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGlobalQuestionRequest setGlobalQuestionId(String globalQuestionId) {
        this.globalQuestionId = globalQuestionId;
        return this;
    }
    public String getGlobalQuestionId() {
        return this.globalQuestionId;
    }

    public DeleteGlobalQuestionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteGlobalQuestionRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

}
