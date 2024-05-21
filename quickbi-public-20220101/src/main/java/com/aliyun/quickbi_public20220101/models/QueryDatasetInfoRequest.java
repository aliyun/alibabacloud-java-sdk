// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDatasetInfoRequest extends TeaModel {
    /**
     * <p>Queries information about a specified dataset.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasetId")
    public String datasetId;

    public static QueryDatasetInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDatasetInfoRequest self = new QueryDatasetInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryDatasetInfoRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

}
