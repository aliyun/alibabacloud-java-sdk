// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDatasetDetailInfoRequest extends TeaModel {
    @NameInMap("DatasetId")
    public String datasetId;

    public static QueryDatasetDetailInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDatasetDetailInfoRequest self = new QueryDatasetDetailInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryDatasetDetailInfoRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

}
