// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class BasePunishLogResponse extends TeaModel {
    @NameInMap("error_code")
    public String errorCode;

    @NameInMap("error_message")
    public String errorMessage;

    @NameInMap("punished_at")
    public String punishedAt;

    @NameInMap("punishee")
    public BasePunishLogResponsePunishee punishee;

    @NameInMap("punishment_detail")
    public BasePunishLogResponsePunishmentDetail punishmentDetail;

    @NameInMap("punishment_id")
    public String punishmentId;

    @NameInMap("punishment_operation")
    public String punishmentOperation;

    @NameInMap("status")
    public String status;

    public static BasePunishLogResponse build(java.util.Map<String, ?> map) throws Exception {
        BasePunishLogResponse self = new BasePunishLogResponse();
        return TeaModel.build(map, self);
    }

    public BasePunishLogResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public BasePunishLogResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BasePunishLogResponse setPunishedAt(String punishedAt) {
        this.punishedAt = punishedAt;
        return this;
    }
    public String getPunishedAt() {
        return this.punishedAt;
    }

    public BasePunishLogResponse setPunishee(BasePunishLogResponsePunishee punishee) {
        this.punishee = punishee;
        return this;
    }
    public BasePunishLogResponsePunishee getPunishee() {
        return this.punishee;
    }

    public BasePunishLogResponse setPunishmentDetail(BasePunishLogResponsePunishmentDetail punishmentDetail) {
        this.punishmentDetail = punishmentDetail;
        return this;
    }
    public BasePunishLogResponsePunishmentDetail getPunishmentDetail() {
        return this.punishmentDetail;
    }

    public BasePunishLogResponse setPunishmentId(String punishmentId) {
        this.punishmentId = punishmentId;
        return this;
    }
    public String getPunishmentId() {
        return this.punishmentId;
    }

    public BasePunishLogResponse setPunishmentOperation(String punishmentOperation) {
        this.punishmentOperation = punishmentOperation;
        return this;
    }
    public String getPunishmentOperation() {
        return this.punishmentOperation;
    }

    public BasePunishLogResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class BasePunishLogResponsePunisheeContentHash extends TeaModel {
        @NameInMap("hash_hex_str")
        public String hashHexStr;

        @NameInMap("hash_name")
        public String hashName;

        @NameInMap("size")
        public Long size;

        public static BasePunishLogResponsePunisheeContentHash build(java.util.Map<String, ?> map) throws Exception {
            BasePunishLogResponsePunisheeContentHash self = new BasePunishLogResponsePunisheeContentHash();
            return TeaModel.build(map, self);
        }

        public BasePunishLogResponsePunisheeContentHash setHashHexStr(String hashHexStr) {
            this.hashHexStr = hashHexStr;
            return this;
        }
        public String getHashHexStr() {
            return this.hashHexStr;
        }

        public BasePunishLogResponsePunisheeContentHash setHashName(String hashName) {
            this.hashName = hashName;
            return this;
        }
        public String getHashName() {
            return this.hashName;
        }

        public BasePunishLogResponsePunisheeContentHash setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

    public static class BasePunishLogResponsePunishee extends TeaModel {
        @NameInMap("content_hash")
        public BasePunishLogResponsePunisheeContentHash contentHash;

        @NameInMap("drive_id")
        public String driveId;

        @NameInMap("face_group_id")
        public String faceGroupId;

        @NameInMap("file_id")
        public String fileId;

        @NameInMap("revision_id")
        public String revisionId;

        @NameInMap("share_id")
        public String shareId;

        @NameInMap("user_id")
        public String userId;

        public static BasePunishLogResponsePunishee build(java.util.Map<String, ?> map) throws Exception {
            BasePunishLogResponsePunishee self = new BasePunishLogResponsePunishee();
            return TeaModel.build(map, self);
        }

        public BasePunishLogResponsePunishee setContentHash(BasePunishLogResponsePunisheeContentHash contentHash) {
            this.contentHash = contentHash;
            return this;
        }
        public BasePunishLogResponsePunisheeContentHash getContentHash() {
            return this.contentHash;
        }

        public BasePunishLogResponsePunishee setDriveId(String driveId) {
            this.driveId = driveId;
            return this;
        }
        public String getDriveId() {
            return this.driveId;
        }

        public BasePunishLogResponsePunishee setFaceGroupId(String faceGroupId) {
            this.faceGroupId = faceGroupId;
            return this;
        }
        public String getFaceGroupId() {
            return this.faceGroupId;
        }

        public BasePunishLogResponsePunishee setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public BasePunishLogResponsePunishee setRevisionId(String revisionId) {
            this.revisionId = revisionId;
            return this;
        }
        public String getRevisionId() {
            return this.revisionId;
        }

        public BasePunishLogResponsePunishee setShareId(String shareId) {
            this.shareId = shareId;
            return this;
        }
        public String getShareId() {
            return this.shareId;
        }

        public BasePunishLogResponsePunishee setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class BasePunishLogResponsePunishmentDetail extends TeaModel {
        @NameInMap("action_code")
        public String actionCode;

        @NameInMap("investigation_status")
        public Long investigationStatus;

        @NameInMap("method")
        public String method;

        @NameInMap("punish_reason")
        public String punishReason;

        @NameInMap("punishments")
        public java.util.List<PunishRule> punishments;

        @NameInMap("source")
        public String source;

        public static BasePunishLogResponsePunishmentDetail build(java.util.Map<String, ?> map) throws Exception {
            BasePunishLogResponsePunishmentDetail self = new BasePunishLogResponsePunishmentDetail();
            return TeaModel.build(map, self);
        }

        public BasePunishLogResponsePunishmentDetail setActionCode(String actionCode) {
            this.actionCode = actionCode;
            return this;
        }
        public String getActionCode() {
            return this.actionCode;
        }

        public BasePunishLogResponsePunishmentDetail setInvestigationStatus(Long investigationStatus) {
            this.investigationStatus = investigationStatus;
            return this;
        }
        public Long getInvestigationStatus() {
            return this.investigationStatus;
        }

        public BasePunishLogResponsePunishmentDetail setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public BasePunishLogResponsePunishmentDetail setPunishReason(String punishReason) {
            this.punishReason = punishReason;
            return this;
        }
        public String getPunishReason() {
            return this.punishReason;
        }

        public BasePunishLogResponsePunishmentDetail setPunishments(java.util.List<PunishRule> punishments) {
            this.punishments = punishments;
            return this;
        }
        public java.util.List<PunishRule> getPunishments() {
            return this.punishments;
        }

        public BasePunishLogResponsePunishmentDetail setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

}
