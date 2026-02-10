// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class CreateMultimodalFineTuneDatasetRequest extends TeaModel {
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
     * <p>用户输入数据集描述</p>
     */
    @NameInMap("DatasetDescription")
    public String datasetDescription;

    /**
     * <strong>example:</strong>
     * <p>用户输入数据集名</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    public static CreateMultimodalFineTuneDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMultimodalFineTuneDatasetRequest self = new CreateMultimodalFineTuneDatasetRequest();
        return TeaModel.build(map, self);
    }

    public CreateMultimodalFineTuneDatasetRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateMultimodalFineTuneDatasetRequest setDatasetDescription(String datasetDescription) {
        this.datasetDescription = datasetDescription;
        return this;
    }
    public String getDatasetDescription() {
        return this.datasetDescription;
    }

    public CreateMultimodalFineTuneDatasetRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

}
