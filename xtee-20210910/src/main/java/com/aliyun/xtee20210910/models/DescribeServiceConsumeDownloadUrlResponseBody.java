// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeServiceConsumeDownloadUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("downloadFileUrl")
    public String downloadFileUrl;

    public static DescribeServiceConsumeDownloadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceConsumeDownloadUrlResponseBody self = new DescribeServiceConsumeDownloadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceConsumeDownloadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServiceConsumeDownloadUrlResponseBody setDownloadFileUrl(String downloadFileUrl) {
        this.downloadFileUrl = downloadFileUrl;
        return this;
    }
    public String getDownloadFileUrl() {
        return this.downloadFileUrl;
    }

}
