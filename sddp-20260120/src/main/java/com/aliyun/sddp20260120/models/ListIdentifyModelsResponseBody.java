// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListIdentifyModelsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7C6D8E9F-1234-5678-ABCD-0123456789AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleList")
    public java.util.List<ListIdentifyModelsResponseBodyRuleList> ruleList;

    public static ListIdentifyModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIdentifyModelsResponseBody self = new ListIdentifyModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIdentifyModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIdentifyModelsResponseBody setRuleList(java.util.List<ListIdentifyModelsResponseBodyRuleList> ruleList) {
        this.ruleList = ruleList;
        return this;
    }
    public java.util.List<ListIdentifyModelsResponseBodyRuleList> getRuleList() {
        return this.ruleList;
    }

    public static class ListIdentifyModelsResponseBodyRuleList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>手机号</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListIdentifyModelsResponseBodyRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListIdentifyModelsResponseBodyRuleList self = new ListIdentifyModelsResponseBodyRuleList();
            return TeaModel.build(map, self);
        }

        public ListIdentifyModelsResponseBodyRuleList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListIdentifyModelsResponseBodyRuleList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
