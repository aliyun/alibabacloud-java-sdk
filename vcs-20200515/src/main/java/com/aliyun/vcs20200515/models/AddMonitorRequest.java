// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddMonitorRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("MonitorType")
    public String monitorType;

    @NameInMap("Description")
    public String description;

    @NameInMap("BatchIndicator")
    public Integer batchIndicator;

    public static AddMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMonitorRequest self = new AddMonitorRequest();
        return TeaModel.build(map, self);
    }

}
