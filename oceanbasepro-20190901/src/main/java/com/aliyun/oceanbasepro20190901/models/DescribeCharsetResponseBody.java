// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeCharsetResponseBody extends TeaModel {
    // 字符集列表。
    @NameInMap("Charset")
    public java.util.List<DescribeCharsetResponseBodyCharset> charset;

    // 请求ID。
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
        // 字符集名称。
        @NameInMap("Charset")
        public String charset;

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

    }

}
