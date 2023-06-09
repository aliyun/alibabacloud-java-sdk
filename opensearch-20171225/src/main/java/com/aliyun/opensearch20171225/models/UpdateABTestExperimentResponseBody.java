// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateABTestExperimentResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The details of the test.</p>
     */
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
         * <br>
         * <p>Value values: 0 to 100.</p>
         */
        @NameInMap("traffic")
        public Integer traffic;

        /**
         * <p>The time when the test was last modified.</p>
         */
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
