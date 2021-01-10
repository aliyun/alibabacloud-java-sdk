// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeABTestGroupResponseBody extends TeaModel {
    @NameInMap("result")
    public DescribeABTestGroupResponseBodyResult result;

    @NameInMap("requestId")
    public String requestId;

    public static DescribeABTestGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeABTestGroupResponseBody self = new DescribeABTestGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeABTestGroupResponseBody setResult(DescribeABTestGroupResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeABTestGroupResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeABTestGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeABTestGroupResponseBodyResult extends TeaModel {
        @NameInMap("created")
        public Integer created;

        @NameInMap("status")
        public Integer status;

        @NameInMap("updated")
        public Integer updated;

        @NameInMap("name")
        public String name;

        @NameInMap("id")
        public String id;

        public static DescribeABTestGroupResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeABTestGroupResponseBodyResult self = new DescribeABTestGroupResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeABTestGroupResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public DescribeABTestGroupResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeABTestGroupResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

        public DescribeABTestGroupResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeABTestGroupResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
