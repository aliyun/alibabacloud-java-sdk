// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class CreateCustomImageResponseBody extends TeaModel {
    /**
     * <p>The ID of the custom image.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCustomImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomImageResponseBody self = new CreateCustomImageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomImageResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateCustomImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
