// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeUsageDistributionStatDataRequest extends TeaModel {
    /**
     * <p>The app ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0rbd****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The end time of the query. The value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1615910399</p>
     */
    @NameInMap("EndDate")
    public Long endDate;

    /**
     * <p>The start time of the query. The value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1615824000</p>
     */
    @NameInMap("StartDate")
    public Long startDate;

    /**
     * <p>The statistical dimension. Valid values:</p>
     * <ul>
     * <li><strong>CHANNEL_ONLINE</strong>: aggregates data by the number of online users in a channel.</li>
     * <li><strong>NETWORK</strong>: aggregates data by network type.</li>
     * <li><strong>OS</strong>: aggregates data by operating system type.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CHANNEL_ONLINE</p>
     */
    @NameInMap("StatDim")
    public String statDim;

    public static DescribeUsageDistributionStatDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsageDistributionStatDataRequest self = new DescribeUsageDistributionStatDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUsageDistributionStatDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeUsageDistributionStatDataRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public DescribeUsageDistributionStatDataRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public DescribeUsageDistributionStatDataRequest setStatDim(String statDim) {
        this.statDim = statDim;
        return this;
    }
    public String getStatDim() {
        return this.statDim;
    }

}
