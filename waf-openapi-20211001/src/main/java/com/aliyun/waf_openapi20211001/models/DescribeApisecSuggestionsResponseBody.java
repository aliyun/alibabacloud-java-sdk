// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecSuggestionsResponseBody extends TeaModel {
    /**
     * <p>The list of protection suggestions.</p>
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
         * <p>The API operation.</p>
         * 
         * <strong>example:</strong>
         * <p>/apisec/v1/saveinfo</p>
         */
        @NameInMap("ApiFormat")
        public String apiFormat;

        /**
         * <p>The domain name or IP address to which the API operation belongs.</p>
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
         * <p>The content of the protection suggestion rule, which is a string converted from a JSON object constructed with a series of parameters. The parameters include:</p>
         * <ul>
         * <li><strong>event_tags</strong>: the event type.</li>
         * <li><strong>black_iplist</strong>: the IP blacklist.</li>
         * <li><strong>ip_baseline</strong>: the IP list.</li>
         * <li><strong>freq_baseline</strong>: the throttling frequency information.</li>
         * <li><strong>client_id_baseline</strong>: the client information.</li>
         * <li><strong>country_baseline</strong>: the country information.</li>
         * <li><strong>province_baseline</strong>: the region information.</li>
         * <li><strong>sensitive_type</strong>: the sensitive information type.</li>
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
         * <p>The type of the protection suggestion. Valid values: </p>
         * <ul>
         * <li><strong>BotRule</strong>: bot rule.</li>
         * <li><strong>BlackIPRule</strong>: IP blacklist rule.</li>
         * <li><strong>WhiteIPRule</strong>: IP whitelist rule.</li>
         * <li><strong>RateLimitRule</strong>: throttling rule.</li>
         * <li><strong>ClientRule</strong>: client rule.</li>
         * <li><strong>GeoRule</strong>: geo-blocking rule.</li>
         * <li><strong>SensitiveRule</strong>: sensitive information rule.</li>
         * <li><strong>UnauthRule</strong>: authentication rule.</li>
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
