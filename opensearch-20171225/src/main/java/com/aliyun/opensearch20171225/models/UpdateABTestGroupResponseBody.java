// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateABTestGroupResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

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
        @NameInMap("created")
        public Integer created;

        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        @NameInMap("status")
        public Integer status;

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
