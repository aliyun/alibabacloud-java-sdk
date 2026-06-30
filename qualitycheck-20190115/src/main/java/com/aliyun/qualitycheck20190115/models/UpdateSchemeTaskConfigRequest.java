// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateSchemeTaskConfigRequest extends TeaModel {
    /**
     * <p>Workspace ID</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>Input parameter JSON. For details, see the request parameters section.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;schemeTaskConfigId&quot;:368,&quot;status&quot;:1,&quot;name&quot;:&quot;检测任务 2022-09-21 16:59:50&quot;}</p>
     */
    @NameInMap("jsonStr")
    public String jsonStr;

    public static UpdateSchemeTaskConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSchemeTaskConfigRequest self = new UpdateSchemeTaskConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSchemeTaskConfigRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public UpdateSchemeTaskConfigRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
