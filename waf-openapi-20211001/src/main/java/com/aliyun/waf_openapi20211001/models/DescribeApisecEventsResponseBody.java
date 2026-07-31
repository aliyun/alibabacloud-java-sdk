// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecEventsResponseBody extends TeaModel {
    /**
     * <p>The list of security events.</p>
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
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AllCnt")
        public Long allCnt;

        /**
         * <p>The API operation.</p>
         * 
         * <strong>example:</strong>
         * <p>/apisec/v1/register.php</p>
         */
        @NameInMap("ApiFormat")
        public String apiFormat;

        /**
         * <p>The ID of the API associated with the security event.</p>
         * 
         * <strong>example:</strong>
         * <p>2ecc1cf67b91853bc55545052ccf06a8</p>
         */
        @NameInMap("ApiId")
        public String apiId;

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
         * <p>The attack client.</p>
         * 
         * <strong>example:</strong>
         * <p>Chrome</p>
         */
        @NameInMap("AttackClient")
        public String attackClient;

        /**
         * <p>The attack count information, which is a string converted from a JSON object. The key is a timestamp in seconds, and the value is the number of attacks.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;1717498320&quot;: 500,
         *     &quot;1717498380&quot;: 529,
         *     &quot;1717498440&quot;: 20
         * }</p>
         */
        @NameInMap("AttackCntInfo")
        @Deprecated
        public String attackCntInfo;

        /**
         * <p>The attack IP address.</p>
         * <blockquote>
         * <p>Notice: This parameter is deprecated. Use the AttackIps parameter instead.</notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>104.234.140.**</p>
         */
        @NameInMap("AttackIp")
        @Deprecated
        public String attackIp;

        /**
         * <p>The attack IP information, which is a string converted from a JSON object constructed with the following parameters:</p>
         * <ul>
         * <li><strong>ip</strong>: the IP address.</li>
         * <li><strong>country_id</strong>: the country to which the IP address belongs.</li>
         * <li><strong>region_id</strong>: the region to which the IP address belongs.</li>
         * <li><strong>cnt</strong>: the number of attacks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[
         *     {
         *         &quot;ip&quot;: &quot;72.<em>.</em>.119&quot;,
         *         &quot;country_id&quot;: &quot;US&quot;,
         *         &quot;region_id&quot;: &quot;&quot;,
         *         &quot;cnt&quot;: &quot;2100&quot;
         *     }
         * ]</p>
         */
        @NameInMap("AttackIpInfo")
        @Deprecated
        public String attackIpInfo;

        /**
         * <p>The list of attack IP addresses.</p>
         */
        @NameInMap("AttackIps")
        @Deprecated
        public java.util.List<String> attackIps;

        /**
         * <p>The Attacker list associated with the event.</p>
         */
        @NameInMap("AttackerList")
        public java.util.List<String> attackerList;

        /**
         * <p>The end time of the query, in UNIX timestamp (UTC) format. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1683703260</p>
         */
        @NameInMap("EndTs")
        public Long endTs;

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c82cb276847e9c96f9597d9f4b0cdcff</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>The event details, which is a string converted from a JSON object constructed with the following parameters:</p>
         * <ul>
         * <li><strong>ip_info</strong>: the attack IP information. Refer to the response parameter <strong>AttackIpInfo</strong> of this operation.</li>
         * <li><strong>rule_id</strong>: the rule ID associated with the event.</li>
         * <li><strong>rule_tag</strong>: the rule information associated with the event.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;ip_info&quot;: [
         *         {
         *             &quot;ip&quot;: &quot;112.224.143.<strong>&quot;,
         *             &quot;country_id&quot;: &quot;CN&quot;,
         *             &quot;region_id&quot;: &quot;-&quot;,
         *             &quot;cnt&quot;: &quot;4&quot;
         *         }
         *     ],
         *     &quot;rule_id&quot;: &quot;837</strong>&quot;,
         *     &quot;rule_tag&quot;: &quot;interface returns a large amount of sensitive information&quot;
         * }</p>
         */
        @NameInMap("EventInfo")
        @Deprecated
        public String eventInfo;

        /**
         * <p>The event level. Valid values:</p>
         * <ul>
         * <li><strong>high</strong>: High-risk.</li>
         * <li><strong>medium</strong>: Medium-risk.</li>
         * <li><strong>low</strong>: Low-risk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("EventLevel")
        public String eventLevel;

        /**
         * <p>The event type.</p>
         * <blockquote>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> to obtain the supported event types.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ObtainSensitiveUnauthorized</p>
         */
        @NameInMap("EventTag")
        public String eventTag;

        /**
         * <p>Indicates whether the event is followed. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Followed.</li>
         * <li><strong>0</strong>: Not followed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Follow")
        public Integer follow;

        /**
         * <p>The domain name or IP address to which the API operation belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>a.***.com</p>
         */
        @NameInMap("MatchedHost")
        public String matchedHost;

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>Notify</p>
         */
        @NameInMap("Note")
        public String note;

        /**
         * <p>The source of the event type. Valid values:</p>
         * <ul>
         * <li><strong>custom</strong>: Custom.</li>
         * <li><strong>default</strong>: Built-in.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("Origin")
        public String origin;

        /**
         * <p>The country to which the attack IP address belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>US</p>
         */
        @NameInMap("RemoteCountry")
        public String remoteCountry;

        /**
         * <p>The region to which the attack IP address belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>110000</p>
         */
        @NameInMap("RemoteRegion")
        public String remoteRegion;

        /**
         * <p>A sample API request data, which is a string converted from a JSON object constructed with a series of parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("RequestData")
        @Deprecated
        public String requestData;

        /**
         * <p>A sample API response data, which is a string converted from a JSON object constructed with a series of parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ResponseData")
        @Deprecated
        public String responseData;

        /**
         * <p>The start time of the query, in UNIX timestamp (UTC) format. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1683648000</p>
         */
        @NameInMap("StartTs")
        public Long startTs;

        /**
         * <p>The event status. Valid values:</p>
         * <ul>
         * <li><strong>toBeConfirmed</strong>: To be confirmed.</li>
         * <li><strong>confirmed</strong>: Confirmed.</li>
         * <li><strong>actioned</strong>: Handled.</li>
         * <li><strong>ignored</strong>: Ignored.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>toBeConfirmed</p>
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
