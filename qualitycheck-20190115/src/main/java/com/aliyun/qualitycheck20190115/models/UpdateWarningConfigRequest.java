// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateWarningConfigRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ridList&quot;:[18130],&quot;configName&quot;:&quot;0310&quot;,&quot;channels&quot;:[{&quot;type&quot;:1,&quot;url&quot;:&quot;<a href="https://sca.console.aliyun.com/#/warningConfig%22%7D%5D,%22configId%22:29%7D">https://sca.console.aliyun.com/#/warningConfig&quot;}],&quot;configId&quot;:29}</a></p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static UpdateWarningConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWarningConfigRequest self = new UpdateWarningConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWarningConfigRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public UpdateWarningConfigRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
