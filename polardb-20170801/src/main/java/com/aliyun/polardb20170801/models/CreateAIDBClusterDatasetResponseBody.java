// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateAIDBClusterDatasetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pc-****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>pcs-2zeei***</p>
     */
    @NameInMap("DataServiceId")
    public String dataServiceId;

    /**
     * <strong>example:</strong>
     * <p>pds-2ze88***</p>
     */
    @NameInMap("DatasetId")
    public String datasetId;

    /**
     * <strong>example:</strong>
     * <p>dataset01</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <strong>example:</strong>
     * <p>polardb_ai/datasets/train/sft/dataset01</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CD35F3-F3-44CA-AFFF-BAF869******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAIDBClusterDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAIDBClusterDatasetResponseBody self = new CreateAIDBClusterDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAIDBClusterDatasetResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateAIDBClusterDatasetResponseBody setDataServiceId(String dataServiceId) {
        this.dataServiceId = dataServiceId;
        return this;
    }
    public String getDataServiceId() {
        return this.dataServiceId;
    }

    public CreateAIDBClusterDatasetResponseBody setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public CreateAIDBClusterDatasetResponseBody setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public CreateAIDBClusterDatasetResponseBody setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CreateAIDBClusterDatasetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
