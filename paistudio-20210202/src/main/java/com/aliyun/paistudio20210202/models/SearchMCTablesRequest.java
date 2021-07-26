// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class SearchMCTablesRequest extends TeaModel {
    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("Keyword")
    public String keyword;

    public static SearchMCTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchMCTablesRequest self = new SearchMCTablesRequest();
        return TeaModel.build(map, self);
    }

    public SearchMCTablesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public SearchMCTablesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

}
