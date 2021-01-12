// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeInstanceKeywordsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Key")
    public String key;

    @NameInMap("Words")
    public DescribeInstanceKeywordsResponseBodyWords words;

    public static DescribeInstanceKeywordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceKeywordsResponseBody self = new DescribeInstanceKeywordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceKeywordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceKeywordsResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeInstanceKeywordsResponseBody setWords(DescribeInstanceKeywordsResponseBodyWords words) {
        this.words = words;
        return this;
    }
    public DescribeInstanceKeywordsResponseBodyWords getWords() {
        return this.words;
    }

    public static class DescribeInstanceKeywordsResponseBodyWords extends TeaModel {
        @NameInMap("word")
        public java.util.List<String> word;

        public static DescribeInstanceKeywordsResponseBodyWords build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceKeywordsResponseBodyWords self = new DescribeInstanceKeywordsResponseBodyWords();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceKeywordsResponseBodyWords setWord(java.util.List<String> word) {
            this.word = word;
            return this;
        }
        public java.util.List<String> getWord() {
            return this.word;
        }

    }

}
