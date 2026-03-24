// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecApiResourcesResponseBody extends TeaModel {
    /**
     * <p>The list of API assets.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeApisecApiResourcesResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2EFCFE18-78F8-5079-B312-07***48B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeApisecApiResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecApiResourcesResponseBody self = new DescribeApisecApiResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApisecApiResourcesResponseBody setData(java.util.List<DescribeApisecApiResourcesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeApisecApiResourcesResponseBodyData> getData() {
        return this.data;
    }

    public DescribeApisecApiResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApisecApiResourcesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApisecApiResourcesResponseBodyData extends TeaModel {
        /**
         * <p>The number of threats associated with the API.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AbnormalNum")
        public Long abnormalNum;

        /**
         * <p>The number of account security events associated with the API.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AccountEventNum")
        public Long accountEventNum;

        /**
         * <p>The total number of requests in the last 30 days.</p>
         * 
         * <strong>example:</strong>
         * <p>1683388800</p>
         */
        @NameInMap("AllCnt")
        public Long allCnt;

        /**
         * <p>The API endpoint path.</p>
         * 
         * <strong>example:</strong>
         * <p>/v1/etl/finddatabyvid</p>
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
         * <p>The detailed information about the API. The value is a JSON string that contains the following fields:</p>
         * <ul>
         * <li><p><strong>param_num</strong>: the number of API parameters.</p>
         * </li>
         * <li><p><strong>request_method</strong>: the request method.</p>
         * </li>
         * <li><p><strong>protocol</strong>: the request protocol.</p>
         * </li>
         * <li><p><strong>api_url</strong>: the request URL.</p>
         * </li>
         * <li><p><strong>poc_payload</strong>: the request.</p>
         * </li>
         * <li><p><strong>request</strong>: the request sample.</p>
         * </li>
         * <li><p><strong>response</strong>: the response sample.</p>
         * </li>
         * <li><p><strong>param</strong>: the request parameters.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only when you specify the <strong>ApiId</strong> request parameter.</p>
         * </blockquote>
         */
        @NameInMap("ApiInfo")
        public String apiInfo;

        /**
         * <p>The HTTP request method of the API. Valid values: <strong>GET</strong>, <strong>POST</strong>, <strong>HEAD</strong>, <strong>PUT</strong>, <strong>DELETE</strong>, <strong>CONNECT</strong>, <strong>PATCH</strong>, and <strong>OPTIONS</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>POST</p>
         */
        @NameInMap("ApiMethod")
        public String apiMethod;

        /**
         * <p>The sensitive data classification of the API. The value is a JSON string that contains the following fields:</p>
         * <ul>
         * <li><p><strong>request_sensitive_list</strong>: the list of sensitive data types in the request.</p>
         * </li>
         * <li><p><strong>response_sensitive_list</strong>: the list of sensitive data types in the response.</p>
         * </li>
         * <li><p><strong>sensitive_list</strong>: the list of sensitive data types.</p>
         * </li>
         * <li><p><strong>sensitive_level</strong>: the sensitivity level.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;sensitive_list&quot;: [&quot;1003&quot;,&quot;1005&quot;],
         *     &quot;sensitive_level&quot;: &quot;L2&quot;,
         *     &quot;request_sensitive_list&quot;: [&quot;1003&quot;],
         *     &quot;response_sensitive_list&quot;: [&quot;1005&quot;]
         * }</p>
         */
        @NameInMap("ApiSensitive")
        public String apiSensitive;

        /**
         * <p>The types of sensitive data detected in the API request. The value is a JSON array of sensitive data type IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;1002&quot;,&quot;1005&quot;]</p>
         */
        @NameInMap("ApiSensitiveRequest")
        public String apiSensitiveRequest;

        /**
         * <p>The types of sensitive data detected in the API response. The value is a JSON array of sensitive data type IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;1002&quot;,&quot;1005&quot;]</p>
         */
        @NameInMap("ApiSensitiveResponse")
        public String apiSensitiveResponse;

        /**
         * <p>The lifecycle status of the API. Valid values:</p>
         * <ul>
         * <li><p><strong>NewbornInterface</strong>: newly discovered.</p>
         * </li>
         * <li><p><strong>OfflineInterface</strong>: inactive.</p>
         * </li>
         * <li><p><strong>normal</strong>: active.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NewbornInterface</p>
         */
        @NameInMap("ApiStatus")
        public String apiStatus;

        /**
         * <p>The business purpose of the API.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> operation to obtain the supported business purposes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SendMail</p>
         */
        @NameInMap("ApiTag")
        public String apiTag;

        /**
         * <p>The type of service that the API serves. Valid values:</p>
         * <ul>
         * <li><p><strong>PublicAPI</strong>: public-facing service.</p>
         * </li>
         * <li><p><strong>ThirdpartAPI</strong>: third-party service.</p>
         * </li>
         * <li><p><strong>InternalAPI</strong>: internal service.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PublicAPI</p>
         */
        @NameInMap("ApiType")
        public String apiType;

        /**
         * <p>Indicates whether the API requires authentication. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: The API requires authentication.</p>
         * </li>
         * <li><p><strong>1</strong>: The API does not require authentication.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AuthFlag")
        public String authFlag;

        /**
         * <p>The number of bot requests in the last 30 days.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("BotCnt")
        public Long botCnt;

        /**
         * <p>The number of cross-border requests in the last 30 days.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CrossBorderCnt")
        public Long crossBorderCnt;

        /**
         * <p>The number of security events associated with the API.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("EventNum")
        public Long eventNum;

        /**
         * <p>The list of API samples.</p>
         */
        @NameInMap("Examples")
        @Deprecated
        public java.util.List<String> examples;

        /**
         * <p>The time when the API was first discovered. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1683388800</p>
         */
        @NameInMap("FarthestTs")
        public Long farthestTs;

        /**
         * <p>Indicates whether the API is followed. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: The API is followed.</p>
         * </li>
         * <li><p><strong>0</strong>: The API is not followed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Follow")
        public Integer follow;

        /**
         * <p>The time of the most recent access to the API. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1683388800</p>
         */
        @NameInMap("LastestTs")
        public Long lastestTs;

        /**
         * <p>The domain name or IP address that the API resides on.</p>
         * 
         * <strong>example:</strong>
         * <p>a.aliyun.com</p>
         */
        @NameInMap("MatchedHost")
        public String matchedHost;

        /**
         * <p>The remarks of the API asset.</p>
         * 
         * <strong>example:</strong>
         * <p>loginApi</p>
         */
        @NameInMap("Note")
        public String note;

        /**
         * <p>The list of protected objects associated with the API.</p>
         */
        @NameInMap("Resources")
        public java.util.List<String> resources;

        public static DescribeApisecApiResourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisecApiResourcesResponseBodyData self = new DescribeApisecApiResourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeApisecApiResourcesResponseBodyData setAbnormalNum(Long abnormalNum) {
            this.abnormalNum = abnormalNum;
            return this;
        }
        public Long getAbnormalNum() {
            return this.abnormalNum;
        }

        public DescribeApisecApiResourcesResponseBodyData setAccountEventNum(Long accountEventNum) {
            this.accountEventNum = accountEventNum;
            return this;
        }
        public Long getAccountEventNum() {
            return this.accountEventNum;
        }

        public DescribeApisecApiResourcesResponseBodyData setAllCnt(Long allCnt) {
            this.allCnt = allCnt;
            return this;
        }
        public Long getAllCnt() {
            return this.allCnt;
        }

        public DescribeApisecApiResourcesResponseBodyData setApiFormat(String apiFormat) {
            this.apiFormat = apiFormat;
            return this;
        }
        public String getApiFormat() {
            return this.apiFormat;
        }

        public DescribeApisecApiResourcesResponseBodyData setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeApisecApiResourcesResponseBodyData setApiInfo(String apiInfo) {
            this.apiInfo = apiInfo;
            return this;
        }
        public String getApiInfo() {
            return this.apiInfo;
        }

        public DescribeApisecApiResourcesResponseBodyData setApiMethod(String apiMethod) {
            this.apiMethod = apiMethod;
            return this;
        }
        public String getApiMethod() {
            return this.apiMethod;
        }

        public DescribeApisecApiResourcesResponseBodyData setApiSensitive(String apiSensitive) {
            this.apiSensitive = apiSensitive;
            return this;
        }
        public String getApiSensitive() {
            return this.apiSensitive;
        }

        public DescribeApisecApiResourcesResponseBodyData setApiSensitiveRequest(String apiSensitiveRequest) {
            this.apiSensitiveRequest = apiSensitiveRequest;
            return this;
        }
        public String getApiSensitiveRequest() {
            return this.apiSensitiveRequest;
        }

        public DescribeApisecApiResourcesResponseBodyData setApiSensitiveResponse(String apiSensitiveResponse) {
            this.apiSensitiveResponse = apiSensitiveResponse;
            return this;
        }
        public String getApiSensitiveResponse() {
            return this.apiSensitiveResponse;
        }

        public DescribeApisecApiResourcesResponseBodyData setApiStatus(String apiStatus) {
            this.apiStatus = apiStatus;
            return this;
        }
        public String getApiStatus() {
            return this.apiStatus;
        }

        public DescribeApisecApiResourcesResponseBodyData setApiTag(String apiTag) {
            this.apiTag = apiTag;
            return this;
        }
        public String getApiTag() {
            return this.apiTag;
        }

        public DescribeApisecApiResourcesResponseBodyData setApiType(String apiType) {
            this.apiType = apiType;
            return this;
        }
        public String getApiType() {
            return this.apiType;
        }

        public DescribeApisecApiResourcesResponseBodyData setAuthFlag(String authFlag) {
            this.authFlag = authFlag;
            return this;
        }
        public String getAuthFlag() {
            return this.authFlag;
        }

        public DescribeApisecApiResourcesResponseBodyData setBotCnt(Long botCnt) {
            this.botCnt = botCnt;
            return this;
        }
        public Long getBotCnt() {
            return this.botCnt;
        }

        public DescribeApisecApiResourcesResponseBodyData setCrossBorderCnt(Long crossBorderCnt) {
            this.crossBorderCnt = crossBorderCnt;
            return this;
        }
        public Long getCrossBorderCnt() {
            return this.crossBorderCnt;
        }

        public DescribeApisecApiResourcesResponseBodyData setEventNum(Long eventNum) {
            this.eventNum = eventNum;
            return this;
        }
        public Long getEventNum() {
            return this.eventNum;
        }

        @Deprecated
        public DescribeApisecApiResourcesResponseBodyData setExamples(java.util.List<String> examples) {
            this.examples = examples;
            return this;
        }
        public java.util.List<String> getExamples() {
            return this.examples;
        }

        public DescribeApisecApiResourcesResponseBodyData setFarthestTs(Long farthestTs) {
            this.farthestTs = farthestTs;
            return this;
        }
        public Long getFarthestTs() {
            return this.farthestTs;
        }

        public DescribeApisecApiResourcesResponseBodyData setFollow(Integer follow) {
            this.follow = follow;
            return this;
        }
        public Integer getFollow() {
            return this.follow;
        }

        public DescribeApisecApiResourcesResponseBodyData setLastestTs(Long lastestTs) {
            this.lastestTs = lastestTs;
            return this;
        }
        public Long getLastestTs() {
            return this.lastestTs;
        }

        public DescribeApisecApiResourcesResponseBodyData setMatchedHost(String matchedHost) {
            this.matchedHost = matchedHost;
            return this;
        }
        public String getMatchedHost() {
            return this.matchedHost;
        }

        public DescribeApisecApiResourcesResponseBodyData setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public DescribeApisecApiResourcesResponseBodyData setResources(java.util.List<String> resources) {
            this.resources = resources;
            return this;
        }
        public java.util.List<String> getResources() {
            return this.resources;
        }

    }

}
