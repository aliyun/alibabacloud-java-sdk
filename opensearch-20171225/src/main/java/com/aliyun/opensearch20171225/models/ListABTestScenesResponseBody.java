// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListABTestScenesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The details of the test scenarios.</p>
     * <br>
     * <p>For more information, see [ABTestScene](~~173618~~).</p>
     */
    @NameInMap("result")
    public java.util.List<ListABTestScenesResponseBodyResult> result;

    public static ListABTestScenesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListABTestScenesResponseBody self = new ListABTestScenesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListABTestScenesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListABTestScenesResponseBody setResult(java.util.List<ListABTestScenesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListABTestScenesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListABTestScenesResponseBodyResult extends TeaModel {
        /**
         * <p>The time when the test scenario was created.</p>
         */
        @NameInMap("created")
        public Integer created;

        /**
         * <p>The ID of the test group.</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The name of the test group.</p>
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
         * <p>The name of the test scenario.</p>
         */
        @NameInMap("values")
        public java.util.List<String> values;

        public static ListABTestScenesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListABTestScenesResponseBodyResult self = new ListABTestScenesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListABTestScenesResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public ListABTestScenesResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListABTestScenesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListABTestScenesResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListABTestScenesResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

        public ListABTestScenesResponseBodyResult setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

}
