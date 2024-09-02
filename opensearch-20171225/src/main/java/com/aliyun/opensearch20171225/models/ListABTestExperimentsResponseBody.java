// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListABTestExperimentsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D77D0DAF-790D-F5F5-A9C0-133738165014</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The experiment details.\
     * For more information, see <a href="https://help.aliyun.com/document_detail/173617.html">ABTestExperiment</a>.</p>
     */
    @NameInMap("result")
    public java.util.List<ListABTestExperimentsResponseBodyResult> result;

    public static ListABTestExperimentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListABTestExperimentsResponseBody self = new ListABTestExperimentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListABTestExperimentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListABTestExperimentsResponseBody setResult(java.util.List<ListABTestExperimentsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListABTestExperimentsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListABTestExperimentsResponseBodyResult extends TeaModel {
        /**
         * <p>The time when the experiment was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1588842080</p>
         */
        @NameInMap("created")
        public Integer created;

        /**
         * <p>The experiment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12888</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The group alias.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Indicates whether the experiment is in effect. Valid values:</p>
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
         * <p>The experiment parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("params")
        public java.util.Map<String, ?> params;

        /**
         * <p>The percentage of traffic that is routed to the experiment.</p>
         * <p>Valid values: [0,100]</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("traffic")
        public Integer traffic;

        /**
         * <p>The time when the experiment was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1588842080</p>
         */
        @NameInMap("updated")
        public Integer updated;

        public static ListABTestExperimentsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListABTestExperimentsResponseBodyResult self = new ListABTestExperimentsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListABTestExperimentsResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public ListABTestExperimentsResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListABTestExperimentsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListABTestExperimentsResponseBodyResult setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public ListABTestExperimentsResponseBodyResult setParams(java.util.Map<String, ?> params) {
            this.params = params;
            return this;
        }
        public java.util.Map<String, ?> getParams() {
            return this.params;
        }

        public ListABTestExperimentsResponseBodyResult setTraffic(Integer traffic) {
            this.traffic = traffic;
            return this;
        }
        public Integer getTraffic() {
            return this.traffic;
        }

        public ListABTestExperimentsResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

    }

}
