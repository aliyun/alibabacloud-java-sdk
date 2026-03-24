// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecAbnormalsResponseBody extends TeaModel {
    /**
     * <p>The list of security risks.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeApisecAbnormalsResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9469646C-F2CC-5F0F-8401-C53***4F46</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of security risks returned.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeApisecAbnormalsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecAbnormalsResponseBody self = new DescribeApisecAbnormalsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApisecAbnormalsResponseBody setData(java.util.List<DescribeApisecAbnormalsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeApisecAbnormalsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeApisecAbnormalsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApisecAbnormalsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApisecAbnormalsResponseBodyData extends TeaModel {
        /**
         * <p>The number of risk events that are associated with the security risk.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AbnormalEventNumber")
        public Long abnormalEventNumber;

        /**
         * <p>The ID of the security risk.</p>
         * 
         * <strong>example:</strong>
         * <p>7c1431f27ae7e9c8cc64095***68e</p>
         */
        @NameInMap("AbnormalId")
        public String abnormalId;

        /**
         * <p>The details of the security risk in JSON format. The JSON object contains the following fields:</p>
         * <ul>
         * <li><p><strong>rule</strong>: The detection rule that triggered the security risk.</p>
         * </li>
         * <li><p><strong>data_type</strong>: The type of sensitive data.</p>
         * </li>
         * <li><p><strong>custom_rule_name</strong>: The name of the custom rule.</p>
         * </li>
         * <li><p><strong>rule_name</strong>: The name of the built-in rule.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;data_type&quot;: [&quot;1005&quot;,&quot;1004&quot;],
         *     &quot;rule&quot;: {
         *         &quot;parent&quot;: &quot;RiskType_Permission&quot;,
         *         &quot;code&quot;: &quot;Risk_UnauthSensitive&quot;,
         *         &quot;level&quot;: &quot;high&quot;,
         *         &quot;origin&quot;: &quot;default&quot;,
         *         &quot;name&quot;: &quot;Risk_UnauthSensitive&quot;
         *     }
         * }</p>
         */
        @NameInMap("AbnormalInfo")
        public String abnormalInfo;

        /**
         * <p>The severity level of the security risk. Valid values:</p>
         * <ul>
         * <li><p><strong>high</strong>: High.</p>
         * </li>
         * <li><p><strong>medium</strong>: Medium.</p>
         * </li>
         * <li><p><strong>low</strong>: Low.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("AbnormalLevel")
        public String abnormalLevel;

        /**
         * <p>The type of the security risk.</p>
         * <blockquote>
         * <p>Call <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> to query the supported risk types.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>LackOfSpeedLimit</p>
         */
        @NameInMap("AbnormalTag")
        public String abnormalTag;

        /**
         * <p>The processing status of the security risk.</p>
         * 
         * <strong>example:</strong>
         * <p>unresolved</p>
         */
        @NameInMap("AbnromalStatus")
        public String abnromalStatus;

        /**
         * <p>The path of the API that is associated with the security risk.</p>
         * 
         * <strong>example:</strong>
         * <p>/api/login</p>
         */
        @NameInMap("ApiFormat")
        public String apiFormat;

        /**
         * <p>The ID of the API that is associated with the security risk.</p>
         * 
         * <strong>example:</strong>
         * <p>09559c0d71ca2ffc996b81***836d8</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>The business purpose of the API.</p>
         * <blockquote>
         * <p>Call <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> to query the supported business purposes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SendMail</p>
         */
        @NameInMap("ApiTag")
        public String apiTag;

        /**
         * <p>The time when the security risk was first detected. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1684252800</p>
         */
        @NameInMap("DiscoverTime")
        public Long discoverTime;

        /**
         * <p>The list of security risk samples.</p>
         */
        @NameInMap("Examples")
        @Deprecated
        public java.util.List<String> examples;

        /**
         * <p>The time when the API was first discovered. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1701138088</p>
         */
        @NameInMap("FirstTime")
        public Long firstTime;

        /**
         * <p>Indicates whether the security risk is being followed. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: The security risk is being followed.</p>
         * </li>
         * <li><p><strong>0</strong> (default): The security risk is not being followed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Follow")
        public Long follow;

        /**
         * <p>The time when the security risk was marked as ignored. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1684252800</p>
         */
        @NameInMap("IgnoreTime")
        public Long ignoreTime;

        /**
         * <p>The most recent time when the API was accessed. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1684252800</p>
         */
        @NameInMap("LastestTime")
        public Long lastestTime;

        /**
         * <p>The most recent time when the security risk was detected. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1684252800</p>
         */
        @NameInMap("LatestDiscoverTime")
        public Long latestDiscoverTime;

        /**
         * <p>The domain name or IP address that the API resides on.</p>
         * 
         * <strong>example:</strong>
         * <p>a.aliyun.com</p>
         */
        @NameInMap("MatchedHost")
        public String matchedHost;

        /**
         * <p>The remarks for the security risk.</p>
         * 
         * <strong>example:</strong>
         * <p>Strict</p>
         */
        @NameInMap("Note")
        public String note;

        /**
         * <p>The source of the risk detection rule. Valid values:</p>
         * <ul>
         * <li><p><strong>custom</strong>: Custom rule.</p>
         * </li>
         * <li><p><strong>default</strong>: Built-in rule.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("Origin")
        public String origin;

        /**
         * <p>The handling status of the security risk. Valid values:</p>
         * <ul>
         * <li><p><strong>toBeConfirmed</strong>: To be confirmed.</p>
         * </li>
         * <li><p><strong>confirmed</strong>: Confirmed.</p>
         * </li>
         * <li><p><strong>toBeFixed</strong>: To be fixed.</p>
         * </li>
         * <li><p><strong>fixed</strong>: Fixed (manually verified).</p>
         * </li>
         * <li><p><strong>ignored</strong>: Ignored.</p>
         * </li>
         * <li><p><strong>toBeVerified</strong>: To be verified by the system.</p>
         * </li>
         * <li><p><strong>notFixed</strong>: Verification failed.</p>
         * </li>
         * <li><p><strong>systemFixed</strong>: Fixed (verified by the system).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Confirmed</p>
         */
        @NameInMap("UserStatus")
        public String userStatus;

        public static DescribeApisecAbnormalsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisecAbnormalsResponseBodyData self = new DescribeApisecAbnormalsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeApisecAbnormalsResponseBodyData setAbnormalEventNumber(Long abnormalEventNumber) {
            this.abnormalEventNumber = abnormalEventNumber;
            return this;
        }
        public Long getAbnormalEventNumber() {
            return this.abnormalEventNumber;
        }

        public DescribeApisecAbnormalsResponseBodyData setAbnormalId(String abnormalId) {
            this.abnormalId = abnormalId;
            return this;
        }
        public String getAbnormalId() {
            return this.abnormalId;
        }

        public DescribeApisecAbnormalsResponseBodyData setAbnormalInfo(String abnormalInfo) {
            this.abnormalInfo = abnormalInfo;
            return this;
        }
        public String getAbnormalInfo() {
            return this.abnormalInfo;
        }

        public DescribeApisecAbnormalsResponseBodyData setAbnormalLevel(String abnormalLevel) {
            this.abnormalLevel = abnormalLevel;
            return this;
        }
        public String getAbnormalLevel() {
            return this.abnormalLevel;
        }

        public DescribeApisecAbnormalsResponseBodyData setAbnormalTag(String abnormalTag) {
            this.abnormalTag = abnormalTag;
            return this;
        }
        public String getAbnormalTag() {
            return this.abnormalTag;
        }

        public DescribeApisecAbnormalsResponseBodyData setAbnromalStatus(String abnromalStatus) {
            this.abnromalStatus = abnromalStatus;
            return this;
        }
        public String getAbnromalStatus() {
            return this.abnromalStatus;
        }

        public DescribeApisecAbnormalsResponseBodyData setApiFormat(String apiFormat) {
            this.apiFormat = apiFormat;
            return this;
        }
        public String getApiFormat() {
            return this.apiFormat;
        }

        public DescribeApisecAbnormalsResponseBodyData setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeApisecAbnormalsResponseBodyData setApiTag(String apiTag) {
            this.apiTag = apiTag;
            return this;
        }
        public String getApiTag() {
            return this.apiTag;
        }

        public DescribeApisecAbnormalsResponseBodyData setDiscoverTime(Long discoverTime) {
            this.discoverTime = discoverTime;
            return this;
        }
        public Long getDiscoverTime() {
            return this.discoverTime;
        }

        @Deprecated
        public DescribeApisecAbnormalsResponseBodyData setExamples(java.util.List<String> examples) {
            this.examples = examples;
            return this;
        }
        public java.util.List<String> getExamples() {
            return this.examples;
        }

        public DescribeApisecAbnormalsResponseBodyData setFirstTime(Long firstTime) {
            this.firstTime = firstTime;
            return this;
        }
        public Long getFirstTime() {
            return this.firstTime;
        }

        public DescribeApisecAbnormalsResponseBodyData setFollow(Long follow) {
            this.follow = follow;
            return this;
        }
        public Long getFollow() {
            return this.follow;
        }

        public DescribeApisecAbnormalsResponseBodyData setIgnoreTime(Long ignoreTime) {
            this.ignoreTime = ignoreTime;
            return this;
        }
        public Long getIgnoreTime() {
            return this.ignoreTime;
        }

        public DescribeApisecAbnormalsResponseBodyData setLastestTime(Long lastestTime) {
            this.lastestTime = lastestTime;
            return this;
        }
        public Long getLastestTime() {
            return this.lastestTime;
        }

        public DescribeApisecAbnormalsResponseBodyData setLatestDiscoverTime(Long latestDiscoverTime) {
            this.latestDiscoverTime = latestDiscoverTime;
            return this;
        }
        public Long getLatestDiscoverTime() {
            return this.latestDiscoverTime;
        }

        public DescribeApisecAbnormalsResponseBodyData setMatchedHost(String matchedHost) {
            this.matchedHost = matchedHost;
            return this;
        }
        public String getMatchedHost() {
            return this.matchedHost;
        }

        public DescribeApisecAbnormalsResponseBodyData setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public DescribeApisecAbnormalsResponseBodyData setOrigin(String origin) {
            this.origin = origin;
            return this;
        }
        public String getOrigin() {
            return this.origin;
        }

        public DescribeApisecAbnormalsResponseBodyData setUserStatus(String userStatus) {
            this.userStatus = userStatus;
            return this;
        }
        public String getUserStatus() {
            return this.userStatus;
        }

    }

}
