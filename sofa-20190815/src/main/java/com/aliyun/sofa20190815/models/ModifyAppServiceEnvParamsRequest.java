// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ModifyAppServiceEnvParamsRequest extends TeaModel {
    @NameInMap("AppServiceId")
    public String appServiceId;

    @NameInMap("BuildpackId")
    public String buildpackId;

    @NameInMap("Params")
    public java.util.List<ModifyAppServiceEnvParamsRequestParams> params;

    public static ModifyAppServiceEnvParamsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppServiceEnvParamsRequest self = new ModifyAppServiceEnvParamsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppServiceEnvParamsRequest setAppServiceId(String appServiceId) {
        this.appServiceId = appServiceId;
        return this;
    }
    public String getAppServiceId() {
        return this.appServiceId;
    }

    public ModifyAppServiceEnvParamsRequest setBuildpackId(String buildpackId) {
        this.buildpackId = buildpackId;
        return this;
    }
    public String getBuildpackId() {
        return this.buildpackId;
    }

    public ModifyAppServiceEnvParamsRequest setParams(java.util.List<ModifyAppServiceEnvParamsRequestParams> params) {
        this.params = params;
        return this;
    }
    public java.util.List<ModifyAppServiceEnvParamsRequestParams> getParams() {
        return this.params;
    }

    public static class ModifyAppServiceEnvParamsRequestParams extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppServiceId")
        public String appServiceId;

        @NameInMap("BaselineBuildpackId")
        public String baselineBuildpackId;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("Key")
        public String key;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("OriginalDefaultValue")
        public String originalDefaultValue;

        @NameInMap("OriginalDescription")
        public String originalDescription;

        @NameInMap("OriginalReadonly")
        public String originalReadonly;

        @NameInMap("OriginalRequired")
        public Boolean originalRequired;

        @NameInMap("Readonly")
        public Boolean readonly;

        @NameInMap("Required")
        public Boolean required;

        @NameInMap("Status")
        public String status;

        @NameInMap("Value")
        public String value;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ModifyAppServiceEnvParamsRequestParams build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppServiceEnvParamsRequestParams self = new ModifyAppServiceEnvParamsRequestParams();
            return TeaModel.build(map, self);
        }

        public ModifyAppServiceEnvParamsRequestParams setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ModifyAppServiceEnvParamsRequestParams setAppServiceId(String appServiceId) {
            this.appServiceId = appServiceId;
            return this;
        }
        public String getAppServiceId() {
            return this.appServiceId;
        }

        public ModifyAppServiceEnvParamsRequestParams setBaselineBuildpackId(String baselineBuildpackId) {
            this.baselineBuildpackId = baselineBuildpackId;
            return this;
        }
        public String getBaselineBuildpackId() {
            return this.baselineBuildpackId;
        }

        public ModifyAppServiceEnvParamsRequestParams setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ModifyAppServiceEnvParamsRequestParams setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ModifyAppServiceEnvParamsRequestParams setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyAppServiceEnvParamsRequestParams setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ModifyAppServiceEnvParamsRequestParams setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifyAppServiceEnvParamsRequestParams setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public ModifyAppServiceEnvParamsRequestParams setOriginalDefaultValue(String originalDefaultValue) {
            this.originalDefaultValue = originalDefaultValue;
            return this;
        }
        public String getOriginalDefaultValue() {
            return this.originalDefaultValue;
        }

        public ModifyAppServiceEnvParamsRequestParams setOriginalDescription(String originalDescription) {
            this.originalDescription = originalDescription;
            return this;
        }
        public String getOriginalDescription() {
            return this.originalDescription;
        }

        public ModifyAppServiceEnvParamsRequestParams setOriginalReadonly(String originalReadonly) {
            this.originalReadonly = originalReadonly;
            return this;
        }
        public String getOriginalReadonly() {
            return this.originalReadonly;
        }

        public ModifyAppServiceEnvParamsRequestParams setOriginalRequired(Boolean originalRequired) {
            this.originalRequired = originalRequired;
            return this;
        }
        public Boolean getOriginalRequired() {
            return this.originalRequired;
        }

        public ModifyAppServiceEnvParamsRequestParams setReadonly(Boolean readonly) {
            this.readonly = readonly;
            return this;
        }
        public Boolean getReadonly() {
            return this.readonly;
        }

        public ModifyAppServiceEnvParamsRequestParams setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public ModifyAppServiceEnvParamsRequestParams setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ModifyAppServiceEnvParamsRequestParams setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ModifyAppServiceEnvParamsRequestParams setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
