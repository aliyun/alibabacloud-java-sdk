// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyPushAllTaskResponseBody extends TeaModel {
    // The results of security check tasks.
    @NameInMap("PushTaskRsp")
    public ModifyPushAllTaskResponseBodyPushTaskRsp pushTaskRsp;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyPushAllTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPushAllTaskResponseBody self = new ModifyPushAllTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPushAllTaskResponseBody setPushTaskRsp(ModifyPushAllTaskResponseBodyPushTaskRsp pushTaskRsp) {
        this.pushTaskRsp = pushTaskRsp;
        return this;
    }
    public ModifyPushAllTaskResponseBodyPushTaskRsp getPushTaskRsp() {
        return this.pushTaskRsp;
    }

    public ModifyPushAllTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyPushAllTaskResponseBodyPushTaskRspPushTaskResultList extends TeaModel {
        // The ID of the server group to which the server belongs.
        @NameInMap("GroupId")
        public Long groupId;

        // The ID of the server.
        @NameInMap("InstanceId")
        public String instanceId;

        // The name of the server.
        @NameInMap("InstanceName")
        public String instanceName;

        // The IP address of the server.
        @NameInMap("Ip")
        public String ip;

        // The message that describes the security check failure.
        @NameInMap("Message")
        public String message;

        // Indicates whether the Security Center agent is online. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        // 
        // >  If the Security Center agent of the server is offline, Security Center does not protect the server.
        @NameInMap("Online")
        public Boolean online;

        // The operating system version of the server.
        @NameInMap("OsVersion")
        public String osVersion;

        // The region in which the server resides.
        @NameInMap("Region")
        public String region;

        // Indicates whether the security check task is successful. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        @NameInMap("Success")
        public Boolean success;

        // The UUID of the server.
        @NameInMap("Uuid")
        public String uuid;

        public static ModifyPushAllTaskResponseBodyPushTaskRspPushTaskResultList build(java.util.Map<String, ?> map) throws Exception {
            ModifyPushAllTaskResponseBodyPushTaskRspPushTaskResultList self = new ModifyPushAllTaskResponseBodyPushTaskRspPushTaskResultList();
            return TeaModel.build(map, self);
        }

        public ModifyPushAllTaskResponseBodyPushTaskRspPushTaskResultList setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public ModifyPushAllTaskResponseBodyPushTaskRspPushTaskResultList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyPushAllTaskResponseBodyPushTaskRspPushTaskResultList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ModifyPushAllTaskResponseBodyPushTaskRspPushTaskResultList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ModifyPushAllTaskResponseBodyPushTaskRspPushTaskResultList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ModifyPushAllTaskResponseBodyPushTaskRspPushTaskResultList setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public ModifyPushAllTaskResponseBodyPushTaskRspPushTaskResultList setOsVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public String getOsVersion() {
            return this.osVersion;
        }

        public ModifyPushAllTaskResponseBodyPushTaskRspPushTaskResultList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ModifyPushAllTaskResponseBodyPushTaskRspPushTaskResultList setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ModifyPushAllTaskResponseBodyPushTaskRspPushTaskResultList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class ModifyPushAllTaskResponseBodyPushTaskRsp extends TeaModel {
        // An array consisting of the servers on which security check tasks failed.
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
