// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class QueryCssOrderForLicenseRequest extends TeaModel {
    @NameInMap("ParamStr")
    public String paramStr;

    public static QueryCssOrderForLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCssOrderForLicenseRequest self = new QueryCssOrderForLicenseRequest();
        return TeaModel.build(map, self);
    }

    public QueryCssOrderForLicenseRequest setParamStr(String paramStr) {
        this.paramStr = paramStr;
        return this;
    }
    public String getParamStr() {
        return this.paramStr;
    }

}
