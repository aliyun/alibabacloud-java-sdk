// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListWarningStrategyConfigRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static ListWarningStrategyConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWarningStrategyConfigRequest self = new ListWarningStrategyConfigRequest();
        return TeaModel.build(map, self);
    }

    public ListWarningStrategyConfigRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
