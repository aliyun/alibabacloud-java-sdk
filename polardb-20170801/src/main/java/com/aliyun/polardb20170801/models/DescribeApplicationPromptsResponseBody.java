// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationPromptsResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeApplicationPromptsResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public String pageRecordCount;

    /**
     * <strong>example:</strong>
     * <p>6BD9CDE4-5E7B-4BF3-9BB8-83C73E******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalRecordCount")
    public String totalRecordCount;

    public static DescribeApplicationPromptsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationPromptsResponseBody self = new DescribeApplicationPromptsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationPromptsResponseBody setItems(java.util.List<DescribeApplicationPromptsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeApplicationPromptsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeApplicationPromptsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApplicationPromptsResponseBody setPageRecordCount(String pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeApplicationPromptsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationPromptsResponseBody setTotalRecordCount(String totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeApplicationPromptsResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>prompt if enabled</p>
         */
        @NameInMap("PromptEnabled")
        public Integer promptEnabled;

        /**
         * <strong>example:</strong>
         * <p>papt-58z96zl691otf356o4</p>
         */
        @NameInMap("PromptId")
        public String promptId;

        /**
         * <strong>example:</strong>
         * <p>prompt name</p>
         */
        @NameInMap("PromptName")
        public String promptName;

        /**
         * <strong>example:</strong>
         * <p>DELETE_RELATIONS_SYSTEM_PROMPT</p>
         */
        @NameInMap("PromptType")
        public String promptType;

        /**
         * <strong>example:</strong>
         * <p>prompt value</p>
         */
        @NameInMap("PromptValue")
        public String promptValue;

        public static DescribeApplicationPromptsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationPromptsResponseBodyItems self = new DescribeApplicationPromptsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationPromptsResponseBodyItems setPromptEnabled(Integer promptEnabled) {
            this.promptEnabled = promptEnabled;
            return this;
        }
        public Integer getPromptEnabled() {
            return this.promptEnabled;
        }

        public DescribeApplicationPromptsResponseBodyItems setPromptId(String promptId) {
            this.promptId = promptId;
            return this;
        }
        public String getPromptId() {
            return this.promptId;
        }

        public DescribeApplicationPromptsResponseBodyItems setPromptName(String promptName) {
            this.promptName = promptName;
            return this;
        }
        public String getPromptName() {
            return this.promptName;
        }

        public DescribeApplicationPromptsResponseBodyItems setPromptType(String promptType) {
            this.promptType = promptType;
            return this;
        }
        public String getPromptType() {
            return this.promptType;
        }

        public DescribeApplicationPromptsResponseBodyItems setPromptValue(String promptValue) {
            this.promptValue = promptValue;
            return this;
        }
        public String getPromptValue() {
            return this.promptValue;
        }

    }

}
