// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListJobInfoRequest extends TeaModel {
    /**
     * <p>The type of the task. Valid values:</p>
     * <ul>
     * <li>transcode</li>
     * <li>snapshot</li>
     * <li>ai</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>transcode</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The ID of the media asset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30e5d7**********bd900764de7c0102</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    public static ListJobInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobInfoRequest self = new ListJobInfoRequest();
        return TeaModel.build(map, self);
    }

    public ListJobInfoRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public ListJobInfoRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

}
