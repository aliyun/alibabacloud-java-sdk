// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteWarningStrategyConfigRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static DeleteWarningStrategyConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWarningStrategyConfigRequest self = new DeleteWarningStrategyConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWarningStrategyConfigRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
