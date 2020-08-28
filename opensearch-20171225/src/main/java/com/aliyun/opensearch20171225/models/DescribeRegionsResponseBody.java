// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    @NameInMap("status")
    @Validation(required = true)
    public String status;

    @NameInMap("errors")
    @Validation(required = true)
    public DescribeRegionsResponseBodyErrors errors;

    public static DescribeRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponseBody self = new DescribeRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public static class DescribeRegionsResponseBodyErrorsError extends TeaModel {
        @NameInMap("code")
        @Validation(required = true)
        public Integer code;

        @NameInMap("message")
        @Validation(required = true)
        public String message;

        public static DescribeRegionsResponseBodyErrorsError build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyErrorsError self = new DescribeRegionsResponseBodyErrorsError();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeRegionsResponseBodyErrors extends TeaModel {
        @NameInMap("error")
        @Validation(required = true)
        public java.util.List<DescribeRegionsResponseBodyErrorsError> error;

        public static DescribeRegionsResponseBodyErrors build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyErrors self = new DescribeRegionsResponseBodyErrors();
            return TeaModel.build(map, self);
        }

    }

}
