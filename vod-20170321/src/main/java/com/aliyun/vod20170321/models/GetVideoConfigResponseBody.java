// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoConfigResponseBody extends TeaModel {
    @NameInMap("DownloadSwitch")
    public String downloadSwitch;

    @NameInMap("RequestId")
    public String requestId;

    public static GetVideoConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoConfigResponseBody self = new GetVideoConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoConfigResponseBody setDownloadSwitch(String downloadSwitch) {
        this.downloadSwitch = downloadSwitch;
        return this;
    }
    public String getDownloadSwitch() {
        return this.downloadSwitch;
    }

    public GetVideoConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
