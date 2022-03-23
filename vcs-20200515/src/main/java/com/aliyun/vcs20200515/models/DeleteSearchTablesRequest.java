// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteSearchTablesRequest extends TeaModel {
    @NameInMap("SearchTableIds")
    public String searchTableIds;

    public static DeleteSearchTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSearchTablesRequest self = new DeleteSearchTablesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSearchTablesRequest setSearchTableIds(String searchTableIds) {
        this.searchTableIds = searchTableIds;
        return this;
    }
    public String getSearchTableIds() {
        return this.searchTableIds;
    }

}
