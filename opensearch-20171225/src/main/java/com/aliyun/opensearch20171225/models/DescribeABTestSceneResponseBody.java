// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeABTestSceneResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public DescribeABTestSceneResponseBodyResult result;

    public static DescribeABTestSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeABTestSceneResponseBody self = new DescribeABTestSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeABTestSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeABTestSceneResponseBody setResult(DescribeABTestSceneResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeABTestSceneResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeABTestSceneResponseBodyResult extends TeaModel {
        @NameInMap("created")
        public Integer created;

        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        @NameInMap("status")
        public Integer status;

        @NameInMap("updated")
        public Integer updated;

        @NameInMap("values")
        public java.util.List<String> values;

        public static DescribeABTestSceneResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeABTestSceneResponseBodyResult self = new DescribeABTestSceneResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeABTestSceneResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public DescribeABTestSceneResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeABTestSceneResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeABTestSceneResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeABTestSceneResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

        public DescribeABTestSceneResponseBodyResult setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

}
