// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class UpdateMultimodalFineTuneDatasetRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2ze454l20me07****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>车辆图片</p>
     */
    @NameInMap("DatasetDescription")
    public String datasetDescription;

    /**
     * <strong>example:</strong>
     * <p>ds-****</p>
     */
    @NameInMap("DatasetId")
    public String datasetId;

    /**
     * <strong>example:</strong>
     * <p>车辆</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    public static UpdateMultimodalFineTuneDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMultimodalFineTuneDatasetRequest self = new UpdateMultimodalFineTuneDatasetRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMultimodalFineTuneDatasetRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public UpdateMultimodalFineTuneDatasetRequest setDatasetDescription(String datasetDescription) {
        this.datasetDescription = datasetDescription;
        return this;
    }
    public String getDatasetDescription() {
        return this.datasetDescription;
    }

    public UpdateMultimodalFineTuneDatasetRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public UpdateMultimodalFineTuneDatasetRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

}
