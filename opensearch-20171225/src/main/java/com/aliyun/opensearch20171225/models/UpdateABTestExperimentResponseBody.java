// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateABTestExperimentResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public UpdateABTestExperimentResponseBodyResult result;

    public static UpdateABTestExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateABTestExperimentResponseBody self = new UpdateABTestExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateABTestExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateABTestExperimentResponseBody setResult(UpdateABTestExperimentResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateABTestExperimentResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateABTestExperimentResponseBodyResult extends TeaModel {
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

        public static UpdateABTestExperimentResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateABTestExperimentResponseBodyResult self = new UpdateABTestExperimentResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateABTestExperimentResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public UpdateABTestExperimentResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateABTestExperimentResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateABTestExperimentResponseBodyResult setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public UpdateABTestExperimentResponseBodyResult setParams(java.util.Map<String, ?> params) {
            this.params = params;
            return this;
        }
        public java.util.Map<String, ?> getParams() {
            return this.params;
        }

        public UpdateABTestExperimentResponseBodyResult setTraffic(Integer traffic) {
            this.traffic = traffic;
            return this;
        }
        public Integer getTraffic() {
            return this.traffic;
        }

        public UpdateABTestExperimentResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

    }

}
