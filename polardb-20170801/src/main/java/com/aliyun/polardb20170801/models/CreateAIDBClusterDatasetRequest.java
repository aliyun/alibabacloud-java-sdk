// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateAIDBClusterDatasetRequest extends TeaModel {
    /**
     * <p>The ID of the PolarDB database cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2ze88***</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The dataset name.</p>
     * 
     * <strong>example:</strong>
     * <p>dataset01</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The type of the dataset. Valid values:</p>
     * <ul>
     * <li><p><strong>train</strong>: training set</p>
     * </li>
     * <li><p><strong>eval</strong>: evaluation set</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>train</p>
     */
    @NameInMap("DatasetType")
    public String datasetType;

    /**
     * <p>The import method. Valid values:</p>
     * <ul>
     * <li><strong>LocalImport</strong>: local import</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LocalImport</p>
     */
    @NameInMap("ImportMode")
    public String importMode;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The training mode for the dataset. The dataset format depends on the mode. Valid values:</p>
     * <ul>
     * <li><p><strong>sft</strong>: supervised fine-tuning. For training sets only.</p>
     * </li>
     * <li><p><strong>grpo</strong>: reinforcement learning optimization. For training sets only.</p>
     * </li>
     * <li><p><strong>text</strong>: text generation. For validation sets only.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sft</p>
     */
    @NameInMap("TrainMode")
    public String trainMode;

    public static CreateAIDBClusterDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAIDBClusterDatasetRequest self = new CreateAIDBClusterDatasetRequest();
        return TeaModel.build(map, self);
    }

    public CreateAIDBClusterDatasetRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateAIDBClusterDatasetRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public CreateAIDBClusterDatasetRequest setDatasetType(String datasetType) {
        this.datasetType = datasetType;
        return this;
    }
    public String getDatasetType() {
        return this.datasetType;
    }

    public CreateAIDBClusterDatasetRequest setImportMode(String importMode) {
        this.importMode = importMode;
        return this;
    }
    public String getImportMode() {
        return this.importMode;
    }

    public CreateAIDBClusterDatasetRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateAIDBClusterDatasetRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateAIDBClusterDatasetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAIDBClusterDatasetRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateAIDBClusterDatasetRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateAIDBClusterDatasetRequest setTrainMode(String trainMode) {
        this.trainMode = trainMode;
        return this;
    }
    public String getTrainMode() {
        return this.trainMode;
    }

}
