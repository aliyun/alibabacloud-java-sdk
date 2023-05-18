// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListHandshakesForResourceDirectoryResponseBody extends TeaModel {
    /**
     * <p>The information of the invitations.</p>
     */
    @NameInMap("Handshakes")
    public ListHandshakesForResourceDirectoryResponseBodyHandshakes handshakes;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListHandshakesForResourceDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHandshakesForResourceDirectoryResponseBody self = new ListHandshakesForResourceDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHandshakesForResourceDirectoryResponseBody setHandshakes(ListHandshakesForResourceDirectoryResponseBodyHandshakes handshakes) {
        this.handshakes = handshakes;
        return this;
    }
    public ListHandshakesForResourceDirectoryResponseBodyHandshakes getHandshakes() {
        return this.handshakes;
    }

    public ListHandshakesForResourceDirectoryResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListHandshakesForResourceDirectoryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHandshakesForResourceDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHandshakesForResourceDirectoryResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListHandshakesForResourceDirectoryResponseBodyHandshakesHandshake extends TeaModel {
        /**
         * <p>The time when the invitation was created. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the invitation expires. The time is displayed in UTC.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The ID of the invitation.</p>
         */
        @NameInMap("HandshakeId")
        public String handshakeId;

        /**
         * <p>The ID of the management account of the resource directory.</p>
         */
        @NameInMap("MasterAccountId")
        public String masterAccountId;

        /**
         * <p>The name of the management account of the resource directory.</p>
         */
        @NameInMap("MasterAccountName")
        public String masterAccountName;

        /**
         * <p>The time when the invitation was modified. The time is displayed in UTC.</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The comment on the invitation.</p>
         */
        @NameInMap("Note")
        public String note;

        /**
         * <p>The ID of the resource directory.</p>
         */
        @NameInMap("ResourceDirectoryId")
        public String resourceDirectoryId;

        /**
         * <p>The status of the invitation. Valid values:</p>
         * <br>
         * <p>*   Pending: The invitation is waiting for confirmation.</p>
         * <p>*   Accepted: The invitation is accepted.</p>
         * <p>*   Cancelled: The invitation is canceled.</p>
         * <p>*   Declined: The invitation is rejected.</p>
         * <p>*   Expired: The invitation expires.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID or logon email address of the invited account.</p>
         */
        @NameInMap("TargetEntity")
        public String targetEntity;

        /**
         * <p>The type of the invited account. Valid values:</p>
         * <br>
         * <p>*   Account: indicates the ID of the account.</p>
         * <p>*   Email: indicates the logon email address of the account.</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static ListHandshakesForResourceDirectoryResponseBodyHandshakesHandshake build(java.util.Map<String, ?> map) throws Exception {
            ListHandshakesForResourceDirectoryResponseBodyHandshakesHandshake self = new ListHandshakesForResourceDirectoryResponseBodyHandshakesHandshake();
            return TeaModel.build(map, self);
        }

        public ListHandshakesForResourceDirectoryResponseBodyHandshakesHandshake setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListHandshakesForResourceDirectoryResponseBodyHandshakesHandshake setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListHandshakesForResourceDirectoryResponseBodyHandshakesHandshake setHandshakeId(String handshakeId) {
            this.handshakeId = handshakeId;
            return this;
        }
        public String getHandshakeId() {
            return this.handshakeId;
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

        public ListHandshakesForResourceDirectoryResponseBodyHandshakesHandshake setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public ListHandshakesForResourceDirectoryResponseBodyHandshakesHandshake setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public ListHandshakesForResourceDirectoryResponseBodyHandshakesHandshake setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListHandshakesForResourceDirectoryResponseBodyHandshakesHandshake setTargetEntity(String targetEntity) {
            this.targetEntity = targetEntity;
            return this;
        }
        public String getTargetEntity() {
            return this.targetEntity;
        }

        public ListHandshakesForResourceDirectoryResponseBodyHandshakesHandshake setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
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
