// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateMultiOrderForLicenseRequest extends TeaModel {
    @NameInMap("ParamStr")
    public String paramStr;

    public static CreateMultiOrderForLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMultiOrderForLicenseRequest self = new CreateMultiOrderForLicenseRequest();
        return TeaModel.build(map, self);
    }

    public CreateMultiOrderForLicenseRequest setParamStr(String paramStr) {
        this.paramStr = paramStr;
        return this;
    }
    public String getParamStr() {
        return this.paramStr;
    }

}
