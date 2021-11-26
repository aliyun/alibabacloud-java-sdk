// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class VerifyFileRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static VerifyFileRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyFileRequest self = new VerifyFileRequest();
        return TeaModel.build(map, self);
    }

    public VerifyFileRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
