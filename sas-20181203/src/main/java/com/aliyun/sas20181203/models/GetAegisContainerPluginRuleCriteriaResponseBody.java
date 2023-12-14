// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAegisContainerPluginRuleCriteriaResponseBody extends TeaModel {
    /**
     * <p>The information about the search condition.</p>
     */
    @NameInMap("CriteriaList")
    public java.util.List<GetAegisContainerPluginRuleCriteriaResponseBodyCriteriaList> criteriaList;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAegisContainerPluginRuleCriteriaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAegisContainerPluginRuleCriteriaResponseBody self = new GetAegisContainerPluginRuleCriteriaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAegisContainerPluginRuleCriteriaResponseBody setCriteriaList(java.util.List<GetAegisContainerPluginRuleCriteriaResponseBodyCriteriaList> criteriaList) {
        this.criteriaList = criteriaList;
        return this;
    }
    public java.util.List<GetAegisContainerPluginRuleCriteriaResponseBodyCriteriaList> getCriteriaList() {
        return this.criteriaList;
    }

    public GetAegisContainerPluginRuleCriteriaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAegisContainerPluginRuleCriteriaResponseBodyCriteriaList extends TeaModel {
        /**
         * <p>The name of the search condition. Valid values:</p>
         * <br>
         * <p>*   **instanceId**: the ID of the container instance.</p>
         * <p>*   **clusterId**: the cluster ID.</p>
         * <p>*   **regionId**: the ID of the region in which the container resides.</p>
         * <p>*   **clusterName**: the name of the cluster.</p>
         * <p>*   **clusterType**: the type of the cluster.</p>
         * <p>*   **hostIp**: the public IP address.</p>
         * <p>*   **pod**: the pod.</p>
         * <p>*   **podIp**: the IP address of the pod.</p>
         * <p>*   **containerId**: the container ID.</p>
         * <p>*   **containerScope**: the type of the container.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the search condition. Valid values:</p>
         * <br>
         * <p>*   **input**: The search condition needs to be specified.</p>
         * <p>*   **select**: The search condition is an option that can be selected from the drop-down list.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The values.</p>
         */
        @NameInMap("Values")
        public String values;

        public static GetAegisContainerPluginRuleCriteriaResponseBodyCriteriaList build(java.util.Map<String, ?> map) throws Exception {
            GetAegisContainerPluginRuleCriteriaResponseBodyCriteriaList self = new GetAegisContainerPluginRuleCriteriaResponseBodyCriteriaList();
            return TeaModel.build(map, self);
        }

        public GetAegisContainerPluginRuleCriteriaResponseBodyCriteriaList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAegisContainerPluginRuleCriteriaResponseBodyCriteriaList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetAegisContainerPluginRuleCriteriaResponseBodyCriteriaList setValues(String values) {
            this.values = values;
            return this;
        }
        public String getValues() {
            return this.values;
        }

    }

}
