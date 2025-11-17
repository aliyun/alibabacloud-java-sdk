// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListAccelerationOfWorkspaceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1***************139</p>
     */
    @NameInMap("CreatorId")
    public String creatorId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("CubeName")
    public String cubeName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
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
