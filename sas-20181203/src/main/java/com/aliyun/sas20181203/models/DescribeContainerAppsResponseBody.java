// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerAppsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The tag values.</p>
     */
    @NameInMap("TagValues")
    public java.util.List<String> tagValues;

    public static DescribeContainerAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerAppsResponseBody self = new DescribeContainerAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContainerAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeContainerAppsResponseBody setTagValues(java.util.List<String> tagValues) {
        this.tagValues = tagValues;
        return this;
    }
    public java.util.List<String> getTagValues() {
        return this.tagValues;
    }

}
