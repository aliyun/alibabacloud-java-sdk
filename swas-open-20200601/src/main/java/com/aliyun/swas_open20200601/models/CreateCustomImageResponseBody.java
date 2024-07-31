// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class CreateCustomImageResponseBody extends TeaModel {
    /**
     * <p>The custom image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>m-csaascsaccscs****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
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
