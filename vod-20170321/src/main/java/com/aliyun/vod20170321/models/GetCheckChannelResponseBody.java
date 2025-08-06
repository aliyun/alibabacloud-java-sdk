// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetCheckChannelResponseBody extends TeaModel {
    @NameInMap("Audit")
    public GetCheckChannelResponseBodyAudit audit;

    @NameInMap("RequestId")
    public String requestId;

    public static GetCheckChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCheckChannelResponseBody self = new GetCheckChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCheckChannelResponseBody setAudit(GetCheckChannelResponseBodyAudit audit) {
        this.audit = audit;
        return this;
    }
    public GetCheckChannelResponseBodyAudit getAudit() {
        return this.audit;
    }

    public GetCheckChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCheckChannelResponseBodyAudit extends TeaModel {
        @NameInMap("Channel")
        public String channel;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CustomerId")
        public String customerId;

        @NameInMap("LegalSwitch")
        public String legalSwitch;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetCheckChannelResponseBodyAudit build(java.util.Map<String, ?> map) throws Exception {
            GetCheckChannelResponseBodyAudit self = new GetCheckChannelResponseBodyAudit();
            return TeaModel.build(map, self);
        }

        public GetCheckChannelResponseBodyAudit setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public GetCheckChannelResponseBodyAudit setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetCheckChannelResponseBodyAudit setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetCheckChannelResponseBodyAudit setLegalSwitch(String legalSwitch) {
            this.legalSwitch = legalSwitch;
            return this;
        }
        public String getLegalSwitch() {
            return this.legalSwitch;
        }

        public GetCheckChannelResponseBodyAudit setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
