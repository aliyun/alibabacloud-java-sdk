// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetCasDatabaseAssignRequest extends TeaModel {
    @NameInMap("AppIdsRepeatList")
    public java.util.List<String> appIdsRepeatList;

    @NameInMap("AppServiceIdsRepeatList")
    public java.util.List<String> appServiceIdsRepeatList;

    @NameInMap("IdsRepeatList")
    public java.util.List<String> idsRepeatList;

    @NameInMap("Workspace")
    public String workspace;

    public static SetCasDatabaseAssignRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCasDatabaseAssignRequest self = new SetCasDatabaseAssignRequest();
        return TeaModel.build(map, self);
    }

    public SetCasDatabaseAssignRequest setAppIdsRepeatList(java.util.List<String> appIdsRepeatList) {
        this.appIdsRepeatList = appIdsRepeatList;
        return this;
    }
    public java.util.List<String> getAppIdsRepeatList() {
        return this.appIdsRepeatList;
    }

    public SetCasDatabaseAssignRequest setAppServiceIdsRepeatList(java.util.List<String> appServiceIdsRepeatList) {
        this.appServiceIdsRepeatList = appServiceIdsRepeatList;
        return this;
    }
    public java.util.List<String> getAppServiceIdsRepeatList() {
        return this.appServiceIdsRepeatList;
    }

    public SetCasDatabaseAssignRequest setIdsRepeatList(java.util.List<String> idsRepeatList) {
        this.idsRepeatList = idsRepeatList;
        return this;
    }
    public java.util.List<String> getIdsRepeatList() {
        return this.idsRepeatList;
    }

    public SetCasDatabaseAssignRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
