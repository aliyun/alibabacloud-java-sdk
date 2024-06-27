// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeServiceListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("regId")
    public String regId;

    public static DescribeServiceListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceListRequest self = new DescribeServiceListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServiceListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeServiceListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
