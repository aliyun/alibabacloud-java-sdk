// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeInstanceKeywordsResponseBody extends TeaModel {
    /**
     * <p>The type of reserved keyword returned.</p>
     * 
     * <strong>example:</strong>
     * <p>account</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1E43AAE0-BEE8-43DA-860D-EAF2AA0724DC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The reserved keywords.</p>
     */
    @NameInMap("Words")
    public DescribeInstanceKeywordsResponseBodyWords words;

    public static DescribeInstanceKeywordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceKeywordsResponseBody self = new DescribeInstanceKeywordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceKeywordsResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeInstanceKeywordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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
