// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetSkillGroupConfigRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static GetSkillGroupConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSkillGroupConfigRequest self = new GetSkillGroupConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetSkillGroupConfigRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
