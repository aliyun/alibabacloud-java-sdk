// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetGWApiGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public GetGWApiGroupResponseBodyData data;

    public static GetGWApiGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGWApiGroupResponseBody self = new GetGWApiGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGWApiGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGWApiGroupResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetGWApiGroupResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetGWApiGroupResponseBody setData(GetGWApiGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGWApiGroupResponseBodyData getData() {
        return this.data;
    }

    public static class GetGWApiGroupResponseBodyData extends TeaModel {
        @NameInMap("ApiCount")
        public Long apiCount;

        @NameInMap("ApiGroupId")
        public String apiGroupId;

        @NameInMap("AuthUserSwitch")
        public String authUserSwitch;

        @NameInMap("CanDelete")
        public Boolean canDelete;

        @NameInMap("CanOperate")
        public Boolean canOperate;

        @NameInMap("Description")
        public String description;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("NeedApiAuthUser")
        public Boolean needApiAuthUser;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static GetGWApiGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGWApiGroupResponseBodyData self = new GetGWApiGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGWApiGroupResponseBodyData setApiCount(Long apiCount) {
            this.apiCount = apiCount;
            return this;
        }
        public Long getApiCount() {
            return this.apiCount;
        }

        public GetGWApiGroupResponseBodyData setApiGroupId(String apiGroupId) {
            this.apiGroupId = apiGroupId;
            return this;
        }
        public String getApiGroupId() {
            return this.apiGroupId;
        }

        public GetGWApiGroupResponseBodyData setAuthUserSwitch(String authUserSwitch) {
            this.authUserSwitch = authUserSwitch;
            return this;
        }
        public String getAuthUserSwitch() {
            return this.authUserSwitch;
        }

        public GetGWApiGroupResponseBodyData setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public GetGWApiGroupResponseBodyData setCanOperate(Boolean canOperate) {
            this.canOperate = canOperate;
            return this;
        }
        public Boolean getCanOperate() {
            return this.canOperate;
        }

        public GetGWApiGroupResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetGWApiGroupResponseBodyData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public GetGWApiGroupResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetGWApiGroupResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetGWApiGroupResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetGWApiGroupResponseBodyData setNeedApiAuthUser(Boolean needApiAuthUser) {
            this.needApiAuthUser = needApiAuthUser;
            return this;
        }
        public Boolean getNeedApiAuthUser() {
            return this.needApiAuthUser;
        }

        public GetGWApiGroupResponseBodyData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetGWApiGroupResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetGWApiGroupResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
