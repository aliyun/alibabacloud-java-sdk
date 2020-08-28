// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateImageInfosResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NonExistImageIds")
    @Validation(required = true)
    public UpdateImageInfosResponseNonExistImageIds nonExistImageIds;

    public static UpdateImageInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageInfosResponse self = new UpdateImageInfosResponse();
        return TeaModel.build(map, self);
    }

    public static class UpdateImageInfosResponseNonExistImageIds extends TeaModel {
        @NameInMap("ImageId")
        @Validation(required = true)
        public java.util.List<String> imageId;

        public static UpdateImageInfosResponseNonExistImageIds build(java.util.Map<String, ?> map) throws Exception {
            UpdateImageInfosResponseNonExistImageIds self = new UpdateImageInfosResponseNonExistImageIds();
            return TeaModel.build(map, self);
        }

    }

}
