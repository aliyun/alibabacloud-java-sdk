// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListHandshakesForResourceDirectoryResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Handshakes")
    public ListHandshakesForResourceDirectoryResponseBodyHandshakes handshakes;

    public static ListHandshakesForResourceDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHandshakesForResourceDirectoryResponseBody self = new ListHandshakesForResourceDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHandshakesForResourceDirectoryResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListHandshakesForResourceDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHandshakesForResourceDirectoryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHandshakesForResourceDirectoryResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListHandshakesForResourceDirectoryResponseBody setHandshakes(ListHandshakesForResourceDirectoryResponseBodyHandshakes handshakes) {
        this.handshakes = handshakes;
        return this;
    }
    public ListHandshakesForResourceDirectoryResponseBodyHandshakes getHandshakes() {
        return this.handshakes;
    }

    public static class ListHandshakesForResourceDirectoryResponseBodyHandshakesHandshake extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("ResourceDirectoryId")
        public String resourceDirectoryId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Note")
        public String note;

        @NameInMap("TargetEntity")
        public String targetEntity;

        @NameInMap("MasterAccountId")
        public String masterAccountId;

        @NameInMap("MasterAccountName")
        public String masterAccountName;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("TargetType")
        public String targetType;

        @NameInMap("HandshakeId")
        public String handshakeId;

        public static ListHandshakesForResourceDirectoryResponseBodyHandshakesHandshake build(java.util.Map<String, ?> map) throws Exception {
            ListHandshakesForResourceDirectoryResponseBodyHandshakesHandshake self = new ListHandshakesForResourceDirectoryResponseBodyHandshakesHandshake();
            return TeaModel.build(map, self);
        }

        public ListHandshakesForResourceDirectoryResponseBodyHandshakesHandshake setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListHandshakesForResourceDirectoryResponseBodyHandshakesHandshake setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListHandshakesForResourceDirectoryResponseBodyHandshakesHandshake setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public ListHandshakesForResourceDirectoryResponseBodyHandshakesHandshake setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListHandshakesForResourceDirectoryResponseBodyHandshakesHandshake setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public ListHandshakesForResourceDirectoryResponseBodyHandshakesHandshake setTargetEntity(String targetEntity) {
            this.targetEntity = targetEntity;
            return this;
        }
        public String getTargetEntity() {
            return this.targetEntity;
        }

        public ListHandshakesForResourceDirectoryResponseBodyHandshakesHandshake setMasterAccountId(String masterAccountId) {
            this.masterAccountId = masterAccountId;
            return this;
        }
        public String getMasterAccountId() {
            return this.masterAccountId;
        }

        public ListHandshakesForResourceDirectoryResponseBodyHandshakesHandshake setMasterAccountName(String masterAccountName) {
            this.masterAccountName = masterAccountName;
            return this;
        }
        public String getMasterAccountName() {
            return this.masterAccountName;
        }

        public ListHandshakesForResourceDirectoryResponseBodyHandshakesHandshake setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListHandshakesForResourceDirectoryResponseBodyHandshakesHandshake setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public ListHandshakesForResourceDirectoryResponseBodyHandshakesHandshake setHandshakeId(String handshakeId) {
            this.handshakeId = handshakeId;
            return this;
        }
        public String getHandshakeId() {
            return this.handshakeId;
        }

    }

    public static class ListHandshakesForResourceDirectoryResponseBodyHandshakes extends TeaModel {
        @NameInMap("Handshake")
        public java.util.List<ListHandshakesForResourceDirectoryResponseBodyHandshakesHandshake> handshake;

        public static ListHandshakesForResourceDirectoryResponseBodyHandshakes build(java.util.Map<String, ?> map) throws Exception {
            ListHandshakesForResourceDirectoryResponseBodyHandshakes self = new ListHandshakesForResourceDirectoryResponseBodyHandshakes();
            return TeaModel.build(map, self);
        }

        public ListHandshakesForResourceDirectoryResponseBodyHandshakes setHandshake(java.util.List<ListHandshakesForResourceDirectoryResponseBodyHandshakesHandshake> handshake) {
            this.handshake = handshake;
            return this;
        }
        public java.util.List<ListHandshakesForResourceDirectoryResponseBodyHandshakesHandshake> getHandshake() {
            return this.handshake;
        }

    }

}
