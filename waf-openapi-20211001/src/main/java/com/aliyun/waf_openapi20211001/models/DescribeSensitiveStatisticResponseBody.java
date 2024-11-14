// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSensitiveStatisticResponseBody extends TeaModel {
    /**
     * <p>The statistics of the sensitive data.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeSensitiveStatisticResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeSensitiveStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSensitiveStatisticResponseBody self = new DescribeSensitiveStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSensitiveStatisticResponseBody setData(java.util.List<DescribeSensitiveStatisticResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeSensitiveStatisticResponseBodyData> getData() {
        return this.data;
    }

    public DescribeSensitiveStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSensitiveStatisticResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSensitiveStatisticResponseBodyData extends TeaModel {
        /**
         * <p>The API.</p>
         * 
         * <strong>example:</strong>
         * <p>/api/login</p>
         */
        @NameInMap("ApiFormat")
        public String apiFormat;

        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.50.11.**</p>
         */
        @NameInMap("ClientIP")
        public String clientIP;

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>169</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>a.****.com</p>
         */
        @NameInMap("MatchedHost")
        public String matchedHost;

        /**
         * <p>The type of the sensitive data.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeApisecRules~~">DescribeApisecRules</a> operation to query the supported types of sensitive data.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1003</p>
         */
        @NameInMap("SensitiveCode")
        public String sensitiveCode;

        public static DescribeSensitiveStatisticResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSensitiveStatisticResponseBodyData self = new DescribeSensitiveStatisticResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSensitiveStatisticResponseBodyData setApiFormat(String apiFormat) {
            this.apiFormat = apiFormat;
            return this;
        }
        public String getApiFormat() {
            return this.apiFormat;
        }

        public DescribeSensitiveStatisticResponseBodyData setClientIP(String clientIP) {
            this.clientIP = clientIP;
            return this;
        }
        public String getClientIP() {
            return this.clientIP;
        }

        public DescribeSensitiveStatisticResponseBodyData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeSensitiveStatisticResponseBodyData setMatchedHost(String matchedHost) {
            this.matchedHost = matchedHost;
            return this;
        }
        public String getMatchedHost() {
            return this.matchedHost;
        }

        public DescribeSensitiveStatisticResponseBodyData setSensitiveCode(String sensitiveCode) {
            this.sensitiveCode = sensitiveCode;
            return this;
        }
        public String getSensitiveCode() {
            return this.sensitiveCode;
        }

    }

}
