// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckWarningDetailResponseBody extends TeaModel {
    /**
     * <p>The suggestion for the management of the risk item.</p>
     */
    @NameInMap("Advice")
    public String advice;

    /**
     * <p>List of asset details to check.</p>
     */
    @NameInMap("CheckDetailAssetInfo")
    public java.util.List<java.util.Map<String, String>> checkDetailAssetInfo;

    /**
     * <p>Detection content details.</p>
     */
    @NameInMap("CheckDetailColumns")
    public java.util.List<DescribeCheckWarningDetailResponseBodyCheckDetailColumns> checkDetailColumns;

    /**
     * <p>The ID of the check item.</p>
     */
    @NameInMap("CheckId")
    public Long checkId;

    /**
     * <p>The additional information about the risk item.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the check item.</p>
     */
    @NameInMap("Item")
    public String item;

    /**
     * <p>The risk level of the check item. Valid values:</p>
     * <br>
     * <p>*   **high**: The item is a high-risk item and is highlighted in red.</p>
     * <p>*   **medium**: The item is a medium-risk item and is highlighted in orange.</p>
     * <p>*   **low**: The item is a low-risk item and is highlighted in gray.</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The prompt for the risk item.</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The type of the check item. Valid values:</p>
     * <br>
     * <p>*   **hc_exploit**: unauthorized access</p>
     * <p>*   **hc_djbh**: classified protection compliance</p>
     * <p>*   **hc_best_secruity**: best security practice</p>
     * <p>*   **hc_container**: container security</p>
     * <p>*   **hc_custom**: custom baseline</p>
     * <p>*   **cis**: Center for Internet Security (CIS) compliance</p>
     * <p>*   **weak_password**: weak password</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeCheckWarningDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckWarningDetailResponseBody self = new DescribeCheckWarningDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCheckWarningDetailResponseBody setAdvice(String advice) {
        this.advice = advice;
        return this;
    }
    public String getAdvice() {
        return this.advice;
    }

    public DescribeCheckWarningDetailResponseBody setCheckDetailAssetInfo(java.util.List<java.util.Map<String, String>> checkDetailAssetInfo) {
        this.checkDetailAssetInfo = checkDetailAssetInfo;
        return this;
    }
    public java.util.List<java.util.Map<String, String>> getCheckDetailAssetInfo() {
        return this.checkDetailAssetInfo;
    }

    public DescribeCheckWarningDetailResponseBody setCheckDetailColumns(java.util.List<DescribeCheckWarningDetailResponseBodyCheckDetailColumns> checkDetailColumns) {
        this.checkDetailColumns = checkDetailColumns;
        return this;
    }
    public java.util.List<DescribeCheckWarningDetailResponseBodyCheckDetailColumns> getCheckDetailColumns() {
        return this.checkDetailColumns;
    }

    public DescribeCheckWarningDetailResponseBody setCheckId(Long checkId) {
        this.checkId = checkId;
        return this;
    }
    public Long getCheckId() {
        return this.checkId;
    }

    public DescribeCheckWarningDetailResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeCheckWarningDetailResponseBody setItem(String item) {
        this.item = item;
        return this;
    }
    public String getItem() {
        return this.item;
    }

    public DescribeCheckWarningDetailResponseBody setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public DescribeCheckWarningDetailResponseBody setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public DescribeCheckWarningDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCheckWarningDetailResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class DescribeCheckWarningDetailResponseBodyCheckDetailColumnsGrids extends TeaModel {
        /**
         * <p>Key to detect content.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The detection content key corresponds to the display name.</p>
         */
        @NameInMap("ShowName")
        public String showName;

        /**
         * <p>Display type. Value:</p>
         * <p>- **grid**：Detection grid</p>
         * <p>- **text**：text</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeCheckWarningDetailResponseBodyCheckDetailColumnsGrids build(java.util.Map<String, ?> map) throws Exception {
            DescribeCheckWarningDetailResponseBodyCheckDetailColumnsGrids self = new DescribeCheckWarningDetailResponseBodyCheckDetailColumnsGrids();
            return TeaModel.build(map, self);
        }

        public DescribeCheckWarningDetailResponseBodyCheckDetailColumnsGrids setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCheckWarningDetailResponseBodyCheckDetailColumnsGrids setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public DescribeCheckWarningDetailResponseBodyCheckDetailColumnsGrids setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeCheckWarningDetailResponseBodyCheckDetailColumns extends TeaModel {
        /**
         * <p>Detection content list.</p>
         */
        @NameInMap("Grids")
        public java.util.List<DescribeCheckWarningDetailResponseBodyCheckDetailColumnsGrids> grids;

        /**
         * <p>Key to detect content.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The detection content key corresponds to the display name.</p>
         */
        @NameInMap("ShowName")
        public String showName;

        /**
         * <p>Display type. Value:</p>
         * <p>- **grid**：Detection grid</p>
         * <p>- **text**：text</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeCheckWarningDetailResponseBodyCheckDetailColumns build(java.util.Map<String, ?> map) throws Exception {
            DescribeCheckWarningDetailResponseBodyCheckDetailColumns self = new DescribeCheckWarningDetailResponseBodyCheckDetailColumns();
            return TeaModel.build(map, self);
        }

        public DescribeCheckWarningDetailResponseBodyCheckDetailColumns setGrids(java.util.List<DescribeCheckWarningDetailResponseBodyCheckDetailColumnsGrids> grids) {
            this.grids = grids;
            return this;
        }
        public java.util.List<DescribeCheckWarningDetailResponseBodyCheckDetailColumnsGrids> getGrids() {
            return this.grids;
        }

        public DescribeCheckWarningDetailResponseBodyCheckDetailColumns setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCheckWarningDetailResponseBodyCheckDetailColumns setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public DescribeCheckWarningDetailResponseBodyCheckDetailColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
