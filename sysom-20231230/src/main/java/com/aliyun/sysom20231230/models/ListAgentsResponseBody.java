// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListAgentsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ListAgentsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>SysomOpenAPIAssumeRoleException: EntityNotExist.Role The role not exists: acs:ram::xxxxx:role/aliyunserviceroleforsysom</p>
     */
    @NameInMap("message")
    public String message;

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
        @NameInMap("created_at")
        public String createdAt;

        @NameInMap("description")
        public String description;

        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>SysOM Agent</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>x86</p>
         */
        @NameInMap("support_arch")
        public String supportArch;

        /**
         * <strong>example:</strong>
         * <p>Control</p>
         */
        @NameInMap("type")
        public String type;

        @NameInMap("updated_at")
        public String updatedAt;

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
