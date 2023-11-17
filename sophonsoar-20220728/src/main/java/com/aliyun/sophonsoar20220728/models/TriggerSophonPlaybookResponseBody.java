// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class TriggerSophonPlaybookResponseBody extends TeaModel {
    @NameInMap("Data")
    public TriggerSophonPlaybookResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static TriggerSophonPlaybookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TriggerSophonPlaybookResponseBody self = new TriggerSophonPlaybookResponseBody();
        return TeaModel.build(map, self);
    }

    public TriggerSophonPlaybookResponseBody setData(TriggerSophonPlaybookResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TriggerSophonPlaybookResponseBodyData getData() {
        return this.data;
    }

    public TriggerSophonPlaybookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class TriggerSophonPlaybookResponseBodyData extends TeaModel {
        @NameInMap("SophonTaskId")
        public String sophonTaskId;

        public static TriggerSophonPlaybookResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TriggerSophonPlaybookResponseBodyData self = new TriggerSophonPlaybookResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TriggerSophonPlaybookResponseBodyData setSophonTaskId(String sophonTaskId) {
            this.sophonTaskId = sophonTaskId;
            return this;
        }
        public String getSophonTaskId() {
            return this.sophonTaskId;
        }

    }

}
