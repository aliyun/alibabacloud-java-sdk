// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class SaveConfigDataSetRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>A complete JSON string. For details, see the following information.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;{&quot;judgeType&quot;:1,&quot;setId&quot;:851,&quot;jsonStrForRule&quot;:{&quot;conditions&quot;:[{&quot;cid&quot;:&quot;1&quot;,&quot;check_range&quot;:{},&quot;lambda&quot;:&quot;1&quot;,&quot;operators&quot;:[{&quot;oid&quot;:1,&quot;type&quot;:&quot;HIT_ANY_KEYWORDS&quot;,&quot;param&quot;:{&quot;keywords&quot;:[&quot;有什么可以帮您&quot;,&quot;客服中心&quot;],&quot;in_sentence&quot;:false}}]}],&quot;rules&quot;:[{&quot;externalProperty&quot;:0,&quot;lambda&quot;:&quot;1&quot;,&quot;rid&quot;:&quot;1&quot;}],&quot;roleJudgeMethod&quot;:&quot;keyword&quot;},&quot;channelType&quot;:1}&quot;</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static SaveConfigDataSetRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveConfigDataSetRequest self = new SaveConfigDataSetRequest();
        return TeaModel.build(map, self);
    }

    public SaveConfigDataSetRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public SaveConfigDataSetRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
