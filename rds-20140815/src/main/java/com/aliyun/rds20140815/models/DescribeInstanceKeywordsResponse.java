// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeInstanceKeywordsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Key")
    @Validation(required = true)
    public String key;

    @NameInMap("Words")
    @Validation(required = true)
    public DescribeInstanceKeywordsResponseWords words;

    public static DescribeInstanceKeywordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceKeywordsResponse self = new DescribeInstanceKeywordsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeInstanceKeywordsResponseWords extends TeaModel {
        @NameInMap("word")
        @Validation(required = true)
        public java.util.List<String> word;

        public static DescribeInstanceKeywordsResponseWords build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceKeywordsResponseWords self = new DescribeInstanceKeywordsResponseWords();
            return TeaModel.build(map, self);
        }

    }

}
