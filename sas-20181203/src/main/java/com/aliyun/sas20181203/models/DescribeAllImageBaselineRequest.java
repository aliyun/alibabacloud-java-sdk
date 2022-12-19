// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAllImageBaselineRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    public static DescribeAllImageBaselineRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllImageBaselineRequest self = new DescribeAllImageBaselineRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAllImageBaselineRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
