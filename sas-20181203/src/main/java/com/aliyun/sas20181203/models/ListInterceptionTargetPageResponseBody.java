// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListInterceptionTargetPageResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    public ListInterceptionTargetPageResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

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
        @NameInMap("AppName")
        public String appName;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("ImageList")
        public java.util.List<String> imageList;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("RuleType")
        public String ruleType;

        @NameInMap("TagList")
        public java.util.List<String> tagList;

        @NameInMap("TargetId")
        public Long targetId;

        @NameInMap("TargetName")
        public String targetName;

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
