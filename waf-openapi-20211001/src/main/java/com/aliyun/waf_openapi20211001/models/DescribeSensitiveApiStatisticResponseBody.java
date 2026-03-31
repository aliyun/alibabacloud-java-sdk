// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSensitiveApiStatisticResponseBody extends TeaModel {
    /**
     * <p>The statistics.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeSensitiveApiStatisticResponseBodyData> data;

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

    public static DescribeSensitiveApiStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSensitiveApiStatisticResponseBody self = new DescribeSensitiveApiStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSensitiveApiStatisticResponseBody setData(java.util.List<DescribeSensitiveApiStatisticResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeSensitiveApiStatisticResponseBodyData> getData() {
        return this.data;
    }

    public DescribeSensitiveApiStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSensitiveApiStatisticResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSensitiveApiStatisticResponseBodyDataList extends TeaModel {
        /**
         * <p>The API.</p>
         * 
         * <strong>example:</strong>
         * <p>/api/login</p>
         */
        @NameInMap("ApiFormat")
        public String apiFormat;

        /**
         * <p>The ID of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>d288137009c119a873d4c395****</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>The number of personal information records involved in cross-border data transfer by API.</p>
         * 
         * <strong>example:</strong>
         * <p>78</p>
         */
        @NameInMap("InfoCount")
        public Long infoCount;

        /**
         * <p>The types of sensitive data.</p>
         */
        @NameInMap("SensitiveCode")
        public java.util.List<String> sensitiveCode;

        /**
         * <p>The number of sensitive personal information records involved in cross-border data transfer by API.</p>
         * 
         * <strong>example:</strong>
         * <p>55</p>
         */
        @NameInMap("SensitiveCount")
        public Long sensitiveCount;

        public static DescribeSensitiveApiStatisticResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSensitiveApiStatisticResponseBodyDataList self = new DescribeSensitiveApiStatisticResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeSensitiveApiStatisticResponseBodyDataList setApiFormat(String apiFormat) {
            this.apiFormat = apiFormat;
            return this;
        }
        public String getApiFormat() {
            return this.apiFormat;
        }

        public DescribeSensitiveApiStatisticResponseBodyDataList setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeSensitiveApiStatisticResponseBodyDataList setInfoCount(Long infoCount) {
            this.infoCount = infoCount;
            return this;
        }
        public Long getInfoCount() {
            return this.infoCount;
        }

        public DescribeSensitiveApiStatisticResponseBodyDataList setSensitiveCode(java.util.List<String> sensitiveCode) {
            this.sensitiveCode = sensitiveCode;
            return this;
        }
        public java.util.List<String> getSensitiveCode() {
            return this.sensitiveCode;
        }

        public DescribeSensitiveApiStatisticResponseBodyDataList setSensitiveCount(Long sensitiveCount) {
            this.sensitiveCount = sensitiveCount;
            return this;
        }
        public Long getSensitiveCount() {
            return this.sensitiveCount;
        }

    }

    public static class DescribeSensitiveApiStatisticResponseBodyData extends TeaModel {
        /**
         * <p>The number of personal information records involved in cross-border data transfer by domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>213</p>
         */
        @NameInMap("InfoOutboundCount")
        public Long infoOutboundCount;

        /**
         * <p>The domain name-related APIs.</p>
         */
        @NameInMap("List")
        public java.util.List<DescribeSensitiveApiStatisticResponseBodyDataList> list;

        /**
         * <p>The domain name or IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>www.***.top</p>
         */
        @NameInMap("MatchedHost")
        public String matchedHost;

        /**
         * <p>The number of sensitive personal information records involved in cross-border data transfer by domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>127</p>
         */
        @NameInMap("SensitiveOutboundCount")
        public Long sensitiveOutboundCount;

        public static DescribeSensitiveApiStatisticResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSensitiveApiStatisticResponseBodyData self = new DescribeSensitiveApiStatisticResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSensitiveApiStatisticResponseBodyData setInfoOutboundCount(Long infoOutboundCount) {
            this.infoOutboundCount = infoOutboundCount;
            return this;
        }
        public Long getInfoOutboundCount() {
            return this.infoOutboundCount;
        }

        public DescribeSensitiveApiStatisticResponseBodyData setList(java.util.List<DescribeSensitiveApiStatisticResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<DescribeSensitiveApiStatisticResponseBodyDataList> getList() {
            return this.list;
        }

        public DescribeSensitiveApiStatisticResponseBodyData setMatchedHost(String matchedHost) {
            this.matchedHost = matchedHost;
            return this;
        }
        public String getMatchedHost() {
            return this.matchedHost;
        }

        public DescribeSensitiveApiStatisticResponseBodyData setSensitiveOutboundCount(Long sensitiveOutboundCount) {
            this.sensitiveOutboundCount = sensitiveOutboundCount;
            return this;
        }
        public Long getSensitiveOutboundCount() {
            return this.sensitiveOutboundCount;
        }

    }

}
