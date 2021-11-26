// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteSkillGroupConfigRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static DeleteSkillGroupConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSkillGroupConfigRequest self = new DeleteSkillGroupConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSkillGroupConfigRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
