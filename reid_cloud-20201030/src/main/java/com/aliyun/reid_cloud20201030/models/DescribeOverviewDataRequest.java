// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class DescribeOverviewDataRequest extends TeaModel {
    @NameInMap("Date")
    public String date;

    @NameInMap("StoreIds")
    public String storeIds;

    public static DescribeOverviewDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOverviewDataRequest self = new DescribeOverviewDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOverviewDataRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public DescribeOverviewDataRequest setStoreIds(String storeIds) {
        this.storeIds = storeIds;
        return this;
    }
    public String getStoreIds() {
        return this.storeIds;
    }

}
