// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribePbrRulesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PbrRules")
    public DescribePbrRulesResponseBodyPbrRules pbrRules;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribePbrRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePbrRulesResponseBody self = new DescribePbrRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePbrRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribePbrRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePbrRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePbrRulesResponseBody setPbrRules(DescribePbrRulesResponseBodyPbrRules pbrRules) {
        this.pbrRules = pbrRules;
        return this;
    }
    public DescribePbrRulesResponseBodyPbrRules getPbrRules() {
        return this.pbrRules;
    }

    public DescribePbrRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribePbrRulesResponseBodyPbrRulesPbrRule extends TeaModel {
        @NameInMap("DstCidr")
        public String dstCidr;

        @NameInMap("Description")
        public String description;

        @NameInMap("PbrRuleId")
        public String pbrRuleId;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("DstPort")
        public String dstPort;

        @NameInMap("SrcCidr")
        public String srcCidr;

        @NameInMap("Name")
        public String name;

        @NameInMap("SrcPort")
        public String srcPort;

        public static DescribePbrRulesResponseBodyPbrRulesPbrRule build(java.util.Map<String, ?> map) throws Exception {
            DescribePbrRulesResponseBodyPbrRulesPbrRule self = new DescribePbrRulesResponseBodyPbrRulesPbrRule();
            return TeaModel.build(map, self);
        }

        public DescribePbrRulesResponseBodyPbrRulesPbrRule setDstCidr(String dstCidr) {
            this.dstCidr = dstCidr;
            return this;
        }
        public String getDstCidr() {
            return this.dstCidr;
        }

        public DescribePbrRulesResponseBodyPbrRulesPbrRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePbrRulesResponseBodyPbrRulesPbrRule setPbrRuleId(String pbrRuleId) {
            this.pbrRuleId = pbrRuleId;
            return this;
        }
        public String getPbrRuleId() {
            return this.pbrRuleId;
        }

        public DescribePbrRulesResponseBodyPbrRulesPbrRule setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribePbrRulesResponseBodyPbrRulesPbrRule setDstPort(String dstPort) {
            this.dstPort = dstPort;
            return this;
        }
        public String getDstPort() {
            return this.dstPort;
        }

        public DescribePbrRulesResponseBodyPbrRulesPbrRule setSrcCidr(String srcCidr) {
            this.srcCidr = srcCidr;
            return this;
        }
        public String getSrcCidr() {
            return this.srcCidr;
        }

        public DescribePbrRulesResponseBodyPbrRulesPbrRule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePbrRulesResponseBodyPbrRulesPbrRule setSrcPort(String srcPort) {
            this.srcPort = srcPort;
            return this;
        }
        public String getSrcPort() {
            return this.srcPort;
        }

    }

    public static class DescribePbrRulesResponseBodyPbrRules extends TeaModel {
        @NameInMap("PbrRule")
        public java.util.List<DescribePbrRulesResponseBodyPbrRulesPbrRule> pbrRule;

        public static DescribePbrRulesResponseBodyPbrRules build(java.util.Map<String, ?> map) throws Exception {
            DescribePbrRulesResponseBodyPbrRules self = new DescribePbrRulesResponseBodyPbrRules();
            return TeaModel.build(map, self);
        }

        public DescribePbrRulesResponseBodyPbrRules setPbrRule(java.util.List<DescribePbrRulesResponseBodyPbrRulesPbrRule> pbrRule) {
            this.pbrRule = pbrRule;
            return this;
        }
        public java.util.List<DescribePbrRulesResponseBodyPbrRulesPbrRule> getPbrRule() {
            return this.pbrRule;
        }

    }

}
