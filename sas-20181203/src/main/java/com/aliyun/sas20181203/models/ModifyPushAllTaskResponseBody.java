// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyPushAllTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PushTaskRsp")
    public ModifyPushAllTaskResponseBodyPushTaskRsp pushTaskRsp;

    public static ModifyPushAllTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPushAllTaskResponseBody self = new ModifyPushAllTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPushAllTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyPushAllTaskResponseBody setPushTaskRsp(ModifyPushAllTaskResponseBodyPushTaskRsp pushTaskRsp) {
        this.pushTaskRsp = pushTaskRsp;
        return this;
    }
    public ModifyPushAllTaskResponseBodyPushTaskRsp getPushTaskRsp() {
        return this.pushTaskRsp;
    }

    public static class ModifyPushAllTaskResponseBodyPushTaskRspPushTaskResultList extends TeaModel {
        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Region")
        public String region;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Online")
        public Boolean online;

        @NameInMap("Message")
        public String message;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("OsVersion")
        public String osVersion;

        @NameInMap("InstanceId")
        public String instanceId;

        public static ModifyPushAllTaskResponseBodyPushTaskRspPushTaskResultList build(java.util.Map<String, ?> map) throws Exception {
            ModifyPushAllTaskResponseBodyPushTaskRspPushTaskResultList self = new ModifyPushAllTaskResponseBodyPushTaskRspPushTaskResultList();
            return TeaModel.build(map, self);
        }

        public ModifyPushAllTaskResponseBodyPushTaskRspPushTaskResultList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public ModifyPushAllTaskResponseBodyPushTaskRspPushTaskResultList setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public ModifyPushAllTaskResponseBodyPushTaskRspPushTaskResultList setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ModifyPushAllTaskResponseBodyPushTaskRspPushTaskResultList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ModifyPushAllTaskResponseBodyPushTaskRspPushTaskResultList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ModifyPushAllTaskResponseBodyPushTaskRspPushTaskResultList setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public ModifyPushAllTaskResponseBodyPushTaskRspPushTaskResultList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ModifyPushAllTaskResponseBodyPushTaskRspPushTaskResultList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ModifyPushAllTaskResponseBodyPushTaskRspPushTaskResultList setOsVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public String getOsVersion() {
            return this.osVersion;
        }

        public ModifyPushAllTaskResponseBodyPushTaskRspPushTaskResultList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class ModifyPushAllTaskResponseBodyPushTaskRsp extends TeaModel {
        @NameInMap("PushTaskResultList")
        public java.util.List<ModifyPushAllTaskResponseBodyPushTaskRspPushTaskResultList> pushTaskResultList;

        public static ModifyPushAllTaskResponseBodyPushTaskRsp build(java.util.Map<String, ?> map) throws Exception {
            ModifyPushAllTaskResponseBodyPushTaskRsp self = new ModifyPushAllTaskResponseBodyPushTaskRsp();
            return TeaModel.build(map, self);
        }

        public ModifyPushAllTaskResponseBodyPushTaskRsp setPushTaskResultList(java.util.List<ModifyPushAllTaskResponseBodyPushTaskRspPushTaskResultList> pushTaskResultList) {
            this.pushTaskResultList = pushTaskResultList;
            return this;
        }
        public java.util.List<ModifyPushAllTaskResponseBodyPushTaskRspPushTaskResultList> getPushTaskResultList() {
            return this.pushTaskResultList;
        }

    }

}
