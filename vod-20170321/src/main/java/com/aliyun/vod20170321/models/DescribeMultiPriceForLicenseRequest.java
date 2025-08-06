// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeMultiPriceForLicenseRequest extends TeaModel {
    @NameInMap("ParamStr")
    public String paramStr;

    public static DescribeMultiPriceForLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMultiPriceForLicenseRequest self = new DescribeMultiPriceForLicenseRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMultiPriceForLicenseRequest setParamStr(String paramStr) {
        this.paramStr = paramStr;
        return this;
    }
    public String getParamStr() {
        return this.paramStr;
    }

}
