// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecSuggestionsResponseBody extends TeaModel {
    /**
     * <p>The list of protection suggestions for the API asset.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeApisecSuggestionsResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeApisecSuggestionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecSuggestionsResponseBody self = new DescribeApisecSuggestionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApisecSuggestionsResponseBody setData(java.util.List<DescribeApisecSuggestionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeApisecSuggestionsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeApisecSuggestionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeApisecSuggestionsResponseBodyData extends TeaModel {
        /**
         * <p>The request path of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>/apisec/v1/saveinfo</p>
         */
        @NameInMap("ApiFormat")
        public String apiFormat;

        /**
         * <p>The domain name or IP address associated with the API.</p>
         * 
         * <strong>example:</strong>
         * <p>a.aliyun.com</p>
         */
        @NameInMap("MatchedHost")
        public String matchedHost;

        /**
         * <p>The ID of the protection suggestion.</p>
         * 
         * <strong>example:</strong>
         * <p>15060a1f8fed40130b7c4a7bf8d8733b</p>
         */
        @NameInMap("SuggestId")
        public String suggestId;

        /**
         * <p>The protection suggestion rule, in JSON format. The JSON string contains the following parameters:</p>
         * <ul>
         * <li><p><strong>event_tags</strong>: the event type.</p>
         * </li>
         * <li><p><strong>black_iplist</strong>: the IP address blacklist.</p>
         * </li>
         * <li><p><strong>ip_baseline</strong>: the IP address list.</p>
         * </li>
         * <li><p><strong>freq_baseline</strong>: the frequency limit information.</p>
         * </li>
         * <li><p><strong>client_id_baseline</strong>: the client information.</p>
         * </li>
         * <li><p><strong>country_baseline</strong>: the country information.</p>
         * </li>
         * <li><p><strong>province_baseline</strong>: the region information.</p>
         * </li>
         * <li><p><strong>sensitive_type</strong>: the sensitive information type.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;rule&quot;: &quot;ClientRule&quot;,
         *     &quot;client_id_baseline&quot;: [&quot;Edge&quot;]
         * }</p>
         */
        @NameInMap("SuggestRule")
        public String suggestRule;

        /**
         * <p>The type of the protection suggestion. Valid values:</p>
         * <ul>
         * <li><p><strong>BotRule</strong>: a bot rule.</p>
         * </li>
         * <li><p><strong>BlackIPRule</strong>: an IP address blacklist rule.</p>
         * </li>
         * <li><p><strong>WhiteIPRule</strong>: an IP address whitelist rule.</p>
         * </li>
         * <li><p><strong>RateLimitRule</strong>: a rate limiting rule.</p>
         * </li>
         * <li><p><strong>ClientRule</strong>: a client rule.</p>
         * </li>
         * <li><p><strong>GeoRule</strong>: a region rule.</p>
         * </li>
         * <li><p><strong>SensitiveRule</strong>: a sensitive information rule.</p>
         * </li>
         * <li><p><strong>UnauthRule</strong>: an authentication rule.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WhiteIPRule</p>
         */
        @NameInMap("SuggestType")
        public String suggestType;

        public static DescribeApisecSuggestionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisecSuggestionsResponseBodyData self = new DescribeApisecSuggestionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeApisecSuggestionsResponseBodyData setApiFormat(String apiFormat) {
            this.apiFormat = apiFormat;
            return this;
        }
        public String getApiFormat() {
            return this.apiFormat;
        }

        public DescribeApisecSuggestionsResponseBodyData setMatchedHost(String matchedHost) {
            this.matchedHost = matchedHost;
            return this;
        }
        public String getMatchedHost() {
            return this.matchedHost;
        }

        public DescribeApisecSuggestionsResponseBodyData setSuggestId(String suggestId) {
            this.suggestId = suggestId;
            return this;
        }
        public String getSuggestId() {
            return this.suggestId;
        }

        public DescribeApisecSuggestionsResponseBodyData setSuggestRule(String suggestRule) {
            this.suggestRule = suggestRule;
            return this;
        }
        public String getSuggestRule() {
            return this.suggestRule;
        }

        public DescribeApisecSuggestionsResponseBodyData setSuggestType(String suggestType) {
            this.suggestType = suggestType;
            return this;
        }
        public String getSuggestType() {
            return this.suggestType;
        }

    }

}
