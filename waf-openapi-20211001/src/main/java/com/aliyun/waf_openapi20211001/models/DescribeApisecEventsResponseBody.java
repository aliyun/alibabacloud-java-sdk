// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecEventsResponseBody extends TeaModel {
    /**
     * <p>The security events.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeApisecEventsResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12F4CC8F-7E9F-5E4D-BF7C-BD1EDDE0C282</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeApisecEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecEventsResponseBody self = new DescribeApisecEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApisecEventsResponseBody setData(java.util.List<DescribeApisecEventsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeApisecEventsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeApisecEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApisecEventsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApisecEventsResponseBodyData extends TeaModel {
        /**
         * <p>The number of attacks.</p>
         * <blockquote>
         * <p>Notice: The parameter has been deprecated, please use the Attackips parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AllCnt")
        public Long allCnt;

        /**
         * <p>The API.</p>
         * 
         * <strong>example:</strong>
         * <p>/apisec/v1/register.php</p>
         */
        @NameInMap("ApiFormat")
        public String apiFormat;

        /**
         * <p>The ID of the API that is associated with the security event.</p>
         * 
         * <strong>example:</strong>
         * <p>2ecc1cf67b91853bc55545052ccf06a8</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>The business purpose of the API.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> operation to query the business purposes of APIs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SendMail</p>
         */
        @NameInMap("ApiTag")
        public String apiTag;

        /**
         * <p>The client that is attacked.</p>
         * 
         * <strong>example:</strong>
         * <p>Chrome</p>
         */
        @NameInMap("AttackClient")
        public String attackClient;

        /**
         * <p>The information about the number of attacks. The value of this parameter is a JSON string that contains multiple parameters. Key indicates the timestamp in seconds, and Value indicates the number of attacks.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;1717498320\&quot;:500,\&quot;1717498380\&quot;:529,\&quot;1717498440\&quot;:20,\&quot;1717498260\&quot;:518,\&quot;1717498200\&quot;:481,\&quot;1717498140\&quot;:52}</p>
         */
        @NameInMap("AttackCntInfo")
        @Deprecated
        public String attackCntInfo;

        /**
         * <p>The source IP address of the attack.</p>
         * 
         * <strong>example:</strong>
         * <p>104.234.140.33</p>
         */
        @NameInMap("AttackIp")
        @Deprecated
        public String attackIp;

        /**
         * <p>The information about the attack source IP address. The value of this parameter is a JSON string that contains multiple parameters. The value includes the following parameters:</p>
         * <ul>
         * <li><strong>ip</strong>: the IP address</li>
         * <li><strong>country_id</strong>: the country ID</li>
         * <li><strong>region_id</strong>: the region ID</li>
         * <li><strong>cnt</strong>: the number of attacks</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;ip\&quot;:\&quot;72.<em>.</em>.119\&quot;,\&quot;country_id\&quot;:\&quot;US\&quot;,\&quot;region_id\&quot;:\&quot;\&quot;,\&quot;cnt\&quot;:\&quot;2100\&quot;}]</p>
         */
        @NameInMap("AttackIpInfo")
        @Deprecated
        public String attackIpInfo;

        /**
         * <p>The source IP addresses of the attacks.</p>
         */
        @NameInMap("AttackIps")
        @Deprecated
        public java.util.List<String> attackIps;

        @NameInMap("AttackerList")
        public java.util.List<String> attackerList;

        /**
         * <p>The end of the time range to query. This value is a UNIX timestamp in UTC. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1683703260</p>
         */
        @NameInMap("EndTs")
        public Long endTs;

        /**
         * <p>The ID of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>c82cb276847e9c96f9597d9f4b0cdcff</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>The details of the event. The value of this parameter is a JSON string that contains multiple parameters. The value includes the following parameters:</p>
         * <ul>
         * <li><strong>ip_info</strong>: the information about the attack source IP address. This parameter corresponds to the <strong>AttackIpInfo</strong> response parameter.</li>
         * <li><strong>rule_id</strong>: the ID of the rule corresponding to the event.</li>
         * <li><strong>rule_tag</strong>: the information about the rule corresponding to the event.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("EventInfo")
        @Deprecated
        public String eventInfo;

        /**
         * <p>The severity level of the event. Valid values:</p>
         * <ul>
         * <li><strong>high</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>low</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("EventLevel")
        public String eventLevel;

        /**
         * <p>The type of the event.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> operation to query the supported event types.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ObtainSensitiveUnauthorized</p>
         */
        @NameInMap("EventTag")
        public String eventTag;

        /**
         * <p>Indicates whether the API is followed. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The API is followed.</li>
         * <li><strong>0</strong>: The API is not followed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Follow")
        public Integer follow;

        /**
         * <p>The domain name or IP address of the API.</p>
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
         * <p>Notified</p>
         */
        @NameInMap("Note")
        public String note;

        /**
         * <p>The source of the event type. Valid values:</p>
         * <ul>
         * <li><strong>custom</strong></li>
         * <li><strong>default</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("Origin")
        public String origin;

        /**
         * <p>The country to which the attack source IP address belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>US</p>
         */
        @NameInMap("RemoteCountry")
        public String remoteCountry;

        /**
         * <p>The region to which the attack source IP address belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>110000</p>
         */
        @NameInMap("RemoteRegion")
        public String remoteRegion;

        /**
         * <p>The sample API request. The value of this parameter is a JSON string that contains multiple parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("RequestData")
        @Deprecated
        public String requestData;

        /**
         * <p>The sample API response. The value of this parameter is a JSON string that contains multiple parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ResponseData")
        @Deprecated
        public String responseData;

        /**
         * <p>The beginning of the time range to query. This value is a UNIX timestamp in UTC. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1683648000</p>
         */
        @NameInMap("StartTs")
        public Long startTs;

        /**
         * <p>The event status. Valid values:</p>
         * <ul>
         * <li><strong>toBeConfirmed</strong></li>
         * <li><strong>confirmed</strong></li>
         * <li><strong>ignored</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ignore</p>
         */
        @NameInMap("UserStatus")
        public String userStatus;

        public static DescribeApisecEventsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisecEventsResponseBodyData self = new DescribeApisecEventsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeApisecEventsResponseBodyData setAllCnt(Long allCnt) {
            this.allCnt = allCnt;
            return this;
        }
        public Long getAllCnt() {
            return this.allCnt;
        }

        public DescribeApisecEventsResponseBodyData setApiFormat(String apiFormat) {
            this.apiFormat = apiFormat;
            return this;
        }
        public String getApiFormat() {
            return this.apiFormat;
        }

        public DescribeApisecEventsResponseBodyData setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeApisecEventsResponseBodyData setApiTag(String apiTag) {
            this.apiTag = apiTag;
            return this;
        }
        public String getApiTag() {
            return this.apiTag;
        }

        public DescribeApisecEventsResponseBodyData setAttackClient(String attackClient) {
            this.attackClient = attackClient;
            return this;
        }
        public String getAttackClient() {
            return this.attackClient;
        }

        @Deprecated
        public DescribeApisecEventsResponseBodyData setAttackCntInfo(String attackCntInfo) {
            this.attackCntInfo = attackCntInfo;
            return this;
        }
        public String getAttackCntInfo() {
            return this.attackCntInfo;
        }

        @Deprecated
        public DescribeApisecEventsResponseBodyData setAttackIp(String attackIp) {
            this.attackIp = attackIp;
            return this;
        }
        public String getAttackIp() {
            return this.attackIp;
        }

        @Deprecated
        public DescribeApisecEventsResponseBodyData setAttackIpInfo(String attackIpInfo) {
            this.attackIpInfo = attackIpInfo;
            return this;
        }
        public String getAttackIpInfo() {
            return this.attackIpInfo;
        }

        @Deprecated
        public DescribeApisecEventsResponseBodyData setAttackIps(java.util.List<String> attackIps) {
            this.attackIps = attackIps;
            return this;
        }
        public java.util.List<String> getAttackIps() {
            return this.attackIps;
        }

        public DescribeApisecEventsResponseBodyData setAttackerList(java.util.List<String> attackerList) {
            this.attackerList = attackerList;
            return this;
        }
        public java.util.List<String> getAttackerList() {
            return this.attackerList;
        }

        public DescribeApisecEventsResponseBodyData setEndTs(Long endTs) {
            this.endTs = endTs;
            return this;
        }
        public Long getEndTs() {
            return this.endTs;
        }

        public DescribeApisecEventsResponseBodyData setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        @Deprecated
        public DescribeApisecEventsResponseBodyData setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public DescribeApisecEventsResponseBodyData setEventLevel(String eventLevel) {
            this.eventLevel = eventLevel;
            return this;
        }
        public String getEventLevel() {
            return this.eventLevel;
        }

        public DescribeApisecEventsResponseBodyData setEventTag(String eventTag) {
            this.eventTag = eventTag;
            return this;
        }
        public String getEventTag() {
            return this.eventTag;
        }

        public DescribeApisecEventsResponseBodyData setFollow(Integer follow) {
            this.follow = follow;
            return this;
        }
        public Integer getFollow() {
            return this.follow;
        }

        public DescribeApisecEventsResponseBodyData setMatchedHost(String matchedHost) {
            this.matchedHost = matchedHost;
            return this;
        }
        public String getMatchedHost() {
            return this.matchedHost;
        }

        public DescribeApisecEventsResponseBodyData setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public DescribeApisecEventsResponseBodyData setOrigin(String origin) {
            this.origin = origin;
            return this;
        }
        public String getOrigin() {
            return this.origin;
        }

        public DescribeApisecEventsResponseBodyData setRemoteCountry(String remoteCountry) {
            this.remoteCountry = remoteCountry;
            return this;
        }
        public String getRemoteCountry() {
            return this.remoteCountry;
        }

        public DescribeApisecEventsResponseBodyData setRemoteRegion(String remoteRegion) {
            this.remoteRegion = remoteRegion;
            return this;
        }
        public String getRemoteRegion() {
            return this.remoteRegion;
        }

        @Deprecated
        public DescribeApisecEventsResponseBodyData setRequestData(String requestData) {
            this.requestData = requestData;
            return this;
        }
        public String getRequestData() {
            return this.requestData;
        }

        @Deprecated
        public DescribeApisecEventsResponseBodyData setResponseData(String responseData) {
            this.responseData = responseData;
            return this;
        }
        public String getResponseData() {
            return this.responseData;
        }

        public DescribeApisecEventsResponseBodyData setStartTs(Long startTs) {
            this.startTs = startTs;
            return this;
        }
        public Long getStartTs() {
            return this.startTs;
        }

        public DescribeApisecEventsResponseBodyData setUserStatus(String userStatus) {
            this.userStatus = userStatus;
            return this;
        }
        public String getUserStatus() {
            return this.userStatus;
        }

    }

}
