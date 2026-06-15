// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryDeviceStatRequest extends TeaModel {
    /**
     * <p>AppKey information.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23267207</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is only valid for early Android and iOS dual-platform application types. If your application is a dual-platform application, specify this parameter as iOS or ANDROID to query the number of devices for each type. By default, it queries ALL types.</p>
     * <p>The device type. Valid values:</p>
     * <ul>
     * <li><p><strong>iOS</strong>: iOS devices</p>
     * </li>
     * <li><p><strong>ANDROID</strong>: Android devices</p>
     * </li>
     * <li><p><strong>ALL</strong>: All device types</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>iOS</p>
     */
    @NameInMap("DeviceType")
    public String deviceType;

    /**
     * <p>The end time of the query. The time format follows the ISO8601 standard and uses UTC time, in the format YYYY-MM-DDThh:mm:ssZ.</p>
     * <blockquote>
     * <p>The statistics end date is the end time\&quot;s day.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-07-29T00:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Query new devices or historical cumulative devices. Valid values:</p>
     * <ul>
     * <li><p><strong>NEW</strong>: New devices</p>
     * </li>
     * <li><p><strong>TOTAL</strong>: Cumulative devices</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TOTAL</p>
     */
    @NameInMap("QueryType")
    public String queryType;

    /**
     * <p>The start time of the query. The time format follows the ISO8601 standard and uses UTC time, in the format YYYY-MM-DDThh:mm:ssZ.</p>
     * <blockquote>
     * <p>The statistics start date is 00:00 UTC+8 on the start time\&quot;s day.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-07-28T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static QueryDeviceStatRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceStatRequest self = new QueryDeviceStatRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceStatRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public QueryDeviceStatRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public QueryDeviceStatRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryDeviceStatRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public QueryDeviceStatRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
