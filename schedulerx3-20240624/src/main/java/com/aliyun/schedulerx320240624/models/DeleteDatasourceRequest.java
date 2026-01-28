// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class DeleteDatasourceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>195</p>
     */
    @NameInMap("DatasourceId")
    public Long datasourceId;

    public static DeleteDatasourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasourceRequest self = new DeleteDatasourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDatasourceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteDatasourceRequest setDatasourceId(Long datasourceId) {
        this.datasourceId = datasourceId;
        return this;
    }
    public Long getDatasourceId() {
        return this.datasourceId;
    }

}
