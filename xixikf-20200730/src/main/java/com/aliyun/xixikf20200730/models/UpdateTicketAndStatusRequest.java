// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class UpdateTicketAndStatusRequest extends TeaModel {
    @NameInMap("AppealInfo")
    public String appealInfo;

    @NameInMap("CaseChannel")
    public Integer caseChannel;

    @NameInMap("CaseId")
    public Long caseId;

    @NameInMap("CaseStatus")
    public Integer caseStatus;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("EnclosureUrl")
    public java.util.List<UpdateTicketAndStatusRequestEnclosureUrl> enclosureUrl;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IsAppeal")
    public Boolean isAppeal;

    @NameInMap("StatusInfo")
    public String statusInfo;

    public static UpdateTicketAndStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTicketAndStatusRequest self = new UpdateTicketAndStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTicketAndStatusRequest setAppealInfo(String appealInfo) {
        this.appealInfo = appealInfo;
        return this;
    }
    public String getAppealInfo() {
        return this.appealInfo;
    }

    public UpdateTicketAndStatusRequest setCaseChannel(Integer caseChannel) {
        this.caseChannel = caseChannel;
        return this;
    }
    public Integer getCaseChannel() {
        return this.caseChannel;
    }

    public UpdateTicketAndStatusRequest setCaseId(Long caseId) {
        this.caseId = caseId;
        return this;
    }
    public Long getCaseId() {
        return this.caseId;
    }

    public UpdateTicketAndStatusRequest setCaseStatus(Integer caseStatus) {
        this.caseStatus = caseStatus;
        return this;
    }
    public Integer getCaseStatus() {
        return this.caseStatus;
    }

    public UpdateTicketAndStatusRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateTicketAndStatusRequest setEnclosureUrl(java.util.List<UpdateTicketAndStatusRequestEnclosureUrl> enclosureUrl) {
        this.enclosureUrl = enclosureUrl;
        return this;
    }
    public java.util.List<UpdateTicketAndStatusRequestEnclosureUrl> getEnclosureUrl() {
        return this.enclosureUrl;
    }

    public UpdateTicketAndStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateTicketAndStatusRequest setIsAppeal(Boolean isAppeal) {
        this.isAppeal = isAppeal;
        return this;
    }
    public Boolean getIsAppeal() {
        return this.isAppeal;
    }

    public UpdateTicketAndStatusRequest setStatusInfo(String statusInfo) {
        this.statusInfo = statusInfo;
        return this;
    }
    public String getStatusInfo() {
        return this.statusInfo;
    }

    public static class UpdateTicketAndStatusRequestEnclosureUrl extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        @NameInMap("Uid")
        public String uid;

        @NameInMap("Url")
        public String url;

        public static UpdateTicketAndStatusRequestEnclosureUrl build(java.util.Map<String, ?> map) throws Exception {
            UpdateTicketAndStatusRequestEnclosureUrl self = new UpdateTicketAndStatusRequestEnclosureUrl();
            return TeaModel.build(map, self);
        }

        public UpdateTicketAndStatusRequestEnclosureUrl setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateTicketAndStatusRequestEnclosureUrl setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateTicketAndStatusRequestEnclosureUrl setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public UpdateTicketAndStatusRequestEnclosureUrl setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
