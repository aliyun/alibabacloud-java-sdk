// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeComfyProductionDownloadUrlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3e5bda20-5cd4-4d55-8d23-88d624a18caa</p>
     */
    @NameInMap("ProductionId")
    public String productionId;

    public static DescribeComfyProductionDownloadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeComfyProductionDownloadUrlRequest self = new DescribeComfyProductionDownloadUrlRequest();
        return TeaModel.build(map, self);
    }

    public DescribeComfyProductionDownloadUrlRequest setProductionId(String productionId) {
        this.productionId = productionId;
        return this;
    }
    public String getProductionId() {
        return this.productionId;
    }

}
