// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTemplateDownloadResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public Boolean data;

    public static DescribeTemplateDownloadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplateDownloadResponseBody self = new DescribeTemplateDownloadResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTemplateDownloadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTemplateDownloadResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}
