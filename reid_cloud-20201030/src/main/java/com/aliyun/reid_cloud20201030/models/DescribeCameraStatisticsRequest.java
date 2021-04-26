// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class DescribeCameraStatisticsRequest extends TeaModel {
    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    @NameInMap("StoreId")
    public Long storeId;

    @NameInMap("LocationId")
    public Long locationId;

    public static DescribeCameraStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCameraStatisticsRequest self = new DescribeCameraStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCameraStatisticsRequest setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public DescribeCameraStatisticsRequest setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribeCameraStatisticsRequest setStoreId(Long storeId) {
        this.storeId = storeId;
        return this;
    }
    public Long getStoreId() {
        return this.storeId;
    }

    public DescribeCameraStatisticsRequest setLocationId(Long locationId) {
        this.locationId = locationId;
        return this;
    }
    public Long getLocationId() {
        return this.locationId;
    }

}
