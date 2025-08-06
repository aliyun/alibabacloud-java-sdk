// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetCheckChannelResponseBody extends TeaModel {
    @NameInMap("Audit")
    public SetCheckChannelResponseBodyAudit audit;

    @NameInMap("RequestId")
    public String requestId;

    public static SetCheckChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetCheckChannelResponseBody self = new SetCheckChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public SetCheckChannelResponseBody setAudit(SetCheckChannelResponseBodyAudit audit) {
        this.audit = audit;
        return this;
    }
    public SetCheckChannelResponseBodyAudit getAudit() {
        return this.audit;
    }

    public SetCheckChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SetCheckChannelResponseBodyAudit extends TeaModel {
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

        public static SetCheckChannelResponseBodyAudit build(java.util.Map<String, ?> map) throws Exception {
            SetCheckChannelResponseBodyAudit self = new SetCheckChannelResponseBodyAudit();
            return TeaModel.build(map, self);
        }

        public SetCheckChannelResponseBodyAudit setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public SetCheckChannelResponseBodyAudit setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SetCheckChannelResponseBodyAudit setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public SetCheckChannelResponseBodyAudit setLegalSwitch(String legalSwitch) {
            this.legalSwitch = legalSwitch;
            return this;
        }
        public String getLegalSwitch() {
            return this.legalSwitch;
        }

        public SetCheckChannelResponseBodyAudit setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
