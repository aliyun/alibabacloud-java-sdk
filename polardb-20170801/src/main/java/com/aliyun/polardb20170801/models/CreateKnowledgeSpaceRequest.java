// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateKnowledgeSpaceRequest extends TeaModel {
    /**
     * <p>The database engine type.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <p>The description of the knowledge space. The description can be up to 512 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>testDesc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The vector dimensions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1536</p>
     */
    @NameInMap("EmbeddingDimension")
    public Integer embeddingDimension;

    /**
     * <p>The name of the embedding model.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>text-embedding-v4</p>
     */
    @NameInMap("EmbeddingModel")
    public String embeddingModel;

    /**
     * <p>Specifies whether to enable ACL-based authentication for the knowledge space.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnforceAcl")
    public Boolean enforceAcl;

    /**
     * <p>The name of the large language model.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen3.6-plus</p>
     */
    @NameInMap("LLMModel")
    public String LLMModel;

    /**
     * <p>The name of the knowledge space. The name must be 1 to 128 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>OSS AK</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("OSSAccessKey")
    public String OSSAccessKey;

    /**
     * <p>The name of an existing OSS bucket in the same region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-bucket</p>
     */
    @NameInMap("OSSBucket")
    public String OSSBucket;

    /**
     * <p>OSS SK</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("OSSSecretKey")
    public String OSSSecretKey;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the reranking model.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen3-rerank</p>
     */
    @NameInMap("RerankModel")
    public String rerankModel;

    /**
     * <p>The security group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-********************</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The shard size, in tokens.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>512</p>
     */
    @NameInMap("ShardingSize")
    public Integer shardingSize;

    /**
     * <p>The sharding strategy. Valid values:</p>
     * <ul>
     * <li>hierarchical (default)</li>
     * <li>hybrid</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hierarchical</p>
     */
    @NameInMap("ShardingStrategy")
    public String shardingStrategy;

    /**
     * <p>The vSwitch for automatic creation of the database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-*********************</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The VPC for automatic creation of the database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-*************</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The active zone for automatic creation of the database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-k</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateKnowledgeSpaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeSpaceRequest self = new CreateKnowledgeSpaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeSpaceRequest setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

    public CreateKnowledgeSpaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateKnowledgeSpaceRequest setEmbeddingDimension(Integer embeddingDimension) {
        this.embeddingDimension = embeddingDimension;
        return this;
    }
    public Integer getEmbeddingDimension() {
        return this.embeddingDimension;
    }

    public CreateKnowledgeSpaceRequest setEmbeddingModel(String embeddingModel) {
        this.embeddingModel = embeddingModel;
        return this;
    }
    public String getEmbeddingModel() {
        return this.embeddingModel;
    }

    public CreateKnowledgeSpaceRequest setEnforceAcl(Boolean enforceAcl) {
        this.enforceAcl = enforceAcl;
        return this;
    }
    public Boolean getEnforceAcl() {
        return this.enforceAcl;
    }

    public CreateKnowledgeSpaceRequest setLLMModel(String LLMModel) {
        this.LLMModel = LLMModel;
        return this;
    }
    public String getLLMModel() {
        return this.LLMModel;
    }

    public CreateKnowledgeSpaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateKnowledgeSpaceRequest setOSSAccessKey(String OSSAccessKey) {
        this.OSSAccessKey = OSSAccessKey;
        return this;
    }
    public String getOSSAccessKey() {
        return this.OSSAccessKey;
    }

    public CreateKnowledgeSpaceRequest setOSSBucket(String OSSBucket) {
        this.OSSBucket = OSSBucket;
        return this;
    }
    public String getOSSBucket() {
        return this.OSSBucket;
    }

    public CreateKnowledgeSpaceRequest setOSSSecretKey(String OSSSecretKey) {
        this.OSSSecretKey = OSSSecretKey;
        return this;
    }
    public String getOSSSecretKey() {
        return this.OSSSecretKey;
    }

    public CreateKnowledgeSpaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateKnowledgeSpaceRequest setRerankModel(String rerankModel) {
        this.rerankModel = rerankModel;
        return this;
    }
    public String getRerankModel() {
        return this.rerankModel;
    }

    public CreateKnowledgeSpaceRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateKnowledgeSpaceRequest setShardingSize(Integer shardingSize) {
        this.shardingSize = shardingSize;
        return this;
    }
    public Integer getShardingSize() {
        return this.shardingSize;
    }

    public CreateKnowledgeSpaceRequest setShardingStrategy(String shardingStrategy) {
        this.shardingStrategy = shardingStrategy;
        return this;
    }
    public String getShardingStrategy() {
        return this.shardingStrategy;
    }

    public CreateKnowledgeSpaceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateKnowledgeSpaceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateKnowledgeSpaceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
