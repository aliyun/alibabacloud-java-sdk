// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AllMsGuardianAppsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("GuardianApps")
    public java.util.List<AllMsGuardianAppsResponseBodyGuardianApps> guardianApps;

    @NameInMap("ResultCode")
    public String resultCode;

    public static AllMsGuardianAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllMsGuardianAppsResponseBody self = new AllMsGuardianAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public AllMsGuardianAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AllMsGuardianAppsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AllMsGuardianAppsResponseBody setGuardianApps(java.util.List<AllMsGuardianAppsResponseBodyGuardianApps> guardianApps) {
        this.guardianApps = guardianApps;
        return this;
    }
    public java.util.List<AllMsGuardianAppsResponseBodyGuardianApps> getGuardianApps() {
        return this.guardianApps;
    }

    public AllMsGuardianAppsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class AllMsGuardianAppsResponseBodyGuardianApps extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RunMode")
        public String runMode;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Enable")
        public Boolean enable;

        public static AllMsGuardianAppsResponseBodyGuardianApps build(java.util.Map<String, ?> map) throws Exception {
            AllMsGuardianAppsResponseBodyGuardianApps self = new AllMsGuardianAppsResponseBodyGuardianApps();
            return TeaModel.build(map, self);
        }

        public AllMsGuardianAppsResponseBodyGuardianApps setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AllMsGuardianAppsResponseBodyGuardianApps setRunMode(String runMode) {
            this.runMode = runMode;
            return this;
        }
        public String getRunMode() {
            return this.runMode;
        }

        public AllMsGuardianAppsResponseBodyGuardianApps setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AllMsGuardianAppsResponseBodyGuardianApps setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public AllMsGuardianAppsResponseBodyGuardianApps setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

}
