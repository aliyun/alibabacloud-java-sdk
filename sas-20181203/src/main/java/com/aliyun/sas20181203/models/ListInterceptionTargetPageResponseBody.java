// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListInterceptionTargetPageResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListInterceptionTargetPageResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>028CF634-5268-5660-9575-48C9ED6B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the network objects.</p>
     */
    @NameInMap("RuleTargetList")
    public java.util.List<ListInterceptionTargetPageResponseBodyRuleTargetList> ruleTargetList;

    public static ListInterceptionTargetPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInterceptionTargetPageResponseBody self = new ListInterceptionTargetPageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInterceptionTargetPageResponseBody setPageInfo(ListInterceptionTargetPageResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListInterceptionTargetPageResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListInterceptionTargetPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInterceptionTargetPageResponseBody setRuleTargetList(java.util.List<ListInterceptionTargetPageResponseBodyRuleTargetList> ruleTargetList) {
        this.ruleTargetList = ruleTargetList;
        return this;
    }
    public java.util.List<ListInterceptionTargetPageResponseBodyRuleTargetList> getRuleTargetList() {
        return this.ruleTargetList;
    }

    public static class ListInterceptionTargetPageResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>45</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListInterceptionTargetPageResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListInterceptionTargetPageResponseBodyPageInfo self = new ListInterceptionTargetPageResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListInterceptionTargetPageResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListInterceptionTargetPageResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListInterceptionTargetPageResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListInterceptionTargetPageResponseBodyRuleTargetList extends TeaModel {
        /**
         * <p>The name of the application of the network object.</p>
         * 
         * <strong>example:</strong>
         * <p>frontend</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The ID of the container cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>c3e2eae03eb064d2ebf940cd5e1b17****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the container cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>sas-test-cnnf</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The images of the network object.</p>
         */
        @NameInMap("ImageList")
        public java.util.List<String> imageList;

        /**
         * <p>The namespace to which the network object belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The type of the rule. Valid value:</p>
         * <ul>
         * <li>customize: custom rule</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>customize</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <p>The tags specified for the network object.</p>
         */
        @NameInMap("TagList")
        public java.util.List<String> tagList;

        /**
         * <p>The ID of the network object.</p>
         * <blockquote>
         * <p>You can call the <a href="~~ListInterceptionTargetPage~~">ListInterceptionTargetPage</a> operation to query the IDs of network objects.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>400914</p>
         */
        @NameInMap("TargetId")
        public Long targetId;

        /**
         * <p>The name of the network object.</p>
         * 
         * <strong>example:</strong>
         * <p>destination-test-obj-Na3cF</p>
         */
        @NameInMap("TargetName")
        public String targetName;

        /**
         * <p>The type of the network object. Valid value:</p>
         * <ul>
         * <li>IMAGE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IMAGE</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static ListInterceptionTargetPageResponseBodyRuleTargetList build(java.util.Map<String, ?> map) throws Exception {
            ListInterceptionTargetPageResponseBodyRuleTargetList self = new ListInterceptionTargetPageResponseBodyRuleTargetList();
            return TeaModel.build(map, self);
        }

        public ListInterceptionTargetPageResponseBodyRuleTargetList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListInterceptionTargetPageResponseBodyRuleTargetList setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListInterceptionTargetPageResponseBodyRuleTargetList setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListInterceptionTargetPageResponseBodyRuleTargetList setImageList(java.util.List<String> imageList) {
            this.imageList = imageList;
            return this;
        }
        public java.util.List<String> getImageList() {
            return this.imageList;
        }

        public ListInterceptionTargetPageResponseBodyRuleTargetList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListInterceptionTargetPageResponseBodyRuleTargetList setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public ListInterceptionTargetPageResponseBodyRuleTargetList setTagList(java.util.List<String> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<String> getTagList() {
            return this.tagList;
        }

        public ListInterceptionTargetPageResponseBodyRuleTargetList setTargetId(Long targetId) {
            this.targetId = targetId;
            return this;
        }
        public Long getTargetId() {
            return this.targetId;
        }

        public ListInterceptionTargetPageResponseBodyRuleTargetList setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public ListInterceptionTargetPageResponseBodyRuleTargetList setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
