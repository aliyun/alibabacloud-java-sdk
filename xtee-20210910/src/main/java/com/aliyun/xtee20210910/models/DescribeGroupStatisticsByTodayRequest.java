// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeGroupStatisticsByTodayRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("regId")
    public String regId;

    public static DescribeGroupStatisticsByTodayRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupStatisticsByTodayRequest self = new DescribeGroupStatisticsByTodayRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGroupStatisticsByTodayRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeGroupStatisticsByTodayRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
