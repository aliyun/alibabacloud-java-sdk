// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodPlayerDimensionDataDemoResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<String> dataList;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4A*****F6-D7393642CA58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVodPlayerDimensionDataDemoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodPlayerDimensionDataDemoResponseBody self = new DescribeVodPlayerDimensionDataDemoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodPlayerDimensionDataDemoResponseBody setDataList(java.util.List<String> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<String> getDataList() {
        return this.dataList;
    }

    public DescribeVodPlayerDimensionDataDemoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
