// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetAppGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetAppGroupResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>app is not existed, groupId=xxxx, namesapce=xxxx</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>39090022-1F3B-4797-8518-6B61095F1AF0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>QI4lWMZ+xk1rNB67jFUhaw==</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        /**
         * <strong>example:</strong>
         * <p>DocTest</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurJobs")
        public Integer curJobs;

        /**
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>testSchedulerx.defaultGroup</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxJobs")
        public Integer maxJobs;

        /**
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
