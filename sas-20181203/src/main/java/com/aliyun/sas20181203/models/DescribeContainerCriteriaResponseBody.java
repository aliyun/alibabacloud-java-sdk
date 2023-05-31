// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerCriteriaResponseBody extends TeaModel {
    /**
     * <p>An array that consists of information about the filter condition.</p>
     */
    @NameInMap("CriteriaList")
    public java.util.List<DescribeContainerCriteriaResponseBodyCriteriaList> criteriaList;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeContainerCriteriaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerCriteriaResponseBody self = new DescribeContainerCriteriaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContainerCriteriaResponseBody setCriteriaList(java.util.List<DescribeContainerCriteriaResponseBodyCriteriaList> criteriaList) {
        this.criteriaList = criteriaList;
        return this;
    }
    public java.util.List<DescribeContainerCriteriaResponseBodyCriteriaList> getCriteriaList() {
        return this.criteriaList;
    }

    public DescribeContainerCriteriaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeContainerCriteriaResponseBodyCriteriaList extends TeaModel {
        /**
         * <p>The name of the filter condition.</p>
         * <br>
         * <p>*   **instanceId**: the ID of the container.</p>
         * <p>*   **clusterId**: the ID of the cluster.</p>
         * <p>*   **regionId**: the region of the container.</p>
         * <p>*   **clusterName**: the name of the cluster.</p>
         * <p>*   **image**: the name of the image.</p>
         * <p>*   **imageRepoName**: the name of the image repository.</p>
         * <p>*   **imageRepoNamespace**: the namespace of the image repository.</p>
         * <p>*   **imageRepoTag**: the tag of the image repository.</p>
         * <p>*   **imageDigest**: the image digest.</p>
         * <p>*   **ClusterType**: the type of the cluster.</p>
         * <p>*   **hostIp**: the public IP address.</p>
         * <p>*   **pod**: the pod.</p>
         * <p>*   **podIp**: the IP address of the pod.</p>
         * <p>*   **containerId**: the ID of the container.</p>
         * <p>*   **vulStatus**: indicates whether vulnerabilities exist in the container.</p>
         * <p>*   **alarmStatus**: indicates whether alerts are generated for the container.</p>
         * <p>*   **riskStatus**: indicates whether risks exist in the container.</p>
         * <p>*   **riskLevel**: the risk level of the container.</p>
         * <p>*   **containerScope**: the type of the container.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the filter condition. Valid values:</p>
         * <br>
         * <p>*   **input**: The filter condition needs to be specified.</p>
         * <p>*   **select**: The filter condition is an option that can be selected from the drop-down list.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value of the filter condition. This parameter is returned only when the value of **Type** is **select**.</p>
         * <br>
         * <p>> If the value of **Type** is **input**, the value of this parameter is an empty string.</p>
         */
        @NameInMap("Values")
        public String values;

        public static DescribeContainerCriteriaResponseBodyCriteriaList build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerCriteriaResponseBodyCriteriaList self = new DescribeContainerCriteriaResponseBodyCriteriaList();
            return TeaModel.build(map, self);
        }

        public DescribeContainerCriteriaResponseBodyCriteriaList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeContainerCriteriaResponseBodyCriteriaList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeContainerCriteriaResponseBodyCriteriaList setValues(String values) {
            this.values = values;
            return this;
        }
        public String getValues() {
            return this.values;
        }

    }

}
