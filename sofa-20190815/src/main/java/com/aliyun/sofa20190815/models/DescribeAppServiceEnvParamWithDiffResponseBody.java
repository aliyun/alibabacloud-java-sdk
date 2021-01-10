// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeAppServiceEnvParamWithDiffResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AppServiceEnvParamDiff")
    public java.util.List<DescribeAppServiceEnvParamWithDiffResponseBodyAppServiceEnvParamDiff> appServiceEnvParamDiff;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DescribeAppServiceEnvParamWithDiffResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppServiceEnvParamWithDiffResponseBody self = new DescribeAppServiceEnvParamWithDiffResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppServiceEnvParamWithDiffResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppServiceEnvParamWithDiffResponseBody setAppServiceEnvParamDiff(java.util.List<DescribeAppServiceEnvParamWithDiffResponseBodyAppServiceEnvParamDiff> appServiceEnvParamDiff) {
        this.appServiceEnvParamDiff = appServiceEnvParamDiff;
        return this;
    }
    public java.util.List<DescribeAppServiceEnvParamWithDiffResponseBodyAppServiceEnvParamDiff> getAppServiceEnvParamDiff() {
        return this.appServiceEnvParamDiff;
    }

    public DescribeAppServiceEnvParamWithDiffResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAppServiceEnvParamWithDiffResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class DescribeAppServiceEnvParamWithDiffResponseBodyAppServiceEnvParamDiff extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Key")
        public String key;

        @NameInMap("OriginalRequired")
        public Boolean originalRequired;

        @NameInMap("Status")
        public String status;

        @NameInMap("OriginalDefaultValue")
        public String originalDefaultValue;

        @NameInMap("OriginalDescription")
        public String originalDescription;

        @NameInMap("BaselineBuildpackId")
        public String baselineBuildpackId;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("Readonly")
        public Boolean readonly;

        @NameInMap("Value")
        public String value;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("Required")
        public Boolean required;

        @NameInMap("OriginalReadonly")
        public String originalReadonly;

        @NameInMap("Description")
        public String description;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppServiceId")
        public String appServiceId;

        @NameInMap("Id")
        public String id;

        public static DescribeAppServiceEnvParamWithDiffResponseBodyAppServiceEnvParamDiff build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppServiceEnvParamWithDiffResponseBodyAppServiceEnvParamDiff self = new DescribeAppServiceEnvParamWithDiffResponseBodyAppServiceEnvParamDiff();
            return TeaModel.build(map, self);
        }

        public DescribeAppServiceEnvParamWithDiffResponseBodyAppServiceEnvParamDiff setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeAppServiceEnvParamWithDiffResponseBodyAppServiceEnvParamDiff setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAppServiceEnvParamWithDiffResponseBodyAppServiceEnvParamDiff setOriginalRequired(Boolean originalRequired) {
            this.originalRequired = originalRequired;
            return this;
        }
        public Boolean getOriginalRequired() {
            return this.originalRequired;
        }

        public DescribeAppServiceEnvParamWithDiffResponseBodyAppServiceEnvParamDiff setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAppServiceEnvParamWithDiffResponseBodyAppServiceEnvParamDiff setOriginalDefaultValue(String originalDefaultValue) {
            this.originalDefaultValue = originalDefaultValue;
            return this;
        }
        public String getOriginalDefaultValue() {
            return this.originalDefaultValue;
        }

        public DescribeAppServiceEnvParamWithDiffResponseBodyAppServiceEnvParamDiff setOriginalDescription(String originalDescription) {
            this.originalDescription = originalDescription;
            return this;
        }
        public String getOriginalDescription() {
            return this.originalDescription;
        }

        public DescribeAppServiceEnvParamWithDiffResponseBodyAppServiceEnvParamDiff setBaselineBuildpackId(String baselineBuildpackId) {
            this.baselineBuildpackId = baselineBuildpackId;
            return this;
        }
        public String getBaselineBuildpackId() {
            return this.baselineBuildpackId;
        }

        public DescribeAppServiceEnvParamWithDiffResponseBodyAppServiceEnvParamDiff setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeAppServiceEnvParamWithDiffResponseBodyAppServiceEnvParamDiff setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public DescribeAppServiceEnvParamWithDiffResponseBodyAppServiceEnvParamDiff setReadonly(Boolean readonly) {
            this.readonly = readonly;
            return this;
        }
        public Boolean getReadonly() {
            return this.readonly;
        }

        public DescribeAppServiceEnvParamWithDiffResponseBodyAppServiceEnvParamDiff setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeAppServiceEnvParamWithDiffResponseBodyAppServiceEnvParamDiff setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public DescribeAppServiceEnvParamWithDiffResponseBodyAppServiceEnvParamDiff setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public DescribeAppServiceEnvParamWithDiffResponseBodyAppServiceEnvParamDiff setOriginalReadonly(String originalReadonly) {
            this.originalReadonly = originalReadonly;
            return this;
        }
        public String getOriginalReadonly() {
            return this.originalReadonly;
        }

        public DescribeAppServiceEnvParamWithDiffResponseBodyAppServiceEnvParamDiff setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAppServiceEnvParamWithDiffResponseBodyAppServiceEnvParamDiff setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeAppServiceEnvParamWithDiffResponseBodyAppServiceEnvParamDiff setAppServiceId(String appServiceId) {
            this.appServiceId = appServiceId;
            return this;
        }
        public String getAppServiceId() {
            return this.appServiceId;
        }

        public DescribeAppServiceEnvParamWithDiffResponseBodyAppServiceEnvParamDiff setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
