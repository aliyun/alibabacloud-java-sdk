// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeModelApisResponseBody extends TeaModel {
    /**
     * <p>The list of model APIs.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeModelApisResponseBodyItems> items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The number of entries per page. Valid values: <strong>30</strong>, <strong>50</strong>, or <strong>100</strong>.</p>
     * <p>Default value: <strong>30</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C61892A4-0850-4516-9E26-44D96C1782DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeModelApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelApisResponseBody self = new DescribeModelApisResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeModelApisResponseBody setItems(java.util.List<DescribeModelApisResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeModelApisResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeModelApisResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeModelApisResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeModelApisResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeModelApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeModelApisResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeModelApisResponseBodyItems extends TeaModel {
        /**
         * <p>The model category. Valid values:</p>
         * <ul>
         * <li><strong>text</strong></li>
         * <li><strong>embedding</strong></li>
         * <li><strong>rerank</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("Category")
        public String category;

        @NameInMap("Config")
        public String config;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-16 16:46:20</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The model API IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>mi-xxxx</p>
         */
        @NameInMap("ModelApiId")
        public String modelApiId;

        /**
         * <p>The model API name.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The API path prefix.</p>
         * 
         * <strong>example:</strong>
         * <p>tests/models/</p>
         */
        @NameInMap("PathPrefix")
        public String pathPrefix;

        /**
         * <p>The protocol. Valid values:</p>
         * <ul>
         * <li><strong>openai</strong></li>
         * <li><strong>anthropic</strong></li>
         * <li><strong>bailian</strong></li>
         * <li><strong>vllm</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>openai</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The number of input tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RecordInput")
        public String recordInput;

        /**
         * <p>The number of output tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RecordOutput")
        public String recordOutput;

        /**
         * <p>The routing rules list (JSON array string).</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *   {
         *     &quot;RuleName&quot;: &quot;string&quot;,
         *     &quot;FallbackMode&quot;: &quot;failover&quot;,
         *     &quot;MatchModelListJson&quot;: &quot;[]&quot;,
         *     &quot;providerBalancerAlgorithm&quot;: &quot;round-robin&quot;,
         *     &quot;Providers&quot;: [
         *       {
         *         &quot;ModelServiceName&quot;: &quot;string&quot;,
         *         &quot;Weight&quot;: &quot;0&quot;,
         *         &quot;model_protocol&quot;: &quot;vllm&quot;
         *         &quot;ModelList&quot;: &quot;[]&quot;
         *       }
         *     ],
         *     &quot;FallbackProviders&quot;: [
         *       {
         *         &quot;ModelServiceName&quot;: &quot;string&quot;,
         *         &quot;model_protocol&quot;: &quot;anthropic&quot;,
         *         &quot;Weight&quot;: &quot;10&quot;,
         *         &quot;ModelList&quot;: &quot;[]&quot;
         *       }
         *     ]
         *   }
         * ]</p>
         */
        @NameInMap("RouteRules")
        public String routeRules;

        /**
         * <p>The model API status.</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeModelApisResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeModelApisResponseBodyItems self = new DescribeModelApisResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeModelApisResponseBodyItems setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeModelApisResponseBodyItems setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public DescribeModelApisResponseBodyItems setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeModelApisResponseBodyItems setModelApiId(String modelApiId) {
            this.modelApiId = modelApiId;
            return this;
        }
        public String getModelApiId() {
            return this.modelApiId;
        }

        public DescribeModelApisResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeModelApisResponseBodyItems setPathPrefix(String pathPrefix) {
            this.pathPrefix = pathPrefix;
            return this;
        }
        public String getPathPrefix() {
            return this.pathPrefix;
        }

        public DescribeModelApisResponseBodyItems setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeModelApisResponseBodyItems setRecordInput(String recordInput) {
            this.recordInput = recordInput;
            return this;
        }
        public String getRecordInput() {
            return this.recordInput;
        }

        public DescribeModelApisResponseBodyItems setRecordOutput(String recordOutput) {
            this.recordOutput = recordOutput;
            return this;
        }
        public String getRecordOutput() {
            return this.recordOutput;
        }

        public DescribeModelApisResponseBodyItems setRouteRules(String routeRules) {
            this.routeRules = routeRules;
            return this;
        }
        public String getRouteRules() {
            return this.routeRules;
        }

        public DescribeModelApisResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
