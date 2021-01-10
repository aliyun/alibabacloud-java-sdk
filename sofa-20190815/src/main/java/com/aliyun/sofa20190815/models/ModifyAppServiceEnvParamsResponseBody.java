// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ModifyAppServiceEnvParamsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("AppServiceEnvParam")
    public java.util.List<ModifyAppServiceEnvParamsResponseBodyAppServiceEnvParam> appServiceEnvParam;

    public static ModifyAppServiceEnvParamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppServiceEnvParamsResponseBody self = new ModifyAppServiceEnvParamsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAppServiceEnvParamsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyAppServiceEnvParamsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ModifyAppServiceEnvParamsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ModifyAppServiceEnvParamsResponseBody setAppServiceEnvParam(java.util.List<ModifyAppServiceEnvParamsResponseBodyAppServiceEnvParam> appServiceEnvParam) {
        this.appServiceEnvParam = appServiceEnvParam;
        return this;
    }
    public java.util.List<ModifyAppServiceEnvParamsResponseBodyAppServiceEnvParam> getAppServiceEnvParam() {
        return this.appServiceEnvParam;
    }

    public static class ModifyAppServiceEnvParamsResponseBodyAppServiceEnvParam extends TeaModel {
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

        public static ModifyAppServiceEnvParamsResponseBodyAppServiceEnvParam build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppServiceEnvParamsResponseBodyAppServiceEnvParam self = new ModifyAppServiceEnvParamsResponseBodyAppServiceEnvParam();
            return TeaModel.build(map, self);
        }

        public ModifyAppServiceEnvParamsResponseBodyAppServiceEnvParam setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ModifyAppServiceEnvParamsResponseBodyAppServiceEnvParam setAppServiceId(String appServiceId) {
            this.appServiceId = appServiceId;
            return this;
        }
        public String getAppServiceId() {
            return this.appServiceId;
        }

        public ModifyAppServiceEnvParamsResponseBodyAppServiceEnvParam setBaselineBuildpackId(String baselineBuildpackId) {
            this.baselineBuildpackId = baselineBuildpackId;
            return this;
        }
        public String getBaselineBuildpackId() {
            return this.baselineBuildpackId;
        }

        public ModifyAppServiceEnvParamsResponseBodyAppServiceEnvParam setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ModifyAppServiceEnvParamsResponseBodyAppServiceEnvParam setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ModifyAppServiceEnvParamsResponseBodyAppServiceEnvParam setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyAppServiceEnvParamsResponseBodyAppServiceEnvParam setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ModifyAppServiceEnvParamsResponseBodyAppServiceEnvParam setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifyAppServiceEnvParamsResponseBodyAppServiceEnvParam setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public ModifyAppServiceEnvParamsResponseBodyAppServiceEnvParam setOriginalDefaultValue(String originalDefaultValue) {
            this.originalDefaultValue = originalDefaultValue;
            return this;
        }
        public String getOriginalDefaultValue() {
            return this.originalDefaultValue;
        }

        public ModifyAppServiceEnvParamsResponseBodyAppServiceEnvParam setOriginalDescription(String originalDescription) {
            this.originalDescription = originalDescription;
            return this;
        }
        public String getOriginalDescription() {
            return this.originalDescription;
        }

        public ModifyAppServiceEnvParamsResponseBodyAppServiceEnvParam setOriginalReadonly(String originalReadonly) {
            this.originalReadonly = originalReadonly;
            return this;
        }
        public String getOriginalReadonly() {
            return this.originalReadonly;
        }

        public ModifyAppServiceEnvParamsResponseBodyAppServiceEnvParam setOriginalRequired(Boolean originalRequired) {
            this.originalRequired = originalRequired;
            return this;
        }
        public Boolean getOriginalRequired() {
            return this.originalRequired;
        }

        public ModifyAppServiceEnvParamsResponseBodyAppServiceEnvParam setReadonly(Boolean readonly) {
            this.readonly = readonly;
            return this;
        }
        public Boolean getReadonly() {
            return this.readonly;
        }

        public ModifyAppServiceEnvParamsResponseBodyAppServiceEnvParam setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public ModifyAppServiceEnvParamsResponseBodyAppServiceEnvParam setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ModifyAppServiceEnvParamsResponseBodyAppServiceEnvParam setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ModifyAppServiceEnvParamsResponseBodyAppServiceEnvParam setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
