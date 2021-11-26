// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListTaskAssignRulesRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static ListTaskAssignRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskAssignRulesRequest self = new ListTaskAssignRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskAssignRulesRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
