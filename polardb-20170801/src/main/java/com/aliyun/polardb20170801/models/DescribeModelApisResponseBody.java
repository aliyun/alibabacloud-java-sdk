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
     * <p>The number of entries per page. Valid values: <strong>30</strong>, <strong>50</strong>, and <strong>100</strong>. Default value: <strong>30</strong>.</p>
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
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

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

    public DescribeModelApisResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
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
         * <p>The category. Valid values:</p>
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

        /**
         * <p>The gateway retry configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;failover&quot;:{&quot;enabled&quot;:true,&quot;max_provider_retries&quot;:2,&quot;max_failover_providers&quot;:1,&quot;retryable_status_codes&quot;:[429,500,502,503,504],&quot;retry_delay&quot;:0.5}}</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The ID of the gateway instance to which the model API belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-2ze3x6i1d7g5rto28</p>
         */
        @NameInMap("CustinsName")
        public String custinsName;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-16 16:46:20</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The modification time of the model API.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-09T06:43:33Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The model API IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>mi-xxxx</p>
         */
        @NameInMap("ModelApiId")
        public String modelApiId;

        /**
         * <p>The model name mappings, which is a JSON array string. Each element is in the format of {&quot;Source&quot;:&quot;client model name&quot;,&quot;Target&quot;:&quot;upstream model name&quot;}. If not configured, this parameter is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Source&quot;:&quot;client-model-a&quot;,&quot;Target&quot;:&quot;upstream-model-a&quot;}]</p>
         */
        @NameInMap("ModelMappings")
        public String modelMappings;

        /**
         * <p>The intelligent routing candidate list, which is a JSON object string in the format of {&quot;AllowedModels&quot;:[&quot;candidate model name&quot;]}. If not configured, this parameter is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AllowedModels&quot;:[&quot;deepseek-v4-pro&quot;,&quot;glm-5.3&quot;,&quot;glm-5.3-flash&quot;]}</p>
         */
        @NameInMap("ModelRouting")
        public String modelRouting;

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
         * <p>The number of input points.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RecordInput")
        public String recordInput;

        /**
         * <p>The number of output points.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RecordOutput")
        public String recordOutput;

        /**
         * <p>The list of routing rules, which is a JSON array string.</p>
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

        public DescribeModelApisResponseBodyItems setCustinsName(String custinsName) {
            this.custinsName = custinsName;
            return this;
        }
        public String getCustinsName() {
            return this.custinsName;
        }

        public DescribeModelApisResponseBodyItems setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeModelApisResponseBodyItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeModelApisResponseBodyItems setModelApiId(String modelApiId) {
            this.modelApiId = modelApiId;
            return this;
        }
        public String getModelApiId() {
            return this.modelApiId;
        }

        public DescribeModelApisResponseBodyItems setModelMappings(String modelMappings) {
            this.modelMappings = modelMappings;
            return this;
        }
        public String getModelMappings() {
            return this.modelMappings;
        }

        public DescribeModelApisResponseBodyItems setModelRouting(String modelRouting) {
            this.modelRouting = modelRouting;
            return this;
        }
        public String getModelRouting() {
            return this.modelRouting;
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
