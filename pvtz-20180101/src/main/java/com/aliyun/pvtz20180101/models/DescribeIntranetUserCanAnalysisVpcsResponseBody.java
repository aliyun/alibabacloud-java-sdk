// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeIntranetUserCanAnalysisVpcsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("CurPage")
    public Integer curPage;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>C6F1D541-E7A6-447A-A2B5-9F7A20B2A8FB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    /**
     * <strong>example:</strong>
     * <p>35</p>
     */
    @NameInMap("TotalSize")
    public Integer totalSize;

    @NameInMap("UserCanAnalysisVpcsPopResults")
    public DescribeIntranetUserCanAnalysisVpcsResponseBodyUserCanAnalysisVpcsPopResults userCanAnalysisVpcsPopResults;

    public static DescribeIntranetUserCanAnalysisVpcsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIntranetUserCanAnalysisVpcsResponseBody self = new DescribeIntranetUserCanAnalysisVpcsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIntranetUserCanAnalysisVpcsResponseBody setCurPage(Integer curPage) {
        this.curPage = curPage;
        return this;
    }
    public Integer getCurPage() {
        return this.curPage;
    }

    public DescribeIntranetUserCanAnalysisVpcsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeIntranetUserCanAnalysisVpcsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIntranetUserCanAnalysisVpcsResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public DescribeIntranetUserCanAnalysisVpcsResponseBody setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public DescribeIntranetUserCanAnalysisVpcsResponseBody setUserCanAnalysisVpcsPopResults(DescribeIntranetUserCanAnalysisVpcsResponseBodyUserCanAnalysisVpcsPopResults userCanAnalysisVpcsPopResults) {
        this.userCanAnalysisVpcsPopResults = userCanAnalysisVpcsPopResults;
        return this;
    }
    public DescribeIntranetUserCanAnalysisVpcsResponseBodyUserCanAnalysisVpcsPopResults getUserCanAnalysisVpcsPopResults() {
        return this.userCanAnalysisVpcsPopResults;
    }

    public static class DescribeIntranetUserCanAnalysisVpcsResponseBodyUserCanAnalysisVpcsPopResultsUserCanAnalysisVpcsPopResult extends TeaModel {
        @NameInMap("AuthType")
        public String authType;

        @NameInMap("AuthorizedUserId")
        public Long authorizedUserId;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("TreeLevel")
        public Integer treeLevel;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcType")
        public String vpcType;

        public static DescribeIntranetUserCanAnalysisVpcsResponseBodyUserCanAnalysisVpcsPopResultsUserCanAnalysisVpcsPopResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeIntranetUserCanAnalysisVpcsResponseBodyUserCanAnalysisVpcsPopResultsUserCanAnalysisVpcsPopResult self = new DescribeIntranetUserCanAnalysisVpcsResponseBodyUserCanAnalysisVpcsPopResultsUserCanAnalysisVpcsPopResult();
            return TeaModel.build(map, self);
        }

        public DescribeIntranetUserCanAnalysisVpcsResponseBodyUserCanAnalysisVpcsPopResultsUserCanAnalysisVpcsPopResult setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public DescribeIntranetUserCanAnalysisVpcsResponseBodyUserCanAnalysisVpcsPopResultsUserCanAnalysisVpcsPopResult setAuthorizedUserId(Long authorizedUserId) {
            this.authorizedUserId = authorizedUserId;
            return this;
        }
        public Long getAuthorizedUserId() {
            return this.authorizedUserId;
        }

        public DescribeIntranetUserCanAnalysisVpcsResponseBodyUserCanAnalysisVpcsPopResultsUserCanAnalysisVpcsPopResult setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeIntranetUserCanAnalysisVpcsResponseBodyUserCanAnalysisVpcsPopResultsUserCanAnalysisVpcsPopResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeIntranetUserCanAnalysisVpcsResponseBodyUserCanAnalysisVpcsPopResultsUserCanAnalysisVpcsPopResult setTreeLevel(Integer treeLevel) {
            this.treeLevel = treeLevel;
            return this;
        }
        public Integer getTreeLevel() {
            return this.treeLevel;
        }

        public DescribeIntranetUserCanAnalysisVpcsResponseBodyUserCanAnalysisVpcsPopResultsUserCanAnalysisVpcsPopResult setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeIntranetUserCanAnalysisVpcsResponseBodyUserCanAnalysisVpcsPopResultsUserCanAnalysisVpcsPopResult setVpcType(String vpcType) {
            this.vpcType = vpcType;
            return this;
        }
        public String getVpcType() {
            return this.vpcType;
        }

    }

    public static class DescribeIntranetUserCanAnalysisVpcsResponseBodyUserCanAnalysisVpcsPopResults extends TeaModel {
        @NameInMap("UserCanAnalysisVpcsPopResult")
        public java.util.List<DescribeIntranetUserCanAnalysisVpcsResponseBodyUserCanAnalysisVpcsPopResultsUserCanAnalysisVpcsPopResult> userCanAnalysisVpcsPopResult;

        public static DescribeIntranetUserCanAnalysisVpcsResponseBodyUserCanAnalysisVpcsPopResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeIntranetUserCanAnalysisVpcsResponseBodyUserCanAnalysisVpcsPopResults self = new DescribeIntranetUserCanAnalysisVpcsResponseBodyUserCanAnalysisVpcsPopResults();
            return TeaModel.build(map, self);
        }

        public DescribeIntranetUserCanAnalysisVpcsResponseBodyUserCanAnalysisVpcsPopResults setUserCanAnalysisVpcsPopResult(java.util.List<DescribeIntranetUserCanAnalysisVpcsResponseBodyUserCanAnalysisVpcsPopResultsUserCanAnalysisVpcsPopResult> userCanAnalysisVpcsPopResult) {
            this.userCanAnalysisVpcsPopResult = userCanAnalysisVpcsPopResult;
            return this;
        }
        public java.util.List<DescribeIntranetUserCanAnalysisVpcsResponseBodyUserCanAnalysisVpcsPopResultsUserCanAnalysisVpcsPopResult> getUserCanAnalysisVpcsPopResult() {
            return this.userCanAnalysisVpcsPopResult;
        }

    }

}
