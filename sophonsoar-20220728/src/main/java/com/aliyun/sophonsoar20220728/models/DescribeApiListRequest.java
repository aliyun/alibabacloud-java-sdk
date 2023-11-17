// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeApiListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    public static DescribeApiListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiListRequest self = new DescribeApiListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApiListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
