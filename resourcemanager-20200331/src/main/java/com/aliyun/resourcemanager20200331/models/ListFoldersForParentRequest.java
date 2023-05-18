// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListFoldersForParentRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Valid values: 1 to 100. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the parent folder.</p>
     * <br>
     * <p>If you leave this parameter empty, the information of the first-level subfolders of the Root folder is queried.</p>
     */
    @NameInMap("ParentFolderId")
    public String parentFolderId;

    /**
     * <p>The keyword used for the query, such as a folder name.</p>
     * <br>
     * <p>Fuzzy match is supported.</p>
     */
    @NameInMap("QueryKeyword")
    public String queryKeyword;

    public static ListFoldersForParentRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFoldersForParentRequest self = new ListFoldersForParentRequest();
        return TeaModel.build(map, self);
    }

    public ListFoldersForParentRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFoldersForParentRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFoldersForParentRequest setParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
        return this;
    }
    public String getParentFolderId() {
        return this.parentFolderId;
    }

    public ListFoldersForParentRequest setQueryKeyword(String queryKeyword) {
        this.queryKeyword = queryKeyword;
        return this;
    }
    public String getQueryKeyword() {
        return this.queryKeyword;
    }

}
