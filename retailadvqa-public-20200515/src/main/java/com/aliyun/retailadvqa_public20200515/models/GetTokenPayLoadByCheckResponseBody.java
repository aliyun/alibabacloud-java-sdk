// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class GetTokenPayLoadByCheckResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetTokenPayLoadByCheckResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorDesc")
    public String errorDesc;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceId")
    public String traceId;

    public static GetTokenPayLoadByCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTokenPayLoadByCheckResponseBody self = new GetTokenPayLoadByCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTokenPayLoadByCheckResponseBody setData(GetTokenPayLoadByCheckResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTokenPayLoadByCheckResponseBodyData getData() {
        return this.data;
    }

    public GetTokenPayLoadByCheckResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetTokenPayLoadByCheckResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public GetTokenPayLoadByCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTokenPayLoadByCheckResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTokenPayLoadByCheckResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class GetTokenPayLoadByCheckResponseBodyDataWorkspaces extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("RoleId")
        public String roleId;

        public static GetTokenPayLoadByCheckResponseBodyDataWorkspaces build(java.util.Map<String, ?> map) throws Exception {
            GetTokenPayLoadByCheckResponseBodyDataWorkspaces self = new GetTokenPayLoadByCheckResponseBodyDataWorkspaces();
            return TeaModel.build(map, self);
        }

        public GetTokenPayLoadByCheckResponseBodyDataWorkspaces setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetTokenPayLoadByCheckResponseBodyDataWorkspaces setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTokenPayLoadByCheckResponseBodyDataWorkspaces setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

    }

    public static class GetTokenPayLoadByCheckResponseBodyData extends TeaModel {
        @NameInMap("Aud")
        public String aud;

        @NameInMap("AudName")
        public String audName;

        @NameInMap("DbRegion")
        public String dbRegion;

        @NameInMap("Language")
        public String language;

        @NameInMap("MainAccount")
        public String mainAccount;

        @NameInMap("MainAccountUid")
        public String mainAccountUid;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("PurchasePackage")
        public String purchasePackage;

        @NameInMap("PurchasePackageQuota")
        public String purchasePackageQuota;

        @NameInMap("Role")
        public String role;

        @NameInMap("RoleSign")
        public String roleSign;

        @NameInMap("TenantRegion")
        public String tenantRegion;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("Workspaces")
        public java.util.List<GetTokenPayLoadByCheckResponseBodyDataWorkspaces> workspaces;

        public static GetTokenPayLoadByCheckResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTokenPayLoadByCheckResponseBodyData self = new GetTokenPayLoadByCheckResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTokenPayLoadByCheckResponseBodyData setAud(String aud) {
            this.aud = aud;
            return this;
        }
        public String getAud() {
            return this.aud;
        }

        public GetTokenPayLoadByCheckResponseBodyData setAudName(String audName) {
            this.audName = audName;
            return this;
        }
        public String getAudName() {
            return this.audName;
        }

        public GetTokenPayLoadByCheckResponseBodyData setDbRegion(String dbRegion) {
            this.dbRegion = dbRegion;
            return this;
        }
        public String getDbRegion() {
            return this.dbRegion;
        }

        public GetTokenPayLoadByCheckResponseBodyData setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public GetTokenPayLoadByCheckResponseBodyData setMainAccount(String mainAccount) {
            this.mainAccount = mainAccount;
            return this;
        }
        public String getMainAccount() {
            return this.mainAccount;
        }

        public GetTokenPayLoadByCheckResponseBodyData setMainAccountUid(String mainAccountUid) {
            this.mainAccountUid = mainAccountUid;
            return this;
        }
        public String getMainAccountUid() {
            return this.mainAccountUid;
        }

        public GetTokenPayLoadByCheckResponseBodyData setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetTokenPayLoadByCheckResponseBodyData setPurchasePackage(String purchasePackage) {
            this.purchasePackage = purchasePackage;
            return this;
        }
        public String getPurchasePackage() {
            return this.purchasePackage;
        }

        public GetTokenPayLoadByCheckResponseBodyData setPurchasePackageQuota(String purchasePackageQuota) {
            this.purchasePackageQuota = purchasePackageQuota;
            return this;
        }
        public String getPurchasePackageQuota() {
            return this.purchasePackageQuota;
        }

        public GetTokenPayLoadByCheckResponseBodyData setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetTokenPayLoadByCheckResponseBodyData setRoleSign(String roleSign) {
            this.roleSign = roleSign;
            return this;
        }
        public String getRoleSign() {
            return this.roleSign;
        }

        public GetTokenPayLoadByCheckResponseBodyData setTenantRegion(String tenantRegion) {
            this.tenantRegion = tenantRegion;
            return this;
        }
        public String getTenantRegion() {
            return this.tenantRegion;
        }

        public GetTokenPayLoadByCheckResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetTokenPayLoadByCheckResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public GetTokenPayLoadByCheckResponseBodyData setWorkspaces(java.util.List<GetTokenPayLoadByCheckResponseBodyDataWorkspaces> workspaces) {
            this.workspaces = workspaces;
            return this;
        }
        public java.util.List<GetTokenPayLoadByCheckResponseBodyDataWorkspaces> getWorkspaces() {
            return this.workspaces;
        }

    }

}
