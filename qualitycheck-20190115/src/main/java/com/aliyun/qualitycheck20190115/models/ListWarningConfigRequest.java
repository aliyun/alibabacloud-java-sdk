// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListWarningConfigRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    @NameInMap("JsonStr")
    public String jsonStr;

    public static ListWarningConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWarningConfigRequest self = new ListWarningConfigRequest();
        return TeaModel.build(map, self);
    }

    public ListWarningConfigRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public ListWarningConfigRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
