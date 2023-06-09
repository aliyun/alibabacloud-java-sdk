// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateABTestExperimentResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The details of the test.</p>
     */
    @NameInMap("result")
    public CreateABTestExperimentResponseBodyResult result;

    public static CreateABTestExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateABTestExperimentResponseBody self = new CreateABTestExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateABTestExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateABTestExperimentResponseBody setResult(CreateABTestExperimentResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateABTestExperimentResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateABTestExperimentResponseBodyResult extends TeaModel {
        /**
         * <p>The time when the test was created.</p>
         */
        @NameInMap("created")
        public Integer created;

        /**
         * <p>The ID of the test.</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The name of the test.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The status of the test. Valid values:</p>
         * <br>
         * <p>*   true: in effect</p>
         * <p>*   false: not in effect</p>
         */
        @NameInMap("online")
        public Boolean online;

        /**
         * <p>The parameters of the test.</p>
         */
        @NameInMap("params")
        public java.util.Map<String, ?> params;

        /**
         * <p>The percentage of traffic that is routed to the test.</p>
         */
        @NameInMap("traffic")
        public Integer traffic;

        /**
         * <p>The time when the test was last modified.</p>
         */
        @NameInMap("updated")
        public Integer updated;

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

        public CreateABTestExperimentResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateABTestExperimentResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateABTestExperimentResponseBodyResult setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
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

        public CreateABTestExperimentResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

    }

}
