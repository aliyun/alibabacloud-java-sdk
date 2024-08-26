// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AIAssistantSession extends TeaModel {
    @NameInMap("client_id")
    public String clientId;

    @NameInMap("created_at")
    public Long createdAt;

    @NameInMap("custom_labels")
    public java.util.List<String> customLabels;

    @NameInMap("domain_id")
    public String domainId;

    @NameInMap("expired_at")
    public Long expiredAt;

    @NameInMap("name")
    public String name;

    @NameInMap("session_id")
    public String sessionId;

    @NameInMap("status")
    public String status;

    @NameInMap("updated_at")
    public Long updatedAt;

    @NameInMap("user_id")
    public String userId;

    public static AIAssistantSession build(java.util.Map<String, ?> map) throws Exception {
        AIAssistantSession self = new AIAssistantSession();
        return TeaModel.build(map, self);
    }

    public AIAssistantSession setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public AIAssistantSession setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public AIAssistantSession setCustomLabels(java.util.List<String> customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public java.util.List<String> getCustomLabels() {
        return this.customLabels;
    }

    public AIAssistantSession setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public AIAssistantSession setExpiredAt(Long expiredAt) {
        this.expiredAt = expiredAt;
        return this;
    }
    public Long getExpiredAt() {
        return this.expiredAt;
    }

    public AIAssistantSession setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AIAssistantSession setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public AIAssistantSession setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AIAssistantSession setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public AIAssistantSession setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
