// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeKnowledgeBaseFilesResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeKnowledgeBaseFilesResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>CED079B7-A408-41A1-BFF1-EC608E******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeKnowledgeBaseFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKnowledgeBaseFilesResponseBody self = new DescribeKnowledgeBaseFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKnowledgeBaseFilesResponseBody setItems(java.util.List<DescribeKnowledgeBaseFilesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeKnowledgeBaseFilesResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeKnowledgeBaseFilesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeKnowledgeBaseFilesResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeKnowledgeBaseFilesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeKnowledgeBaseFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeKnowledgeBaseFilesResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigDefaultStrategyParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>512</p>
         */
        @NameInMap("MaxTokens")
        public Integer maxTokens;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MergePeers")
        public Boolean mergePeers;

        public static DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigDefaultStrategyParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigDefaultStrategyParameters self = new DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigDefaultStrategyParameters();
            return TeaModel.build(map, self);
        }

        public DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigDefaultStrategyParameters setMaxTokens(Integer maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Integer getMaxTokens() {
            return this.maxTokens;
        }

        public DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigDefaultStrategyParameters setMergePeers(Boolean mergePeers) {
            this.mergePeers = mergePeers;
            return this;
        }
        public Boolean getMergePeers() {
            return this.mergePeers;
        }

    }

    public static class DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigDefaultStrategy extends TeaModel {
        @NameInMap("Parameters")
        public DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigDefaultStrategyParameters parameters;

        /**
         * <strong>example:</strong>
         * <p>hybrid</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigDefaultStrategy build(java.util.Map<String, ?> map) throws Exception {
            DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigDefaultStrategy self = new DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigDefaultStrategy();
            return TeaModel.build(map, self);
        }

        public DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigDefaultStrategy setParameters(DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigDefaultStrategyParameters parameters) {
            this.parameters = parameters;
            return this;
        }
        public DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigDefaultStrategyParameters getParameters() {
            return this.parameters;
        }

        public DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigDefaultStrategy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRulesMatch extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>table</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        public static DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRulesMatch build(java.util.Map<String, ?> map) throws Exception {
            DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRulesMatch self = new DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRulesMatch();
            return TeaModel.build(map, self);
        }

        public DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRulesMatch setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

    }

    public static class DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRulesStrategyParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("MarkdownTables")
        public String markdownTables;

        /**
         * <strong>example:</strong>
         * <p>512</p>
         */
        @NameInMap("MaxTokens")
        public Integer maxTokens;

        public static DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRulesStrategyParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRulesStrategyParameters self = new DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRulesStrategyParameters();
            return TeaModel.build(map, self);
        }

        public DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRulesStrategyParameters setMarkdownTables(String markdownTables) {
            this.markdownTables = markdownTables;
            return this;
        }
        public String getMarkdownTables() {
            return this.markdownTables;
        }

        public DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRulesStrategyParameters setMaxTokens(Integer maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Integer getMaxTokens() {
            return this.maxTokens;
        }

    }

    public static class DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRulesStrategy extends TeaModel {
        @NameInMap("Parameters")
        public DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRulesStrategyParameters parameters;

        /**
         * <strong>example:</strong>
         * <p>hierarchical</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRulesStrategy build(java.util.Map<String, ?> map) throws Exception {
            DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRulesStrategy self = new DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRulesStrategy();
            return TeaModel.build(map, self);
        }

        public DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRulesStrategy setParameters(DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRulesStrategyParameters parameters) {
            this.parameters = parameters;
            return this;
        }
        public DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRulesStrategyParameters getParameters() {
            return this.parameters;
        }

        public DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRulesStrategy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRules extends TeaModel {
        @NameInMap("Match")
        public DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRulesMatch match;

        @NameInMap("Strategy")
        public DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRulesStrategy strategy;

        public static DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRules self = new DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRules();
            return TeaModel.build(map, self);
        }

        public DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRules setMatch(DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRulesMatch match) {
            this.match = match;
            return this;
        }
        public DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRulesMatch getMatch() {
            return this.match;
        }

        public DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRules setStrategy(DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRulesStrategy strategy) {
            this.strategy = strategy;
            return this;
        }
        public DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRulesStrategy getStrategy() {
            return this.strategy;
        }

    }

    public static class DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfig extends TeaModel {
        @NameInMap("DefaultStrategy")
        public DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigDefaultStrategy defaultStrategy;

        @NameInMap("Rules")
        public java.util.List<DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRules> rules;

        public static DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfig self = new DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfig();
            return TeaModel.build(map, self);
        }

        public DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfig setDefaultStrategy(DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigDefaultStrategy defaultStrategy) {
            this.defaultStrategy = defaultStrategy;
            return this;
        }
        public DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigDefaultStrategy getDefaultStrategy() {
            return this.defaultStrategy;
        }

        public DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfig setRules(java.util.List<DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfigRules> getRules() {
            return this.rules;
        }

    }

    public static class DescribeKnowledgeBaseFilesResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Not Support.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>5b2dbb13-xxxx-xxxx-xxxx-a55fe8daec8f</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <strong>example:</strong>
         * <p>财报.pdf</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>318881</p>
         */
        @NameInMap("FileSize")
        public Long fileSize;

        /**
         * <strong>example:</strong>
         * <p>pdf</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("InheritSpaceStrategy")
        public Boolean inheritSpaceStrategy;

        /**
         * <strong>example:</strong>
         * <p>pkb-xxxxxx</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <strong>example:</strong>
         * <p>pks-xxxxxx</p>
         */
        @NameInMap("KnowledgeSpaceId")
        public String knowledgeSpaceId;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Metadata")
        public java.util.Map<String, ?> metadata;

        /**
         * <strong>example:</strong>
         * <p>oss://test-bucket-example/pks-xxxx/pkb-xxxx/财报.pdf</p>
         */
        @NameInMap("OSSPath")
        public String OSSPath;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ShardCount")
        public Integer shardCount;

        @NameInMap("ShardingStrategyConfig")
        public DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfig shardingStrategyConfig;

        /**
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>2026-06-15T22:28:53Z</p>
         */
        @NameInMap("UpdatedAt")
        public String updatedAt;

        /**
         * <strong>example:</strong>
         * <p>2026-06-15T22:28:53Z</p>
         */
        @NameInMap("UploadTime")
        public String uploadTime;

        public static DescribeKnowledgeBaseFilesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeKnowledgeBaseFilesResponseBodyItems self = new DescribeKnowledgeBaseFilesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeKnowledgeBaseFilesResponseBodyItems setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeKnowledgeBaseFilesResponseBodyItems setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public DescribeKnowledgeBaseFilesResponseBodyItems setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DescribeKnowledgeBaseFilesResponseBodyItems setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public DescribeKnowledgeBaseFilesResponseBodyItems setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public DescribeKnowledgeBaseFilesResponseBodyItems setInheritSpaceStrategy(Boolean inheritSpaceStrategy) {
            this.inheritSpaceStrategy = inheritSpaceStrategy;
            return this;
        }
        public Boolean getInheritSpaceStrategy() {
            return this.inheritSpaceStrategy;
        }

        public DescribeKnowledgeBaseFilesResponseBodyItems setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public DescribeKnowledgeBaseFilesResponseBodyItems setKnowledgeSpaceId(String knowledgeSpaceId) {
            this.knowledgeSpaceId = knowledgeSpaceId;
            return this;
        }
        public String getKnowledgeSpaceId() {
            return this.knowledgeSpaceId;
        }

        public DescribeKnowledgeBaseFilesResponseBodyItems setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public DescribeKnowledgeBaseFilesResponseBodyItems setOSSPath(String OSSPath) {
            this.OSSPath = OSSPath;
            return this;
        }
        public String getOSSPath() {
            return this.OSSPath;
        }

        public DescribeKnowledgeBaseFilesResponseBodyItems setShardCount(Integer shardCount) {
            this.shardCount = shardCount;
            return this;
        }
        public Integer getShardCount() {
            return this.shardCount;
        }

        public DescribeKnowledgeBaseFilesResponseBodyItems setShardingStrategyConfig(DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfig shardingStrategyConfig) {
            this.shardingStrategyConfig = shardingStrategyConfig;
            return this;
        }
        public DescribeKnowledgeBaseFilesResponseBodyItemsShardingStrategyConfig getShardingStrategyConfig() {
            return this.shardingStrategyConfig;
        }

        public DescribeKnowledgeBaseFilesResponseBodyItems setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeKnowledgeBaseFilesResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeKnowledgeBaseFilesResponseBodyItems setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public DescribeKnowledgeBaseFilesResponseBodyItems setUploadTime(String uploadTime) {
            this.uploadTime = uploadTime;
            return this;
        }
        public String getUploadTime() {
            return this.uploadTime;
        }

    }

}
