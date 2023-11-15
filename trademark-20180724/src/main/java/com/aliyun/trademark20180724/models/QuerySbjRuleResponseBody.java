// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QuerySbjRuleResponseBody extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("SbjRuleList")
    public QuerySbjRuleResponseBodySbjRuleList sbjRuleList;

    public static QuerySbjRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySbjRuleResponseBody self = new QuerySbjRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySbjRuleResponseBody setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QuerySbjRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySbjRuleResponseBody setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public QuerySbjRuleResponseBody setSbjRuleList(QuerySbjRuleResponseBodySbjRuleList sbjRuleList) {
        this.sbjRuleList = sbjRuleList;
        return this;
    }
    public QuerySbjRuleResponseBodySbjRuleList getSbjRuleList() {
        return this.sbjRuleList;
    }

    public static class QuerySbjRuleResponseBodySbjRuleListSbjRuleItemFrontendOptionsFrontendOption extends TeaModel {
        @NameInMap("title")
        public String title;

        @NameInMap("value")
        public String value;

        public static QuerySbjRuleResponseBodySbjRuleListSbjRuleItemFrontendOptionsFrontendOption build(java.util.Map<String, ?> map) throws Exception {
            QuerySbjRuleResponseBodySbjRuleListSbjRuleItemFrontendOptionsFrontendOption self = new QuerySbjRuleResponseBodySbjRuleListSbjRuleItemFrontendOptionsFrontendOption();
            return TeaModel.build(map, self);
        }

        public QuerySbjRuleResponseBodySbjRuleListSbjRuleItemFrontendOptionsFrontendOption setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QuerySbjRuleResponseBodySbjRuleListSbjRuleItemFrontendOptionsFrontendOption setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QuerySbjRuleResponseBodySbjRuleListSbjRuleItemFrontendOptions extends TeaModel {
        @NameInMap("FrontendOption")
        public java.util.List<QuerySbjRuleResponseBodySbjRuleListSbjRuleItemFrontendOptionsFrontendOption> frontendOption;

        public static QuerySbjRuleResponseBodySbjRuleListSbjRuleItemFrontendOptions build(java.util.Map<String, ?> map) throws Exception {
            QuerySbjRuleResponseBodySbjRuleListSbjRuleItemFrontendOptions self = new QuerySbjRuleResponseBodySbjRuleListSbjRuleItemFrontendOptions();
            return TeaModel.build(map, self);
        }

        public QuerySbjRuleResponseBodySbjRuleListSbjRuleItemFrontendOptions setFrontendOption(java.util.List<QuerySbjRuleResponseBodySbjRuleListSbjRuleItemFrontendOptionsFrontendOption> frontendOption) {
            this.frontendOption = frontendOption;
            return this;
        }
        public java.util.List<QuerySbjRuleResponseBodySbjRuleListSbjRuleItemFrontendOptionsFrontendOption> getFrontendOption() {
            return this.frontendOption;
        }

    }

    public static class QuerySbjRuleResponseBodySbjRuleListSbjRuleItem extends TeaModel {
        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("EspExtFieldName")
        public String espExtFieldName;

        @NameInMap("FieldName")
        public String fieldName;

        @NameInMap("FileType")
        public String fileType;

        @NameInMap("FrontendOptions")
        public QuerySbjRuleResponseBodySbjRuleListSbjRuleItemFrontendOptions frontendOptions;

        @NameInMap("FrontendType")
        public String frontendType;

        @NameInMap("RequiredExpression")
        public String requiredExpression;

        @NameInMap("SbjFieldId")
        public String sbjFieldId;

        @NameInMap("ShowExpression")
        public String showExpression;

        @NameInMap("TrademarkServiceExpression")
        public String trademarkServiceExpression;

        @NameInMap("ValidateRegularExpression")
        public String validateRegularExpression;

        public static QuerySbjRuleResponseBodySbjRuleListSbjRuleItem build(java.util.Map<String, ?> map) throws Exception {
            QuerySbjRuleResponseBodySbjRuleListSbjRuleItem self = new QuerySbjRuleResponseBodySbjRuleListSbjRuleItem();
            return TeaModel.build(map, self);
        }

        public QuerySbjRuleResponseBodySbjRuleListSbjRuleItem setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public QuerySbjRuleResponseBodySbjRuleListSbjRuleItem setEspExtFieldName(String espExtFieldName) {
            this.espExtFieldName = espExtFieldName;
            return this;
        }
        public String getEspExtFieldName() {
            return this.espExtFieldName;
        }

        public QuerySbjRuleResponseBodySbjRuleListSbjRuleItem setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public QuerySbjRuleResponseBodySbjRuleListSbjRuleItem setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public QuerySbjRuleResponseBodySbjRuleListSbjRuleItem setFrontendOptions(QuerySbjRuleResponseBodySbjRuleListSbjRuleItemFrontendOptions frontendOptions) {
            this.frontendOptions = frontendOptions;
            return this;
        }
        public QuerySbjRuleResponseBodySbjRuleListSbjRuleItemFrontendOptions getFrontendOptions() {
            return this.frontendOptions;
        }

        public QuerySbjRuleResponseBodySbjRuleListSbjRuleItem setFrontendType(String frontendType) {
            this.frontendType = frontendType;
            return this;
        }
        public String getFrontendType() {
            return this.frontendType;
        }

        public QuerySbjRuleResponseBodySbjRuleListSbjRuleItem setRequiredExpression(String requiredExpression) {
            this.requiredExpression = requiredExpression;
            return this;
        }
        public String getRequiredExpression() {
            return this.requiredExpression;
        }

        public QuerySbjRuleResponseBodySbjRuleListSbjRuleItem setSbjFieldId(String sbjFieldId) {
            this.sbjFieldId = sbjFieldId;
            return this;
        }
        public String getSbjFieldId() {
            return this.sbjFieldId;
        }

        public QuerySbjRuleResponseBodySbjRuleListSbjRuleItem setShowExpression(String showExpression) {
            this.showExpression = showExpression;
            return this;
        }
        public String getShowExpression() {
            return this.showExpression;
        }

        public QuerySbjRuleResponseBodySbjRuleListSbjRuleItem setTrademarkServiceExpression(String trademarkServiceExpression) {
            this.trademarkServiceExpression = trademarkServiceExpression;
            return this;
        }
        public String getTrademarkServiceExpression() {
            return this.trademarkServiceExpression;
        }

        public QuerySbjRuleResponseBodySbjRuleListSbjRuleItem setValidateRegularExpression(String validateRegularExpression) {
            this.validateRegularExpression = validateRegularExpression;
            return this;
        }
        public String getValidateRegularExpression() {
            return this.validateRegularExpression;
        }

    }

    public static class QuerySbjRuleResponseBodySbjRuleList extends TeaModel {
        @NameInMap("SbjRuleItem")
        public java.util.List<QuerySbjRuleResponseBodySbjRuleListSbjRuleItem> sbjRuleItem;

        public static QuerySbjRuleResponseBodySbjRuleList build(java.util.Map<String, ?> map) throws Exception {
            QuerySbjRuleResponseBodySbjRuleList self = new QuerySbjRuleResponseBodySbjRuleList();
            return TeaModel.build(map, self);
        }

        public QuerySbjRuleResponseBodySbjRuleList setSbjRuleItem(java.util.List<QuerySbjRuleResponseBodySbjRuleListSbjRuleItem> sbjRuleItem) {
            this.sbjRuleItem = sbjRuleItem;
            return this;
        }
        public java.util.List<QuerySbjRuleResponseBodySbjRuleListSbjRuleItem> getSbjRuleItem() {
            return this.sbjRuleItem;
        }

    }

}
