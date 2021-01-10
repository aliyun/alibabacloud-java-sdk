// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeBahamutEnvinmultienvResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Result")
    public java.util.List<ExecLinkeBahamutEnvinmultienvResponseBodyResult> result;

    public static ExecLinkeBahamutEnvinmultienvResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeBahamutEnvinmultienvResponseBody self = new ExecLinkeBahamutEnvinmultienvResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecLinkeBahamutEnvinmultienvResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecLinkeBahamutEnvinmultienvResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExecLinkeBahamutEnvinmultienvResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ExecLinkeBahamutEnvinmultienvResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExecLinkeBahamutEnvinmultienvResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ExecLinkeBahamutEnvinmultienvResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecLinkeBahamutEnvinmultienvResponseBody setResult(java.util.List<ExecLinkeBahamutEnvinmultienvResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ExecLinkeBahamutEnvinmultienvResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ExecLinkeBahamutEnvinmultienvResponseBodyResultProdEnvReleaseInfo extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("Ticket")
        public String ticket;

        @NameInMap("EnvId")
        public String envId;

        @NameInMap("WorkspaceName")
        public String workspaceName;

        @NameInMap("Info")
        public String info;

        public static ExecLinkeBahamutEnvinmultienvResponseBodyResultProdEnvReleaseInfo build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeBahamutEnvinmultienvResponseBodyResultProdEnvReleaseInfo self = new ExecLinkeBahamutEnvinmultienvResponseBodyResultProdEnvReleaseInfo();
            return TeaModel.build(map, self);
        }

        public ExecLinkeBahamutEnvinmultienvResponseBodyResultProdEnvReleaseInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ExecLinkeBahamutEnvinmultienvResponseBodyResultProdEnvReleaseInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ExecLinkeBahamutEnvinmultienvResponseBodyResultProdEnvReleaseInfo setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ExecLinkeBahamutEnvinmultienvResponseBodyResultProdEnvReleaseInfo setTicket(String ticket) {
            this.ticket = ticket;
            return this;
        }
        public String getTicket() {
            return this.ticket;
        }

        public ExecLinkeBahamutEnvinmultienvResponseBodyResultProdEnvReleaseInfo setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public ExecLinkeBahamutEnvinmultienvResponseBodyResultProdEnvReleaseInfo setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        public ExecLinkeBahamutEnvinmultienvResponseBodyResultProdEnvReleaseInfo setInfo(String info) {
            this.info = info;
            return this;
        }
        public String getInfo() {
            return this.info;
        }

    }

    public static class ExecLinkeBahamutEnvinmultienvResponseBodyResultPreEnvReleaseInfo extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("Ticket")
        public String ticket;

        @NameInMap("EnvId")
        public String envId;

        @NameInMap("WorkspaceName")
        public String workspaceName;

        @NameInMap("Info")
        public String info;

        public static ExecLinkeBahamutEnvinmultienvResponseBodyResultPreEnvReleaseInfo build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeBahamutEnvinmultienvResponseBodyResultPreEnvReleaseInfo self = new ExecLinkeBahamutEnvinmultienvResponseBodyResultPreEnvReleaseInfo();
            return TeaModel.build(map, self);
        }

        public ExecLinkeBahamutEnvinmultienvResponseBodyResultPreEnvReleaseInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ExecLinkeBahamutEnvinmultienvResponseBodyResultPreEnvReleaseInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ExecLinkeBahamutEnvinmultienvResponseBodyResultPreEnvReleaseInfo setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ExecLinkeBahamutEnvinmultienvResponseBodyResultPreEnvReleaseInfo setTicket(String ticket) {
            this.ticket = ticket;
            return this;
        }
        public String getTicket() {
            return this.ticket;
        }

        public ExecLinkeBahamutEnvinmultienvResponseBodyResultPreEnvReleaseInfo setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public ExecLinkeBahamutEnvinmultienvResponseBodyResultPreEnvReleaseInfo setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        public ExecLinkeBahamutEnvinmultienvResponseBodyResultPreEnvReleaseInfo setInfo(String info) {
            this.info = info;
            return this;
        }
        public String getInfo() {
            return this.info;
        }

    }

    public static class ExecLinkeBahamutEnvinmultienvResponseBodyResult extends TeaModel {
        @NameInMap("CloudTenantId")
        public String cloudTenantId;

        @NameInMap("CloudTenantName")
        public String cloudTenantName;

        @NameInMap("ProdEnvReleaseInfo")
        public ExecLinkeBahamutEnvinmultienvResponseBodyResultProdEnvReleaseInfo prodEnvReleaseInfo;

        @NameInMap("PreEnvReleaseInfo")
        public ExecLinkeBahamutEnvinmultienvResponseBodyResultPreEnvReleaseInfo preEnvReleaseInfo;

        public static ExecLinkeBahamutEnvinmultienvResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeBahamutEnvinmultienvResponseBodyResult self = new ExecLinkeBahamutEnvinmultienvResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ExecLinkeBahamutEnvinmultienvResponseBodyResult setCloudTenantId(String cloudTenantId) {
            this.cloudTenantId = cloudTenantId;
            return this;
        }
        public String getCloudTenantId() {
            return this.cloudTenantId;
        }

        public ExecLinkeBahamutEnvinmultienvResponseBodyResult setCloudTenantName(String cloudTenantName) {
            this.cloudTenantName = cloudTenantName;
            return this;
        }
        public String getCloudTenantName() {
            return this.cloudTenantName;
        }

        public ExecLinkeBahamutEnvinmultienvResponseBodyResult setProdEnvReleaseInfo(ExecLinkeBahamutEnvinmultienvResponseBodyResultProdEnvReleaseInfo prodEnvReleaseInfo) {
            this.prodEnvReleaseInfo = prodEnvReleaseInfo;
            return this;
        }
        public ExecLinkeBahamutEnvinmultienvResponseBodyResultProdEnvReleaseInfo getProdEnvReleaseInfo() {
            return this.prodEnvReleaseInfo;
        }

        public ExecLinkeBahamutEnvinmultienvResponseBodyResult setPreEnvReleaseInfo(ExecLinkeBahamutEnvinmultienvResponseBodyResultPreEnvReleaseInfo preEnvReleaseInfo) {
            this.preEnvReleaseInfo = preEnvReleaseInfo;
            return this;
        }
        public ExecLinkeBahamutEnvinmultienvResponseBodyResultPreEnvReleaseInfo getPreEnvReleaseInfo() {
            return this.preEnvReleaseInfo;
        }

    }

}
