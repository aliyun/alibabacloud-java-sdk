// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeABTestSceneResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The details of the test scenario.</p>
     */
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
        /**
         * <p>The time when the test scenario was created.</p>
         */
        @NameInMap("created")
        public Integer created;

        /**
         * <p>The ID of the test scenario.</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The name of the test scenario.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The status of the test scenario. Valid values:</p>
         * <br>
         * <p>*   0: not in effect</p>
         * <p>*   1: in effect</p>
         */
        @NameInMap("status")
        public Integer status;

        /**
         * <p>The time when the test scenario was last modified.</p>
         */
        @NameInMap("updated")
        public Integer updated;

        /**
         * <p>The tag of the test scenario.</p>
         */
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
