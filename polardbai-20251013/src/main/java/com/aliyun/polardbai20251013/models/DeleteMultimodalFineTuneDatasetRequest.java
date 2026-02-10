// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class DeleteMultimodalFineTuneDatasetRequest extends TeaModel {
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
     * <p>ds-***</p>
     */
    @NameInMap("DatasetId")
    public String datasetId;

    public static DeleteMultimodalFineTuneDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMultimodalFineTuneDatasetRequest self = new DeleteMultimodalFineTuneDatasetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMultimodalFineTuneDatasetRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteMultimodalFineTuneDatasetRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

}
