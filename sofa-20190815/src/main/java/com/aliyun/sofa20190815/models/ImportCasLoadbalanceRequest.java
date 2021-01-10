// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportCasLoadbalanceRequest extends TeaModel {
    @NameInMap("LoadbalanceIdsRepeatList")
    public java.util.List<String> loadbalanceIdsRepeatList;

    @NameInMap("Workspace")
    public String workspace;

    public static ImportCasLoadbalanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportCasLoadbalanceRequest self = new ImportCasLoadbalanceRequest();
        return TeaModel.build(map, self);
    }

    public ImportCasLoadbalanceRequest setLoadbalanceIdsRepeatList(java.util.List<String> loadbalanceIdsRepeatList) {
        this.loadbalanceIdsRepeatList = loadbalanceIdsRepeatList;
        return this;
    }
    public java.util.List<String> getLoadbalanceIdsRepeatList() {
        return this.loadbalanceIdsRepeatList;
    }

    public ImportCasLoadbalanceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
