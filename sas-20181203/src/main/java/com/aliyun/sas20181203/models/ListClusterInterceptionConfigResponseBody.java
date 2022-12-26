// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListClusterInterceptionConfigResponseBody extends TeaModel {
    @NameInMap("ClusterConfigList")
    public java.util.List<ListClusterInterceptionConfigResponseBodyClusterConfigList> clusterConfigList;

    @NameInMap("PageInfo")
    public ListClusterInterceptionConfigResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static ListClusterInterceptionConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterInterceptionConfigResponseBody self = new ListClusterInterceptionConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterInterceptionConfigResponseBody setClusterConfigList(java.util.List<ListClusterInterceptionConfigResponseBodyClusterConfigList> clusterConfigList) {
        this.clusterConfigList = clusterConfigList;
        return this;
    }
    public java.util.List<ListClusterInterceptionConfigResponseBodyClusterConfigList> getClusterConfigList() {
        return this.clusterConfigList;
    }

    public ListClusterInterceptionConfigResponseBody setPageInfo(ListClusterInterceptionConfigResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListClusterInterceptionConfigResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListClusterInterceptionConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListClusterInterceptionConfigResponseBodyClusterConfigList extends TeaModel {
        @NameInMap("ClusterCNNFStatus")
        public Integer clusterCNNFStatus;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("ClusterType")
        public String clusterType;

        @NameInMap("InterceptionSwitch")
        public Integer interceptionSwitch;

        @NameInMap("OpenRuleCount")
        public Long openRuleCount;

        @NameInMap("SupportCNNF")
        public Boolean supportCNNF;

        @NameInMap("TotalRuleCount")
        public Long totalRuleCount;

        public static ListClusterInterceptionConfigResponseBodyClusterConfigList build(java.util.Map<String, ?> map) throws Exception {
            ListClusterInterceptionConfigResponseBodyClusterConfigList self = new ListClusterInterceptionConfigResponseBodyClusterConfigList();
            return TeaModel.build(map, self);
        }

        public ListClusterInterceptionConfigResponseBodyClusterConfigList setClusterCNNFStatus(Integer clusterCNNFStatus) {
            this.clusterCNNFStatus = clusterCNNFStatus;
            return this;
        }
        public Integer getClusterCNNFStatus() {
            return this.clusterCNNFStatus;
        }

        public ListClusterInterceptionConfigResponseBodyClusterConfigList setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListClusterInterceptionConfigResponseBodyClusterConfigList setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListClusterInterceptionConfigResponseBodyClusterConfigList setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public ListClusterInterceptionConfigResponseBodyClusterConfigList setInterceptionSwitch(Integer interceptionSwitch) {
            this.interceptionSwitch = interceptionSwitch;
            return this;
        }
        public Integer getInterceptionSwitch() {
            return this.interceptionSwitch;
        }

        public ListClusterInterceptionConfigResponseBodyClusterConfigList setOpenRuleCount(Long openRuleCount) {
            this.openRuleCount = openRuleCount;
            return this;
        }
        public Long getOpenRuleCount() {
            return this.openRuleCount;
        }

        public ListClusterInterceptionConfigResponseBodyClusterConfigList setSupportCNNF(Boolean supportCNNF) {
            this.supportCNNF = supportCNNF;
            return this;
        }
        public Boolean getSupportCNNF() {
            return this.supportCNNF;
        }

        public ListClusterInterceptionConfigResponseBodyClusterConfigList setTotalRuleCount(Long totalRuleCount) {
            this.totalRuleCount = totalRuleCount;
            return this;
        }
        public Long getTotalRuleCount() {
            return this.totalRuleCount;
        }

    }

    public static class ListClusterInterceptionConfigResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrrentPage")
        public Integer currrentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListClusterInterceptionConfigResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListClusterInterceptionConfigResponseBodyPageInfo self = new ListClusterInterceptionConfigResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListClusterInterceptionConfigResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListClusterInterceptionConfigResponseBodyPageInfo setCurrrentPage(Integer currrentPage) {
            this.currrentPage = currrentPage;
            return this;
        }
        public Integer getCurrrentPage() {
            return this.currrentPage;
        }

        public ListClusterInterceptionConfigResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListClusterInterceptionConfigResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
