// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOssBucketScanStatisticRequest extends TeaModel {
    /**
     * <p>The names of the buckets.</p>
     */
    @NameInMap("BucketNameList")
    public java.util.List<String> bucketNameList;

    @NameInMap("Source")
    public String source;

    public static GetOssBucketScanStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOssBucketScanStatisticRequest self = new GetOssBucketScanStatisticRequest();
        return TeaModel.build(map, self);
    }

    public GetOssBucketScanStatisticRequest setBucketNameList(java.util.List<String> bucketNameList) {
        this.bucketNameList = bucketNameList;
        return this;
    }
    public java.util.List<String> getBucketNameList() {
        return this.bucketNameList;
    }

    public GetOssBucketScanStatisticRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
