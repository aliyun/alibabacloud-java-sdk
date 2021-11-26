// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateSkillGroupConfigRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static UpdateSkillGroupConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSkillGroupConfigRequest self = new UpdateSkillGroupConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSkillGroupConfigRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
