// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListSessionGroupRequest extends TeaModel {
    @NameInMap("jsonStr")
    public String jsonStr;

    public static ListSessionGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSessionGroupRequest self = new ListSessionGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListSessionGroupRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
