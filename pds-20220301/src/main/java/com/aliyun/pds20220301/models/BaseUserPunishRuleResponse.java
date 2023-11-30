// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class BaseUserPunishRuleResponse extends TeaModel {
    @NameInMap("results")
    public java.util.List<BaseUserPunishRuleResponseResults> results;

    public static BaseUserPunishRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        BaseUserPunishRuleResponse self = new BaseUserPunishRuleResponse();
        return TeaModel.build(map, self);
    }

    public BaseUserPunishRuleResponse setResults(java.util.List<BaseUserPunishRuleResponseResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<BaseUserPunishRuleResponseResults> getResults() {
        return this.results;
    }

    public static class BaseUserPunishRuleResponseResults extends TeaModel {
        @NameInMap("success")
        public Boolean success;

        @NameInMap("user_id")
        public String userId;

        public static BaseUserPunishRuleResponseResults build(java.util.Map<String, ?> map) throws Exception {
            BaseUserPunishRuleResponseResults self = new BaseUserPunishRuleResponseResults();
            return TeaModel.build(map, self);
        }

        public BaseUserPunishRuleResponseResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public BaseUserPunishRuleResponseResults setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
