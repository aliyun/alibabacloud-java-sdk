// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListDevicesRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("GbId")
    public String gbId;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDevicesRequest self = new ListDevicesRequest();
        return TeaModel.build(map, self);
    }

}
