// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeAppServiceEnvParamResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("AppServiceEnvParams")
    public java.util.List<DescribeAppServiceEnvParamResponseBodyAppServiceEnvParams> appServiceEnvParams;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DescribeAppServiceEnvParamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppServiceEnvParamResponseBody self = new DescribeAppServiceEnvParamResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppServiceEnvParamResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeAppServiceEnvParamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppServiceEnvParamResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeAppServiceEnvParamResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAppServiceEnvParamResponseBody setAppServiceEnvParams(java.util.List<DescribeAppServiceEnvParamResponseBodyAppServiceEnvParams> appServiceEnvParams) {
        this.appServiceEnvParams = appServiceEnvParams;
        return this;
    }
    public java.util.List<DescribeAppServiceEnvParamResponseBodyAppServiceEnvParams> getAppServiceEnvParams() {
        return this.appServiceEnvParams;
    }

    public DescribeAppServiceEnvParamResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAppServiceEnvParamResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class DescribeAppServiceEnvParamResponseBodyAppServiceEnvParams extends TeaModel {
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

        public static DescribeAppServiceEnvParamResponseBodyAppServiceEnvParams build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppServiceEnvParamResponseBodyAppServiceEnvParams self = new DescribeAppServiceEnvParamResponseBodyAppServiceEnvParams();
            return TeaModel.build(map, self);
        }

        public DescribeAppServiceEnvParamResponseBodyAppServiceEnvParams setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeAppServiceEnvParamResponseBodyAppServiceEnvParams setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAppServiceEnvParamResponseBodyAppServiceEnvParams setOriginalRequired(Boolean originalRequired) {
            this.originalRequired = originalRequired;
            return this;
        }
        public Boolean getOriginalRequired() {
            return this.originalRequired;
        }

        public DescribeAppServiceEnvParamResponseBodyAppServiceEnvParams setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAppServiceEnvParamResponseBodyAppServiceEnvParams setOriginalDefaultValue(String originalDefaultValue) {
            this.originalDefaultValue = originalDefaultValue;
            return this;
        }
        public String getOriginalDefaultValue() {
            return this.originalDefaultValue;
        }

        public DescribeAppServiceEnvParamResponseBodyAppServiceEnvParams setOriginalDescription(String originalDescription) {
            this.originalDescription = originalDescription;
            return this;
        }
        public String getOriginalDescription() {
            return this.originalDescription;
        }

        public DescribeAppServiceEnvParamResponseBodyAppServiceEnvParams setBaselineBuildpackId(String baselineBuildpackId) {
            this.baselineBuildpackId = baselineBuildpackId;
            return this;
        }
        public String getBaselineBuildpackId() {
            return this.baselineBuildpackId;
        }

        public DescribeAppServiceEnvParamResponseBodyAppServiceEnvParams setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeAppServiceEnvParamResponseBodyAppServiceEnvParams setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public DescribeAppServiceEnvParamResponseBodyAppServiceEnvParams setReadonly(Boolean readonly) {
            this.readonly = readonly;
            return this;
        }
        public Boolean getReadonly() {
            return this.readonly;
        }

        public DescribeAppServiceEnvParamResponseBodyAppServiceEnvParams setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeAppServiceEnvParamResponseBodyAppServiceEnvParams setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public DescribeAppServiceEnvParamResponseBodyAppServiceEnvParams setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public DescribeAppServiceEnvParamResponseBodyAppServiceEnvParams setOriginalReadonly(String originalReadonly) {
            this.originalReadonly = originalReadonly;
            return this;
        }
        public String getOriginalReadonly() {
            return this.originalReadonly;
        }

        public DescribeAppServiceEnvParamResponseBodyAppServiceEnvParams setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAppServiceEnvParamResponseBodyAppServiceEnvParams setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeAppServiceEnvParamResponseBodyAppServiceEnvParams setAppServiceId(String appServiceId) {
            this.appServiceId = appServiceId;
            return this;
        }
        public String getAppServiceId() {
            return this.appServiceId;
        }

        public DescribeAppServiceEnvParamResponseBodyAppServiceEnvParams setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
