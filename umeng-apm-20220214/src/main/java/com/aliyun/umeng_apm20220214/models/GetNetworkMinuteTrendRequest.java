// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class GetNetworkMinuteTrendRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5fb6001a73749c24fd9cb356</p>
     */
    @NameInMap("dataSourceId")
    public String dataSourceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-09-27 09:07</p>
     */
    @NameInMap("startTime")
    public String startTime;

    public static GetNetworkMinuteTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkMinuteTrendRequest self = new GetNetworkMinuteTrendRequest();
        return TeaModel.build(map, self);
    }

    public GetNetworkMinuteTrendRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public GetNetworkMinuteTrendRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
