// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListSchemeTaskConfigRequest extends TeaModel {
    @NameInMap("jsonStr")
    public String jsonStr;

    public static ListSchemeTaskConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSchemeTaskConfigRequest self = new ListSchemeTaskConfigRequest();
        return TeaModel.build(map, self);
    }

    public ListSchemeTaskConfigRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
