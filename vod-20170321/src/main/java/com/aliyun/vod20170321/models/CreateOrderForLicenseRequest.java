// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateOrderForLicenseRequest extends TeaModel {
    @NameInMap("ParamStr")
    public String paramStr;

    public static CreateOrderForLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderForLicenseRequest self = new CreateOrderForLicenseRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrderForLicenseRequest setParamStr(String paramStr) {
        this.paramStr = paramStr;
        return this;
    }
    public String getParamStr() {
        return this.paramStr;
    }

}
