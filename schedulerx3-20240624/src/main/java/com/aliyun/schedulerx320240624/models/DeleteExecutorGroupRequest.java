// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class DeleteExecutorGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>83163</p>
     */
    @NameInMap("Id")
    public Integer id;

    public static DeleteExecutorGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteExecutorGroupRequest self = new DeleteExecutorGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteExecutorGroupRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteExecutorGroupRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

}
