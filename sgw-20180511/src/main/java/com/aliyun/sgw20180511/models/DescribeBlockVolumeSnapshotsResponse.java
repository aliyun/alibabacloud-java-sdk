// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeBlockVolumeSnapshotsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBlockVolumeSnapshotsResponseBody body;

    public static DescribeBlockVolumeSnapshotsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockVolumeSnapshotsResponse self = new DescribeBlockVolumeSnapshotsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBlockVolumeSnapshotsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBlockVolumeSnapshotsResponse setBody(DescribeBlockVolumeSnapshotsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBlockVolumeSnapshotsResponseBody getBody() {
        return this.body;
    }

}
