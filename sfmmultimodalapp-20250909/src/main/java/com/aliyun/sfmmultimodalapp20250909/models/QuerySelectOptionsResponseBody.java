// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class QuerySelectOptionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SelectOptions")
    public java.util.List<QuerySelectOptionsResponseBodySelectOptions> selectOptions;

    public static QuerySelectOptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySelectOptionsResponseBody self = new QuerySelectOptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySelectOptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySelectOptionsResponseBody setSelectOptions(java.util.List<QuerySelectOptionsResponseBodySelectOptions> selectOptions) {
        this.selectOptions = selectOptions;
        return this;
    }
    public java.util.List<QuerySelectOptionsResponseBodySelectOptions> getSelectOptions() {
        return this.selectOptions;
    }

    public static class QuerySelectOptionsResponseBodySelectOptionsChildren extends TeaModel {
        @NameInMap("BizConfig")
        public java.util.Map<String, ?> bizConfig;

        @NameInMap("Category")
        public String category;

        @NameInMap("Description")
        public String description;

        @NameInMap("Label")
        public String label;

        @NameInMap("Tags")
        public java.util.List<String> tags;

        @NameInMap("Value")
        public String value;

        public static QuerySelectOptionsResponseBodySelectOptionsChildren build(java.util.Map<String, ?> map) throws Exception {
            QuerySelectOptionsResponseBodySelectOptionsChildren self = new QuerySelectOptionsResponseBodySelectOptionsChildren();
            return TeaModel.build(map, self);
        }

        public QuerySelectOptionsResponseBodySelectOptionsChildren setBizConfig(java.util.Map<String, ?> bizConfig) {
            this.bizConfig = bizConfig;
            return this;
        }
        public java.util.Map<String, ?> getBizConfig() {
            return this.bizConfig;
        }

        public QuerySelectOptionsResponseBodySelectOptionsChildren setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public QuerySelectOptionsResponseBodySelectOptionsChildren setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QuerySelectOptionsResponseBodySelectOptionsChildren setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QuerySelectOptionsResponseBodySelectOptionsChildren setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public QuerySelectOptionsResponseBodySelectOptionsChildren setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QuerySelectOptionsResponseBodySelectOptions extends TeaModel {
        @NameInMap("BizConfig")
        public java.util.Map<String, ?> bizConfig;

        @NameInMap("Category")
        public String category;

        @NameInMap("Children")
        public java.util.List<QuerySelectOptionsResponseBodySelectOptionsChildren> children;

        @NameInMap("Description")
        public String description;

        @NameInMap("Label")
        public String label;

        @NameInMap("Tags")
        public java.util.List<String> tags;

        @NameInMap("Value")
        public String value;

        public static QuerySelectOptionsResponseBodySelectOptions build(java.util.Map<String, ?> map) throws Exception {
            QuerySelectOptionsResponseBodySelectOptions self = new QuerySelectOptionsResponseBodySelectOptions();
            return TeaModel.build(map, self);
        }

        public QuerySelectOptionsResponseBodySelectOptions setBizConfig(java.util.Map<String, ?> bizConfig) {
            this.bizConfig = bizConfig;
            return this;
        }
        public java.util.Map<String, ?> getBizConfig() {
            return this.bizConfig;
        }

        public QuerySelectOptionsResponseBodySelectOptions setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public QuerySelectOptionsResponseBodySelectOptions setChildren(java.util.List<QuerySelectOptionsResponseBodySelectOptionsChildren> children) {
            this.children = children;
            return this;
        }
        public java.util.List<QuerySelectOptionsResponseBodySelectOptionsChildren> getChildren() {
            return this.children;
        }

        public QuerySelectOptionsResponseBodySelectOptions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QuerySelectOptionsResponseBodySelectOptions setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QuerySelectOptionsResponseBodySelectOptions setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public QuerySelectOptionsResponseBodySelectOptions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
