// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDatasetListRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>schemaad8aad00-9c55-4984-a767-b4e0ec60****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>Information about the directory where the dataset is located</p>
     * 
     * <strong>example:</strong>
     * <p>Queries the datasets of a specified workspace. The datasets are sorted in descending order by creation time.</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The ID of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>Specifies the directory ID.</p>
     * <ul>
     * <li>If this field is not empty, all datasets in the directory are obtained.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The total number of pages returned.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("WithChildren")
    public Boolean withChildren;

    /**
     * <p>The name of the data source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>95296e95-ca89-4c7d-8af9-dedf0ad0****</p>
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
