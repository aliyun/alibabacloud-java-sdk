// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeGlobalQuestionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e851e242-ad67-4507-96a2-d4114564dcec</p>
     */
    @NameInMap("GlobalQuestionId")
    public String globalQuestionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7cefbff0-8d50-4d6f-b93c-73cee23c1555</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b7ee988b-2837-4bc1-9d56-f76e7c831f60</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    public static DescribeGlobalQuestionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalQuestionRequest self = new DescribeGlobalQuestionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalQuestionRequest setGlobalQuestionId(String globalQuestionId) {
        this.globalQuestionId = globalQuestionId;
        return this;
    }
    public String getGlobalQuestionId() {
        return this.globalQuestionId;
    }

    public DescribeGlobalQuestionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeGlobalQuestionRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

}
