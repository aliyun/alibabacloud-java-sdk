// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListApiDatasourceRequest extends TeaModel {
    /**
     * <p>The keyword of the API data source name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

    /**
     * <p>Current page number for API data source list:</p>
     * <ul>
     * <li>Pages start from page 1.</li>
     * <li>Default value: 1.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of rows per page in a paged query.</p>
     * <ul>
     * <li>Default value: 10.</li>
     * <li>Valid values: 1 to 100.</li>
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
     * <p>89713491-cb4f-4579-b889-e82c35f1****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListApiDatasourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApiDatasourceRequest self = new ListApiDatasourceRequest();
        return TeaModel.build(map, self);
    }

    public ListApiDatasourceRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public ListApiDatasourceRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListApiDatasourceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListApiDatasourceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
