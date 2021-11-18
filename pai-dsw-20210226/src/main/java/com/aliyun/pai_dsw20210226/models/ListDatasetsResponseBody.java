// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListDatasetsResponseBody extends TeaModel {
    @NameInMap("Datasets")
    public java.util.List<Dataset> datasets;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ListDatasetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetsResponseBody self = new ListDatasetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatasetsResponseBody setDatasets(java.util.List<Dataset> datasets) {
        this.datasets = datasets;
        return this;
    }
    public java.util.List<Dataset> getDatasets() {
        return this.datasets;
    }

    public ListDatasetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
