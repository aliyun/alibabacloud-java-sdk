// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateSkillGroupConfigRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static CreateSkillGroupConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillGroupConfigRequest self = new CreateSkillGroupConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateSkillGroupConfigRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
