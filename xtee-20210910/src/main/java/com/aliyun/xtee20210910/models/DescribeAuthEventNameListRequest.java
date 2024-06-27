// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAuthEventNameListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("regId")
    public String regId;

    public static DescribeAuthEventNameListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuthEventNameListRequest self = new DescribeAuthEventNameListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAuthEventNameListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAuthEventNameListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
