// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateABTestGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The details of the test group.</p>
     */
    @NameInMap("result")
    public UpdateABTestGroupResponseBodyResult result;

    public static UpdateABTestGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateABTestGroupResponseBody self = new UpdateABTestGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateABTestGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateABTestGroupResponseBody setResult(UpdateABTestGroupResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateABTestGroupResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateABTestGroupResponseBodyResult extends TeaModel {
        /**
         * <p>The time when the test group was created.</p>
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
         * <p>The status of the test group. Valid values:</p>
         * <br>
         * <p>*   0: not in effect</p>
         * <p>*   1: in effect</p>
         */
        @NameInMap("status")
        public Integer status;

        /**
         * <p>The time when the test group was last modified.</p>
         */
        @NameInMap("updated")
        public Integer updated;

        public static UpdateABTestGroupResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateABTestGroupResponseBodyResult self = new UpdateABTestGroupResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateABTestGroupResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public UpdateABTestGroupResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateABTestGroupResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateABTestGroupResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public UpdateABTestGroupResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

    }

}
