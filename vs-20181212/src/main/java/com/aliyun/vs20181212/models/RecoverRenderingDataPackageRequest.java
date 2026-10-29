// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class RecoverRenderingDataPackageRequest extends TeaModel {
    /**
     * <p>The ID of the cloud application service data package.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dp-449ea3d16c0841b8bf33ec5bbc86a152</p>
     */
    @NameInMap("DataPackageId")
    public String dataPackageId;

    /**
     * <p>The data loading mode. Valid values:</p>
     * <ul>
     * <li>System: system-level loading, which provides high stability but takes a relatively long time.</li>
     * <li>Process: process-level loading, which provides high loading timeliness but relatively low stability.
     * Default value: System.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Process</p>
     */
    @NameInMap("LoadMode")
    public String loadMode;

    /**
     * <p>The cloud application service instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    public static RecoverRenderingDataPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        RecoverRenderingDataPackageRequest self = new RecoverRenderingDataPackageRequest();
        return TeaModel.build(map, self);
    }

    public RecoverRenderingDataPackageRequest setDataPackageId(String dataPackageId) {
        this.dataPackageId = dataPackageId;
        return this;
    }
    public String getDataPackageId() {
        return this.dataPackageId;
    }

    public RecoverRenderingDataPackageRequest setLoadMode(String loadMode) {
        this.loadMode = loadMode;
        return this;
    }
    public String getLoadMode() {
        return this.loadMode;
    }

    public RecoverRenderingDataPackageRequest setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

}
