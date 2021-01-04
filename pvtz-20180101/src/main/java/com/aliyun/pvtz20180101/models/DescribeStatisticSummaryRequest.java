// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeStatisticSummaryRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static DescribeStatisticSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStatisticSummaryRequest self = new DescribeStatisticSummaryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStatisticSummaryRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeStatisticSummaryRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
