// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckWarningDetailResponseBody extends TeaModel {
    /**
     * <p>The hardening suggestion for the baseline check risk item.</p>
     * 
     * <strong>example:</strong>
     * <p>You can fix it in the following ways:↵1. To configure authentication for redis service, click the redis.conf Configure complex password in requirepass, and then restart redis.↵2. In redis configuration file redis.conf The configuration is as follows: bind 127.0.0.1, only allow local access, and then restart redis</p>
     */
    @NameInMap("Advice")
    public String advice;

    /**
     * <p>The list of checked asset details.</p>
     */
    @NameInMap("CheckDetailAssetInfo")
    public java.util.List<java.util.Map<String, String>> checkDetailAssetInfo;

    /**
     * <p>The details of the check content.</p>
     */
    @NameInMap("CheckDetailColumns")
    public java.util.List<DescribeCheckWarningDetailResponseBodyCheckDetailColumns> checkDetailColumns;

    /**
     * <p>The ID of the check item.</p>
     * 
     * <strong>example:</strong>
     * <p>946</p>
     */
    @NameInMap("CheckId")
    public Long checkId;

    /**
     * <p>The supplementary description of the baseline check risk item.</p>
     * 
     * <strong>example:</strong>
     * <p>The redis port is open to the outside world and there is no authentication option configured. In addition to directly obtaining all the information in the database, unauthorized users can also attack the system through unauthorized access vulnerability.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the check item.</p>
     * 
     * <strong>example:</strong>
     * <p>Redis unauthorized access</p>
     */
    @NameInMap("Item")
    public String item;

    /**
     * <p>The risk level of the check item. Valid values:</p>
     * <ul>
     * <li><p><strong>high</strong>: High risk, highlighted in red.</p>
     * </li>
     * <li><p><strong>medium</strong>: Medium risk, highlighted in orange.</p>
     * </li>
     * <li><p><strong>low</strong>: Low risk, highlighted in gray.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>high</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The check prompt for the baseline check risk item.</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>The request ID. Alibaba Cloud generates a unique identifier for each request. You can use the request ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>BE120DAB-F4E7-4C53-ADC3-A97578ABF384</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The type of the baseline check item.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeRiskType~~">DescribeRiskType</a> operation to view all baseline types.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Security audit</p>
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
         * <p>The key of the check content.</p>
         * 
         * <strong>example:</strong>
         * <p>Username</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The display name that corresponds to the key of the check content.</p>
         * 
         * <strong>example:</strong>
         * <p>UserName</p>
         */
        @NameInMap("ShowName")
        public String showName;

        /**
         * <p>The display type. Valid values:</p>
         * <ul>
         * <li><strong>grid</strong>: grid</li>
         * <li><strong>text</strong>: text.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>text</p>
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
         * <p>The list of check content.</p>
         */
        @NameInMap("Grids")
        public java.util.List<DescribeCheckWarningDetailResponseBodyCheckDetailColumnsGrids> grids;

        /**
         * <p>The key of the check content.</p>
         * 
         * <strong>example:</strong>
         * <p>Containername</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The display name that corresponds to the key of the check content.</p>
         * 
         * <strong>example:</strong>
         * <p>ContainerName</p>
         */
        @NameInMap("ShowName")
        public String showName;

        /**
         * <p>The display type. Valid values:</p>
         * <ul>
         * <li><strong>grid</strong>: grid</li>
         * <li><strong>text</strong>: text.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>text</p>
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
