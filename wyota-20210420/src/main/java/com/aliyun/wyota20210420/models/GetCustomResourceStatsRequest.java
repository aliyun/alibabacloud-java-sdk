// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetCustomResourceStatsRequest extends TeaModel {
    /**
     * <p>The business type. Default value: enterprise.</p>
     * 
     * <strong>example:</strong>
     * <p>enterprise</p>
     */
    @NameInMap("MainBizType")
    public String mainBizType;

    public static GetCustomResourceStatsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCustomResourceStatsRequest self = new GetCustomResourceStatsRequest();
        return TeaModel.build(map, self);
    }

    public GetCustomResourceStatsRequest setMainBizType(String mainBizType) {
        this.mainBizType = mainBizType;
        return this;
    }
    public String getMainBizType() {
        return this.mainBizType;
    }

}
