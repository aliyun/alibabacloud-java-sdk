// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeRegionInfoRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    public static DescribeRegionInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionInfoRequest self = new DescribeRegionInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRegionInfoRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

}
