// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSSubsDailyConsumedRecordRequest extends TeaModel {
    @NameInMap("End")
    public Long end;

    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Start")
    public Long start;

    public static GetDWSSubsDailyConsumedRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDWSSubsDailyConsumedRecordRequest self = new GetDWSSubsDailyConsumedRecordRequest();
        return TeaModel.build(map, self);
    }

    public GetDWSSubsDailyConsumedRecordRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public GetDWSSubsDailyConsumedRecordRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetDWSSubsDailyConsumedRecordRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetDWSSubsDailyConsumedRecordRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
