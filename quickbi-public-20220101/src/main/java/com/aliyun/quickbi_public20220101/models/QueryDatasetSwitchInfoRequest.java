// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDatasetSwitchInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CubeId")
    public String cubeId;

    public static QueryDatasetSwitchInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDatasetSwitchInfoRequest self = new QueryDatasetSwitchInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryDatasetSwitchInfoRequest setCubeId(String cubeId) {
        this.cubeId = cubeId;
        return this;
    }
    public String getCubeId() {
        return this.cubeId;
    }

}
