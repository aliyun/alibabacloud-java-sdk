// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200805.models;

import com.aliyun.tea.*;

public class QueryDatasetRowLevelPermissionInfoRequest extends TeaModel {
    @NameInMap("DatasetId")
    public String datasetId;

    public static QueryDatasetRowLevelPermissionInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDatasetRowLevelPermissionInfoRequest self = new QueryDatasetRowLevelPermissionInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryDatasetRowLevelPermissionInfoRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

}
