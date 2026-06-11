// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListAccelerationOfWorkspaceRequest extends TeaModel {
    /**
     * <p>The user ID in Quick BI. This is not your Alibaba Cloud account ID. Call the QueryUserInfoByAccount operation to obtain the user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1***************139</p>
     */
    @NameInMap("CreatorId")
    public String creatorId;

    /**
     * <p>The name of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("CubeName")
    public String cubeName;

    /**
     * <p>The page number. If this parameter is left empty, the default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of rows on each page for a paged query.</p>
     * <ul>
     * <li>Default value: 10.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>95296e95-ca89-4c7d-8af9-dedf0ad0****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListAccelerationOfWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAccelerationOfWorkspaceRequest self = new ListAccelerationOfWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public ListAccelerationOfWorkspaceRequest setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public ListAccelerationOfWorkspaceRequest setCubeName(String cubeName) {
        this.cubeName = cubeName;
        return this;
    }
    public String getCubeName() {
        return this.cubeName;
    }

    public ListAccelerationOfWorkspaceRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListAccelerationOfWorkspaceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAccelerationOfWorkspaceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
