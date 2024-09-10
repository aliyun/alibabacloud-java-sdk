// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWhiteListEffectiveAssetsResponseBody extends TeaModel {
    /**
     * <p>The servers on which the policy takes effect.</p>
     */
    @NameInMap("Assets")
    public java.util.List<DescribeWhiteListEffectiveAssetsResponseBodyAssets> assets;

    /**
     * <p>The number of entries returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A4EB8B1C-1DEC-5E18-BCD0-D1BBB39****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of the servers on which the policy takes effect.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeWhiteListEffectiveAssetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhiteListEffectiveAssetsResponseBody self = new DescribeWhiteListEffectiveAssetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWhiteListEffectiveAssetsResponseBody setAssets(java.util.List<DescribeWhiteListEffectiveAssetsResponseBodyAssets> assets) {
        this.assets = assets;
        return this;
    }
    public java.util.List<DescribeWhiteListEffectiveAssetsResponseBodyAssets> getAssets() {
        return this.assets;
    }

    public DescribeWhiteListEffectiveAssetsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeWhiteListEffectiveAssetsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeWhiteListEffectiveAssetsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWhiteListEffectiveAssetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWhiteListEffectiveAssetsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeWhiteListEffectiveAssetsResponseBodyAssets extends TeaModel {
        /**
         * <p>The public IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>60.205.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The name of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("MachineName")
        public String machineName;

        /**
         * <p>The exception handling mode. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: unhandled</li>
         * <li><strong>1</strong>: alerted</li>
         * <li><strong>2</strong>: blocked</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ProcessMethod")
        public Integer processMethod;

        /**
         * <p>The ID of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>35815387</p>
         */
        @NameInMap("StrategyId")
        public Long strategyId;

        /**
         * <p>The name of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("StrategyName")
        public String strategyName;

        /**
         * <p>The number of <strong>untrusted programs</strong> on the server.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("SuspiciousEventCount")
        public Integer suspiciousEventCount;

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>544900ff-1be7-4655-9719-6311cecb3****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeWhiteListEffectiveAssetsResponseBodyAssets build(java.util.Map<String, ?> map) throws Exception {
            DescribeWhiteListEffectiveAssetsResponseBodyAssets self = new DescribeWhiteListEffectiveAssetsResponseBodyAssets();
            return TeaModel.build(map, self);
        }

        public DescribeWhiteListEffectiveAssetsResponseBodyAssets setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeWhiteListEffectiveAssetsResponseBodyAssets setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeWhiteListEffectiveAssetsResponseBodyAssets setMachineName(String machineName) {
            this.machineName = machineName;
            return this;
        }
        public String getMachineName() {
            return this.machineName;
        }

        public DescribeWhiteListEffectiveAssetsResponseBodyAssets setProcessMethod(Integer processMethod) {
            this.processMethod = processMethod;
            return this;
        }
        public Integer getProcessMethod() {
            return this.processMethod;
        }

        public DescribeWhiteListEffectiveAssetsResponseBodyAssets setStrategyId(Long strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public Long getStrategyId() {
            return this.strategyId;
        }

        public DescribeWhiteListEffectiveAssetsResponseBodyAssets setStrategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }
        public String getStrategyName() {
            return this.strategyName;
        }

        public DescribeWhiteListEffectiveAssetsResponseBodyAssets setSuspiciousEventCount(Integer suspiciousEventCount) {
            this.suspiciousEventCount = suspiciousEventCount;
            return this;
        }
        public Integer getSuspiciousEventCount() {
            return this.suspiciousEventCount;
        }

        public DescribeWhiteListEffectiveAssetsResponseBodyAssets setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
