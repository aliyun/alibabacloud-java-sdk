// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetDeviceLiveUrlRequest extends TeaModel {
    @NameInMap("CorpId")
    @Validation(required = true)
    public String corpId;

    @NameInMap("GbId")
    public String gbId;

    public static GetDeviceLiveUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceLiveUrlRequest self = new GetDeviceLiveUrlRequest();
        return TeaModel.build(map, self);
    }

}
