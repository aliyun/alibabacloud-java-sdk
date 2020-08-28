// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class DescribeSamplingLogRequest extends TeaModel {
    @NameInMap("ReportId")
    @Validation(required = true)
    public String reportId;

    @NameInMap("ChainId")
    public Long chainId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("HttpResponseStatus")
    public String httpResponseStatus;

    @NameInMap("RtRange")
    public String rtRange;

    public static DescribeSamplingLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSamplingLogRequest self = new DescribeSamplingLogRequest();
        return TeaModel.build(map, self);
    }

}
