// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetMonitorResultRequest extends TeaModel {
    @NameInMap("CorpId")
    @Validation(required = true)
    public String corpId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    @NameInMap("MinRecordId")
    public String minRecordId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    public static GetMonitorResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMonitorResultRequest self = new GetMonitorResultRequest();
        return TeaModel.build(map, self);
    }

}
