// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateABTestExperimentResponseBody extends TeaModel {
    @NameInMap("result")
    public CreateABTestExperimentResponseBodyResult result;

    @NameInMap("requestId")
    public String requestId;

    public static CreateABTestExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateABTestExperimentResponseBody self = new CreateABTestExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateABTestExperimentResponseBody setResult(CreateABTestExperimentResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateABTestExperimentResponseBodyResult getResult() {
        return this.result;
    }

    public CreateABTestExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateABTestExperimentResponseBodyResult extends TeaModel {
        @NameInMap("created")
        public Integer created;

        @NameInMap("params")
        public java.util.Map<String, ?> params;

        @NameInMap("traffic")
        public Integer traffic;

        @NameInMap("online")
        public Boolean online;

        @NameInMap("name")
        public String name;

        @NameInMap("updated")
        public Integer updated;

        @NameInMap("id")
        public String id;

        public static CreateABTestExperimentResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateABTestExperimentResponseBodyResult self = new CreateABTestExperimentResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateABTestExperimentResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public CreateABTestExperimentResponseBodyResult setParams(java.util.Map<String, ?> params) {
            this.params = params;
            return this;
        }
        public java.util.Map<String, ?> getParams() {
            return this.params;
        }

        public CreateABTestExperimentResponseBodyResult setTraffic(Integer traffic) {
            this.traffic = traffic;
            return this;
        }
        public Integer getTraffic() {
            return this.traffic;
        }

        public CreateABTestExperimentResponseBodyResult setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public CreateABTestExperimentResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateABTestExperimentResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

        public CreateABTestExperimentResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
