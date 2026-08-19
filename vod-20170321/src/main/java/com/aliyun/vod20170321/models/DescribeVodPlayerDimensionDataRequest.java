// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodPlayerDimensionDataRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app-1000000</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The dimension type. Valid values:</p>
     * <ul>
     * <li>Os: operating system.</li>
     * <li>AppVersion: application version.</li>
     * <li>SdkVersion: SDK version.</li>
     * <li>Codec: codec.</li>
     * <li>VideoType: video format.</li>
     * <li>Network: network type.</li>
     * <li>Isp: Internet service provider.</li>
     * <li>VideoDefinition: resolution.</li>
     * <li>Domain: domain name.</li>
     * <li>Country: country.</li>
     * <li>Province: province.</li>
     * <li>ErrorCode: error code.</li>
     * <li>IsHw: whether hardware decoding is used.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Os</p>
     */
    @NameInMap("Dimension")
    public String dimension;

    /**
     * <p>The end time of the query. Specify the time in the yyyy-mm-ddthh:mm:ssz format (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2025-06-05T15:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The region filter used when querying the Province or Isp dimension metadata. Valid values:</p>
     * <ul>
     * <li>ALL (default): all regions.</li>
     * <li>CN: China.</li>
     * <li>OVERSEAS: outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The start time of the query. Specify the time in the <i>yyyy-mm-dd</i>t<i>hh:mm:ss</i>z format (UTC).</p>
     * <blockquote>
     * <ul>
     * <li>Playback data from the last year is supported.</li>
     * <li>The time range for a single query cannot exceed 31 days.</li>
     * <li>The time interval is left-closed and right-open [StartTime, EndTime).</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2025-06-24T00:55:06Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVodPlayerDimensionDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodPlayerDimensionDataRequest self = new DescribeVodPlayerDimensionDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodPlayerDimensionDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeVodPlayerDimensionDataRequest setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }
    public String getDimension() {
        return this.dimension;
    }

    public DescribeVodPlayerDimensionDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodPlayerDimensionDataRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeVodPlayerDimensionDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
