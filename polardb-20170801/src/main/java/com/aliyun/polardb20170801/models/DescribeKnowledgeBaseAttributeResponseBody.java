// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeKnowledgeBaseAttributeResponseBody extends TeaModel {
    /**
     * <p>The number of AI applications bound to the knowledge base.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("BindingAppCount")
    public Integer bindingAppCount;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-08-14T05:58:42Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The description of the knowledge base.</p>
     * 
     * <strong>example:</strong>
     * <p>testDesc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The unique identifier of the knowledge base.</p>
     * 
     * <strong>example:</strong>
     * <p>pkb-xxxxx</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <p>The type of the knowledge base. Valid values:</p>
     * <ul>
     * <li>PUBLIC</li>
     * <li>PERSONAL</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("KnowledgeBaseType")
    public String knowledgeBaseType;

    /**
     * <p>The ID of the knowledge space.</p>
     * 
     * <strong>example:</strong>
     * <p>pks-xxxxxx</p>
     */
    @NameInMap("KnowledgeSpaceId")
    public String knowledgeSpaceId;

    /**
     * <p>The name of the knowledge base.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E56531A4-E552-40BA-9C58-137B80******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The search mode. Valid values:</p>
     * <ul>
     * <li>balanced (default)</li>
     * <li>precise</li>
     * <li>semantic</li>
     * <li>knn</li>
     * <li>rrf</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>balanced</p>
     */
    @NameInMap("SearchMode")
    public String searchMode;

    /**
     * <p>The number of shards.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("ShardCount")
    public Integer shardCount;

    /**
     * <p>The status of the knowledge base.</p>
     * 
     * <strong>example:</strong>
     * <p>Activation</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The total number of documents.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalDocs")
    public Integer totalDocs;

    /**
     * <p>The total size in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>318881</p>
     */
    @NameInMap("TotalSizeBytes")
    public Long totalSizeBytes;

    public static DescribeKnowledgeBaseAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKnowledgeBaseAttributeResponseBody self = new DescribeKnowledgeBaseAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKnowledgeBaseAttributeResponseBody setBindingAppCount(Integer bindingAppCount) {
        this.bindingAppCount = bindingAppCount;
        return this;
    }
    public Integer getBindingAppCount() {
        return this.bindingAppCount;
    }

    public DescribeKnowledgeBaseAttributeResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeKnowledgeBaseAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeKnowledgeBaseAttributeResponseBody setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public DescribeKnowledgeBaseAttributeResponseBody setKnowledgeBaseType(String knowledgeBaseType) {
        this.knowledgeBaseType = knowledgeBaseType;
        return this;
    }
    public String getKnowledgeBaseType() {
        return this.knowledgeBaseType;
    }

    public DescribeKnowledgeBaseAttributeResponseBody setKnowledgeSpaceId(String knowledgeSpaceId) {
        this.knowledgeSpaceId = knowledgeSpaceId;
        return this;
    }
    public String getKnowledgeSpaceId() {
        return this.knowledgeSpaceId;
    }

    public DescribeKnowledgeBaseAttributeResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeKnowledgeBaseAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeKnowledgeBaseAttributeResponseBody setSearchMode(String searchMode) {
        this.searchMode = searchMode;
        return this;
    }
    public String getSearchMode() {
        return this.searchMode;
    }

    public DescribeKnowledgeBaseAttributeResponseBody setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }
    public Integer getShardCount() {
        return this.shardCount;
    }

    public DescribeKnowledgeBaseAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeKnowledgeBaseAttributeResponseBody setTotalDocs(Integer totalDocs) {
        this.totalDocs = totalDocs;
        return this;
    }
    public Integer getTotalDocs() {
        return this.totalDocs;
    }

    public DescribeKnowledgeBaseAttributeResponseBody setTotalSizeBytes(Long totalSizeBytes) {
        this.totalSizeBytes = totalSizeBytes;
        return this;
    }
    public Long getTotalSizeBytes() {
        return this.totalSizeBytes;
    }

}
