// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecExamplesResponseBody extends TeaModel {
    /**
     * <p>The list of samples.</p>
     */
    @NameInMap("Examples")
    public java.util.List<DescribeApisecExamplesResponseBodyExamples> examples;

    /**
     * <p>The number of entries per page in a paged query. Valid values: 1 to 5. Default value: 5. This parameter is used for paging.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAGBgV9tolsLfijC4wam2htS*****D/46H3X2wIS</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of results.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeApisecExamplesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecExamplesResponseBody self = new DescribeApisecExamplesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApisecExamplesResponseBody setExamples(java.util.List<DescribeApisecExamplesResponseBodyExamples> examples) {
        this.examples = examples;
        return this;
    }
    public java.util.List<DescribeApisecExamplesResponseBodyExamples> getExamples() {
        return this.examples;
    }

    public DescribeApisecExamplesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeApisecExamplesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeApisecExamplesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApisecExamplesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApisecExamplesResponseBodyExamplesRequestSensitiveData extends TeaModel {
        /**
         * <p>The sensitive information type.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("SensitiveCode")
        public String sensitiveCode;

        /**
         * <p>The list of sensitive data.</p>
         */
        @NameInMap("SensitiveDataList")
        public java.util.List<String> sensitiveDataList;

        public static DescribeApisecExamplesResponseBodyExamplesRequestSensitiveData build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisecExamplesResponseBodyExamplesRequestSensitiveData self = new DescribeApisecExamplesResponseBodyExamplesRequestSensitiveData();
            return TeaModel.build(map, self);
        }

        public DescribeApisecExamplesResponseBodyExamplesRequestSensitiveData setSensitiveCode(String sensitiveCode) {
            this.sensitiveCode = sensitiveCode;
            return this;
        }
        public String getSensitiveCode() {
            return this.sensitiveCode;
        }

        public DescribeApisecExamplesResponseBodyExamplesRequestSensitiveData setSensitiveDataList(java.util.List<String> sensitiveDataList) {
            this.sensitiveDataList = sensitiveDataList;
            return this;
        }
        public java.util.List<String> getSensitiveDataList() {
            return this.sensitiveDataList;
        }

    }

    public static class DescribeApisecExamplesResponseBodyExamplesResponseSensitiveData extends TeaModel {
        /**
         * <p>The sensitive information type.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("SensitiveCode")
        public String sensitiveCode;

        /**
         * <p>The list of sensitive data.</p>
         */
        @NameInMap("SensitiveDataList")
        public java.util.List<String> sensitiveDataList;

        public static DescribeApisecExamplesResponseBodyExamplesResponseSensitiveData build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisecExamplesResponseBodyExamplesResponseSensitiveData self = new DescribeApisecExamplesResponseBodyExamplesResponseSensitiveData();
            return TeaModel.build(map, self);
        }

        public DescribeApisecExamplesResponseBodyExamplesResponseSensitiveData setSensitiveCode(String sensitiveCode) {
            this.sensitiveCode = sensitiveCode;
            return this;
        }
        public String getSensitiveCode() {
            return this.sensitiveCode;
        }

        public DescribeApisecExamplesResponseBodyExamplesResponseSensitiveData setSensitiveDataList(java.util.List<String> sensitiveDataList) {
            this.sensitiveDataList = sensitiveDataList;
            return this;
        }
        public java.util.List<String> getSensitiveDataList() {
            return this.sensitiveDataList;
        }

    }

    public static class DescribeApisecExamplesResponseBodyExamples extends TeaModel {
        /**
         * <p>The full request path.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.test.com/api/v1/hello.php?token=TkJGQw">http://www.test.com/api/v1/hello.php?token=TkJGQw</a></p>
         */
        @NameInMap("ApiUrl")
        public String apiUrl;

        /**
         * <p>The verification request.</p>
         */
        @NameInMap("PocPayload")
        public String pocPayload;

        /**
         * <p>The protocol type. Valid values:</p>
         * <ul>
         * <li><p><strong>http</strong>: HTTP protocol.</p>
         * </li>
         * <li><p><strong>https</strong>: HTTPS protocol.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The sample request content, which is a character string converted from a JSON format constructed with a series of parameters. The following fields are included:</p>
         * <ul>
         * <li><strong>method</strong>: the request method.</li>
         * <li><strong>host</strong>: the request domain name.</li>
         * <li><strong>header</strong>: the request header.</li>
         * <li><strong>server_port</strong>: the service port.</li>
         * <li><strong>body</strong>: the request body content.</li>
         * <li><strong>url</strong>: the request path.</li>
         * <li><strong>server_protocol</strong>: the server protocol.</li>
         * </ul>
         * <blockquote>
         * <p>If the <strong>body</strong> content exceeds 16 KB, only partial content is returned.</p>
         * </blockquote>
         */
        @NameInMap("Request")
        public String request;

        /**
         * <p>The list of request sensitive data.</p>
         */
        @NameInMap("RequestSensitiveData")
        public java.util.List<DescribeApisecExamplesResponseBodyExamplesRequestSensitiveData> requestSensitiveData;

        /**
         * <p>The sample response content, which is a string converted from a JSON object constructed with a series of parameters. The following fields are included:</p>
         * <ul>
         * <li><strong>status</strong>: the status code.</li>
         * <li><strong>header</strong>: the response header.</li>
         * <li><strong>body</strong>: the response body content.</li>
         * </ul>
         * <blockquote>
         * <p>If the <strong>body</strong> content exceeds 16 KB, only partial content is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;header&quot;: {
         *     &quot;Connection&quot;: &quot;keep-alive&quot;,
         *     &quot;Content-Encoding&quot;: &quot;gzip&quot;,
         *     &quot;Content-Type&quot;: &quot;text/html; charset=UTF-8&quot;
         *   },
         *   &quot;body&quot;: &quot;xxxx&quot;,
         *   &quot;status&quot;: 200
         * }</p>
         */
        @NameInMap("Response")
        public String response;

        /**
         * <p>The list of response sensitive data.</p>
         */
        @NameInMap("ResponseSensitiveData")
        public java.util.List<DescribeApisecExamplesResponseBodyExamplesResponseSensitiveData> responseSensitiveData;

        public static DescribeApisecExamplesResponseBodyExamples build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisecExamplesResponseBodyExamples self = new DescribeApisecExamplesResponseBodyExamples();
            return TeaModel.build(map, self);
        }

        public DescribeApisecExamplesResponseBodyExamples setApiUrl(String apiUrl) {
            this.apiUrl = apiUrl;
            return this;
        }
        public String getApiUrl() {
            return this.apiUrl;
        }

        public DescribeApisecExamplesResponseBodyExamples setPocPayload(String pocPayload) {
            this.pocPayload = pocPayload;
            return this;
        }
        public String getPocPayload() {
            return this.pocPayload;
        }

        public DescribeApisecExamplesResponseBodyExamples setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeApisecExamplesResponseBodyExamples setRequest(String request) {
            this.request = request;
            return this;
        }
        public String getRequest() {
            return this.request;
        }

        public DescribeApisecExamplesResponseBodyExamples setRequestSensitiveData(java.util.List<DescribeApisecExamplesResponseBodyExamplesRequestSensitiveData> requestSensitiveData) {
            this.requestSensitiveData = requestSensitiveData;
            return this;
        }
        public java.util.List<DescribeApisecExamplesResponseBodyExamplesRequestSensitiveData> getRequestSensitiveData() {
            return this.requestSensitiveData;
        }

        public DescribeApisecExamplesResponseBodyExamples setResponse(String response) {
            this.response = response;
            return this;
        }
        public String getResponse() {
            return this.response;
        }

        public DescribeApisecExamplesResponseBodyExamples setResponseSensitiveData(java.util.List<DescribeApisecExamplesResponseBodyExamplesResponseSensitiveData> responseSensitiveData) {
            this.responseSensitiveData = responseSensitiveData;
            return this;
        }
        public java.util.List<DescribeApisecExamplesResponseBodyExamplesResponseSensitiveData> getResponseSensitiveData() {
            return this.responseSensitiveData;
        }

    }

}
