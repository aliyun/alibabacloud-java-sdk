// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMsGuardianAppsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("GuardianApp")
    public GetMsGuardianAppsResponseBodyGuardianApp guardianApp;

    public static GetMsGuardianAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMsGuardianAppsResponseBody self = new GetMsGuardianAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMsGuardianAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMsGuardianAppsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetMsGuardianAppsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetMsGuardianAppsResponseBody setGuardianApp(GetMsGuardianAppsResponseBodyGuardianApp guardianApp) {
        this.guardianApp = guardianApp;
        return this;
    }
    public GetMsGuardianAppsResponseBodyGuardianApp getGuardianApp() {
        return this.guardianApp;
    }

    public static class GetMsGuardianAppsResponseBodyGuardianApp extends TeaModel {
        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("RunMode")
        public String runMode;

        public static GetMsGuardianAppsResponseBodyGuardianApp build(java.util.Map<String, ?> map) throws Exception {
            GetMsGuardianAppsResponseBodyGuardianApp self = new GetMsGuardianAppsResponseBodyGuardianApp();
            return TeaModel.build(map, self);
        }

        public GetMsGuardianAppsResponseBodyGuardianApp setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetMsGuardianAppsResponseBodyGuardianApp setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetMsGuardianAppsResponseBodyGuardianApp setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetMsGuardianAppsResponseBodyGuardianApp setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMsGuardianAppsResponseBodyGuardianApp setRunMode(String runMode) {
            this.runMode = runMode;
            return this;
        }
        public String getRunMode() {
            return this.runMode;
        }

    }

}
