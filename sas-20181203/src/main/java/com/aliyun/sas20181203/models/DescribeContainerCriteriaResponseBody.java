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
     * 
     * <strong>example:</strong>
     * <p>A4EB8B1C-1DEC-5E18-BCD0-D1BBB3936FA7</p>
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
         * <p>The name of the search condition. Valid values:</p>
         * <ul>
         * <li><strong>instanceId</strong>: the ID of the container instance.</li>
         * <li><strong>clusterId</strong>: the cluster ID.</li>
         * <li><strong>regionId</strong>: the ID of the region in which the container resides.</li>
         * <li><strong>clusterName</strong>: the name of the cluster.</li>
         * <li><strong>image</strong>: the name of the image.</li>
         * <li><strong>imageRepoName</strong>: the name of the image repository.</li>
         * <li><strong>imageRepoNamespace</strong>: the namespace of the image repository.</li>
         * <li><strong>imageRepoTag</strong>: the tag of the image repository.</li>
         * <li><strong>imageDigest</strong>: the image digest.</li>
         * <li><strong>ClusterType</strong>: the type of the cluster.</li>
         * <li><strong>hostIp</strong>: the public IP address.</li>
         * <li><strong>pod</strong>: the pod.</li>
         * <li><strong>podIp</strong>: the IP address of the pod.</li>
         * <li><strong>containerId</strong>: the container ID.</li>
         * <li><strong>vulStatus</strong>: indicates whether vulnerabilities exist in the container.</li>
         * <li><strong>alarmStatus</strong>: indicates whether alerts are generated for the container.</li>
         * <li><strong>riskStatus</strong>: indicates whether risks exist in the container.</li>
         * <li><strong>riskLevel</strong>: the risk level of the container.</li>
         * <li><strong>containerScope</strong>: the type of the container.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>clusterId</p>
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
         * <p>input</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The values of the search condition. This parameter is returned only if the value of <strong>Type</strong> is set to <strong>select</strong>.</p>
         * <blockquote>
         * <p>If the value of <strong>Type</strong> is set to <strong>input</strong>, the return value of this parameter is empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ManagedKubernetes,NotManagedKubernetes,PrivateKubernetes</p>
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
