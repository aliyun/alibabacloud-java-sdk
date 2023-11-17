// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeComponentsJsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    public static DescribeComponentsJsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeComponentsJsRequest self = new DescribeComponentsJsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeComponentsJsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
