// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class SelectDataSet2Request extends TeaModel {
    @NameInMap("clientId")
    public Long clientId;

    @NameInMap("dataSetId")
    public Long dataSetId;

    public static SelectDataSet2Request build(java.util.Map<String, ?> map) throws Exception {
        SelectDataSet2Request self = new SelectDataSet2Request();
        return TeaModel.build(map, self);
    }

    public SelectDataSet2Request setClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }
    public Long getClientId() {
        return this.clientId;
    }

    public SelectDataSet2Request setDataSetId(Long dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }
    public Long getDataSetId() {
        return this.dataSetId;
    }

}
