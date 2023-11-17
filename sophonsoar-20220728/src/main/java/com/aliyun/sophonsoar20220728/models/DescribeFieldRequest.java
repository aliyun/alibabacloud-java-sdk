// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeFieldRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("QueryKey")
    public String queryKey;

    public static DescribeFieldRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFieldRequest self = new DescribeFieldRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFieldRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeFieldRequest setQueryKey(String queryKey) {
        this.queryKey = queryKey;
        return this;
    }
    public String getQueryKey() {
        return this.queryKey;
    }

}
