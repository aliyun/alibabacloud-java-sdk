// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class CreateMultimodalDatasetEmbeddingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2ze454l20me07****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-3h6bm*****af60</p>
     */
    @NameInMap("DatasetId")
    public String datasetId;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <strong>example:</strong>
     * <p>flash</p>
     */
    @NameInMap("ModelMode")
    public String modelMode;

    public static CreateMultimodalDatasetEmbeddingRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMultimodalDatasetEmbeddingRequest self = new CreateMultimodalDatasetEmbeddingRequest();
        return TeaModel.build(map, self);
    }

    public CreateMultimodalDatasetEmbeddingRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateMultimodalDatasetEmbeddingRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public CreateMultimodalDatasetEmbeddingRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public CreateMultimodalDatasetEmbeddingRequest setModelMode(String modelMode) {
        this.modelMode = modelMode;
        return this;
    }
    public String getModelMode() {
        return this.modelMode;
    }

}
