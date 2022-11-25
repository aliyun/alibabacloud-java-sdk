// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class CheckDatasetOssBucketCORSRequest extends TeaModel {
    @NameInMap("LabelsetId")
    public Long labelsetId;

    public static CheckDatasetOssBucketCORSRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckDatasetOssBucketCORSRequest self = new CheckDatasetOssBucketCORSRequest();
        return TeaModel.build(map, self);
    }

    public CheckDatasetOssBucketCORSRequest setLabelsetId(Long labelsetId) {
        this.labelsetId = labelsetId;
        return this;
    }
    public Long getLabelsetId() {
        return this.labelsetId;
    }

}
