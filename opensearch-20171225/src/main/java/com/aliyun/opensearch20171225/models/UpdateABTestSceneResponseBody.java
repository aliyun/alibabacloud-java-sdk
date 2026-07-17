// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateABTestSceneResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D77D0DAF-790D-F5F5-A9C0-133738165014</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The details of the A/B test scenario.
     * For more information, see <a href="https://help.aliyun.com/document_detail/173618.html">ABTestScene</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
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
        /**
         * <p>The time when the scenario was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1596527691</p>
         */
        @NameInMap("created")
        public Integer created;

        /**
         * <p>The ID of the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>20614</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The alias of the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>kevintest22</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The status of the test.</p>
         * <ul>
         * <li><p>true: The test is started.</p>
         * </li>
         * <li><p>false: The test is stopped.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("online")
        public Boolean online;

        /**
         * <p>The parameters of the experiment.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("params")
        public java.util.Map<String, ?> params;

        /**
         * <p>The percentage of traffic that is allocated to the A/B test. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("traffic")
        public Integer traffic;

        /**
         * <p>The time when the scenario was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1596527691</p>
         */
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
