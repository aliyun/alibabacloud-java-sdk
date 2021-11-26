// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetCustomizationConfigListRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static GetCustomizationConfigListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCustomizationConfigListRequest self = new GetCustomizationConfigListRequest();
        return TeaModel.build(map, self);
    }

    public GetCustomizationConfigListRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
