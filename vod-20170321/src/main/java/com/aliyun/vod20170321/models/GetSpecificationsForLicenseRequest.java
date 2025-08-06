// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetSpecificationsForLicenseRequest extends TeaModel {
    @NameInMap("ParamStr")
    public String paramStr;

    public static GetSpecificationsForLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSpecificationsForLicenseRequest self = new GetSpecificationsForLicenseRequest();
        return TeaModel.build(map, self);
    }

    public GetSpecificationsForLicenseRequest setParamStr(String paramStr) {
        this.paramStr = paramStr;
        return this;
    }
    public String getParamStr() {
        return this.paramStr;
    }

}
