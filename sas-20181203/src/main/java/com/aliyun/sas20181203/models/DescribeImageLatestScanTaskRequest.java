// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageLatestScanTaskRequest extends TeaModel {
    /**
     * <p>The digest value of the image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8f0fbdb41d3d1ade4ffdf21558443f4c03342010563bb8c43ccc09594d50****</p>
     */
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
