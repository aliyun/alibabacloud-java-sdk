// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateABTestGroupResponseBody extends TeaModel {
    @NameInMap("result")
    public CreateABTestGroupResponseBodyResult result;

    @NameInMap("requestId")
    public String requestId;

    public static CreateABTestGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateABTestGroupResponseBody self = new CreateABTestGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateABTestGroupResponseBody setResult(CreateABTestGroupResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateABTestGroupResponseBodyResult getResult() {
        return this.result;
    }

    public CreateABTestGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateABTestGroupResponseBodyResult extends TeaModel {
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

        public CreateABTestGroupResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateABTestGroupResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
