// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDSTTraceHistoryRequest extends TeaModel {
    @NameInMap("DeleteAll")
    public Boolean deleteAll;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TraceId")
    public String traceId;

    public static DeleteDSTTraceHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDSTTraceHistoryRequest self = new DeleteDSTTraceHistoryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDSTTraceHistoryRequest setDeleteAll(Boolean deleteAll) {
        this.deleteAll = deleteAll;
        return this;
    }
    public Boolean getDeleteAll() {
        return this.deleteAll;
    }

    public DeleteDSTTraceHistoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteDSTTraceHistoryRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
