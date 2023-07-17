// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetAppGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetAppGroupResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AppKey")
        public String appKey;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("CurJobs")
        public Integer curJobs;

        @NameInMap("Description")
        public String description;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("MaxJobs")
        public Integer maxJobs;

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
