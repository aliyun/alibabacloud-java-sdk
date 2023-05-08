// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupStructRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    public static DescribeGroupStructRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupStructRequest self = new DescribeGroupStructRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGroupStructRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
