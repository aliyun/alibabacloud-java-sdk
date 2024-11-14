// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSensitiveRequestLogResponseBody extends TeaModel {
    /**
     * <p>The access logs.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeSensitiveRequestLogResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>26E46541-7AAB-5565-801D-F14DBDC5****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeSensitiveRequestLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSensitiveRequestLogResponseBody self = new DescribeSensitiveRequestLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSensitiveRequestLogResponseBody setData(java.util.List<DescribeSensitiveRequestLogResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeSensitiveRequestLogResponseBodyData> getData() {
        return this.data;
    }

    public DescribeSensitiveRequestLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSensitiveRequestLogResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSensitiveRequestLogResponseBodyData extends TeaModel {
        /**
         * <p>The API.</p>
         * 
         * <strong>example:</strong>
         * <p>/api/users/login</p>
         */
        @NameInMap("ApiFormat")
        public String apiFormat;

        /**
         * <p>The ID of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>197b52abcd81d6a8bd4***e477</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>103.118.55.**</p>
         */
        @NameInMap("ClientIP")
        public String clientIP;

        /**
         * <p>The number of sensitive data records involved in cross-border data transfer.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The domain name of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>a.****.com</p>
         */
        @NameInMap("MatchedHost")
        public String matchedHost;

        /**
         * <p>The time when the request was initiated. The value is a UNIX timestamp displayed in UTC. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1723392000</p>
         */
        @NameInMap("RequestTime")
        public Long requestTime;

        /**
         * <p>The sensitive data.</p>
         * 
         * <strong>example:</strong>
         * <p>A0Y5MPH3P</p>
         */
        @NameInMap("SensitiveList")
        public String sensitiveList;

        /**
         * <p>The trace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0a3d455b17027784870843933dce3d</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static DescribeSensitiveRequestLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSensitiveRequestLogResponseBodyData self = new DescribeSensitiveRequestLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSensitiveRequestLogResponseBodyData setApiFormat(String apiFormat) {
            this.apiFormat = apiFormat;
            return this;
        }
        public String getApiFormat() {
            return this.apiFormat;
        }

        public DescribeSensitiveRequestLogResponseBodyData setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeSensitiveRequestLogResponseBodyData setClientIP(String clientIP) {
            this.clientIP = clientIP;
            return this;
        }
        public String getClientIP() {
            return this.clientIP;
        }

        public DescribeSensitiveRequestLogResponseBodyData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeSensitiveRequestLogResponseBodyData setMatchedHost(String matchedHost) {
            this.matchedHost = matchedHost;
            return this;
        }
        public String getMatchedHost() {
            return this.matchedHost;
        }

        public DescribeSensitiveRequestLogResponseBodyData setRequestTime(Long requestTime) {
            this.requestTime = requestTime;
            return this;
        }
        public Long getRequestTime() {
            return this.requestTime;
        }

        public DescribeSensitiveRequestLogResponseBodyData setSensitiveList(String sensitiveList) {
            this.sensitiveList = sensitiveList;
            return this;
        }
        public String getSensitiveList() {
            return this.sensitiveList;
        }

        public DescribeSensitiveRequestLogResponseBodyData setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

}
