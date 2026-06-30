// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateSchemeTaskConfigRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>Input parameter in JSON format. For details, see Request Parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;manualReview&quot;:0,&quot;name&quot;:&quot;检测任务 2022-09-21 16:59:50&quot;,&quot;asrTaskPriority&quot;:2,&quot;modeCustomizationId&quot;:&quot;englishxxx&quot;,&quot;vocabId&quot;:&quot;xxxx5b98d98f8405xxxxxe5dbb383ca1df&quot;,&quot;dataConfig&quot;:{&quot;assignConfigs&quot;:[{&quot;assignConfigContests&quot;:[{&quot;name&quot;:&quot;fileName&quot;,&quot;symbol&quot;:1,&quot;value&quot;:[&quot;1&quot;],&quot;dataType&quot;:2}]}]},&quot;schemeIdList&quot;:[187],&quot;sourceDataType&quot;:1}</p>
     */
    @NameInMap("jsonStr")
    public String jsonStr;

    public static CreateSchemeTaskConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSchemeTaskConfigRequest self = new CreateSchemeTaskConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateSchemeTaskConfigRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public CreateSchemeTaskConfigRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
