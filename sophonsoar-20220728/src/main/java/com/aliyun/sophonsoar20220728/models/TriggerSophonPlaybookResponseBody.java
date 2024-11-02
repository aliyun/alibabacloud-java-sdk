// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class TriggerSophonPlaybookResponseBody extends TeaModel {
    /**
     * <p>The details that is returned after the command or playbook is triggered.</p>
     */
    @NameInMap("Data")
    public TriggerSophonPlaybookResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0DFC9403-54EB-5672-B690-9AA93C9EBB54</p>
     */
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
        /**
         * <p>The custom ID. If you do not specify this parameter when the playbook is triggered, a random ID is generated for fault locating and troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>a7c6d055-a72f-4676-bc89-3cd9edc0284c</p>
         */
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
