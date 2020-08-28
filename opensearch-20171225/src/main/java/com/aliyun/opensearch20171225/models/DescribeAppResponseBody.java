// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeAppResponseBody extends TeaModel {
    @NameInMap("requestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("result")
    @Validation(required = true)
    public DescribeAppResponseBodyResult result;

    public static DescribeAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppResponseBody self = new DescribeAppResponseBody();
        return TeaModel.build(map, self);
    }

    public static class DescribeAppResponseBodyResultQuota extends TeaModel {
        @NameInMap("docSize")
        @Validation(required = true)
        public Integer docSize;

        @NameInMap("computeResource")
        @Validation(required = true)
        public Integer computeResource;

        @NameInMap("qps")
        @Validation(required = true)
        public Integer qps;

        @NameInMap("spec")
        @Validation(required = true)
        public String spec;

        public static DescribeAppResponseBodyResultQuota build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppResponseBodyResultQuota self = new DescribeAppResponseBodyResultQuota();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAppResponseBodyResult extends TeaModel {
        @NameInMap("id")
        @Validation(required = true)
        public String id;

        @NameInMap("description")
        @Validation(required = true)
        public String description;

        @NameInMap("status")
        @Validation(required = true)
        public String status;

        @NameInMap("type")
        @Validation(required = true)
        public String type;

        @NameInMap("clusterName")
        @Validation(required = true)
        public String clusterName;

        @NameInMap("algoDeploymentId")
        @Validation(required = true)
        public Integer algoDeploymentId;

        @NameInMap("created")
        @Validation(required = true)
        public Integer created;

        @NameInMap("autoSwitch")
        @Validation(required = true)
        public Boolean autoSwitch;

        @NameInMap("progressPercent")
        @Validation(required = true)
        public Integer progressPercent;

        @NameInMap("schema")
        @Validation(required = true)
        public java.util.Map<String, ?> schema;

        @NameInMap("quota")
        @Validation(required = true)
        public DescribeAppResponseBodyResultQuota quota;

        @NameInMap("fetchFields")
        @Validation(required = true)
        public java.util.List<String> fetchFields;

        public static DescribeAppResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppResponseBodyResult self = new DescribeAppResponseBodyResult();
            return TeaModel.build(map, self);
        }

    }

}
