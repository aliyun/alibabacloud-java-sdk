// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryUniqueDeviceStatRequest extends TeaModel {
    /**
     * <p>Your app key.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23267207</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>The end time of the query, in ISO 8601 format. Format: YYYY-MM-DDThh:mm:ssZ.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-07-26T00:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time granularity for the query. Valid values:</p>
     * <ul>
     * <li><p>DAY</p>
     * </li>
     * <li><p>MONTH</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DAY</p>
     */
    @NameInMap("Granularity")
    public String granularity;

    /**
     * <p>The start time of the query, in ISO 8601 format. Format: YYYY-MM-DDThh:mm:ssZ.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-07-25T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static QueryUniqueDeviceStatRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUniqueDeviceStatRequest self = new QueryUniqueDeviceStatRequest();
        return TeaModel.build(map, self);
    }

    public QueryUniqueDeviceStatRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public QueryUniqueDeviceStatRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryUniqueDeviceStatRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public QueryUniqueDeviceStatRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
