// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListInterceptionRulePageResponseBody extends TeaModel {
    /**
     * <p>An array that consists of information about the defense rules.</p>
     */
    @NameInMap("InterceptionRuleList")
    public java.util.List<ListInterceptionRulePageResponseBodyInterceptionRuleList> interceptionRuleList;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListInterceptionRulePageResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListInterceptionRulePageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInterceptionRulePageResponseBody self = new ListInterceptionRulePageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInterceptionRulePageResponseBody setInterceptionRuleList(java.util.List<ListInterceptionRulePageResponseBodyInterceptionRuleList> interceptionRuleList) {
        this.interceptionRuleList = interceptionRuleList;
        return this;
    }
    public java.util.List<ListInterceptionRulePageResponseBodyInterceptionRuleList> getInterceptionRuleList() {
        return this.interceptionRuleList;
    }

    public ListInterceptionRulePageResponseBody setPageInfo(ListInterceptionRulePageResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListInterceptionRulePageResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListInterceptionRulePageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListInterceptionRulePageResponseBodyInterceptionRuleListDstTarget extends TeaModel {
        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>An array that consists of the affected images.</p>
         */
        @NameInMap("ImageList")
        public java.util.List<String> imageList;

        /**
         * <p>The namespace.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>An array that consists of information about the ports used by the destination server.</p>
         */
        @NameInMap("Ports")
        public java.util.List<String> ports;

        /**
         * <p>The type of the defense rule. Valid values:</p>
         * <br>
         * <p>*   **suggest**: intelligently recommended rule</p>
         * <p>*   **customize**: custom rule</p>
         * <p>*   **system**: system rule</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <p>An array that consists of tags added to the destination network object.</p>
         */
        @NameInMap("TagList")
        public java.util.List<String> tagList;

        /**
         * <p>The ID of the network object.</p>
         */
        @NameInMap("TargetId")
        public Integer targetId;

        /**
         * <p>The name of the network object.</p>
         */
        @NameInMap("TargetName")
        public String targetName;

        /**
         * <p>The type of the network object.</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static ListInterceptionRulePageResponseBodyInterceptionRuleListDstTarget build(java.util.Map<String, ?> map) throws Exception {
            ListInterceptionRulePageResponseBodyInterceptionRuleListDstTarget self = new ListInterceptionRulePageResponseBodyInterceptionRuleListDstTarget();
            return TeaModel.build(map, self);
        }

        public ListInterceptionRulePageResponseBodyInterceptionRuleListDstTarget setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListInterceptionRulePageResponseBodyInterceptionRuleListDstTarget setImageList(java.util.List<String> imageList) {
            this.imageList = imageList;
            return this;
        }
        public java.util.List<String> getImageList() {
            return this.imageList;
        }

        public ListInterceptionRulePageResponseBodyInterceptionRuleListDstTarget setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListInterceptionRulePageResponseBodyInterceptionRuleListDstTarget setPorts(java.util.List<String> ports) {
            this.ports = ports;
            return this;
        }
        public java.util.List<String> getPorts() {
            return this.ports;
        }

        public ListInterceptionRulePageResponseBodyInterceptionRuleListDstTarget setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public ListInterceptionRulePageResponseBodyInterceptionRuleListDstTarget setTagList(java.util.List<String> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<String> getTagList() {
            return this.tagList;
        }

        public ListInterceptionRulePageResponseBodyInterceptionRuleListDstTarget setTargetId(Integer targetId) {
            this.targetId = targetId;
            return this;
        }
        public Integer getTargetId() {
            return this.targetId;
        }

        public ListInterceptionRulePageResponseBodyInterceptionRuleListDstTarget setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public ListInterceptionRulePageResponseBodyInterceptionRuleListDstTarget setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class ListInterceptionRulePageResponseBodyInterceptionRuleListSrcTarget extends TeaModel {
        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>An array that consists of the images of the network object.</p>
         */
        @NameInMap("ImageList")
        public java.util.List<String> imageList;

        /**
         * <p>The namespace.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The type of the defense rule. Valid values:</p>
         * <br>
         * <p>*   **suggest**: intelligently recommended rule</p>
         * <p>*   **customize**: custom rule</p>
         * <p>*   **system**: system rule</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <p>An array that consists of tags added to the source network object.</p>
         */
        @NameInMap("TagList")
        public java.util.List<String> tagList;

        /**
         * <p>The ID of the network object.</p>
         */
        @NameInMap("TargetId")
        public Integer targetId;

        /**
         * <p>The name of the network object.</p>
         */
        @NameInMap("TargetName")
        public String targetName;

        /**
         * <p>The type of the affected assets.</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static ListInterceptionRulePageResponseBodyInterceptionRuleListSrcTarget build(java.util.Map<String, ?> map) throws Exception {
            ListInterceptionRulePageResponseBodyInterceptionRuleListSrcTarget self = new ListInterceptionRulePageResponseBodyInterceptionRuleListSrcTarget();
            return TeaModel.build(map, self);
        }

        public ListInterceptionRulePageResponseBodyInterceptionRuleListSrcTarget setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListInterceptionRulePageResponseBodyInterceptionRuleListSrcTarget setImageList(java.util.List<String> imageList) {
            this.imageList = imageList;
            return this;
        }
        public java.util.List<String> getImageList() {
            return this.imageList;
        }

        public ListInterceptionRulePageResponseBodyInterceptionRuleListSrcTarget setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListInterceptionRulePageResponseBodyInterceptionRuleListSrcTarget setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public ListInterceptionRulePageResponseBodyInterceptionRuleListSrcTarget setTagList(java.util.List<String> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<String> getTagList() {
            return this.tagList;
        }

        public ListInterceptionRulePageResponseBodyInterceptionRuleListSrcTarget setTargetId(Integer targetId) {
            this.targetId = targetId;
            return this;
        }
        public Integer getTargetId() {
            return this.targetId;
        }

        public ListInterceptionRulePageResponseBodyInterceptionRuleListSrcTarget setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public ListInterceptionRulePageResponseBodyInterceptionRuleListSrcTarget setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class ListInterceptionRulePageResponseBodyInterceptionRuleList extends TeaModel {
        /**
         * <p>The destination network object.</p>
         */
        @NameInMap("DstTarget")
        public ListInterceptionRulePageResponseBodyInterceptionRuleListDstTarget dstTarget;

        /**
         * <p>The interception mode. Valid values:</p>
         * <br>
         * <p>*   **0**: monitor</p>
         * <p>*   **1**: block</p>
         * <p>*   **2**: alert</p>
         * <p>*   **3**: allow</p>
         */
        @NameInMap("InterceptType")
        public Long interceptType;

        /**
         * <p>The order in which the entries are sorted.</p>
         */
        @NameInMap("OrderIndex")
        public Long orderIndex;

        /**
         * <p>The ID of the defense rule.</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The name of the defense rule.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The status of the defense rule. Valid values:</p>
         * <br>
         * <p>*   **1**: enabled</p>
         * <p>*   **0**: disabled</p>
         */
        @NameInMap("RuleSwitch")
        public Integer ruleSwitch;

        /**
         * <p>The type of the defense rule.</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <p>The source network object.</p>
         */
        @NameInMap("SrcTarget")
        public ListInterceptionRulePageResponseBodyInterceptionRuleListSrcTarget srcTarget;

        public static ListInterceptionRulePageResponseBodyInterceptionRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListInterceptionRulePageResponseBodyInterceptionRuleList self = new ListInterceptionRulePageResponseBodyInterceptionRuleList();
            return TeaModel.build(map, self);
        }

        public ListInterceptionRulePageResponseBodyInterceptionRuleList setDstTarget(ListInterceptionRulePageResponseBodyInterceptionRuleListDstTarget dstTarget) {
            this.dstTarget = dstTarget;
            return this;
        }
        public ListInterceptionRulePageResponseBodyInterceptionRuleListDstTarget getDstTarget() {
            return this.dstTarget;
        }

        public ListInterceptionRulePageResponseBodyInterceptionRuleList setInterceptType(Long interceptType) {
            this.interceptType = interceptType;
            return this;
        }
        public Long getInterceptType() {
            return this.interceptType;
        }

        public ListInterceptionRulePageResponseBodyInterceptionRuleList setOrderIndex(Long orderIndex) {
            this.orderIndex = orderIndex;
            return this;
        }
        public Long getOrderIndex() {
            return this.orderIndex;
        }

        public ListInterceptionRulePageResponseBodyInterceptionRuleList setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ListInterceptionRulePageResponseBodyInterceptionRuleList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListInterceptionRulePageResponseBodyInterceptionRuleList setRuleSwitch(Integer ruleSwitch) {
            this.ruleSwitch = ruleSwitch;
            return this;
        }
        public Integer getRuleSwitch() {
            return this.ruleSwitch;
        }

        public ListInterceptionRulePageResponseBodyInterceptionRuleList setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public ListInterceptionRulePageResponseBodyInterceptionRuleList setSrcTarget(ListInterceptionRulePageResponseBodyInterceptionRuleListSrcTarget srcTarget) {
            this.srcTarget = srcTarget;
            return this;
        }
        public ListInterceptionRulePageResponseBodyInterceptionRuleListSrcTarget getSrcTarget() {
            return this.srcTarget;
        }

    }

    public static class ListInterceptionRulePageResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListInterceptionRulePageResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListInterceptionRulePageResponseBodyPageInfo self = new ListInterceptionRulePageResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListInterceptionRulePageResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListInterceptionRulePageResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListInterceptionRulePageResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListInterceptionRulePageResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
