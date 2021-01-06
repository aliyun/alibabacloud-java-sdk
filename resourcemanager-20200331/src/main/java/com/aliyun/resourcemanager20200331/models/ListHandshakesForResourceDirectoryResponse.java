// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListHandshakesForResourceDirectoryResponse extends TeaModel {
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
    public ListHandshakesForResourceDirectoryResponseHandshakes handshakes;

    public static ListHandshakesForResourceDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHandshakesForResourceDirectoryResponse self = new ListHandshakesForResourceDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public ListHandshakesForResourceDirectoryResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListHandshakesForResourceDirectoryResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHandshakesForResourceDirectoryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHandshakesForResourceDirectoryResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListHandshakesForResourceDirectoryResponse setHandshakes(ListHandshakesForResourceDirectoryResponseHandshakes handshakes) {
        this.handshakes = handshakes;
        return this;
    }
    public ListHandshakesForResourceDirectoryResponseHandshakes getHandshakes() {
        return this.handshakes;
    }

    public static class ListHandshakesForResourceDirectoryResponseHandshakesHandshake extends TeaModel {
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

        public static ListHandshakesForResourceDirectoryResponseHandshakesHandshake build(java.util.Map<String, ?> map) throws Exception {
            ListHandshakesForResourceDirectoryResponseHandshakesHandshake self = new ListHandshakesForResourceDirectoryResponseHandshakesHandshake();
            return TeaModel.build(map, self);
        }

        public ListHandshakesForResourceDirectoryResponseHandshakesHandshake setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListHandshakesForResourceDirectoryResponseHandshakesHandshake setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListHandshakesForResourceDirectoryResponseHandshakesHandshake setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public ListHandshakesForResourceDirectoryResponseHandshakesHandshake setHandshakeId(String handshakeId) {
            this.handshakeId = handshakeId;
            return this;
        }
        public String getHandshakeId() {
            return this.handshakeId;
        }

        public ListHandshakesForResourceDirectoryResponseHandshakesHandshake setMasterAccountName(String masterAccountName) {
            this.masterAccountName = masterAccountName;
            return this;
        }
        public String getMasterAccountName() {
            return this.masterAccountName;
        }

        public ListHandshakesForResourceDirectoryResponseHandshakesHandshake setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public ListHandshakesForResourceDirectoryResponseHandshakesHandshake setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListHandshakesForResourceDirectoryResponseHandshakesHandshake setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public ListHandshakesForResourceDirectoryResponseHandshakesHandshake setMasterAccountId(String masterAccountId) {
            this.masterAccountId = masterAccountId;
            return this;
        }
        public String getMasterAccountId() {
            return this.masterAccountId;
        }

        public ListHandshakesForResourceDirectoryResponseHandshakesHandshake setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListHandshakesForResourceDirectoryResponseHandshakesHandshake setTargetEntity(String targetEntity) {
            this.targetEntity = targetEntity;
            return this;
        }
        public String getTargetEntity() {
            return this.targetEntity;
        }

    }

    public static class ListHandshakesForResourceDirectoryResponseHandshakes extends TeaModel {
        @NameInMap("Handshake")
        @Validation(required = true)
        public java.util.List<ListHandshakesForResourceDirectoryResponseHandshakesHandshake> handshake;

        public static ListHandshakesForResourceDirectoryResponseHandshakes build(java.util.Map<String, ?> map) throws Exception {
            ListHandshakesForResourceDirectoryResponseHandshakes self = new ListHandshakesForResourceDirectoryResponseHandshakes();
            return TeaModel.build(map, self);
        }

        public ListHandshakesForResourceDirectoryResponseHandshakes setHandshake(java.util.List<ListHandshakesForResourceDirectoryResponseHandshakesHandshake> handshake) {
            this.handshake = handshake;
            return this;
        }
        public java.util.List<ListHandshakesForResourceDirectoryResponseHandshakesHandshake> getHandshake() {
            return this.handshake;
        }

    }

}
