// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteCustomizationConfigRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static DeleteCustomizationConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomizationConfigRequest self = new DeleteCustomizationConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomizationConfigRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
