// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ProduceEditingProjectVideoResponseBody extends TeaModel {
    // The ID of the produced video.
    // 
    // > *   This operation returns the ID of the produced video in synchronous mode.
    // > *   If this operation returns the MediaId parameter, the video production task is being asynchronously processed.
    @NameInMap("MediaId")
    public String mediaId;

    // The ID of the online editing project.
    @NameInMap("ProjectId")
    public String projectId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static ProduceEditingProjectVideoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ProduceEditingProjectVideoResponseBody self = new ProduceEditingProjectVideoResponseBody();
        return TeaModel.build(map, self);
    }

    public ProduceEditingProjectVideoResponseBody setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public ProduceEditingProjectVideoResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ProduceEditingProjectVideoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
