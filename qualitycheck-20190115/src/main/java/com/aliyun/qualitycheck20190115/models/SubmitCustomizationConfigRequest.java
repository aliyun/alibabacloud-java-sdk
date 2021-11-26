// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class SubmitCustomizationConfigRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static SubmitCustomizationConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitCustomizationConfigRequest self = new SubmitCustomizationConfigRequest();
        return TeaModel.build(map, self);
    }

    public SubmitCustomizationConfigRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
