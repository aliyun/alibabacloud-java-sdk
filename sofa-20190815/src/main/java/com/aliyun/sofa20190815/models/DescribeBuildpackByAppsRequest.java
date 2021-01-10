// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeBuildpackByAppsRequest extends TeaModel {
    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("AppIdsRepeatList")
    public java.util.List<String> appIdsRepeatList;

    public static DescribeBuildpackByAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBuildpackByAppsRequest self = new DescribeBuildpackByAppsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBuildpackByAppsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public DescribeBuildpackByAppsRequest setAppIdsRepeatList(java.util.List<String> appIdsRepeatList) {
        this.appIdsRepeatList = appIdsRepeatList;
        return this;
    }
    public java.util.List<String> getAppIdsRepeatList() {
        return this.appIdsRepeatList;
    }

}
