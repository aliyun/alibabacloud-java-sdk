// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteAIDBClusterDatasetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pcs-2zeei***</p>
     */
    @NameInMap("DataServiceId")
    public String dataServiceId;

    /**
     * <strong>example:</strong>
     * <p>pds-xxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("DatasetId")
    public String datasetId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CD35F3-F3-44CA-AFFF-BAF869******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAIDBClusterDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAIDBClusterDatasetResponseBody self = new DeleteAIDBClusterDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAIDBClusterDatasetResponseBody setDataServiceId(String dataServiceId) {
        this.dataServiceId = dataServiceId;
        return this;
    }
    public String getDataServiceId() {
        return this.dataServiceId;
    }

    public DeleteAIDBClusterDatasetResponseBody setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public DeleteAIDBClusterDatasetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
