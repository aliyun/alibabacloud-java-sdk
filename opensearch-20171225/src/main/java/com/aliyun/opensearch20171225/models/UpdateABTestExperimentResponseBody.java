// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateABTestExperimentResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D77D0DAF-790D-F5F5-A9C0-133738165014</p>
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
         * 
         * <strong>example:</strong>
         * <p>1588842080</p>
         */
        @NameInMap("created")
        public Integer created;

        /**
         * <p>The test ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12888</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The alias of the test.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Indicates whether the test is in effect. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("online")
        public Boolean online;

        /**
         * <p>The test parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("params")
        public java.util.Map<String, ?> params;

        /**
         * <p>The percentage of traffic that is routed to the test. Valid values: [0,100]</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("traffic")
        public Integer traffic;

        /**
         * <p>The time when the test was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1588842080</p>
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
