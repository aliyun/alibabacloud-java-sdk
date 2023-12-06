// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateBucketScanTaskRequest extends TeaModel {
    /**
     * <p>The name of the bucket.</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <p>The operation that you want to perform on the bucket. Valid value:</p>
     * <br>
     * <p>*   **1**: cancels the bucket check.</p>
     */
    @NameInMap("OperateCode")
    public Integer operateCode;

    public static OperateBucketScanTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateBucketScanTaskRequest self = new OperateBucketScanTaskRequest();
        return TeaModel.build(map, self);
    }

    public OperateBucketScanTaskRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public OperateBucketScanTaskRequest setOperateCode(Integer operateCode) {
        this.operateCode = operateCode;
        return this;
    }
    public Integer getOperateCode() {
        return this.operateCode;
    }

}
