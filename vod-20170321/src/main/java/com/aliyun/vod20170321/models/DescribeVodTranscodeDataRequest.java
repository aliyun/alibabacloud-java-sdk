// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodTranscodeDataRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can specify this parameter to query the transcoding statistics of a specific application. By default, the transcoding statistics of all applications is returned. You can obtain the application ID from the <code>AppId</code> parameter in the response to the <a href="~~CreateAppInfo~~">CreateAppInfo</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>app-1000001</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-02-01T15:59:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The interval at which you want to query data. Valid values:</p>
     * <ul>
     * <li><strong>day</strong>: days</li>
     * <li><strong>hour</strong>: hours</li>
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
     * <p>The region in which you want to query data. If you leave this parameter empty, data in all regions is returned. Separate multiple regions with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>cn-shanghai</strong>: China (Shanghai)</li>
     * <li><strong>cn-beijing</strong>: China (Beijing)</li>
     * <li><strong>eu-central-1</strong>: Germany (Frankfurt)</li>
     * <li><strong>ap-southeast-1</strong>: Singapore</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The transcoding specification. If you leave this parameter empty, data of all transcoding specifications is returned. Separate multiple transcoding specifications with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>Audio</strong>: audio transcoding</li>
     * <li><strong>Segmentation</strong>: container format conversion</li>
     * <li><strong>H264.LD</strong>, <strong>H264.SD</strong>, <strong>H264.HD</strong>, <strong>H264.2K</strong>, <strong>H264.4K</strong>, and more</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Audio</p>
     */
    @NameInMap("Specification")
    public String specification;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-02-01T15:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the Object Storage Service (OSS) bucket. If you leave this parameter empty, data of all buckets is returned. Separate multiple bucket names with commas (,).</p>
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
