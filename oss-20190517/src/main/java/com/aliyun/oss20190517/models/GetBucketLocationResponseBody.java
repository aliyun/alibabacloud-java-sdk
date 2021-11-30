// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketLocationResponseBody extends TeaModel {
    @NameInMap("LocationConstraint")
    public String locationConstraint;

    public static GetBucketLocationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBucketLocationResponseBody self = new GetBucketLocationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBucketLocationResponseBody setLocationConstraint(String locationConstraint) {
        this.locationConstraint = locationConstraint;
        return this;
    }
    public String getLocationConstraint() {
        return this.locationConstraint;
    }

}
