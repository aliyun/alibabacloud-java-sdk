// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLDCCellgroupDisasterinfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLDCCellgroupDisasterinfoResponseBody body;

    public static UpdateLDCCellgroupDisasterinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLDCCellgroupDisasterinfoResponse self = new UpdateLDCCellgroupDisasterinfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLDCCellgroupDisasterinfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLDCCellgroupDisasterinfoResponse setBody(UpdateLDCCellgroupDisasterinfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLDCCellgroupDisasterinfoResponseBody getBody() {
        return this.body;
    }

}
