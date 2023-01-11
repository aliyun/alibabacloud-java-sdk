// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class AddImageResponseBody extends TeaModel {
    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("requestId")
    public String requestId;

    public static AddImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddImageResponseBody self = new AddImageResponseBody();
        return TeaModel.build(map, self);
    }

    public AddImageResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public AddImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
