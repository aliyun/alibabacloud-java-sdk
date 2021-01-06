// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListHandshakesForAccountResponse extends TeaModel {
    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("Handshakes")
    @Validation(required = true)
    public ListHandshakesForAccountResponseHandshakes handshakes;

    public static ListHandshakesForAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHandshakesForAccountResponse self = new ListHandshakesForAccountResponse();
        return TeaModel.build(map, self);
    }

    public ListHandshakesForAccountResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListHandshakesForAccountResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHandshakesForAccountResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHandshakesForAccountResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListHandshakesForAccountResponse setHandshakes(ListHandshakesForAccountResponseHandshakes handshakes) {
        this.handshakes = handshakes;
        return this;
    }
    public ListHandshakesForAccountResponseHandshakes getHandshakes() {
        return this.handshakes;
    }

    public static class ListHandshakesForAccountResponseHandshakesHandshake extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("ModifyTime")
        @Validation(required = true)
        public String modifyTime;

        @NameInMap("ResourceDirectoryId")
        @Validation(required = true)
        public String resourceDirectoryId;

        @NameInMap("HandshakeId")
        @Validation(required = true)
        public String handshakeId;

        @NameInMap("MasterAccountName")
        @Validation(required = true)
        public String masterAccountName;

        @NameInMap("Note")
        @Validation(required = true)
        public String note;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("TargetType")
        @Validation(required = true)
        public String targetType;

        @NameInMap("MasterAccountId")
        @Validation(required = true)
        public String masterAccountId;

        @NameInMap("ExpireTime")
        @Validation(required = true)
        public String expireTime;

        @NameInMap("TargetEntity")
        @Validation(required = true)
        public String targetEntity;

        public static ListHandshakesForAccountResponseHandshakesHandshake build(java.util.Map<String, ?> map) throws Exception {
            ListHandshakesForAccountResponseHandshakesHandshake self = new ListHandshakesForAccountResponseHandshakesHandshake();
            return TeaModel.build(map, self);
        }

        public ListHandshakesForAccountResponseHandshakesHandshake setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListHandshakesForAccountResponseHandshakesHandshake setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListHandshakesForAccountResponseHandshakesHandshake setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public ListHandshakesForAccountResponseHandshakesHandshake setHandshakeId(String handshakeId) {
            this.handshakeId = handshakeId;
            return this;
        }
        public String getHandshakeId() {
            return this.handshakeId;
        }

        public ListHandshakesForAccountResponseHandshakesHandshake setMasterAccountName(String masterAccountName) {
            this.masterAccountName = masterAccountName;
            return this;
        }
        public String getMasterAccountName() {
            return this.masterAccountName;
        }

        public ListHandshakesForAccountResponseHandshakesHandshake setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public ListHandshakesForAccountResponseHandshakesHandshake setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListHandshakesForAccountResponseHandshakesHandshake setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public ListHandshakesForAccountResponseHandshakesHandshake setMasterAccountId(String masterAccountId) {
            this.masterAccountId = masterAccountId;
            return this;
        }
        public String getMasterAccountId() {
            return this.masterAccountId;
        }

        public ListHandshakesForAccountResponseHandshakesHandshake setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListHandshakesForAccountResponseHandshakesHandshake setTargetEntity(String targetEntity) {
            this.targetEntity = targetEntity;
            return this;
        }
        public String getTargetEntity() {
            return this.targetEntity;
        }

    }

    public static class ListHandshakesForAccountResponseHandshakes extends TeaModel {
        @NameInMap("Handshake")
        @Validation(required = true)
        public java.util.List<ListHandshakesForAccountResponseHandshakesHandshake> handshake;

        public static ListHandshakesForAccountResponseHandshakes build(java.util.Map<String, ?> map) throws Exception {
            ListHandshakesForAccountResponseHandshakes self = new ListHandshakesForAccountResponseHandshakes();
            return TeaModel.build(map, self);
        }

        public ListHandshakesForAccountResponseHandshakes setHandshake(java.util.List<ListHandshakesForAccountResponseHandshakesHandshake> handshake) {
            this.handshake = handshake;
            return this;
        }
        public java.util.List<ListHandshakesForAccountResponseHandshakesHandshake> getHandshake() {
            return this.handshake;
        }

    }

}
