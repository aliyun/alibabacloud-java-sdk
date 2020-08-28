// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetDeviceVideoUrlRequest extends TeaModel {
    @NameInMap("CorpId")
    @Validation(required = true)
    public String corpId;

    @NameInMap("GbId")
    public String gbId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    public static GetDeviceVideoUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceVideoUrlRequest self = new GetDeviceVideoUrlRequest();
        return TeaModel.build(map, self);
    }

}
