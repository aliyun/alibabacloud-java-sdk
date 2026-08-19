// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteStreamRequest extends TeaModel {
    /**
     * <p>The list of job IDs for media stream transcoding, which consists of one or more job IDs.</p>
     * <ul>
     * <li>Separate multiple IDs with commas (,). A maximum of 20 job IDs under the same video are supported.</li>
     * <li>You can obtain the JobId from the PlayInfo struct returned by the <a href="https://help.aliyun.com/document_detail/56124.html">GetPlayInfo</a> operation. Each media stream has a different JobId.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>35eb4dbda18c49cc0025df374b46****</p>
     */
    @NameInMap("JobIds")
    public String jobIds;

    /**
     * <p>The custom ID. Only lowercase letters, uppercase letters, digits, hyphens (-), and underscores (_) are supported. The value must be 6 to 64 characters in length. The value is unique per user.</p>
     * 
     * <strong>example:</strong>
     * <p>123-123</p>
     */
    @NameInMap("ReferenceId")
    public String referenceId;

    /**
     * <p>The video ID. You can obtain the video ID by using one of the following methods:</p>
     * <ul>
     * <li>For videos uploaded by using the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the video ID.</li>
     * <li>When you upload a video by calling the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation, the video ID is the value of the VideoId parameter in the response.</li>
     * <li>After a video is uploaded, you can call the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation to query the video ID, which is the value of the VideoId parameter in the response.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>95948ddba24446b6aed5db985e78****</p>
     */
    @NameInMap("VideoId")
    public String videoId;

    public static DeleteStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStreamRequest self = new DeleteStreamRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStreamRequest setJobIds(String jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public String getJobIds() {
        return this.jobIds;
    }

    public DeleteStreamRequest setReferenceId(String referenceId) {
        this.referenceId = referenceId;
        return this;
    }
    public String getReferenceId() {
        return this.referenceId;
    }

    public DeleteStreamRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
