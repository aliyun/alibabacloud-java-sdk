// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateABTestGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The return result.</p>
     */
    @NameInMap("result")
    public CreateABTestGroupResponseBodyResult result;

    public static CreateABTestGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateABTestGroupResponseBody self = new CreateABTestGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateABTestGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateABTestGroupResponseBody setResult(CreateABTestGroupResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateABTestGroupResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateABTestGroupResponseBodyResult extends TeaModel {
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

        public static CreateABTestGroupResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateABTestGroupResponseBodyResult self = new CreateABTestGroupResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateABTestGroupResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public CreateABTestGroupResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateABTestGroupResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateABTestGroupResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CreateABTestGroupResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

    }

}
