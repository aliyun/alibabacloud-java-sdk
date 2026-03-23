// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListProjectRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether to retrieve the quota information for the project.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("fetchQuota")
    public Boolean fetchQuota;

    /**
     * <p>The line from which the query starts. The default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("offset")
    public Integer offset;

    /**
     * <p>The name of the project. Fuzzy queries are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>ali-test-project</p>
     */
    @NameInMap("projectName")
    public String projectName;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzf******sxby</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The number of rows to return on each page for a paged query. The default value is 100. A maximum of 500 projects can be returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("size")
    public Integer size;

    public static ListProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectRequest self = new ListProjectRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListProjectRequest setFetchQuota(Boolean fetchQuota) {
        this.fetchQuota = fetchQuota;
        return this;
    }
    public Boolean getFetchQuota() {
        return this.fetchQuota;
    }

    public ListProjectRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ListProjectRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListProjectRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
