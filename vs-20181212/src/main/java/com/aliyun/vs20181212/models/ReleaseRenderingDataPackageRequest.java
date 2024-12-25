// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ReleaseRenderingDataPackageRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dp-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("DataPackageId")
    public String dataPackageId;

    public static ReleaseRenderingDataPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseRenderingDataPackageRequest self = new ReleaseRenderingDataPackageRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseRenderingDataPackageRequest setDataPackageId(String dataPackageId) {
        this.dataPackageId = dataPackageId;
        return this;
    }
    public String getDataPackageId() {
        return this.dataPackageId;
    }

}
