// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasInspectSingledayreportRequest extends TeaModel {
    @NameInMap("UnixTime")
    public Long unixTime;

    public static ListHasInspectSingledayreportRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHasInspectSingledayreportRequest self = new ListHasInspectSingledayreportRequest();
        return TeaModel.build(map, self);
    }

    public ListHasInspectSingledayreportRequest setUnixTime(Long unixTime) {
        this.unixTime = unixTime;
        return this;
    }
    public Long getUnixTime() {
        return this.unixTime;
    }

}
