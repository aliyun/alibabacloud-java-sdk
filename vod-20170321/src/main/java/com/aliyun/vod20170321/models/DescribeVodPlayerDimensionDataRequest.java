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
     * <li>Os: Operating system.</li>
     * <li>AppVersion: App version.</li>
     * <li>SdkVersion: SDK version.</li>
     * <li>Codec: Codec.</li>
     * <li>VideoType: Video format.</li>
     * <li>Network: Network type.</li>
     * <li>Isp: ISP.</li>
     * <li>VideoDefinition: Resolution.</li>
     * <li>Domain: Domain name.</li>
     * <li>Country: Country.</li>
     * <li>Province: Province.</li>
     * <li>ErrorCode: Error code.</li>
     * <li>IsHw: Hardware decoding.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Os</p>
     */
    @NameInMap("Dimension")
    public String dimension;

    /**
     * <p>The end time of the query. Format: yyyy-mm-ddThh:mm:ssZ (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2025-06-05T15:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The region used to limit the query scope when querying the metadata for the Province and ISP dimensions. Valid values:</p>
     * <ul>
     * <li>ALL (default): All regions.</li>
     * <li>CN: China.</li>
     * <li>OVERSEAS: Outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The start time of the query. Format: <i>yyyy-mm-dd</i>T<i>hh:mm:ss</i>Z (UTC).</p>
     * <blockquote>
     * <ul>
     * <li>You can query playback data history for the past year.</li>
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
