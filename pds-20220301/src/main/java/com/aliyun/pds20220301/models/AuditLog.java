// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AuditLog extends TeaModel {
    @NameInMap("acted_at")
    public String actedAt;

    @NameInMap("action_category")
    public String actionCategory;

    @NameInMap("action_type")
    public String actionType;

    @NameInMap("actor_id")
    public String actorId;

    @NameInMap("actor_name")
    public String actorName;

    @NameInMap("actor_type")
    public String actorType;

    @NameInMap("client_device")
    public String clientDevice;

    @NameInMap("client_ip")
    public String clientIp;

    @NameInMap("client_type")
    public String clientType;

    @NameInMap("client_version")
    public String clientVersion;

    @NameInMap("detail")
    public AuditLogDetail detail;

    @NameInMap("file_path_type")
    public String filePathType;

    @NameInMap("log_id")
    public String logId;

    @NameInMap("object_id")
    public String objectId;

    @NameInMap("object_name")
    public String objectName;

    public static AuditLog build(java.util.Map<String, ?> map) throws Exception {
        AuditLog self = new AuditLog();
        return TeaModel.build(map, self);
    }

    public AuditLog setActedAt(String actedAt) {
        this.actedAt = actedAt;
        return this;
    }
    public String getActedAt() {
        return this.actedAt;
    }

    public AuditLog setActionCategory(String actionCategory) {
        this.actionCategory = actionCategory;
        return this;
    }
    public String getActionCategory() {
        return this.actionCategory;
    }

    public AuditLog setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public AuditLog setActorId(String actorId) {
        this.actorId = actorId;
        return this;
    }
    public String getActorId() {
        return this.actorId;
    }

    public AuditLog setActorName(String actorName) {
        this.actorName = actorName;
        return this;
    }
    public String getActorName() {
        return this.actorName;
    }

    public AuditLog setActorType(String actorType) {
        this.actorType = actorType;
        return this;
    }
    public String getActorType() {
        return this.actorType;
    }

    public AuditLog setClientDevice(String clientDevice) {
        this.clientDevice = clientDevice;
        return this;
    }
    public String getClientDevice() {
        return this.clientDevice;
    }

    public AuditLog setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public AuditLog setClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }
    public String getClientType() {
        return this.clientType;
    }

    public AuditLog setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public AuditLog setDetail(AuditLogDetail detail) {
        this.detail = detail;
        return this;
    }
    public AuditLogDetail getDetail() {
        return this.detail;
    }

    public AuditLog setFilePathType(String filePathType) {
        this.filePathType = filePathType;
        return this;
    }
    public String getFilePathType() {
        return this.filePathType;
    }

    public AuditLog setLogId(String logId) {
        this.logId = logId;
        return this;
    }
    public String getLogId() {
        return this.logId;
    }

    public AuditLog setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public AuditLog setObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }
    public String getObjectName() {
        return this.objectName;
    }

}
