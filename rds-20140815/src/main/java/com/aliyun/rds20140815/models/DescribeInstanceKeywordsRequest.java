// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeInstanceKeywordsRequest extends TeaModel {
    @NameInMap("Key")
    public String key;

    public static DescribeInstanceKeywordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceKeywordsRequest self = new DescribeInstanceKeywordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceKeywordsRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

}
