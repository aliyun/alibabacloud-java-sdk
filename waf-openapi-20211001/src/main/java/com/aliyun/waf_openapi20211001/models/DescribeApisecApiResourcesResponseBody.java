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
     * <p>The total number of entries returned.</p>
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
         * <p>The number of risks associated with the API.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AbnormalNum")
        public Long abnormalNum;

        /**
         * <p>The number of account security events associated with the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AccountEventNum")
        public Long accountEventNum;

        /**
         * <p>The total access volume in the last 30 days.</p>
         * 
         * <strong>example:</strong>
         * <p>1683388800</p>
         */
        @NameInMap("AllCnt")
        public Long allCnt;

        /**
         * <p>The API operation.</p>
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
         * <p>The API information, which is a string converted from a JSON object constructed with a series of parameters. The parameters include:</p>
         * <ul>
         * <li><strong>param_num</strong>: the number of API parameters.</li>
         * <li><strong>request_method</strong>: the request method.</li>
         * <li><strong>protocol</strong>: the request protocol.</li>
         * <li><strong>api_url</strong>: the request URL.</li>
         * <li><strong>poc_payload</strong>: the request.</li>
         * <li><strong>request</strong>: the request sample.</li>
         * <li><strong>response</strong>: the response sample.</li>
         * <li><strong>param</strong>: the request parameters.<blockquote>
         * <p>This field is returned only when the <strong>ApiId</strong> parameter is specified.</p>
         * </blockquote>
         * </li>
         * </ul>
         */
        @NameInMap("ApiInfo")
        public String apiInfo;

        /**
         * <p>The request method of the API. Valid values:</p>
         * <ul>
         * <li><strong>GET</strong>: GET request.</li>
         * <li><strong>POST</strong>: POST request.</li>
         * <li><strong>HEAD</strong>: HEAD request.</li>
         * <li><strong>PUT</strong>: PUT request.</li>
         * <li><strong>DELETE</strong>: DELETE request.</li>
         * <li><strong>CONNECT</strong>: CONNECT request.</li>
         * <li><strong>PATCH</strong>: PATCH request.</li>
         * <li><strong>OPTIONS</strong>: OPTIONS request.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>POST</p>
         */
        @NameInMap("ApiMethod")
        public String apiMethod;

        /**
         * <p>The sensitive information involved in the API, which is a string converted from a JSON object constructed with a series of parameters. The parameters include:</p>
         * <ul>
         * <li><strong>request_sensitive_list</strong>: the list of sensitive data types in the request.</li>
         * <li><strong>response_sensitive_list</strong>: the list of sensitive data types in the response.</li>
         * <li><strong>sensitive_list</strong>: the list of sensitive data types.</li>
         * <li><strong>sensitive_level</strong>: the sensitivity level.</li>
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
         * <p>The sensitive data in the API request.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;1002&quot;,&quot;1005&quot;]</p>
         */
        @NameInMap("ApiSensitiveRequest")
        public String apiSensitiveRequest;

        /**
         * <p>The sensitive data in the API response.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;1002&quot;,&quot;1005&quot;]</p>
         */
        @NameInMap("ApiSensitiveResponse")
        public String apiSensitiveResponse;

        /**
         * <p>The status of the API. Valid values:</p>
         * <ul>
         * <li><strong>NewbornInterface</strong>: newly added.</li>
         * <li><strong>OfflineInterface</strong>: inactive.</li>
         * <li><strong>normal</strong>: normal.</li>
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
         * <p>You can call <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> to obtain the supported business purposes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SendMail</p>
         */
        @NameInMap("ApiTag")
        public String apiTag;

        /**
         * <p>The service object. Valid values:</p>
         * <ul>
         * <li><strong>PublicAPI</strong>: public service.</li>
         * <li><strong>ThirdpartAPI</strong>: third-party collaboration.</li>
         * <li><strong>InternalAPI</strong>: internal office.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PublicAPI</p>
         */
        @NameInMap("ApiType")
        public String apiType;

        /**
         * <p>Specifies whether the API has an authentication field. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: has authentication.</li>
         * <li><strong>1</strong>: does not have authentication.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AuthFlag")
        public String authFlag;

        /**
         * <p>The bot access volume in the last 30 days.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("BotCnt")
        public Long botCnt;

        /**
         * <p>The cross-border access volume in the last 30 days.</p>
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
         * <p>The time when the API asset was first discovered, in UNIX timestamp (UTC) format. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1683388800</p>
         */
        @NameInMap("FarthestTs")
        public Long farthestTs;

        /**
         * <p>Specifies whether the API is followed. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: followed.</li>
         * <li><strong>0</strong>: not followed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Follow")
        public Integer follow;

        /**
         * <p>The most recent access time of the API asset, in UNIX timestamp (UTC) format. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1683388800</p>
         */
        @NameInMap("LastestTs")
        public Long lastestTs;

        /**
         * <p>The domain name or IP address to which the API operation belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>a.aliyun.com</p>
         */
        @NameInMap("MatchedHost")
        public String matchedHost;

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>loginApi</p>
         */
        @NameInMap("Note")
        public String note;

        /**
         * <p>The list of protected objects corresponding to the asset.</p>
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
