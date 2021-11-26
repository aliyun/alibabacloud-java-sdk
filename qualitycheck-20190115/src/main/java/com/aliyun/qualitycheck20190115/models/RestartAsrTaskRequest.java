// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class RestartAsrTaskRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static RestartAsrTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartAsrTaskRequest self = new RestartAsrTaskRequest();
        return TeaModel.build(map, self);
    }

    public RestartAsrTaskRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
