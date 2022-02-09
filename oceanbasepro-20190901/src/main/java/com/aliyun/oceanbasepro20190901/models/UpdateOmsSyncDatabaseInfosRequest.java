// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class UpdateOmsSyncDatabaseInfosRequest extends TeaModel {
    @NameInMap("DatabaseInfos")
    public String databaseInfos;

    @NameInMap("ProjectId")
    public String projectId;

    public static UpdateOmsSyncDatabaseInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOmsSyncDatabaseInfosRequest self = new UpdateOmsSyncDatabaseInfosRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOmsSyncDatabaseInfosRequest setDatabaseInfos(String databaseInfos) {
        this.databaseInfos = databaseInfos;
        return this;
    }
    public String getDatabaseInfos() {
        return this.databaseInfos;
    }

    public UpdateOmsSyncDatabaseInfosRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
