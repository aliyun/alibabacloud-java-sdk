// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateWarningConfigRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static UpdateWarningConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWarningConfigRequest self = new UpdateWarningConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWarningConfigRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
