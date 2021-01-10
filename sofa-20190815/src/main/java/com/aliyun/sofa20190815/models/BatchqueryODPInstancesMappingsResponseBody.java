// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryODPInstancesMappingsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<BatchqueryODPInstancesMappingsResponseBodyData> data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static BatchqueryODPInstancesMappingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryODPInstancesMappingsResponseBody self = new BatchqueryODPInstancesMappingsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchqueryODPInstancesMappingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchqueryODPInstancesMappingsResponseBody setData(java.util.List<BatchqueryODPInstancesMappingsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<BatchqueryODPInstancesMappingsResponseBodyData> getData() {
        return this.data;
    }

    public BatchqueryODPInstancesMappingsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public BatchqueryODPInstancesMappingsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class BatchqueryODPInstancesMappingsResponseBodyData extends TeaModel {
        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceId")
        public String instanceId;

        public static BatchqueryODPInstancesMappingsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchqueryODPInstancesMappingsResponseBodyData self = new BatchqueryODPInstancesMappingsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchqueryODPInstancesMappingsResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public BatchqueryODPInstancesMappingsResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
