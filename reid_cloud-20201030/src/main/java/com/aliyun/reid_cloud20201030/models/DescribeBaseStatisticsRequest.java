// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class DescribeBaseStatisticsRequest extends TeaModel {
    @NameInMap("Date")
    public String date;

    @NameInMap("SummaryType")
    public String summaryType;

    @NameInMap("ExtraStatisticTypes")
    public String extraStatisticTypes;

    @NameInMap("StoreId")
    public Long storeId;

    @NameInMap("LocationId")
    public Long locationId;

    public static DescribeBaseStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBaseStatisticsRequest self = new DescribeBaseStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBaseStatisticsRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public DescribeBaseStatisticsRequest setSummaryType(String summaryType) {
        this.summaryType = summaryType;
        return this;
    }
    public String getSummaryType() {
        return this.summaryType;
    }

    public DescribeBaseStatisticsRequest setExtraStatisticTypes(String extraStatisticTypes) {
        this.extraStatisticTypes = extraStatisticTypes;
        return this;
    }
    public String getExtraStatisticTypes() {
        return this.extraStatisticTypes;
    }

    public DescribeBaseStatisticsRequest setStoreId(Long storeId) {
        this.storeId = storeId;
        return this;
    }
    public Long getStoreId() {
        return this.storeId;
    }

    public DescribeBaseStatisticsRequest setLocationId(Long locationId) {
        this.locationId = locationId;
        return this;
    }
    public Long getLocationId() {
        return this.locationId;
    }

}
