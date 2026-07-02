// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetAgentResponseBody extends TeaModel {
    /**
     * <p>Request ID, which can be used for end-to-end diagnostics</p>
     * 
     * <strong>example:</strong>
     * <p>2024-09-14T20:46:08</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Status code</p>
     * <ul>
     * <li><code>code == Success</code> indicates the authorization is successful;</li>
     * <li>Other status codes indicate authorization failure. Check the <code>message</code> field for detailed error information when authorization fails;</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Response data.</p>
     */
    @NameInMap("data")
    public GetAgentResponseBodyData data;

    /**
     * <p>Error message</p>
     * <ul>
     * <li>If <code>code == Success</code>, this field is empty;</li>
     * <li>Otherwise, this field contains the request error message.</li>
     * </ul>
     * 
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
        /**
         * <p>Agent version creation time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-14T20:46:08</p>
         */
        @NameInMap("created_at")
        public String createdAt;

        /**
         * <p>Installation script for this agent version</p>
         * 
         * <strong>example:</strong>
         * <p>sysom.sh install</p>
         */
        @NameInMap("install_script")
        public String installScript;

        /**
         * <p>Uninstallation script for this agent version</p>
         * 
         * <strong>example:</strong>
         * <p>sysom.sh uninstall</p>
         */
        @NameInMap("uninstall_script")
        public String uninstallScript;

        /**
         * <p>Agent version update time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-14T20:46:08</p>
         */
        @NameInMap("updated_at")
        public String updatedAt;

        /**
         * <p>Upgrade script for this agent version</p>
         * 
         * <strong>example:</strong>
         * <p>sysom.sh upgrade</p>
         */
        @NameInMap("upgrade_script")
        public String upgradeScript;

        /**
         * <p>Agent version number</p>
         * 
         * <strong>example:</strong>
         * <p>3.4.0-1</p>
         */
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
        /**
         * <p>Agent creation time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-14T20:46:08</p>
         */
        @NameInMap("created_at")
        public String createdAt;

        /**
         * <p>Agent description</p>
         * 
         * <strong>example:</strong>
         * <p>SysOM Agent</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Agent ID</p>
         * 
         * <strong>example:</strong>
         * <p>74a86327-3170-412c-8e67-da3389ec56a9</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>Agent name</p>
         * 
         * <strong>example:</strong>
         * <p>SysOM</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Supported architectures</p>
         * 
         * <strong>example:</strong>
         * <p>x86</p>
         */
        @NameInMap("support_arch")
        public String supportArch;

        /**
         * <p>Agent type</p>
         * 
         * <strong>example:</strong>
         * <p>control</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>Update time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-14T20:46:08</p>
         */
        @NameInMap("updated_at")
        public String updatedAt;

        /**
         * <p>Agent version information</p>
         */
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
