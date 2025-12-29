// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListABTestScenesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D77D0DAF-790D-F5F5-A9C0-133738165014</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The details of the test scenario.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/173618.html">ABTestScene</a>.</p>
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
         * <p>The time when the test group was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1588836130</p>
         */
        @NameInMap("created")
        public Integer created;

        /**
         * <p>The ID of the test group.</p>
         * 
         * <strong>example:</strong>
         * <p>20404</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The alias of the test group.</p>
         * 
         * <strong>example:</strong>
         * <p>kevintest_2020-5-7_15:21:482</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The status of the test group. Valid values:</p>
         * <ul>
         * <li>0: not in effect</li>
         * <li>1: in effect</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("status")
        public Integer status;

        /**
         * <p>The time when the test group was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1588836129</p>
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
