// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class DescribeSampleMetricResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("SampleMetricList")
    @Validation(required = true)
    public String sampleMetricList;

    public static DescribeSampleMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleMetricResponse self = new DescribeSampleMetricResponse();
        return TeaModel.build(map, self);
    }

}
