// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckTimeDimensionStatisticRequest extends TeaModel {
    /**
     * <p>End time, in timestamp format.</p>
     * 
     * <strong>example:</strong>
     * <p>1672285044000</p>
     */
    @NameInMap("EndTimeStamp")
    public Long endTimeStamp;

    /**
     * <p>Start time, in timestamp format.</p>
     * 
     * <strong>example:</strong>
     * <p>1672385044000</p>
     */
    @NameInMap("StartTimeStamp")
    public Long startTimeStamp;

    /**
     * <p>Type of statistical data. Values:</p>
     * <ul>
     * <li><strong>CheckPassRate</strong>: Check item pass rate.</li>
     * <li><strong>AssetPassRate</strong>: Asset pass rate.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AssetPassRate</p>
     */
    @NameInMap("StatisticType")
    public String statisticType;

    /**
     * <p>List of cloud vendors.</p>
     */
    @NameInMap("Vendors")
    public java.util.List<String> vendors;

    public static GetCheckTimeDimensionStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCheckTimeDimensionStatisticRequest self = new GetCheckTimeDimensionStatisticRequest();
        return TeaModel.build(map, self);
    }

    public GetCheckTimeDimensionStatisticRequest setEndTimeStamp(Long endTimeStamp) {
        this.endTimeStamp = endTimeStamp;
        return this;
    }
    public Long getEndTimeStamp() {
        return this.endTimeStamp;
    }

    public GetCheckTimeDimensionStatisticRequest setStartTimeStamp(Long startTimeStamp) {
        this.startTimeStamp = startTimeStamp;
        return this;
    }
    public Long getStartTimeStamp() {
        return this.startTimeStamp;
    }

    public GetCheckTimeDimensionStatisticRequest setStatisticType(String statisticType) {
        this.statisticType = statisticType;
        return this;
    }
    public String getStatisticType() {
        return this.statisticType;
    }

    public GetCheckTimeDimensionStatisticRequest setVendors(java.util.List<String> vendors) {
        this.vendors = vendors;
        return this;
    }
    public java.util.List<String> getVendors() {
        return this.vendors;
    }

}
