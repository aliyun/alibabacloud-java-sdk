// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UploadRuleRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static UploadRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadRuleRequest self = new UploadRuleRequest();
        return TeaModel.build(map, self);
    }

    public UploadRuleRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
