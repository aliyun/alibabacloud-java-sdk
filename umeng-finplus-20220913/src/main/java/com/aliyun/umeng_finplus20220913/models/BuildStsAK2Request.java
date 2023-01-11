// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class BuildStsAK2Request extends TeaModel {
    @NameInMap("clientId")
    public Long clientId;

    @NameInMap("dataSetId")
    public Long dataSetId;

    public static BuildStsAK2Request build(java.util.Map<String, ?> map) throws Exception {
        BuildStsAK2Request self = new BuildStsAK2Request();
        return TeaModel.build(map, self);
    }

    public BuildStsAK2Request setClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }
    public Long getClientId() {
        return this.clientId;
    }

    public BuildStsAK2Request setDataSetId(Long dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }
    public Long getDataSetId() {
        return this.dataSetId;
    }

}
