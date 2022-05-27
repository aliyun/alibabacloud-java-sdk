// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class SetDatasetUserOssPathRequest extends TeaModel {
    @NameInMap("DatasetId")
    public Long datasetId;

    @NameInMap("UserOssUrl")
    public String userOssUrl;

    public static SetDatasetUserOssPathRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDatasetUserOssPathRequest self = new SetDatasetUserOssPathRequest();
        return TeaModel.build(map, self);
    }

    public SetDatasetUserOssPathRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public SetDatasetUserOssPathRequest setUserOssUrl(String userOssUrl) {
        this.userOssUrl = userOssUrl;
        return this;
    }
    public String getUserOssUrl() {
        return this.userOssUrl;
    }

}
