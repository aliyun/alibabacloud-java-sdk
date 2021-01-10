// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetGWApiGroupAuthUserConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public GetGWApiGroupAuthUserConfigResponseBodyData data;

    public static GetGWApiGroupAuthUserConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGWApiGroupAuthUserConfigResponseBody self = new GetGWApiGroupAuthUserConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGWApiGroupAuthUserConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGWApiGroupAuthUserConfigResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetGWApiGroupAuthUserConfigResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetGWApiGroupAuthUserConfigResponseBody setData(GetGWApiGroupAuthUserConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGWApiGroupAuthUserConfigResponseBodyData getData() {
        return this.data;
    }

    public static class GetGWApiGroupAuthUserConfigResponseBodyData extends TeaModel {
        @NameInMap("ApiAuthUserSwitch")
        public String apiAuthUserSwitch;

        @NameInMap("CheckMaster")
        public Boolean checkMaster;

        @NameInMap("NeedApiAuthUser")
        public Boolean needApiAuthUser;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static GetGWApiGroupAuthUserConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGWApiGroupAuthUserConfigResponseBodyData self = new GetGWApiGroupAuthUserConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGWApiGroupAuthUserConfigResponseBodyData setApiAuthUserSwitch(String apiAuthUserSwitch) {
            this.apiAuthUserSwitch = apiAuthUserSwitch;
            return this;
        }
        public String getApiAuthUserSwitch() {
            return this.apiAuthUserSwitch;
        }

        public GetGWApiGroupAuthUserConfigResponseBodyData setCheckMaster(Boolean checkMaster) {
            this.checkMaster = checkMaster;
            return this;
        }
        public Boolean getCheckMaster() {
            return this.checkMaster;
        }

        public GetGWApiGroupAuthUserConfigResponseBodyData setNeedApiAuthUser(Boolean needApiAuthUser) {
            this.needApiAuthUser = needApiAuthUser;
            return this;
        }
        public Boolean getNeedApiAuthUser() {
            return this.needApiAuthUser;
        }

        public GetGWApiGroupAuthUserConfigResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetGWApiGroupAuthUserConfigResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
