// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ProduceEditingProjectVideoResponseBody extends TeaModel {
    /**
     * <p>The ID of the produced video.</p>
     * <br>
     * <p>> *   This parameter is returned for each request.</p>
     * <p>> *   If a value is returned for this parameter, the video production task is being asynchronously processed.</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The ID of the online editing project.</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The ID of the request.</p>
     */
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
