// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodTranscodeDataRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time granularity at which the data is queried. Valid values:</p>
     * <br>
     * <p>*   **day**</p>
     * <p>*   **hour**</p>
     */
    @NameInMap("Interval")
    public String interval;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region where the transcoded file is stored. If you do not set this parameter, the data in all regions is returned. You can specify multiple regions. Separate them with commas (,). Valid values:</p>
     * <br>
     * <p>*   **cn-shanghai**: China (Shanghai)</p>
     * <p>*   **cn-beijing**: China (Beijing)</p>
     * <p>*   **eu-central-1**: Germany (Frankfurt)</p>
     * <p>*   **ap-southeast-1**: Singapore</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The transcoding specification. If you do not set this parameter, the data of all transcoding specifications is returned. You can specify multiple transcoding specifications. Separate them with commas (,). Valid values:</p>
     * <br>
     * <p>*   **Audio**: audio transcoding</p>
     * <p>*   **Segmentation**: container format conversion</p>
     * <p>*   H.264 and H.265-related video transcoding specifications, such as **H264.LD**, **H264.SD**, **H264.HD**, **H264.2K**, and **H264.4K**</p>
     */
    @NameInMap("Specification")
    public String specification;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the Object Storage Service (OSS) bucket. If you do not set this parameter, the data of all buckets is returned. You can specify multiple buckets. Separate them with commas (,).</p>
     */
    @NameInMap("Storage")
    public String storage;

    public static DescribeVodTranscodeDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodTranscodeDataRequest self = new DescribeVodTranscodeDataRequest();
        return TeaModel.build(map, self);
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
