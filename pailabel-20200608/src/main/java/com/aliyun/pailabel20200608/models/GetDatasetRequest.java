// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailabel20200608.models;

import com.aliyun.tea.*;

public class GetDatasetRequest extends TeaModel {
    @NameInMap("DatasetId")
    @Validation(required = true)
    public Long datasetId;

    public static GetDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetRequest self = new GetDatasetRequest();
        return TeaModel.build(map, self);
    }

}
