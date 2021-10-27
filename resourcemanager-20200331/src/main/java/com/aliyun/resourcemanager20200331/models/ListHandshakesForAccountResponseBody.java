// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListHandshakesForAccountResponseBody extends TeaModel {
    @NameInMap("Handshakes")
    public ListHandshakesForAccountResponseBodyHandshakes handshakes;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListHandshakesForAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHandshakesForAccountResponseBody self = new ListHandshakesForAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHandshakesForAccountResponseBody setHandshakes(ListHandshakesForAccountResponseBodyHandshakes handshakes) {
        this.handshakes = handshakes;
        return this;
    }
    public ListHandshakesForAccountResponseBodyHandshakes getHandshakes() {
        return this.handshakes;
    }

    public ListHandshakesForAccountResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListHandshakesForAccountResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHandshakesForAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHandshakesForAccountResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListHandshakesForAccountResponseBodyHandshakesHandshake extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("HandshakeId")
        public String handshakeId;

        @NameInMap("MasterAccountId")
        public String masterAccountId;

        @NameInMap("MasterAccountName")
        public String masterAccountName;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("Note")
        public String note;

        @NameInMap("ResourceDirectoryId")
        public String resourceDirectoryId;

        @NameInMap("Status")
        public String status;

        @NameInMap("TargetEntity")
        public String targetEntity;

        @NameInMap("TargetType")
        public String targetType;

        public static ListHandshakesForAccountResponseBodyHandshakesHandshake build(java.util.Map<String, ?> map) throws Exception {
            ListHandshakesForAccountResponseBodyHandshakesHandshake self = new ListHandshakesForAccountResponseBodyHandshakesHandshake();
            return TeaModel.build(map, self);
        }

        public ListHandshakesForAccountResponseBodyHandshakesHandshake setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListHandshakesForAccountResponseBodyHandshakesHandshake setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListHandshakesForAccountResponseBodyHandshakesHandshake setHandshakeId(String handshakeId) {
            this.handshakeId = handshakeId;
            return this;
        }
        public String getHandshakeId() {
            return this.handshakeId;
        }

        public ListHandshakesForAccountResponseBodyHandshakesHandshake setMasterAccountId(String masterAccountId) {
            this.masterAccountId = masterAccountId;
            return this;
        }
        public String getMasterAccountId() {
            return this.masterAccountId;
        }

        public ListHandshakesForAccountResponseBodyHandshakesHandshake setMasterAccountName(String masterAccountName) {
            this.masterAccountName = masterAccountName;
            return this;
        }
        public String getMasterAccountName() {
            return this.masterAccountName;
        }

        public ListHandshakesForAccountResponseBodyHandshakesHandshake setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListHandshakesForAccountResponseBodyHandshakesHandshake setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public ListHandshakesForAccountResponseBodyHandshakesHandshake setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public ListHandshakesForAccountResponseBodyHandshakesHandshake setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListHandshakesForAccountResponseBodyHandshakesHandshake setTargetEntity(String targetEntity) {
            this.targetEntity = targetEntity;
            return this;
        }
        public String getTargetEntity() {
            return this.targetEntity;
        }

        public ListHandshakesForAccountResponseBodyHandshakesHandshake setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class ListHandshakesForAccountResponseBodyHandshakes extends TeaModel {
        @NameInMap("Handshake")
        public java.util.List<ListHandshakesForAccountResponseBodyHandshakesHandshake> handshake;

        public static ListHandshakesForAccountResponseBodyHandshakes build(java.util.Map<String, ?> map) throws Exception {
            ListHandshakesForAccountResponseBodyHandshakes self = new ListHandshakesForAccountResponseBodyHandshakes();
            return TeaModel.build(map, self);
        }

        public ListHandshakesForAccountResponseBodyHandshakes setHandshake(java.util.List<ListHandshakesForAccountResponseBodyHandshakesHandshake> handshake) {
            this.handshake = handshake;
            return this;
        }
        public java.util.List<ListHandshakesForAccountResponseBodyHandshakesHandshake> getHandshake() {
            return this.handshake;
        }

    }

}
