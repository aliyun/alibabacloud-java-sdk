// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateABTestSceneResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The return result.</p>
     */
    @NameInMap("result")
    public CreateABTestSceneResponseBodyResult result;

    public static CreateABTestSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateABTestSceneResponseBody self = new CreateABTestSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateABTestSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateABTestSceneResponseBody setResult(CreateABTestSceneResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateABTestSceneResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateABTestSceneResponseBodyResult extends TeaModel {
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
         * <p>The tag of the test scenario.</p>
         */
        @NameInMap("values")
        public java.util.List<String> values;

        public static CreateABTestSceneResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateABTestSceneResponseBodyResult self = new CreateABTestSceneResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateABTestSceneResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public CreateABTestSceneResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateABTestSceneResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateABTestSceneResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CreateABTestSceneResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

        public CreateABTestSceneResponseBodyResult setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

}
