// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class DownloadDatasetRequest extends TeaModel {
    @NameInMap("DatasetId")
    public Long datasetId;

    public static DownloadDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadDatasetRequest self = new DownloadDatasetRequest();
        return TeaModel.build(map, self);
    }

    public DownloadDatasetRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

}
