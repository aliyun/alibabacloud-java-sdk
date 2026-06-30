// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class SubmitQualityCheckTaskRequest extends TeaModel {
    /**
     * <p>Workspace ID.</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>The complete JSON string. For details, see the following sections.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;{&quot;jobName&quot;:&quot;任务 2020-03-19 14:16:55&quot;,&quot;jobType&quot;:0,&quot;jsonStr&quot;:{&quot;dataSetIds&quot;:[123**],&quot;modeCustomizationId&quot;:&quot;046db35352904c5dbb0564****&quot;,&quot;ruleIds&quot;:[185**,185**],&quot;vocabId&quot;:&quot;0f0cd63546c747bcb306bb05***&quot;}}&quot;</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static SubmitQualityCheckTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitQualityCheckTaskRequest self = new SubmitQualityCheckTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitQualityCheckTaskRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public SubmitQualityCheckTaskRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
