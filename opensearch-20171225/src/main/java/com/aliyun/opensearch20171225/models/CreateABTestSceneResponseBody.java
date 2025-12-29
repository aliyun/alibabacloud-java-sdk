// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateABTestSceneResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D77D0DAF-790D-F5F5-A9C0-133738165014</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned data.</p>
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
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("created")
        public Integer created;

        /**
         * <p>The ID of the test group.</p>
         * 
         * <strong>example:</strong>
         * <p>20405</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The name of the A/B test group.</p>
         * 
         * <strong>example:</strong>
         * <p>kevintest_2020-5-7_15:21:48</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The status. Valid values:</p>
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
         * <p>The time when the test scenario was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1589012351</p>
         */
        @NameInMap("updated")
        public Integer updated;

        /**
         * <p>The ID of the test scenario</p>
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
