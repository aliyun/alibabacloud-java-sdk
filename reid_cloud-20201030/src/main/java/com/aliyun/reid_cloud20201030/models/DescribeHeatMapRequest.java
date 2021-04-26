// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class DescribeHeatMapRequest extends TeaModel {
    @NameInMap("EmapId")
    public Long emapId;

    @NameInMap("StoreId")
    public Long storeId;

    @NameInMap("Date")
    public String date;

    public static DescribeHeatMapRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHeatMapRequest self = new DescribeHeatMapRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHeatMapRequest setEmapId(Long emapId) {
        this.emapId = emapId;
        return this;
    }
    public Long getEmapId() {
        return this.emapId;
    }

    public DescribeHeatMapRequest setStoreId(Long storeId) {
        this.storeId = storeId;
        return this;
    }
    public Long getStoreId() {
        return this.storeId;
    }

    public DescribeHeatMapRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

}
