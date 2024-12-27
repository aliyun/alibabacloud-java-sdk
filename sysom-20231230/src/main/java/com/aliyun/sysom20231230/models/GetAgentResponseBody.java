// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetAgentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetAgentResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>SysomOpenAPIException: SysomOpenAPI.InvalidParameter Invalid params, should be json string or dict</p>
     */
    @NameInMap("message")
    public String message;

    public static GetAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentResponseBody self = new GetAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgentResponseBody setData(GetAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentResponseBodyData getData() {
        return this.data;
    }

    public GetAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class GetAgentResponseBodyDataVersions extends TeaModel {
        @NameInMap("created_at")
        public String createdAt;

        @NameInMap("install_script")
        public String installScript;

        @NameInMap("uninstall_script")
        public String uninstallScript;

        @NameInMap("updated_at")
        public String updatedAt;

        @NameInMap("upgrade_script")
        public String upgradeScript;

        @NameInMap("version")
        public String version;

        public static GetAgentResponseBodyDataVersions build(java.util.Map<String, ?> map) throws Exception {
            GetAgentResponseBodyDataVersions self = new GetAgentResponseBodyDataVersions();
            return TeaModel.build(map, self);
        }

        public GetAgentResponseBodyDataVersions setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetAgentResponseBodyDataVersions setInstallScript(String installScript) {
            this.installScript = installScript;
            return this;
        }
        public String getInstallScript() {
            return this.installScript;
        }

        public GetAgentResponseBodyDataVersions setUninstallScript(String uninstallScript) {
            this.uninstallScript = uninstallScript;
            return this;
        }
        public String getUninstallScript() {
            return this.uninstallScript;
        }

        public GetAgentResponseBodyDataVersions setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public GetAgentResponseBodyDataVersions setUpgradeScript(String upgradeScript) {
            this.upgradeScript = upgradeScript;
            return this;
        }
        public String getUpgradeScript() {
            return this.upgradeScript;
        }

        public GetAgentResponseBodyDataVersions setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetAgentResponseBodyData extends TeaModel {
        @NameInMap("created_at")
        public String createdAt;

        @NameInMap("description")
        public String description;

        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        @NameInMap("support_arch")
        public String supportArch;

        @NameInMap("type")
        public String type;

        @NameInMap("updated_at")
        public String updatedAt;

        @NameInMap("versions")
        public java.util.List<GetAgentResponseBodyDataVersions> versions;

        public static GetAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentResponseBodyData self = new GetAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetAgentResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAgentResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetAgentResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAgentResponseBodyData setSupportArch(String supportArch) {
            this.supportArch = supportArch;
            return this;
        }
        public String getSupportArch() {
            return this.supportArch;
        }

        public GetAgentResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetAgentResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public GetAgentResponseBodyData setVersions(java.util.List<GetAgentResponseBodyDataVersions> versions) {
            this.versions = versions;
            return this;
        }
        public java.util.List<GetAgentResponseBodyDataVersions> getVersions() {
            return this.versions;
        }

    }

}
