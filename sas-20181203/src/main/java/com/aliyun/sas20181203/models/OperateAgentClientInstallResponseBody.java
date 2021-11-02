// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateAgentClientInstallResponseBody extends TeaModel {
    @NameInMap("AegisCelintInstallResposeList")
    public java.util.List<OperateAgentClientInstallResponseBodyAegisCelintInstallResposeList> aegisCelintInstallResposeList;

    @NameInMap("RequestId")
    public String requestId;

    public static OperateAgentClientInstallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateAgentClientInstallResponseBody self = new OperateAgentClientInstallResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateAgentClientInstallResponseBody setAegisCelintInstallResposeList(java.util.List<OperateAgentClientInstallResponseBodyAegisCelintInstallResposeList> aegisCelintInstallResposeList) {
        this.aegisCelintInstallResposeList = aegisCelintInstallResposeList;
        return this;
    }
    public java.util.List<OperateAgentClientInstallResponseBodyAegisCelintInstallResposeList> getAegisCelintInstallResposeList() {
        return this.aegisCelintInstallResposeList;
    }

    public OperateAgentClientInstallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class OperateAgentClientInstallResponseBodyAegisCelintInstallResposeList extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RecordId")
        public Long recordId;

        @NameInMap("Uuid")
        public String uuid;

        public static OperateAgentClientInstallResponseBodyAegisCelintInstallResposeList build(java.util.Map<String, ?> map) throws Exception {
            OperateAgentClientInstallResponseBodyAegisCelintInstallResposeList self = new OperateAgentClientInstallResponseBodyAegisCelintInstallResposeList();
            return TeaModel.build(map, self);
        }

        public OperateAgentClientInstallResponseBodyAegisCelintInstallResposeList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public OperateAgentClientInstallResponseBodyAegisCelintInstallResposeList setRecordId(Long recordId) {
            this.recordId = recordId;
            return this;
        }
        public Long getRecordId() {
            return this.recordId;
        }

        public OperateAgentClientInstallResponseBodyAegisCelintInstallResposeList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
