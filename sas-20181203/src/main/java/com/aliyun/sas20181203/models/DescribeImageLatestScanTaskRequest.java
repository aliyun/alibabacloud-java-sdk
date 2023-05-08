// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageLatestScanTaskRequest extends TeaModel {
    @NameInMap("Digest")
    public String digest;

    public static DescribeImageLatestScanTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageLatestScanTaskRequest self = new DescribeImageLatestScanTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageLatestScanTaskRequest setDigest(String digest) {
        this.digest = digest;
        return this;
    }
    public String getDigest() {
        return this.digest;
    }

}
