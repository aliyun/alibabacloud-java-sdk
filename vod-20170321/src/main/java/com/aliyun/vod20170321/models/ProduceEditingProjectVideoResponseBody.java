// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ProduceEditingProjectVideoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("ProjectId")
    public String projectId;

    public static ProduceEditingProjectVideoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ProduceEditingProjectVideoResponseBody self = new ProduceEditingProjectVideoResponseBody();
        return TeaModel.build(map, self);
    }

    public ProduceEditingProjectVideoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

}
