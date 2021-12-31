// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateABTestSceneResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public UpdateABTestSceneResponseBodyResult result;

    public static UpdateABTestSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateABTestSceneResponseBody self = new UpdateABTestSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateABTestSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateABTestSceneResponseBody setResult(UpdateABTestSceneResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateABTestSceneResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateABTestSceneResponseBodyResult extends TeaModel {
        @NameInMap("created")
        public Integer created;

        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        @NameInMap("online")
        public Boolean online;

        @NameInMap("params")
        public java.util.Map<String, ?> params;

        @NameInMap("traffic")
        public Integer traffic;

        @NameInMap("updated")
        public Integer updated;

        public static UpdateABTestSceneResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateABTestSceneResponseBodyResult self = new UpdateABTestSceneResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateABTestSceneResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public UpdateABTestSceneResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateABTestSceneResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateABTestSceneResponseBodyResult setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public UpdateABTestSceneResponseBodyResult setParams(java.util.Map<String, ?> params) {
            this.params = params;
            return this;
        }
        public java.util.Map<String, ?> getParams() {
            return this.params;
        }

        public UpdateABTestSceneResponseBodyResult setTraffic(Integer traffic) {
            this.traffic = traffic;
            return this;
        }
        public Integer getTraffic() {
            return this.traffic;
        }

        public UpdateABTestSceneResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

    }

}
