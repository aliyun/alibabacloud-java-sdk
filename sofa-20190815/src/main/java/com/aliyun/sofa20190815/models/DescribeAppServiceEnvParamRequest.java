// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeAppServiceEnvParamRequest extends TeaModel {
    @NameInMap("CreationTimeFrom")
    public String creationTimeFrom;

    @NameInMap("CreationTimeTo")
    public String creationTimeTo;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("DefaultValue")
    public String defaultValue;

    @NameInMap("Descend")
    public Boolean descend;

    @NameInMap("IsProcessed")
    public Boolean isProcessed;

    @NameInMap("Key")
    public String key;

    @NameInMap("ModificationTimeFrom")
    public String modificationTimeFrom;

    @NameInMap("ModificationTimeTo")
    public String modificationTimeTo;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SortField")
    public String sortField;

    @NameInMap("StartIndex")
    public Long startIndex;

    @NameInMap("Value")
    public String value;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("AppIdsRepeatList")
    public java.util.List<String> appIdsRepeatList;

    @NameInMap("AppServiceIdsRepeatList")
    public java.util.List<String> appServiceIdsRepeatList;

    @NameInMap("BuildpackIdsRepeatList")
    public java.util.List<String> buildpackIdsRepeatList;

    @NameInMap("IdsRepeatList")
    public java.util.List<String> idsRepeatList;

    public static DescribeAppServiceEnvParamRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppServiceEnvParamRequest self = new DescribeAppServiceEnvParamRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppServiceEnvParamRequest setCreationTimeFrom(String creationTimeFrom) {
        this.creationTimeFrom = creationTimeFrom;
        return this;
    }
    public String getCreationTimeFrom() {
        return this.creationTimeFrom;
    }

    public DescribeAppServiceEnvParamRequest setCreationTimeTo(String creationTimeTo) {
        this.creationTimeTo = creationTimeTo;
        return this;
    }
    public String getCreationTimeTo() {
        return this.creationTimeTo;
    }

    public DescribeAppServiceEnvParamRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAppServiceEnvParamRequest setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public String getDefaultValue() {
        return this.defaultValue;
    }

    public DescribeAppServiceEnvParamRequest setDescend(Boolean descend) {
        this.descend = descend;
        return this;
    }
    public Boolean getDescend() {
        return this.descend;
    }

    public DescribeAppServiceEnvParamRequest setIsProcessed(Boolean isProcessed) {
        this.isProcessed = isProcessed;
        return this;
    }
    public Boolean getIsProcessed() {
        return this.isProcessed;
    }

    public DescribeAppServiceEnvParamRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeAppServiceEnvParamRequest setModificationTimeFrom(String modificationTimeFrom) {
        this.modificationTimeFrom = modificationTimeFrom;
        return this;
    }
    public String getModificationTimeFrom() {
        return this.modificationTimeFrom;
    }

    public DescribeAppServiceEnvParamRequest setModificationTimeTo(String modificationTimeTo) {
        this.modificationTimeTo = modificationTimeTo;
        return this;
    }
    public String getModificationTimeTo() {
        return this.modificationTimeTo;
    }

    public DescribeAppServiceEnvParamRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeAppServiceEnvParamRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public DescribeAppServiceEnvParamRequest setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public DescribeAppServiceEnvParamRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public DescribeAppServiceEnvParamRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public DescribeAppServiceEnvParamRequest setAppIdsRepeatList(java.util.List<String> appIdsRepeatList) {
        this.appIdsRepeatList = appIdsRepeatList;
        return this;
    }
    public java.util.List<String> getAppIdsRepeatList() {
        return this.appIdsRepeatList;
    }

    public DescribeAppServiceEnvParamRequest setAppServiceIdsRepeatList(java.util.List<String> appServiceIdsRepeatList) {
        this.appServiceIdsRepeatList = appServiceIdsRepeatList;
        return this;
    }
    public java.util.List<String> getAppServiceIdsRepeatList() {
        return this.appServiceIdsRepeatList;
    }

    public DescribeAppServiceEnvParamRequest setBuildpackIdsRepeatList(java.util.List<String> buildpackIdsRepeatList) {
        this.buildpackIdsRepeatList = buildpackIdsRepeatList;
        return this;
    }
    public java.util.List<String> getBuildpackIdsRepeatList() {
        return this.buildpackIdsRepeatList;
    }

    public DescribeAppServiceEnvParamRequest setIdsRepeatList(java.util.List<String> idsRepeatList) {
        this.idsRepeatList = idsRepeatList;
        return this;
    }
    public java.util.List<String> getIdsRepeatList() {
        return this.idsRepeatList;
    }

}
