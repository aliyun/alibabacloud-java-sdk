// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListSkillGroupConfigRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static ListSkillGroupConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSkillGroupConfigRequest self = new ListSkillGroupConfigRequest();
        return TeaModel.build(map, self);
    }

    public ListSkillGroupConfigRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
