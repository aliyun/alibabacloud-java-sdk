// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeScriptRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>38d2e8ed-04e9-4dac-83b5-a8e57642ef13</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bee7e5b1-5d9a-4389-aa7e-bbbee5353a16</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    public static DescribeScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScriptRequest self = new DescribeScriptRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScriptRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeScriptRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

}
