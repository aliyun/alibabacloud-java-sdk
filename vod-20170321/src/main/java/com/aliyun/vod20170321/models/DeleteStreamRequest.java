// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteStreamRequest extends TeaModel {
    /**
     * <p>The job IDs for deleting media streams.</p>
     * <ul>
     * <li>Separate multiple IDs with commas (,). A maximum of 20 IDs can be specified for one video.</li>
     * <li>You can obtain job IDs from the PlayInfo parameter that is returned after you call the <a href="https://help.aliyun.com/document_detail/56124.html">GetPlayInfo</a> operation. Each media stream has a unique job ID.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>35eb4dbda18c49cc0025df374b46****</p>
     */
    @NameInMap("JobIds")
    public String jobIds;

    /**
     * <p>The ID of the video.</p>
     * <p>This parameter is required.</p>
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

    public DeleteStreamRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
