// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckTimeDimensionStatisticRequest extends TeaModel {
    /**
     * <p>The end time in UNIX timestamp format.</p>
     * 
     * <strong>example:</strong>
     * <p>1672285044000</p>
     */
    @NameInMap("EndTimeStamp")
    public Long endTimeStamp;

    /**
     * <p>The ID of the Alibaba Cloud account to which the member accounts in the resource folder belong.</p>
     * <blockquote>
     * <p>You can invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1234567890123456</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The start time in UNIX timestamp format.</p>
     * 
     * <strong>example:</strong>
     * <p>1672385044000</p>
     */
    @NameInMap("StartTimeStamp")
    public Long startTimeStamp;

    /**
     * <p>The data statistics type. Valid values:</p>
     * <ul>
     * <li><strong>CheckPassRate</strong>: The pass rate of check items.</li>
     * <li><strong>AssetPassRate</strong>: The pass rate of assets.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AssetPassRate</p>
     */
    @NameInMap("StatisticType")
    public String statisticType;

    /**
     * <p>The list of cloud providers.</p>
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

    public GetCheckTimeDimensionStatisticRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
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
