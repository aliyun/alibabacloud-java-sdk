// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetDeviceUpgradeStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDeviceUpgradeStatusResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDeviceUpgradeStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceUpgradeStatusResponseBody self = new GetDeviceUpgradeStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceUpgradeStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDeviceUpgradeStatusResponseBody setData(GetDeviceUpgradeStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDeviceUpgradeStatusResponseBodyData getData() {
        return this.data;
    }

    public GetDeviceUpgradeStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDeviceUpgradeStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDeviceUpgradeStatusResponseBodyDataAppOtaStatusDTOList extends TeaModel {
        @NameInMap("BaseVersion")
        public String baseVersion;

        @NameInMap("ClientType")
        public Integer clientType;

        @NameInMap("ClientUid")
        public String clientUid;

        @NameInMap("Note")
        public String note;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("Project")
        public String project;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TargetVersion")
        public String targetVersion;

        @NameInMap("TaskUid")
        public String taskUid;

        public static GetDeviceUpgradeStatusResponseBodyDataAppOtaStatusDTOList build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceUpgradeStatusResponseBodyDataAppOtaStatusDTOList self = new GetDeviceUpgradeStatusResponseBodyDataAppOtaStatusDTOList();
            return TeaModel.build(map, self);
        }

        public GetDeviceUpgradeStatusResponseBodyDataAppOtaStatusDTOList setBaseVersion(String baseVersion) {
            this.baseVersion = baseVersion;
            return this;
        }
        public String getBaseVersion() {
            return this.baseVersion;
        }

        public GetDeviceUpgradeStatusResponseBodyDataAppOtaStatusDTOList setClientType(Integer clientType) {
            this.clientType = clientType;
            return this;
        }
        public Integer getClientType() {
            return this.clientType;
        }

        public GetDeviceUpgradeStatusResponseBodyDataAppOtaStatusDTOList setClientUid(String clientUid) {
            this.clientUid = clientUid;
            return this;
        }
        public String getClientUid() {
            return this.clientUid;
        }

        public GetDeviceUpgradeStatusResponseBodyDataAppOtaStatusDTOList setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public GetDeviceUpgradeStatusResponseBodyDataAppOtaStatusDTOList setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public GetDeviceUpgradeStatusResponseBodyDataAppOtaStatusDTOList setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public GetDeviceUpgradeStatusResponseBodyDataAppOtaStatusDTOList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetDeviceUpgradeStatusResponseBodyDataAppOtaStatusDTOList setTargetVersion(String targetVersion) {
            this.targetVersion = targetVersion;
            return this;
        }
        public String getTargetVersion() {
            return this.targetVersion;
        }

        public GetDeviceUpgradeStatusResponseBodyDataAppOtaStatusDTOList setTaskUid(String taskUid) {
            this.taskUid = taskUid;
            return this;
        }
        public String getTaskUid() {
            return this.taskUid;
        }

    }

    public static class GetDeviceUpgradeStatusResponseBodyData extends TeaModel {
        @NameInMap("AppOtaStatusDTOList")
        public java.util.List<GetDeviceUpgradeStatusResponseBodyDataAppOtaStatusDTOList> appOtaStatusDTOList;

        public static GetDeviceUpgradeStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceUpgradeStatusResponseBodyData self = new GetDeviceUpgradeStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDeviceUpgradeStatusResponseBodyData setAppOtaStatusDTOList(java.util.List<GetDeviceUpgradeStatusResponseBodyDataAppOtaStatusDTOList> appOtaStatusDTOList) {
            this.appOtaStatusDTOList = appOtaStatusDTOList;
            return this;
        }
        public java.util.List<GetDeviceUpgradeStatusResponseBodyDataAppOtaStatusDTOList> getAppOtaStatusDTOList() {
            return this.appOtaStatusDTOList;
        }

    }

}
