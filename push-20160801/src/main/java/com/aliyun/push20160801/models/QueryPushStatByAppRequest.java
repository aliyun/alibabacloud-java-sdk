// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryPushStatByAppRequest extends TeaModel {
    /**
     * <p>The AppKey value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23267207</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>The end time of the query. Specify the time in ISO 8601 format, YYYY-MM-DDThh:mm:ssZ.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-07-29T00:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The data granularity of the response. You can only query data for up to 31 days at daily granularity. Valid values:</p>
     * <ul>
     * <li><strong>DAY</strong>: Query data at daily granularity.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DAY</p>
     */
    @NameInMap("Granularity")
    public String granularity;

    /**
     * <p>The start time of the query. Specify the time in ISO 8601 format, YYYY-MM-DDThh:mm:ssZ.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-07-25T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static QueryPushStatByAppRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPushStatByAppRequest self = new QueryPushStatByAppRequest();
        return TeaModel.build(map, self);
    }

    public QueryPushStatByAppRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public QueryPushStatByAppRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryPushStatByAppRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public QueryPushStatByAppRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
