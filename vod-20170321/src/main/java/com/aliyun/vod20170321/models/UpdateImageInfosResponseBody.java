// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateImageInfosResponseBody extends TeaModel {
    @NameInMap("NonExistImageIds")
    public UpdateImageInfosResponseBodyNonExistImageIds nonExistImageIds;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateImageInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageInfosResponseBody self = new UpdateImageInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateImageInfosResponseBody setNonExistImageIds(UpdateImageInfosResponseBodyNonExistImageIds nonExistImageIds) {
        this.nonExistImageIds = nonExistImageIds;
        return this;
    }
    public UpdateImageInfosResponseBodyNonExistImageIds getNonExistImageIds() {
        return this.nonExistImageIds;
    }

    public UpdateImageInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateImageInfosResponseBodyNonExistImageIds extends TeaModel {
        @NameInMap("ImageId")
        public java.util.List<String> imageId;

        public static UpdateImageInfosResponseBodyNonExistImageIds build(java.util.Map<String, ?> map) throws Exception {
            UpdateImageInfosResponseBodyNonExistImageIds self = new UpdateImageInfosResponseBodyNonExistImageIds();
            return TeaModel.build(map, self);
        }

        public UpdateImageInfosResponseBodyNonExistImageIds setImageId(java.util.List<String> imageId) {
            this.imageId = imageId;
            return this;
        }
        public java.util.List<String> getImageId() {
            return this.imageId;
        }

    }

}
