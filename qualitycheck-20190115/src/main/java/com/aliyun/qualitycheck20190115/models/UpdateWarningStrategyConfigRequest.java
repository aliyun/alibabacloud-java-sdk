// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateWarningStrategyConfigRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static UpdateWarningStrategyConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWarningStrategyConfigRequest self = new UpdateWarningStrategyConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWarningStrategyConfigRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
