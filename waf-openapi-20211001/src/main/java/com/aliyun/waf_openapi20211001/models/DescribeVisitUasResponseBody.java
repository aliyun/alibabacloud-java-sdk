// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeVisitUasResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2847CE98-AFAE-5A64-B80E-60461717F9DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The array of the top 10 user agents that are used to initiate requests.</p>
     */
    @NameInMap("Uas")
    public java.util.List<DescribeVisitUasResponseBodyUas> uas;

    public static DescribeVisitUasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVisitUasResponseBody self = new DescribeVisitUasResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVisitUasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVisitUasResponseBody setUas(java.util.List<DescribeVisitUasResponseBodyUas> uas) {
        this.uas = uas;
        return this;
    }
    public java.util.List<DescribeVisitUasResponseBodyUas> getUas() {
        return this.uas;
    }

    public static class DescribeVisitUasResponseBodyUas extends TeaModel {
        /**
         * <p>The number of requests that use the user agent.</p>
         * 
         * <strong>example:</strong>
         * <p>698455</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The user agent.</p>
         * 
         * <strong>example:</strong>
         * <p>chrome</p>
         */
        @NameInMap("Ua")
        public String ua;

        public static DescribeVisitUasResponseBodyUas build(java.util.Map<String, ?> map) throws Exception {
            DescribeVisitUasResponseBodyUas self = new DescribeVisitUasResponseBodyUas();
            return TeaModel.build(map, self);
        }

        public DescribeVisitUasResponseBodyUas setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeVisitUasResponseBodyUas setUa(String ua) {
            this.ua = ua;
            return this;
        }
        public String getUa() {
            return this.ua;
        }

    }

}
