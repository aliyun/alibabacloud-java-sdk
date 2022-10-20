// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetWarningStrategyConfigRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static GetWarningStrategyConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWarningStrategyConfigRequest self = new GetWarningStrategyConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetWarningStrategyConfigRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
