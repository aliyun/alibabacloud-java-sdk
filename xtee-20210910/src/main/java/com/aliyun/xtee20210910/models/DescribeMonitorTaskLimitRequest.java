// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeMonitorTaskLimitRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("regId")
    public String regId;

    public static DescribeMonitorTaskLimitRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorTaskLimitRequest self = new DescribeMonitorTaskLimitRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorTaskLimitRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeMonitorTaskLimitRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
