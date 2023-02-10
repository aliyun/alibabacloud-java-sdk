// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerTagsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TagValues")
    public java.util.List<String> tagValues;

    public static DescribeContainerTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerTagsResponseBody self = new DescribeContainerTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContainerTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeContainerTagsResponseBody setTagValues(java.util.List<String> tagValues) {
        this.tagValues = tagValues;
        return this;
    }
    public java.util.List<String> getTagValues() {
        return this.tagValues;
    }

}
