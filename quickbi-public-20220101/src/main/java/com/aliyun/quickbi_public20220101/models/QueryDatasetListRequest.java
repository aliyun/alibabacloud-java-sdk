// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDatasetListRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>Information about the directory where the dataset is located</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The ID of the workspace.</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>Specifies the directory ID.</p>
     * <br>
     * <p>*   If this field is not empty, all datasets in the directory are obtained.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The total number of pages returned.</p>
     */
    @NameInMap("WithChildren")
    public Boolean withChildren;

    /**
     * <p>The name of the data source.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static QueryDatasetListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDatasetListRequest self = new QueryDatasetListRequest();
        return TeaModel.build(map, self);
    }

    public QueryDatasetListRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public QueryDatasetListRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryDatasetListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryDatasetListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDatasetListRequest setWithChildren(Boolean withChildren) {
        this.withChildren = withChildren;
        return this;
    }
    public Boolean getWithChildren() {
        return this.withChildren;
    }

    public QueryDatasetListRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
