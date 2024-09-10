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
     * 
     * <strong>example:</strong>
     * <p>DA8133CC-CCA0-5CF2-BF64-FE7D52C44***</p>
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
         * <ul>
         * <li><strong>instanceId</strong>: the ID of the container instance.</li>
         * <li><strong>clusterId</strong>: the cluster ID.</li>
         * <li><strong>regionId</strong>: the ID of the region in which the container resides.</li>
         * <li><strong>clusterName</strong>: the name of the cluster.</li>
         * <li><strong>clusterType</strong>: the type of the cluster.</li>
         * <li><strong>hostIp</strong>: the public IP address.</li>
         * <li><strong>pod</strong>: the pod.</li>
         * <li><strong>podIp</strong>: the IP address of the pod.</li>
         * <li><strong>containerId</strong>: the container ID.</li>
         * <li><strong>containerScope</strong>: the type of the container.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>containerScope</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the search condition. Valid values:</p>
         * <ul>
         * <li><strong>input</strong>: The search condition needs to be specified.</li>
         * <li><strong>select</strong>: The search condition is an option that can be selected from the drop-down list.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>select</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The values.</p>
         * 
         * <strong>example:</strong>
         * <p>NO,YES</p>
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
