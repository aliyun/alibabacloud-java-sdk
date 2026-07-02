// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListAgentsResponseBody extends TeaModel {
    /**
     * <p>The request ID, which can be used for end-to-end diagnostics.</p>
     * 
     * <strong>example:</strong>
     * <p>66EAED72-542B-583B-BCED-64433DC27AD7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status code.</p>
     * <ul>
     * <li>If code is Success, the authorization is successful.</li>
     * <li>Other status codes indicate authorization failed. Check the message field for the detailed fault information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public java.util.List<ListAgentsResponseBodyData> data;

    /**
     * <p>The error message.</p>
     * <ul>
     * <li>If code is Success, this field is empty.</li>
     * <li>Otherwise, this field contains the request error message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SysomOpenAPIAssumeRoleException: EntityNotExist.Role The role not exists: acs:ram::xxxxx:role/aliyunserviceroleforsysom</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListAgentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentsResponseBody self = new ListAgentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAgentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAgentsResponseBody setData(java.util.List<ListAgentsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAgentsResponseBodyData> getData() {
        return this.data;
    }

    public ListAgentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAgentsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListAgentsResponseBodyDataVersions extends TeaModel {
        /**
         * <p>The time when the component version was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-14T20:46:08</p>
         */
        @NameInMap("created_at")
        public String createdAt;

        /**
         * <p>The installation script of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>sysom.sh install</p>
         */
        @NameInMap("install_script")
        public String installScript;

        /**
         * <p>The uninstallation script of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>sysom.sh uninstall</p>
         */
        @NameInMap("uninstall_script")
        public String uninstallScript;

        /**
         * <p>The time when the component version was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-14T20:46:08</p>
         */
        @NameInMap("updated_at")
        public String updatedAt;

        /**
         * <p>The update script of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>sysom.sh upgrade</p>
         */
        @NameInMap("upgrade_script")
        public String upgradeScript;

        /**
         * <p>The component version number.</p>
         * 
         * <strong>example:</strong>
         * <p>3.4.0-1</p>
         */
        @NameInMap("version")
        public String version;

        public static ListAgentsResponseBodyDataVersions build(java.util.Map<String, ?> map) throws Exception {
            ListAgentsResponseBodyDataVersions self = new ListAgentsResponseBodyDataVersions();
            return TeaModel.build(map, self);
        }

        public ListAgentsResponseBodyDataVersions setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListAgentsResponseBodyDataVersions setInstallScript(String installScript) {
            this.installScript = installScript;
            return this;
        }
        public String getInstallScript() {
            return this.installScript;
        }

        public ListAgentsResponseBodyDataVersions setUninstallScript(String uninstallScript) {
            this.uninstallScript = uninstallScript;
            return this;
        }
        public String getUninstallScript() {
            return this.uninstallScript;
        }

        public ListAgentsResponseBodyDataVersions setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListAgentsResponseBodyDataVersions setUpgradeScript(String upgradeScript) {
            this.upgradeScript = upgradeScript;
            return this;
        }
        public String getUpgradeScript() {
            return this.upgradeScript;
        }

        public ListAgentsResponseBodyDataVersions setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListAgentsResponseBodyData extends TeaModel {
        /**
         * <p>The time when the component was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-14T20:46:08</p>
         */
        @NameInMap("created_at")
        public String createdAt;

        /**
         * <p>The component description.</p>
         * 
         * <strong>example:</strong>
         * <p>SysOM Agent</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The component ID.</p>
         * 
         * <strong>example:</strong>
         * <p>74a86327-3170-412c-8e67-da3389ec56a9</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The component name.</p>
         * 
         * <strong>example:</strong>
         * <p>SysOM Agent</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The supported architectures. Multiple architectures are separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>x86</p>
         */
        @NameInMap("support_arch")
        public String supportArch;

        /**
         * <p>The type of the component. Valid values:</p>
         * <ul>
         * <li>Control: control-type component.</li>
         * <li>AI: AI component.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Control</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The time when the component was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-14T20:46:08</p>
         */
        @NameInMap("updated_at")
        public String updatedAt;

        /**
         * <p>The list of component versions.</p>
         */
        @NameInMap("versions")
        public java.util.List<ListAgentsResponseBodyDataVersions> versions;

        public static ListAgentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAgentsResponseBodyData self = new ListAgentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAgentsResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListAgentsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAgentsResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAgentsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAgentsResponseBodyData setSupportArch(String supportArch) {
            this.supportArch = supportArch;
            return this;
        }
        public String getSupportArch() {
            return this.supportArch;
        }

        public ListAgentsResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAgentsResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListAgentsResponseBodyData setVersions(java.util.List<ListAgentsResponseBodyDataVersions> versions) {
            this.versions = versions;
            return this;
        }
        public java.util.List<ListAgentsResponseBodyDataVersions> getVersions() {
            return this.versions;
        }

    }

}
