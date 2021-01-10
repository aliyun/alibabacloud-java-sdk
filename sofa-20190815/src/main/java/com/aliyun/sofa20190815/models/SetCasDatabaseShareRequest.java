// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetCasDatabaseShareRequest extends TeaModel {
    @NameInMap("IdsRepeatList")
    public java.util.List<String> idsRepeatList;

    @NameInMap("WorkspaceIdsRepeatList")
    public java.util.List<String> workspaceIdsRepeatList;

    public static SetCasDatabaseShareRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCasDatabaseShareRequest self = new SetCasDatabaseShareRequest();
        return TeaModel.build(map, self);
    }

    public SetCasDatabaseShareRequest setIdsRepeatList(java.util.List<String> idsRepeatList) {
        this.idsRepeatList = idsRepeatList;
        return this;
    }
    public java.util.List<String> getIdsRepeatList() {
        return this.idsRepeatList;
    }

    public SetCasDatabaseShareRequest setWorkspaceIdsRepeatList(java.util.List<String> workspaceIdsRepeatList) {
        this.workspaceIdsRepeatList = workspaceIdsRepeatList;
        return this;
    }
    public java.util.List<String> getWorkspaceIdsRepeatList() {
        return this.workspaceIdsRepeatList;
    }

}
