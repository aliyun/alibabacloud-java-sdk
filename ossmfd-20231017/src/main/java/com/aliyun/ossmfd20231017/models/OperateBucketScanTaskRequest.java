// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossmfd20231017.models;

import com.aliyun.tea.*;

public class OperateBucketScanTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>testBucket******</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
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
