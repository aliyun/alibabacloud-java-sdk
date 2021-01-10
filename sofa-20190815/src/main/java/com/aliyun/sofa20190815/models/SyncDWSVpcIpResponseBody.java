// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SyncDWSVpcIpResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public SyncDWSVpcIpResponseBodyData data;

    public static SyncDWSVpcIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncDWSVpcIpResponseBody self = new SyncDWSVpcIpResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncDWSVpcIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SyncDWSVpcIpResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SyncDWSVpcIpResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public SyncDWSVpcIpResponseBody setData(SyncDWSVpcIpResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SyncDWSVpcIpResponseBodyData getData() {
        return this.data;
    }

    public static class SyncDWSVpcIpResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("MappingIp")
        public String mappingIp;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static SyncDWSVpcIpResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SyncDWSVpcIpResponseBodyData self = new SyncDWSVpcIpResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SyncDWSVpcIpResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public SyncDWSVpcIpResponseBodyData setMappingIp(String mappingIp) {
            this.mappingIp = mappingIp;
            return this;
        }
        public String getMappingIp() {
            return this.mappingIp;
        }

        public SyncDWSVpcIpResponseBodyData setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

}
