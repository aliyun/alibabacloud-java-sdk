// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCSystemUrlRequest extends TeaModel {
    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static ListLDCSystemUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLDCSystemUrlRequest self = new ListLDCSystemUrlRequest();
        return TeaModel.build(map, self);
    }

    public ListLDCSystemUrlRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
