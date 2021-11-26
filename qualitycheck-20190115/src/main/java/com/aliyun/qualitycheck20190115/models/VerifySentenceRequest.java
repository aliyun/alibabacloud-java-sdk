// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class VerifySentenceRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static VerifySentenceRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifySentenceRequest self = new VerifySentenceRequest();
        return TeaModel.build(map, self);
    }

    public VerifySentenceRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
