// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class GetDataSetStatusRequest extends TeaModel {
    @NameInMap("dataSetId")
    public Long dataSetId;

    public static GetDataSetStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataSetStatusRequest self = new GetDataSetStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetDataSetStatusRequest setDataSetId(Long dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }
    public Long getDataSetId() {
        return this.dataSetId;
    }

}
