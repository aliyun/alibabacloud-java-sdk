// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetAppGroupResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public GetAppGroupResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The information about the application group.</p>
     */
    @NameInMap("Data")
    public GetAppGroupResponseBodyData data;

    /**
     * <p>The additional information that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>app is not existed, groupId=xxxx, namesapce=xxxx</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>39090022-1F3B-4797-8518-6B61095F1AF0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAppGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppGroupResponseBody self = new GetAppGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppGroupResponseBody setAccessDeniedDetail(GetAppGroupResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public GetAppGroupResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetAppGroupResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetAppGroupResponseBody setData(GetAppGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAppGroupResponseBodyData getData() {
        return this.data;
    }

    public GetAppGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAppGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAppGroupResponseBodyAccessDeniedDetail extends TeaModel {
        @NameInMap("AuthAction")
        public String authAction;

        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        @NameInMap("NoPermissionType")
        public String noPermissionType;

        @NameInMap("PolicyType")
        public String policyType;

        public static GetAppGroupResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            GetAppGroupResponseBodyAccessDeniedDetail self = new GetAppGroupResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public GetAppGroupResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public GetAppGroupResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public GetAppGroupResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public GetAppGroupResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public GetAppGroupResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public GetAppGroupResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public GetAppGroupResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class GetAppGroupResponseBodyData extends TeaModel {
        /**
         * <p>The AppKey of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>QI4lWMZ+xk1rNB67jFUhaw==</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>DocTest</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The application version. 1: Basic version, 2: Professional version.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        /**
         * <p>The number of jobs that are configured for the application group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurJobs")
        public Integer curJobs;

        /**
         * <p>The description of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>testSchedulerx.defaultGroup</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The maximum number of jobs that can be configured for the application group.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxJobs")
        public Integer maxJobs;

        /**
         * <p>The configuration of the alert. The value is a JSON string. For more information, see <strong>the additional information about response parameters below this table.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;sendChannel&quot;:&quot;sms,mail,ding&quot;}</p>
         */
        @NameInMap("MonitorConfigJson")
        public String monitorConfigJson;

        public static GetAppGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAppGroupResponseBodyData self = new GetAppGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAppGroupResponseBodyData setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public GetAppGroupResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetAppGroupResponseBodyData setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public GetAppGroupResponseBodyData setCurJobs(Integer curJobs) {
            this.curJobs = curJobs;
            return this;
        }
        public Integer getCurJobs() {
            return this.curJobs;
        }

        public GetAppGroupResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAppGroupResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetAppGroupResponseBodyData setMaxJobs(Integer maxJobs) {
            this.maxJobs = maxJobs;
            return this;
        }
        public Integer getMaxJobs() {
            return this.maxJobs;
        }

        public GetAppGroupResponseBodyData setMonitorConfigJson(String monitorConfigJson) {
            this.monitorConfigJson = monitorConfigJson;
            return this;
        }
        public String getMonitorConfigJson() {
            return this.monitorConfigJson;
        }

    }

}
