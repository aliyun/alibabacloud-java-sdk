// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodTranscodeDataRequest extends TeaModel {
    /**
     * <p>The application ID. If you specify this parameter, transcoding usage data for the specified application is returned. By default, transcoding usage data for all applications is returned. You can obtain the value of this parameter from the AppId response parameter of the <a href="~~CreateAppInfo~~">CreateAppInfo</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>app-1000001</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-02-01T15:59:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time granularity. Valid values:</p>
     * <ul>
     * <li><strong>day</strong>: day.</li>
     * <li><strong>hour</strong>: hour.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>day</p>
     */
    @NameInMap("Interval")
    public String interval;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The storage region. By default, data for all regions is returned. You can specify multiple regions separated by commas (,). Valid values:</p>
     * <ul>
     * <li><strong>cn-shanghai</strong>: Shanghai.</li>
     * <li><strong>cn-beijing</strong>: Beijing.</li>
     * <li><strong>eu-central-1</strong>: Germany.</li>
     * <li><strong>ap-southeast-1</strong>: Singapore.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The transcoding specification. By default, data for all transcoding specifications is returned. You can specify multiple specifications separated by commas (,). Valid values:</p>
     * <ul>
     * <li><strong>Audio</strong>: audio-only.</li>
     * <li><strong>Segmentation</strong>: container format conversion.</li>
     * <li><strong>H264.LD</strong>, <strong>H264.SD</strong>, <strong>H264.HD</strong>, <strong>H264.2K</strong>, <strong>H264.4K</strong>, and more.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Audio</p>
     */
    @NameInMap("Specification")
    public String specification;

    /**
     * <p>The start of the time range to query. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-02-01T15:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The storage name (Alibaba Cloud OSS bucket name). By default, data for all storage locations is returned. You can specify multiple storage names separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>bucket01</p>
     */
    @NameInMap("Storage")
    public String storage;

    public static DescribeVodTranscodeDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodTranscodeDataRequest self = new DescribeVodTranscodeDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodTranscodeDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeVodTranscodeDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodTranscodeDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeVodTranscodeDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVodTranscodeDataRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeVodTranscodeDataRequest setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

    public DescribeVodTranscodeDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeVodTranscodeDataRequest setStorage(String storage) {
        this.storage = storage;
        return this;
    }
    public String getStorage() {
        return this.storage;
    }

}
