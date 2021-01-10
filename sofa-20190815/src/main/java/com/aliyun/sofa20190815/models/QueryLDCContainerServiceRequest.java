// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCContainerServiceRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

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

    public static QueryLDCContainerServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCContainerServiceRequest self = new QueryLDCContainerServiceRequest();
        return TeaModel.build(map, self);
    }

    public QueryLDCContainerServiceRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryLDCContainerServiceRequest setDeploymentStatusRepeatList(java.util.List<String> deploymentStatusRepeatList) {
        this.deploymentStatusRepeatList = deploymentStatusRepeatList;
        return this;
    }
    public java.util.List<String> getDeploymentStatusRepeatList() {
        return this.deploymentStatusRepeatList;
    }

    public QueryLDCContainerServiceRequest setMetadataStatusRepeatList(java.util.List<String> metadataStatusRepeatList) {
        this.metadataStatusRepeatList = metadataStatusRepeatList;
        return this;
    }
    public java.util.List<String> getMetadataStatusRepeatList() {
        return this.metadataStatusRepeatList;
    }

    public QueryLDCContainerServiceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryLDCContainerServiceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryLDCContainerServiceRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryLDCContainerServiceRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryLDCContainerServiceRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
