// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodRangeDataByLocateAndIspServiceResponseBody extends TeaModel {
    /**
     * <p>The returned result. The value is in the JSON format. These parameters indicate the following information in sequence: UNIX time, region, ISP, distribution of HTTP status codes, response time, bandwidth (bit/s), average response rate, page views, cache hit ratio, and request hit ratio.</p>
     */
    @NameInMap("JsonResult")
    public String jsonResult;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C74802AA-C277-5A80-BDF2-072B05F119C7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVodRangeDataByLocateAndIspServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodRangeDataByLocateAndIspServiceResponseBody self = new DescribeVodRangeDataByLocateAndIspServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodRangeDataByLocateAndIspServiceResponseBody setJsonResult(String jsonResult) {
        this.jsonResult = jsonResult;
        return this;
    }
    public String getJsonResult() {
        return this.jsonResult;
    }

    public DescribeVodRangeDataByLocateAndIspServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
