// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeExportProgressResponseBody extends TeaModel {
    @NameInMap("FileHttpUrl")
    public String fileHttpUrl;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static DescribeExportProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExportProgressResponseBody self = new DescribeExportProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExportProgressResponseBody setFileHttpUrl(String fileHttpUrl) {
        this.fileHttpUrl = fileHttpUrl;
        return this;
    }
    public String getFileHttpUrl() {
        return this.fileHttpUrl;
    }

    public DescribeExportProgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExportProgressResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
