// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class SearchDirectoriesRequest extends TeaModel {
    @NameInMap("ParentDirectoryId")
    public String parentDirectoryId;

    @NameInMap("DirectoryName")
    public String directoryName;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("AccessId")
    public String accessId;

    public static SearchDirectoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchDirectoriesRequest self = new SearchDirectoriesRequest();
        return TeaModel.build(map, self);
    }

    public SearchDirectoriesRequest setParentDirectoryId(String parentDirectoryId) {
        this.parentDirectoryId = parentDirectoryId;
        return this;
    }
    public String getParentDirectoryId() {
        return this.parentDirectoryId;
    }

    public SearchDirectoriesRequest setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
        return this;
    }
    public String getDirectoryName() {
        return this.directoryName;
    }

    public SearchDirectoriesRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public SearchDirectoriesRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public SearchDirectoriesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchDirectoriesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public SearchDirectoriesRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

}
