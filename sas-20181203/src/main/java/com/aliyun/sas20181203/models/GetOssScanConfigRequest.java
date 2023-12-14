// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOssScanConfigRequest extends TeaModel {
    /**
     * <p>The name of the bucket.</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <p>The ID of the policy.</p>
     */
    @NameInMap("Id")
    public String id;

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

    public GetOssScanConfigRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
