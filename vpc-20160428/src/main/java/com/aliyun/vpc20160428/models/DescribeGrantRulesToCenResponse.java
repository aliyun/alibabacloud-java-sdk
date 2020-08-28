// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeGrantRulesToCenResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("CenGrantRules")
    @Validation(required = true)
    public DescribeGrantRulesToCenResponseCenGrantRules cenGrantRules;

    public static DescribeGrantRulesToCenResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGrantRulesToCenResponse self = new DescribeGrantRulesToCenResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeGrantRulesToCenResponseCenGrantRulesCbnGrantRule extends TeaModel {
        @NameInMap("CenInstanceId")
        @Validation(required = true)
        public String cenInstanceId;

        @NameInMap("CenOwnerId")
        @Validation(required = true)
        public Long cenOwnerId;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        public static DescribeGrantRulesToCenResponseCenGrantRulesCbnGrantRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeGrantRulesToCenResponseCenGrantRulesCbnGrantRule self = new DescribeGrantRulesToCenResponseCenGrantRulesCbnGrantRule();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeGrantRulesToCenResponseCenGrantRules extends TeaModel {
        @NameInMap("CbnGrantRule")
        @Validation(required = true)
        public java.util.List<DescribeGrantRulesToCenResponseCenGrantRulesCbnGrantRule> cbnGrantRule;

        public static DescribeGrantRulesToCenResponseCenGrantRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeGrantRulesToCenResponseCenGrantRules self = new DescribeGrantRulesToCenResponseCenGrantRules();
            return TeaModel.build(map, self);
        }

    }

}
