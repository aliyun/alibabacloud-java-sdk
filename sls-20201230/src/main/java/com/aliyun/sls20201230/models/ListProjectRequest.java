// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListProjectRequest extends TeaModel {
    /**
     * <p>The line from which the query starts. Default value: 0.</p>
     */
    @NameInMap("offset")
    public Integer offset;

    /**
     * <p>The name of the project.</p>
     */
    @NameInMap("projectName")
    public String projectName;

    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The number of entries per page. Default value: 100. This operation can return up to 500 projects.</p>
     */
    @NameInMap("size")
    public Integer size;

    public static ListProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectRequest self = new ListProjectRequest();
        return TeaModel.build(map, self);
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
