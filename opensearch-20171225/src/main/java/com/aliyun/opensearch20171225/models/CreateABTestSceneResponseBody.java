// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateABTestSceneResponseBody extends TeaModel {
    @NameInMap("result")
    public CreateABTestSceneResponseBodyResult result;

    @NameInMap("requestId")
    public String requestId;

    public static CreateABTestSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateABTestSceneResponseBody self = new CreateABTestSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateABTestSceneResponseBody setResult(CreateABTestSceneResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateABTestSceneResponseBodyResult getResult() {
        return this.result;
    }

    public CreateABTestSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateABTestSceneResponseBodyResult extends TeaModel {
        @NameInMap("created")
        public Integer created;

        @NameInMap("values")
        public java.util.List<String> values;

        @NameInMap("status")
        public Integer status;

        @NameInMap("updated")
        public Integer updated;

        @NameInMap("name")
        public String name;

        @NameInMap("id")
        public String id;

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

        public CreateABTestSceneResponseBodyResult setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
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

        public CreateABTestSceneResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateABTestSceneResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
