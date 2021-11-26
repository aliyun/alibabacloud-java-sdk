// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteWarningConfigRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static DeleteWarningConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWarningConfigRequest self = new DeleteWarningConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWarningConfigRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
