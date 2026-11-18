// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateAIDBClusterDatasetRequest extends TeaModel {
    /**
     * <p>The ID of the AI database cluster. The cluster must have DBType set to polardb_ai. This parameter is required. If it is not provided, the service returns InvalidDBClusterId.Malformed (404).</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2ze88***</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The name of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>dataset01</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The dataset type. Valid values:</p>
     * <ul>
     * <li><strong>train</strong>: training dataset</li>
     * <li><strong>eval</strong>: evaluation dataset</li>
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
     * <p>The training mode for the dataset. Dataset formats vary by mode. Valid values:</p>
     * <ul>
     * <li><strong>sft</strong>: supervised fine-tuning, dedicated to training datasets</li>
     * <li><strong>grpo</strong>: reinforcement learning optimization, dedicated to training datasets</li>
     * <li><strong>text</strong>: text generation, dedicated to validation datasets</li>
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
