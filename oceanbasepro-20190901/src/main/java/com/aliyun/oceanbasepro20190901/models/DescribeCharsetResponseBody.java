// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeCharsetResponseBody extends TeaModel {
    /**
     * <pre><code>http(s)://[Endpoint]/?Action=DescribeCharset
     * &amp;TenantMode=Oracle
     * &amp;Common request parameters
     * </code></pre>
     */
    @NameInMap("Charset")
    public java.util.List<DescribeCharsetResponseBodyCharset> charset;

    /**
     * <p>The operation that you want to perform.<br>Set the value to <strong>DescribeCharset</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
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
         * <p>DescribeCharset</p>
         * 
         * <strong>example:</strong>
         * <p>utf8</p>
         */
        @NameInMap("Charset")
        public String charset;

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
