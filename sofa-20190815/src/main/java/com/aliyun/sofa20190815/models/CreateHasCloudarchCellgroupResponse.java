// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasCloudarchCellgroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHasCloudarchCellgroupResponseBody body;

    public static CreateHasCloudarchCellgroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHasCloudarchCellgroupResponse self = new CreateHasCloudarchCellgroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateHasCloudarchCellgroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHasCloudarchCellgroupResponse setBody(CreateHasCloudarchCellgroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHasCloudarchCellgroupResponseBody getBody() {
        return this.body;
    }

}
