// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribePlayVideoStatisRequest extends TeaModel {
    /**
     * <p>The end time of the query. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
     * <blockquote>
     * <p>The end time must be later than the start time, and the maximum time span between the start time and end time is 180 days.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-06-30T13:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The start time of the query. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-06-29T13:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the video to query. Only one video ID can be specified. You can obtain the video ID by using the following methods:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong>.</li>
     * <li>Obtain the video ID from the response when you call the <a href="~~CreateUploadVideo~~">CreateUploadVideo</a> operation to obtain the upload URL and credential.</li>
     * <li>Obtain the video ID from the response when you call the <a href="~~SearchMedia~~">SearchMedia</a> operation to query the video after it is uploaded.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2a8d4cb9ecbb487681473****aba8fda</p>
     */
    @NameInMap("VideoId")
    public String videoId;

    public static DescribePlayVideoStatisRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayVideoStatisRequest self = new DescribePlayVideoStatisRequest();
        return TeaModel.build(map, self);
    }

    public DescribePlayVideoStatisRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribePlayVideoStatisRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribePlayVideoStatisRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribePlayVideoStatisRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
