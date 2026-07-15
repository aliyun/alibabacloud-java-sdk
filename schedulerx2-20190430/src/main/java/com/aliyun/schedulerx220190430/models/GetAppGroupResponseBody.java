// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetAppGroupResponseBody extends TeaModel {
    /**
     * <p>The returned status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The details of the App Group.</p>
     */
    @NameInMap("Data")
    public GetAppGroupResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>app is not existed, groupId=xxxx, namesapce=xxxx</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>39090022-1F3B-4797-8518-6B61095F1AF0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
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

    public static class GetAppGroupResponseBodyData extends TeaModel {
        /**
         * <p>The application\&quot;s AppKey.</p>
         * 
         * <strong>example:</strong>
         * <p>QI4lWMZ+xk1rNB67jFUhaw==</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>DocTest</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The application version. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        /**
         * <p>The number of jobs currently configured for the App Group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurJobs")
        public Integer curJobs;

        /**
         * <p>The application description.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Specifies whether to enable log collection. The default value is false.</p>
         */
        @NameInMap("EnableLog")
        public Boolean enableLog;

        /**
         * <p>The App Group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>testSchedulerx.defaultGroup</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The maximum number of jobs that can be configured for the App Group.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxJobs")
        public Integer maxJobs;

        /**
         * <p>The alarm notification configuration.</p>
         * <blockquote>
         * <p>For more information, see the <strong>MonitorConfigJson</strong> section below.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;sendChannel&quot;: &quot;ding,sms,mail,phone&quot;,
         *     &quot;alarmType&quot;: &quot;Contacts&quot;,
         *     &quot;webhookIsAtAll&quot;: false
         * }</p>
         */
        @NameInMap("MonitorConfigJson")
        public String monitorConfigJson;

        /**
         * <p>The alarm contact configuration.</p>
         * <blockquote>
         * <p>For more information, see the <strong>MonitorContactsJson</strong> section below.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[
         *     {&quot;name&quot;: &quot;Alice Johnson&quot;},
         *     {&quot;name&quot;: &quot;Lee Smith&quot;}
         * ]</p>
         */
        @NameInMap("MonitorContactsJson")
        public String monitorContactsJson;

        /**
         * <p>The namespace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>adcfc35d-e2fe-4fe9-bbaa-20e90ffc****</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The name of the notification policy.</p>
         * 
         * <strong>example:</strong>
         * <p>test-workday-notification</p>
         */
        @NameInMap("NotificationPolicyName")
        public String notificationPolicyName;

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

        public GetAppGroupResponseBodyData setEnableLog(Boolean enableLog) {
            this.enableLog = enableLog;
            return this;
        }
        public Boolean getEnableLog() {
            return this.enableLog;
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

        public GetAppGroupResponseBodyData setMonitorContactsJson(String monitorContactsJson) {
            this.monitorContactsJson = monitorContactsJson;
            return this;
        }
        public String getMonitorContactsJson() {
            return this.monitorContactsJson;
        }

        public GetAppGroupResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetAppGroupResponseBodyData setNotificationPolicyName(String notificationPolicyName) {
            this.notificationPolicyName = notificationPolicyName;
            return this;
        }
        public String getNotificationPolicyName() {
            return this.notificationPolicyName;
        }

    }

}
