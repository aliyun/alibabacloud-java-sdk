// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeCharsetResponseBody extends TeaModel {
    /**
     * <p>The list of character sets.</p>
     */
    @NameInMap("Charset")
    public java.util.List<DescribeCharsetResponseBodyCharset> charset;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCharsetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCharsetResponseBody self = new DescribeCharsetResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCharsetResponseBody setCharset(java.util.List<DescribeCharsetResponseBodyCharset> charset) {
        this.charset = charset;
        return this;
    }
    public java.util.List<DescribeCharsetResponseBodyCharset> getCharset() {
        return this.charset;
    }

    public DescribeCharsetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCharsetResponseBodyCharset extends TeaModel {
        /**
         * <p>The character set name.</p>
         */
        @NameInMap("Charset")
        public String charset;

        /**
         * <p>The collation set.</p>
         */
        @NameInMap("Collations")
        public java.util.List<String> collations;

        public static DescribeCharsetResponseBodyCharset build(java.util.Map<String, ?> map) throws Exception {
            DescribeCharsetResponseBodyCharset self = new DescribeCharsetResponseBodyCharset();
            return TeaModel.build(map, self);
        }

        public DescribeCharsetResponseBodyCharset setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public DescribeCharsetResponseBodyCharset setCollations(java.util.List<String> collations) {
            this.collations = collations;
            return this;
        }
        public java.util.List<String> getCollations() {
            return this.collations;
        }

    }

}
