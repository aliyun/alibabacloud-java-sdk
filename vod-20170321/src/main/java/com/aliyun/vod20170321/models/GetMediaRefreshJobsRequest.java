// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaRefreshJobsRequest extends TeaModel {
    // 媒资ID
    @NameInMap("MediaId")
    public String mediaId;

    // 媒资刷新预热任务ID
    @NameInMap("MediaRefreshJobId")
    public String mediaRefreshJobId;

    public static GetMediaRefreshJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMediaRefreshJobsRequest self = new GetMediaRefreshJobsRequest();
        return TeaModel.build(map, self);
    }

    public GetMediaRefreshJobsRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public GetMediaRefreshJobsRequest setMediaRefreshJobId(String mediaRefreshJobId) {
        this.mediaRefreshJobId = mediaRefreshJobId;
        return this;
    }
    public String getMediaRefreshJobId() {
        return this.mediaRefreshJobId;
    }

}
