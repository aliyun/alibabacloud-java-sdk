// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSensitiveRequestsResponseBody extends TeaModel {
    /**
     * <p>The tracing results of the data.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeSensitiveRequestsResponseBodyData> data;

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
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeSensitiveRequestsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSensitiveRequestsResponseBody self = new DescribeSensitiveRequestsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSensitiveRequestsResponseBody setData(java.util.List<DescribeSensitiveRequestsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeSensitiveRequestsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeSensitiveRequestsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSensitiveRequestsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSensitiveRequestsResponseBodyDataInfoCount extends TeaModel {
        /**
         * <p>The type of the sensitive data.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The number of sensitive data entries.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("Count")
        public Long count;

        public static DescribeSensitiveRequestsResponseBodyDataInfoCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeSensitiveRequestsResponseBodyDataInfoCount self = new DescribeSensitiveRequestsResponseBodyDataInfoCount();
            return TeaModel.build(map, self);
        }

        public DescribeSensitiveRequestsResponseBodyDataInfoCount setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeSensitiveRequestsResponseBodyDataInfoCount setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

    public static class DescribeSensitiveRequestsResponseBodyData extends TeaModel {
        /**
         * <p>The number of risks in the previous 30 days.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("AbnormalCount")
        public Long abnormalCount;

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
         * <p>09559c0d71ca2ffc996b81***836d8</p>
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
         * <p>The evaluation result. Valid values:</p>
         * <ul>
         * <li><strong>leak</strong>: Data leaks may occur.</li>
         * <li><strong>none</strong>: No data leak can occur.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>leak</p>
         */
        @NameInMap("DetectionResult")
        public String detectionResult;

        /**
         * <p>The number of events in the previous 30 days.</p>
         * 
         * <strong>example:</strong>
         * <p>679</p>
         */
        @NameInMap("EventCount")
        public Long eventCount;

        /**
         * <p>The statistics of the sensitive data.</p>
         */
        @NameInMap("InfoCount")
        public java.util.List<DescribeSensitiveRequestsResponseBodyDataInfoCount> infoCount;

        /**
         * <p>The domain name of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>a.****.com</p>
         */
        @NameInMap("MatchedHost")
        public String matchedHost;

        /**
         * <p>The sensitive data.</p>
         */
        @NameInMap("SensitiveList")
        public java.util.List<String> sensitiveList;

        public static DescribeSensitiveRequestsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSensitiveRequestsResponseBodyData self = new DescribeSensitiveRequestsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSensitiveRequestsResponseBodyData setAbnormalCount(Long abnormalCount) {
            this.abnormalCount = abnormalCount;
            return this;
        }
        public Long getAbnormalCount() {
            return this.abnormalCount;
        }

        public DescribeSensitiveRequestsResponseBodyData setApiFormat(String apiFormat) {
            this.apiFormat = apiFormat;
            return this;
        }
        public String getApiFormat() {
            return this.apiFormat;
        }

        public DescribeSensitiveRequestsResponseBodyData setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeSensitiveRequestsResponseBodyData setClientIP(String clientIP) {
            this.clientIP = clientIP;
            return this;
        }
        public String getClientIP() {
            return this.clientIP;
        }

        public DescribeSensitiveRequestsResponseBodyData setDetectionResult(String detectionResult) {
            this.detectionResult = detectionResult;
            return this;
        }
        public String getDetectionResult() {
            return this.detectionResult;
        }

        public DescribeSensitiveRequestsResponseBodyData setEventCount(Long eventCount) {
            this.eventCount = eventCount;
            return this;
        }
        public Long getEventCount() {
            return this.eventCount;
        }

        public DescribeSensitiveRequestsResponseBodyData setInfoCount(java.util.List<DescribeSensitiveRequestsResponseBodyDataInfoCount> infoCount) {
            this.infoCount = infoCount;
            return this;
        }
        public java.util.List<DescribeSensitiveRequestsResponseBodyDataInfoCount> getInfoCount() {
            return this.infoCount;
        }

        public DescribeSensitiveRequestsResponseBodyData setMatchedHost(String matchedHost) {
            this.matchedHost = matchedHost;
            return this;
        }
        public String getMatchedHost() {
            return this.matchedHost;
        }

        public DescribeSensitiveRequestsResponseBodyData setSensitiveList(java.util.List<String> sensitiveList) {
            this.sensitiveList = sensitiveList;
            return this;
        }
        public java.util.List<String> getSensitiveList() {
            return this.sensitiveList;
        }

    }

}
