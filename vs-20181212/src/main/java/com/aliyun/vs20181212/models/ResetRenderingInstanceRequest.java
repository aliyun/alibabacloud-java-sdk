// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ResetRenderingInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Reset</p>
     */
    @NameInMap("ActionName")
    public String actionName;

    /**
     * <p>Data baseline ID</p>
     * 
     * <strong>example:</strong>
     * <p>dp-449ea3d16c0841b8bf33ec5bbc86a152</p>
     */
    @NameInMap("DataPackageId")
    public String dataPackageId;

    /**
     * <p>Service instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    public static ResetRenderingInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetRenderingInstanceRequest self = new ResetRenderingInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ResetRenderingInstanceRequest setActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }
    public String getActionName() {
        return this.actionName;
    }

    public ResetRenderingInstanceRequest setDataPackageId(String dataPackageId) {
        this.dataPackageId = dataPackageId;
        return this;
    }
    public String getDataPackageId() {
        return this.dataPackageId;
    }

    public ResetRenderingInstanceRequest setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

}
