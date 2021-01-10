// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasBaselineNwapprovalprocessResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public CreateHasBaselineNwapprovalprocessResponseBodyResultContent resultContent;

    public static CreateHasBaselineNwapprovalprocessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHasBaselineNwapprovalprocessResponseBody self = new CreateHasBaselineNwapprovalprocessResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHasBaselineNwapprovalprocessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateHasBaselineNwapprovalprocessResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateHasBaselineNwapprovalprocessResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateHasBaselineNwapprovalprocessResponseBody setResultContent(CreateHasBaselineNwapprovalprocessResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public CreateHasBaselineNwapprovalprocessResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class CreateHasBaselineNwapprovalprocessResponseBodyResultContentDataNwApprovalSummitters extends TeaModel {
        @NameInMap("ProcessId")
        public String processId;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("RealName")
        public String realName;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("ApprovalType")
        public String approvalType;

        @NameInMap("Nickname")
        public String nickname;

        @NameInMap("WorkNo")
        public String workNo;

        @NameInMap("Id")
        public String id;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Creator")
        public String creator;

        public static CreateHasBaselineNwapprovalprocessResponseBodyResultContentDataNwApprovalSummitters build(java.util.Map<String, ?> map) throws Exception {
            CreateHasBaselineNwapprovalprocessResponseBodyResultContentDataNwApprovalSummitters self = new CreateHasBaselineNwapprovalprocessResponseBodyResultContentDataNwApprovalSummitters();
            return TeaModel.build(map, self);
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentDataNwApprovalSummitters setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentDataNwApprovalSummitters setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentDataNwApprovalSummitters setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentDataNwApprovalSummitters setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentDataNwApprovalSummitters setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentDataNwApprovalSummitters setApprovalType(String approvalType) {
            this.approvalType = approvalType;
            return this;
        }
        public String getApprovalType() {
            return this.approvalType;
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentDataNwApprovalSummitters setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentDataNwApprovalSummitters setWorkNo(String workNo) {
            this.workNo = workNo;
            return this;
        }
        public String getWorkNo() {
            return this.workNo;
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentDataNwApprovalSummitters setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentDataNwApprovalSummitters setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentDataNwApprovalSummitters setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

    }

    public static class CreateHasBaselineNwapprovalprocessResponseBodyResultContentData extends TeaModel {
        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("ApprovalNodes")
        public String approvalNodes;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("ApprovalType")
        public String approvalType;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        @NameInMap("DefaultProcess")
        public Boolean defaultProcess;

        @NameInMap("NwApprovalSummitters")
        public java.util.List<CreateHasBaselineNwapprovalprocessResponseBodyResultContentDataNwApprovalSummitters> nwApprovalSummitters;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Creator")
        public String creator;

        public static CreateHasBaselineNwapprovalprocessResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            CreateHasBaselineNwapprovalprocessResponseBodyResultContentData self = new CreateHasBaselineNwapprovalprocessResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentData setApprovalNodes(String approvalNodes) {
            this.approvalNodes = approvalNodes;
            return this;
        }
        public String getApprovalNodes() {
            return this.approvalNodes;
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentData setApprovalType(String approvalType) {
            this.approvalType = approvalType;
            return this;
        }
        public String getApprovalType() {
            return this.approvalType;
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentData setDefaultProcess(Boolean defaultProcess) {
            this.defaultProcess = defaultProcess;
            return this;
        }
        public Boolean getDefaultProcess() {
            return this.defaultProcess;
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentData setNwApprovalSummitters(java.util.List<CreateHasBaselineNwapprovalprocessResponseBodyResultContentDataNwApprovalSummitters> nwApprovalSummitters) {
            this.nwApprovalSummitters = nwApprovalSummitters;
            return this;
        }
        public java.util.List<CreateHasBaselineNwapprovalprocessResponseBodyResultContentDataNwApprovalSummitters> getNwApprovalSummitters() {
            return this.nwApprovalSummitters;
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

    }

    public static class CreateHasBaselineNwapprovalprocessResponseBodyResultContentTopErrorCode extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("ExceptionCode")
        public String exceptionCode;

        @NameInMap("Version")
        public String version;

        @NameInMap("ExceptionCodeDescription")
        public String exceptionCodeDescription;

        @NameInMap("Prefix")
        public String prefix;

        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("Level")
        public String level;

        @NameInMap("Scene")
        public String scene;

        public static CreateHasBaselineNwapprovalprocessResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            CreateHasBaselineNwapprovalprocessResponseBodyResultContentTopErrorCode self = new CreateHasBaselineNwapprovalprocessResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class CreateHasBaselineNwapprovalprocessResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static CreateHasBaselineNwapprovalprocessResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            CreateHasBaselineNwapprovalprocessResponseBodyResultContentTopErrorReason self = new CreateHasBaselineNwapprovalprocessResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class CreateHasBaselineNwapprovalprocessResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentData data;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("TopErrorReason")
        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentTopErrorReason topErrorReason;

        public static CreateHasBaselineNwapprovalprocessResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            CreateHasBaselineNwapprovalprocessResponseBodyResultContent self = new CreateHasBaselineNwapprovalprocessResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContent setData(CreateHasBaselineNwapprovalprocessResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentData getData() {
            return this.data;
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContent setTopErrorCode(CreateHasBaselineNwapprovalprocessResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateHasBaselineNwapprovalprocessResponseBodyResultContent setTopErrorReason(CreateHasBaselineNwapprovalprocessResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public CreateHasBaselineNwapprovalprocessResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
