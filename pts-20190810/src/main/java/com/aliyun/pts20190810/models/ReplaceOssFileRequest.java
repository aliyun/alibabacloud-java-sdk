// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class ReplaceOssFileRequest extends TeaModel {
    @NameInMap("SceneId")
    @Validation(required = true)
    public String sceneId;

    @NameInMap("OriginalOssFileUrl")
    @Validation(required = true)
    public String originalOssFileUrl;

    @NameInMap("NewOssFileUrl")
    @Validation(required = true)
    public String newOssFileUrl;

    @NameInMap("JobId")
    public String jobId;

    public static ReplaceOssFileRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceOssFileRequest self = new ReplaceOssFileRequest();
        return TeaModel.build(map, self);
    }

}
