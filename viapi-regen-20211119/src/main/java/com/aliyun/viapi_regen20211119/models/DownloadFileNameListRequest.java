// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class DownloadFileNameListRequest extends TeaModel {
    // 空间id
    @NameInMap("DatasetId")
    public Long datasetId;

    // 数据集名称
    @NameInMap("Identity")
    public String identity;

    public static DownloadFileNameListRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadFileNameListRequest self = new DownloadFileNameListRequest();
        return TeaModel.build(map, self);
    }

    public DownloadFileNameListRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public DownloadFileNameListRequest setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

}
