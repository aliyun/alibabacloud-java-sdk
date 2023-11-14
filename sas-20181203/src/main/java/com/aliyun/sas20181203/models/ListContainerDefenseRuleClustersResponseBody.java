// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListContainerDefenseRuleClustersResponseBody extends TeaModel {
    /**
     * <p>The clusters.</p>
     */
    @NameInMap("ClusterList")
    public java.util.List<ListContainerDefenseRuleClustersResponseBodyClusterList> clusterList;

    /**
     * <p>The response code. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListContainerDefenseRuleClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListContainerDefenseRuleClustersResponseBody self = new ListContainerDefenseRuleClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListContainerDefenseRuleClustersResponseBody setClusterList(java.util.List<ListContainerDefenseRuleClustersResponseBodyClusterList> clusterList) {
        this.clusterList = clusterList;
        return this;
    }
    public java.util.List<ListContainerDefenseRuleClustersResponseBodyClusterList> getClusterList() {
        return this.clusterList;
    }

    public ListContainerDefenseRuleClustersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListContainerDefenseRuleClustersResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListContainerDefenseRuleClustersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListContainerDefenseRuleClustersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListContainerDefenseRuleClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListContainerDefenseRuleClustersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListContainerDefenseRuleClustersResponseBodyClusterList extends TeaModel {
        /**
         * <p>Indicates whether all namespaces are included. Valid values:</p>
         * <br>
         * <p>*   **0**: no</p>
         * <p>*   **1**: yes</p>
         */
        @NameInMap("AllNamespace")
        public Integer allNamespace;

        /**
         * <p>The ID of the cluster.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The namespaces.</p>
         */
        @NameInMap("Namespaces")
        public java.util.List<String> namespaces;

        @NameInMap("RuleId")
        public Long ruleId;

        public static ListContainerDefenseRuleClustersResponseBodyClusterList build(java.util.Map<String, ?> map) throws Exception {
            ListContainerDefenseRuleClustersResponseBodyClusterList self = new ListContainerDefenseRuleClustersResponseBodyClusterList();
            return TeaModel.build(map, self);
        }

        public ListContainerDefenseRuleClustersResponseBodyClusterList setAllNamespace(Integer allNamespace) {
            this.allNamespace = allNamespace;
            return this;
        }
        public Integer getAllNamespace() {
            return this.allNamespace;
        }

        public ListContainerDefenseRuleClustersResponseBodyClusterList setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListContainerDefenseRuleClustersResponseBodyClusterList setNamespaces(java.util.List<String> namespaces) {
            this.namespaces = namespaces;
            return this;
        }
        public java.util.List<String> getNamespaces() {
            return this.namespaces;
        }

        public ListContainerDefenseRuleClustersResponseBodyClusterList setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

}
