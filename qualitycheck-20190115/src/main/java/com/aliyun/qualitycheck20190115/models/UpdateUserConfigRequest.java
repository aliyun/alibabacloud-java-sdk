// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateUserConfigRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static UpdateUserConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserConfigRequest self = new UpdateUserConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserConfigRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
