// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListABTestGroupsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D77D0DAF-790D-F5F5-A9C0-133738165014</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The test groups.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/178935.html">ABTestGroup</a>.</p>
     */
    @NameInMap("result")
    public java.util.List<ListABTestGroupsResponseBodyResult> result;

    public static ListABTestGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListABTestGroupsResponseBody self = new ListABTestGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListABTestGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListABTestGroupsResponseBody setResult(java.util.List<ListABTestGroupsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListABTestGroupsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListABTestGroupsResponseBodyResult extends TeaModel {
        /**
         * <p>The time when the test group was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1588839490</p>
         */
        @NameInMap("created")
        public Integer created;

        /**
         * <p>The ID of the test group.</p>
         * 
         * <strong>example:</strong>
         * <p>13466</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The name of the test group.</p>
         * 
         * <strong>example:</strong>
         * <p>Group_2020-5-7_15:23:3</p>
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
         * <p>The time when the test group was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1588839490</p>
         */
        @NameInMap("updated")
        public Integer updated;

        public static ListABTestGroupsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListABTestGroupsResponseBodyResult self = new ListABTestGroupsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListABTestGroupsResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public ListABTestGroupsResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListABTestGroupsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListABTestGroupsResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListABTestGroupsResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

    }

}
