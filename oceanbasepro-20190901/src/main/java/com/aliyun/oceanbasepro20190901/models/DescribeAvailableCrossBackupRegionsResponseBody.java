// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAvailableCrossBackupRegionsResponseBody extends TeaModel {
    // 异地备份的可用地域列表
    @NameInMap("Data")
    public java.util.List<String> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAvailableCrossBackupRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableCrossBackupRegionsResponseBody self = new DescribeAvailableCrossBackupRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableCrossBackupRegionsResponseBody setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

    public DescribeAvailableCrossBackupRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
