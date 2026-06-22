// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OpenBackupAutoConfigRequest extends TeaModel {
    /**
     * <p>The number of servers included in a single batch when the anti-ransomware managed service automatically generates policies.</p>
     * <blockquote>
     * <p>The maximum value is 50. If you specify a value greater than 50, the value is set to 50.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxBatchSize")
    public Integer maxBatchSize;

    public static OpenBackupAutoConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenBackupAutoConfigRequest self = new OpenBackupAutoConfigRequest();
        return TeaModel.build(map, self);
    }

    public OpenBackupAutoConfigRequest setMaxBatchSize(Integer maxBatchSize) {
        this.maxBatchSize = maxBatchSize;
        return this;
    }
    public Integer getMaxBatchSize() {
        return this.maxBatchSize;
    }

}
