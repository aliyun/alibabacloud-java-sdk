// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitLiveEditingResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("ProjectId")
    public String projectId;

    public static SubmitLiveEditingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitLiveEditingResponseBody self = new SubmitLiveEditingResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitLiveEditingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitLiveEditingResponseBody setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public SubmitLiveEditingResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
