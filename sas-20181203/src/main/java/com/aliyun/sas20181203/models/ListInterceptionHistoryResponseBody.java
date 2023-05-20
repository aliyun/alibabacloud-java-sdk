// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListInterceptionHistoryResponseBody extends TeaModel {
    @NameInMap("InterceptionHistoryList")
    public java.util.List<ListInterceptionHistoryResponseBodyInterceptionHistoryList> interceptionHistoryList;

    @NameInMap("PageInfo")
    public ListInterceptionHistoryResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static ListInterceptionHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInterceptionHistoryResponseBody self = new ListInterceptionHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInterceptionHistoryResponseBody setInterceptionHistoryList(java.util.List<ListInterceptionHistoryResponseBodyInterceptionHistoryList> interceptionHistoryList) {
        this.interceptionHistoryList = interceptionHistoryList;
        return this;
    }
    public java.util.List<ListInterceptionHistoryResponseBodyInterceptionHistoryList> getInterceptionHistoryList() {
        return this.interceptionHistoryList;
    }

    public ListInterceptionHistoryResponseBody setPageInfo(ListInterceptionHistoryResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListInterceptionHistoryResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListInterceptionHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListInterceptionHistoryResponseBodyInterceptionHistoryList extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("DstAppName")
        public String dstAppName;

        @NameInMap("DstNamespace")
        public String dstNamespace;

        @NameInMap("DstPort")
        public Long dstPort;

        @NameInMap("DstRuleTargetName")
        public String dstRuleTargetName;

        @NameInMap("FirstTime")
        public Long firstTime;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InterceptionName")
        public Long interceptionName;

        @NameInMap("InterceptionType")
        public Integer interceptionType;

        @NameInMap("LastTime")
        public Long lastTime;

        @NameInMap("RealDstAppName")
        public String realDstAppName;

        @NameInMap("RealDstImageName")
        public String realDstImageName;

        @NameInMap("RealDstNamespace")
        public String realDstNamespace;

        @NameInMap("RealDstPodName")
        public String realDstPodName;

        @NameInMap("RealInterceptionType")
        public Integer realInterceptionType;

        @NameInMap("RealSrcAppName")
        public String realSrcAppName;

        @NameInMap("RealSrcImageName")
        public String realSrcImageName;

        @NameInMap("RealSrcNamespace")
        public String realSrcNamespace;

        @NameInMap("RealSrcPodName")
        public String realSrcPodName;

        @NameInMap("RiskLevel")
        public Long riskLevel;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("SrcAppName")
        public String srcAppName;

        @NameInMap("SrcNamespace")
        public String srcNamespace;

        @NameInMap("SrcRuleTargetName")
        public String srcRuleTargetName;

        @NameInMap("Status")
        public Long status;

        @NameInMap("TryCount")
        public Integer tryCount;

        public static ListInterceptionHistoryResponseBodyInterceptionHistoryList build(java.util.Map<String, ?> map) throws Exception {
            ListInterceptionHistoryResponseBodyInterceptionHistoryList self = new ListInterceptionHistoryResponseBodyInterceptionHistoryList();
            return TeaModel.build(map, self);
        }

        public ListInterceptionHistoryResponseBodyInterceptionHistoryList setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListInterceptionHistoryResponseBodyInterceptionHistoryList setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListInterceptionHistoryResponseBodyInterceptionHistoryList setDstAppName(String dstAppName) {
            this.dstAppName = dstAppName;
            return this;
        }
        public String getDstAppName() {
            return this.dstAppName;
        }

        public ListInterceptionHistoryResponseBodyInterceptionHistoryList setDstNamespace(String dstNamespace) {
            this.dstNamespace = dstNamespace;
            return this;
        }
        public String getDstNamespace() {
            return this.dstNamespace;
        }

        public ListInterceptionHistoryResponseBodyInterceptionHistoryList setDstPort(Long dstPort) {
            this.dstPort = dstPort;
            return this;
        }
        public Long getDstPort() {
            return this.dstPort;
        }

        public ListInterceptionHistoryResponseBodyInterceptionHistoryList setDstRuleTargetName(String dstRuleTargetName) {
            this.dstRuleTargetName = dstRuleTargetName;
            return this;
        }
        public String getDstRuleTargetName() {
            return this.dstRuleTargetName;
        }

        public ListInterceptionHistoryResponseBodyInterceptionHistoryList setFirstTime(Long firstTime) {
            this.firstTime = firstTime;
            return this;
        }
        public Long getFirstTime() {
            return this.firstTime;
        }

        public ListInterceptionHistoryResponseBodyInterceptionHistoryList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListInterceptionHistoryResponseBodyInterceptionHistoryList setInterceptionName(Long interceptionName) {
            this.interceptionName = interceptionName;
            return this;
        }
        public Long getInterceptionName() {
            return this.interceptionName;
        }

        public ListInterceptionHistoryResponseBodyInterceptionHistoryList setInterceptionType(Integer interceptionType) {
            this.interceptionType = interceptionType;
            return this;
        }
        public Integer getInterceptionType() {
            return this.interceptionType;
        }

        public ListInterceptionHistoryResponseBodyInterceptionHistoryList setLastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Long getLastTime() {
            return this.lastTime;
        }

        public ListInterceptionHistoryResponseBodyInterceptionHistoryList setRealDstAppName(String realDstAppName) {
            this.realDstAppName = realDstAppName;
            return this;
        }
        public String getRealDstAppName() {
            return this.realDstAppName;
        }

        public ListInterceptionHistoryResponseBodyInterceptionHistoryList setRealDstImageName(String realDstImageName) {
            this.realDstImageName = realDstImageName;
            return this;
        }
        public String getRealDstImageName() {
            return this.realDstImageName;
        }

        public ListInterceptionHistoryResponseBodyInterceptionHistoryList setRealDstNamespace(String realDstNamespace) {
            this.realDstNamespace = realDstNamespace;
            return this;
        }
        public String getRealDstNamespace() {
            return this.realDstNamespace;
        }

        public ListInterceptionHistoryResponseBodyInterceptionHistoryList setRealDstPodName(String realDstPodName) {
            this.realDstPodName = realDstPodName;
            return this;
        }
        public String getRealDstPodName() {
            return this.realDstPodName;
        }

        public ListInterceptionHistoryResponseBodyInterceptionHistoryList setRealInterceptionType(Integer realInterceptionType) {
            this.realInterceptionType = realInterceptionType;
            return this;
        }
        public Integer getRealInterceptionType() {
            return this.realInterceptionType;
        }

        public ListInterceptionHistoryResponseBodyInterceptionHistoryList setRealSrcAppName(String realSrcAppName) {
            this.realSrcAppName = realSrcAppName;
            return this;
        }
        public String getRealSrcAppName() {
            return this.realSrcAppName;
        }

        public ListInterceptionHistoryResponseBodyInterceptionHistoryList setRealSrcImageName(String realSrcImageName) {
            this.realSrcImageName = realSrcImageName;
            return this;
        }
        public String getRealSrcImageName() {
            return this.realSrcImageName;
        }

        public ListInterceptionHistoryResponseBodyInterceptionHistoryList setRealSrcNamespace(String realSrcNamespace) {
            this.realSrcNamespace = realSrcNamespace;
            return this;
        }
        public String getRealSrcNamespace() {
            return this.realSrcNamespace;
        }

        public ListInterceptionHistoryResponseBodyInterceptionHistoryList setRealSrcPodName(String realSrcPodName) {
            this.realSrcPodName = realSrcPodName;
            return this;
        }
        public String getRealSrcPodName() {
            return this.realSrcPodName;
        }

        public ListInterceptionHistoryResponseBodyInterceptionHistoryList setRiskLevel(Long riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Long getRiskLevel() {
            return this.riskLevel;
        }

        public ListInterceptionHistoryResponseBodyInterceptionHistoryList setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ListInterceptionHistoryResponseBodyInterceptionHistoryList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListInterceptionHistoryResponseBodyInterceptionHistoryList setSrcAppName(String srcAppName) {
            this.srcAppName = srcAppName;
            return this;
        }
        public String getSrcAppName() {
            return this.srcAppName;
        }

        public ListInterceptionHistoryResponseBodyInterceptionHistoryList setSrcNamespace(String srcNamespace) {
            this.srcNamespace = srcNamespace;
            return this;
        }
        public String getSrcNamespace() {
            return this.srcNamespace;
        }

        public ListInterceptionHistoryResponseBodyInterceptionHistoryList setSrcRuleTargetName(String srcRuleTargetName) {
            this.srcRuleTargetName = srcRuleTargetName;
            return this;
        }
        public String getSrcRuleTargetName() {
            return this.srcRuleTargetName;
        }

        public ListInterceptionHistoryResponseBodyInterceptionHistoryList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public ListInterceptionHistoryResponseBodyInterceptionHistoryList setTryCount(Integer tryCount) {
            this.tryCount = tryCount;
            return this;
        }
        public Integer getTryCount() {
            return this.tryCount;
        }

    }

    public static class ListInterceptionHistoryResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListInterceptionHistoryResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListInterceptionHistoryResponseBodyPageInfo self = new ListInterceptionHistoryResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListInterceptionHistoryResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListInterceptionHistoryResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListInterceptionHistoryResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListInterceptionHistoryResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
