// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class GetInstanceImageResponseBody extends TeaModel {
    @NameInMap("Image")
    public Image image;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceImageResponseBody self = new GetInstanceImageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceImageResponseBody setImage(Image image) {
        this.image = image;
        return this;
    }
    public Image getImage() {
        return this.image;
    }

    public GetInstanceImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
