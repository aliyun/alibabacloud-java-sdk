// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAntiBruteForceRulesResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeAntiBruteForceRulesResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>4E5BFDCF-B9DD-430D-9DA4-151BCB581C9D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the details of the defense rule.</p>
     */
    @NameInMap("Rules")
    public java.util.List<DescribeAntiBruteForceRulesResponseBodyRules> rules;

    public static DescribeAntiBruteForceRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntiBruteForceRulesResponseBody self = new DescribeAntiBruteForceRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntiBruteForceRulesResponseBody setPageInfo(DescribeAntiBruteForceRulesResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeAntiBruteForceRulesResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeAntiBruteForceRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntiBruteForceRulesResponseBody setRules(java.util.List<DescribeAntiBruteForceRulesResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<DescribeAntiBruteForceRulesResponseBodyRules> getRules() {
        return this.rules;
    }

    public static class DescribeAntiBruteForceRulesResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Integer count;

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
         * <p>2</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeAntiBruteForceRulesResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntiBruteForceRulesResponseBodyPageInfo self = new DescribeAntiBruteForceRulesResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeAntiBruteForceRulesResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeAntiBruteForceRulesResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeAntiBruteForceRulesResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAntiBruteForceRulesResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeAntiBruteForceRulesResponseBodyRulesProtocolType extends TeaModel {
        @NameInMap("Rdp")
        public String rdp;

        @NameInMap("SqlServer")
        public String sqlServer;

        @NameInMap("Ssh")
        public String ssh;

        public static DescribeAntiBruteForceRulesResponseBodyRulesProtocolType build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntiBruteForceRulesResponseBodyRulesProtocolType self = new DescribeAntiBruteForceRulesResponseBodyRulesProtocolType();
            return TeaModel.build(map, self);
        }

        public DescribeAntiBruteForceRulesResponseBodyRulesProtocolType setRdp(String rdp) {
            this.rdp = rdp;
            return this;
        }
        public String getRdp() {
            return this.rdp;
        }

        public DescribeAntiBruteForceRulesResponseBodyRulesProtocolType setSqlServer(String sqlServer) {
            this.sqlServer = sqlServer;
            return this;
        }
        public String getSqlServer() {
            return this.sqlServer;
        }

        public DescribeAntiBruteForceRulesResponseBodyRulesProtocolType setSsh(String ssh) {
            this.ssh = ssh;
            return this;
        }
        public String getSsh() {
            return this.ssh;
        }

    }

    public static class DescribeAntiBruteForceRulesResponseBodyRules extends TeaModel {
        /**
         * <p>The timestamp when the rule was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1669800181000</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>Indicates whether the defense rule is the default rule. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The defense rule is the default rule.</li>
         * <li><strong>false</strong>: The defense rule is not the default rule.</li>
         * </ul>
         * <blockquote>
         * <p>The default rule takes effect on all servers that are not protected by defense rules against brute-force attacks.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DefaultRule")
        public Boolean defaultRule;

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableSmartRule")
        public Boolean enableSmartRule;

        /**
         * <p>The threshold of logon failures that is specified in the defense rule.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("FailCount")
        public Integer failCount;

        /**
         * <p>The period of time during which logons from an account are not allowed. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>360</p>
         */
        @NameInMap("ForbiddenTime")
        public Integer forbiddenTime;

        /**
         * <p>The ID of the defense rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1629</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The number of servers to which the defense rule is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MachineCount")
        public Integer machineCount;

        /**
         * <p>The name of the defense rule.</p>
         * 
         * <strong>example:</strong>
         * <p>AntiBruteForceRule01</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("ProtocolType")
        public DescribeAntiBruteForceRulesResponseBodyRulesProtocolType protocolType;

        /**
         * <p>The period of time during which logon failures from an account are measured. Unit: minutes. If <strong>Span</strong> is set to 10, the defense rule takes effect when the logon failures measured within 10 minutes reaches the specified threshold. The IP address of attackers cannot be used to log on to the server in the specified period of time.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Span")
        public Integer span;

        /**
         * <p>An array consisting of the UUIDs of servers to which the defense rule is applied.</p>
         */
        @NameInMap("UuidList")
        public java.util.List<String> uuidList;

        public static DescribeAntiBruteForceRulesResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntiBruteForceRulesResponseBodyRules self = new DescribeAntiBruteForceRulesResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeAntiBruteForceRulesResponseBodyRules setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeAntiBruteForceRulesResponseBodyRules setDefaultRule(Boolean defaultRule) {
            this.defaultRule = defaultRule;
            return this;
        }
        public Boolean getDefaultRule() {
            return this.defaultRule;
        }

        public DescribeAntiBruteForceRulesResponseBodyRules setEnableSmartRule(Boolean enableSmartRule) {
            this.enableSmartRule = enableSmartRule;
            return this;
        }
        public Boolean getEnableSmartRule() {
            return this.enableSmartRule;
        }

        public DescribeAntiBruteForceRulesResponseBodyRules setFailCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }
        public Integer getFailCount() {
            return this.failCount;
        }

        public DescribeAntiBruteForceRulesResponseBodyRules setForbiddenTime(Integer forbiddenTime) {
            this.forbiddenTime = forbiddenTime;
            return this;
        }
        public Integer getForbiddenTime() {
            return this.forbiddenTime;
        }

        public DescribeAntiBruteForceRulesResponseBodyRules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeAntiBruteForceRulesResponseBodyRules setMachineCount(Integer machineCount) {
            this.machineCount = machineCount;
            return this;
        }
        public Integer getMachineCount() {
            return this.machineCount;
        }

        public DescribeAntiBruteForceRulesResponseBodyRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAntiBruteForceRulesResponseBodyRules setProtocolType(DescribeAntiBruteForceRulesResponseBodyRulesProtocolType protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public DescribeAntiBruteForceRulesResponseBodyRulesProtocolType getProtocolType() {
            return this.protocolType;
        }

        public DescribeAntiBruteForceRulesResponseBodyRules setSpan(Integer span) {
            this.span = span;
            return this;
        }
        public Integer getSpan() {
            return this.span;
        }

        public DescribeAntiBruteForceRulesResponseBodyRules setUuidList(java.util.List<String> uuidList) {
            this.uuidList = uuidList;
            return this;
        }
        public java.util.List<String> getUuidList() {
            return this.uuidList;
        }

    }

}
