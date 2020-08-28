// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ProduceEditingProjectVideoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MediaId")
    @Validation(required = true)
    public String mediaId;

    @NameInMap("ProjectId")
    @Validation(required = true)
    public String projectId;

    public static ProduceEditingProjectVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        ProduceEditingProjectVideoResponse self = new ProduceEditingProjectVideoResponse();
        return TeaModel.build(map, self);
    }

}
