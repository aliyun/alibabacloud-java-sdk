// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossmfd20231017.models;

import com.aliyun.tea.*;

public class GetOssScanConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testBucketName****</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    public static GetOssScanConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOssScanConfigRequest self = new GetOssScanConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetOssScanConfigRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

}
