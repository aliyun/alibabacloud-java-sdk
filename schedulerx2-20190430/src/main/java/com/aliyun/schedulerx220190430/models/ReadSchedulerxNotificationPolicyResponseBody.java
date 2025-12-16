// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ReadSchedulerxNotificationPolicyResponseBody extends TeaModel {
    /**
     * <p>The access denial details.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public ReadSchedulerxNotificationPolicyResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Data")
    public ReadSchedulerxNotificationPolicyResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>unknown exception occurred</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>71BCC0E3-64B2-4B63-A870-AFB64EBCB5A7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ReadSchedulerxNotificationPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReadSchedulerxNotificationPolicyResponseBody self = new ReadSchedulerxNotificationPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ReadSchedulerxNotificationPolicyResponseBody setAccessDeniedDetail(ReadSchedulerxNotificationPolicyResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public ReadSchedulerxNotificationPolicyResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ReadSchedulerxNotificationPolicyResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ReadSchedulerxNotificationPolicyResponseBody setData(ReadSchedulerxNotificationPolicyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ReadSchedulerxNotificationPolicyResponseBodyData getData() {
        return this.data;
    }

    public ReadSchedulerxNotificationPolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReadSchedulerxNotificationPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReadSchedulerxNotificationPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ReadSchedulerxNotificationPolicyResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The authentication operation.</p>
         * 
         * <strong>example:</strong>
         * <p>edas:ReadSchedulerxNotificationPolicy</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>The principal name.</p>
         * 
         * <strong>example:</strong>
         * <p>209312833131416xxx</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>The account of the principal.</p>
         * 
         * <strong>example:</strong>
         * <p>1827811800526xxx</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>The principal type.</p>
         * 
         * <strong>example:</strong>
         * <p>SubUser</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <p>The encoded diagnostic message.</p>
         * 
         * <strong>example:</strong>
         * <p>AQFn/cLPZ/3Cz0YxQkZBMjVGLTY0REUtNTlGNS05NzUwLTgyMUE4M0MwMTFDRQ==</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>The permission denial type.</p>
         * 
         * <strong>example:</strong>
         * <p>ImplicitDeny</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <p>The policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>AccountLevelIdentityBasedPolicy</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static ReadSchedulerxNotificationPolicyResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            ReadSchedulerxNotificationPolicyResponseBodyAccessDeniedDetail self = new ReadSchedulerxNotificationPolicyResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public ReadSchedulerxNotificationPolicyResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public ReadSchedulerxNotificationPolicyResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public ReadSchedulerxNotificationPolicyResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public ReadSchedulerxNotificationPolicyResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public ReadSchedulerxNotificationPolicyResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public ReadSchedulerxNotificationPolicyResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public ReadSchedulerxNotificationPolicyResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class ReadSchedulerxNotificationPolicyResponseBodyDataRecordsReferenceApps extends TeaModel {
        /**
         * <p>The ID of the task group.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("AppGroupId")
        public Long appGroupId;

        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>Notification strategy testing namespace</p>
         */
        @NameInMap("NamespaceName")
        public String namespaceName;

        /**
         * <p>The unique identifier of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>18271388-aa16-4eab-9a6f-55f65d7e4391</p>
         */
        @NameInMap("NamespaceUid")
        public String namespaceUid;

        public static ReadSchedulerxNotificationPolicyResponseBodyDataRecordsReferenceApps build(java.util.Map<String, ?> map) throws Exception {
            ReadSchedulerxNotificationPolicyResponseBodyDataRecordsReferenceApps self = new ReadSchedulerxNotificationPolicyResponseBodyDataRecordsReferenceApps();
            return TeaModel.build(map, self);
        }

        public ReadSchedulerxNotificationPolicyResponseBodyDataRecordsReferenceApps setAppGroupId(Long appGroupId) {
            this.appGroupId = appGroupId;
            return this;
        }
        public Long getAppGroupId() {
            return this.appGroupId;
        }

        public ReadSchedulerxNotificationPolicyResponseBodyDataRecordsReferenceApps setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ReadSchedulerxNotificationPolicyResponseBodyDataRecordsReferenceApps setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public ReadSchedulerxNotificationPolicyResponseBodyDataRecordsReferenceApps setNamespaceUid(String namespaceUid) {
            this.namespaceUid = namespaceUid;
            return this;
        }
        public String getNamespaceUid() {
            return this.namespaceUid;
        }

    }

    public static class ReadSchedulerxNotificationPolicyResponseBodyDataRecords extends TeaModel {
        /**
         * <p>The configuration of the notification policy.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;isUnifiedSetting&quot;: false,
         *   &quot;timezone&quot;: &quot;GMT+8&quot;,
         *   &quot;webhookIsAtAll&quot;: &quot;false&quot;,
         *   &quot;timeRanges&quot;: {
         *     &quot;webhook&quot;: [
         *       {
         *         &quot;startTime&quot;: &quot;08:00&quot;,
         *         &quot;endTime&quot;: &quot;18:00&quot;,
         *         &quot;daysOfWeek&quot;: [
         *           1,
         *           2,
         *           3,
         *           4,
         *           5
         *         ]
         *       }
         *     ],
         *     &quot;sms&quot;: [
         *       {
         *         &quot;startTime&quot;: &quot;08:00&quot;,
         *         &quot;endTime&quot;: &quot;18:00&quot;,
         *         &quot;daysOfWeek&quot;: [
         *           1,
         *           2,
         *           3,
         *           4,
         *           5
         *         ]
         *       }
         *     ],
         *     &quot;mail&quot;: [
         *       {
         *         &quot;startTime&quot;: &quot;08:00&quot;,
         *         &quot;endTime&quot;: &quot;18:00&quot;,
         *         &quot;daysOfWeek&quot;: [
         *           1,
         *           2,
         *           3,
         *           4,
         *           5
         *         ]
         *       }
         *     ],
         *     &quot;phone&quot;: [
         *       {
         *         &quot;startTime&quot;: &quot;08:00&quot;,
         *         &quot;endTime&quot;: &quot;18:00&quot;,
         *         &quot;daysOfWeek&quot;: [
         *           1,
         *           2,
         *           3,
         *           4,
         *           5
         *         ]
         *       }
         *     ]
         *   }
         * }</p>
         */
        @NameInMap("ChannelTimeRange")
        public String channelTimeRange;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-17 11:21:01</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The creator.</p>
         * 
         * <strong>example:</strong>
         * <p>201576653956616970</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The description of the notification policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Monday-Friday only</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the notification policy.</p>
         * 
         * <strong>example:</strong>
         * <p>test-weekdays</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The list of applications associated with the notification policy.</p>
         */
        @NameInMap("ReferenceApps")
        public java.util.List<ReadSchedulerxNotificationPolicyResponseBodyDataRecordsReferenceApps> referenceApps;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-17 11:21:01</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The updater.</p>
         * 
         * <strong>example:</strong>
         * <p>1144881807903942</p>
         */
        @NameInMap("Updater")
        public String updater;

        public static ReadSchedulerxNotificationPolicyResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ReadSchedulerxNotificationPolicyResponseBodyDataRecords self = new ReadSchedulerxNotificationPolicyResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ReadSchedulerxNotificationPolicyResponseBodyDataRecords setChannelTimeRange(String channelTimeRange) {
            this.channelTimeRange = channelTimeRange;
            return this;
        }
        public String getChannelTimeRange() {
            return this.channelTimeRange;
        }

        public ReadSchedulerxNotificationPolicyResponseBodyDataRecords setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ReadSchedulerxNotificationPolicyResponseBodyDataRecords setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ReadSchedulerxNotificationPolicyResponseBodyDataRecords setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ReadSchedulerxNotificationPolicyResponseBodyDataRecords setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public ReadSchedulerxNotificationPolicyResponseBodyDataRecords setReferenceApps(java.util.List<ReadSchedulerxNotificationPolicyResponseBodyDataRecordsReferenceApps> referenceApps) {
            this.referenceApps = referenceApps;
            return this;
        }
        public java.util.List<ReadSchedulerxNotificationPolicyResponseBodyDataRecordsReferenceApps> getReferenceApps() {
            return this.referenceApps;
        }

        public ReadSchedulerxNotificationPolicyResponseBodyDataRecords setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ReadSchedulerxNotificationPolicyResponseBodyDataRecords setUpdater(String updater) {
            this.updater = updater;
            return this;
        }
        public String getUpdater() {
            return this.updater;
        }

    }

    public static class ReadSchedulerxNotificationPolicyResponseBodyData extends TeaModel {
        /**
         * <p>The maximum number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>When data that matches the query conditions has not been fully retrieved, the server returns nextToken. You can then use nextToken to continue retrieving the remaining data.</p>
         * 
         * <strong>example:</strong>
         * <p>O39nXKu5XafATl3/cJjSJw==</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The data records.</p>
         */
        @NameInMap("Records")
        public java.util.List<ReadSchedulerxNotificationPolicyResponseBodyDataRecords> records;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ReadSchedulerxNotificationPolicyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReadSchedulerxNotificationPolicyResponseBodyData self = new ReadSchedulerxNotificationPolicyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReadSchedulerxNotificationPolicyResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ReadSchedulerxNotificationPolicyResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ReadSchedulerxNotificationPolicyResponseBodyData setRecords(java.util.List<ReadSchedulerxNotificationPolicyResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ReadSchedulerxNotificationPolicyResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public ReadSchedulerxNotificationPolicyResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
