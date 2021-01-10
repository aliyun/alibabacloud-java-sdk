// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCContainerServiceRevisionRequest extends TeaModel {
    @NameInMap("DeploymentStatusRepeatList")
    public java.util.List<String> deploymentStatusRepeatList;

    @NameInMap("MetadataStatusRepeatList")
    public java.util.List<String> metadataStatusRepeatList;

    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static QueryLDCContainerServiceRevisionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCContainerServiceRevisionRequest self = new QueryLDCContainerServiceRevisionRequest();
        return TeaModel.build(map, self);
    }

    public QueryLDCContainerServiceRevisionRequest setDeploymentStatusRepeatList(java.util.List<String> deploymentStatusRepeatList) {
        this.deploymentStatusRepeatList = deploymentStatusRepeatList;
        return this;
    }
    public java.util.List<String> getDeploymentStatusRepeatList() {
        return this.deploymentStatusRepeatList;
    }

    public QueryLDCContainerServiceRevisionRequest setMetadataStatusRepeatList(java.util.List<String> metadataStatusRepeatList) {
        this.metadataStatusRepeatList = metadataStatusRepeatList;
        return this;
    }
    public java.util.List<String> getMetadataStatusRepeatList() {
        return this.metadataStatusRepeatList;
    }

    public QueryLDCContainerServiceRevisionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryLDCContainerServiceRevisionRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryLDCContainerServiceRevisionRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryLDCContainerServiceRevisionRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryLDCContainerServiceRevisionRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
