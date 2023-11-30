// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class DriveLogDetail extends TeaModel {
    @NameInMap("force_delete")
    public Boolean forceDelete;

    @NameInMap("handover_owner_name")
    public String handoverOwnerName;

    @NameInMap("name")
    public String name;

    @NameInMap("owner_id")
    public String ownerId;

    @NameInMap("owner_name")
    public String ownerName;

    @NameInMap("owner_type")
    public String ownerType;

    @NameInMap("total_size")
    public Long totalSize;

    @NameInMap("update_to")
    public DriveLogDetailUpdateTo updateTo;

    public static DriveLogDetail build(java.util.Map<String, ?> map) throws Exception {
        DriveLogDetail self = new DriveLogDetail();
        return TeaModel.build(map, self);
    }

    public DriveLogDetail setForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
        return this;
    }
    public Boolean getForceDelete() {
        return this.forceDelete;
    }

    public DriveLogDetail setHandoverOwnerName(String handoverOwnerName) {
        this.handoverOwnerName = handoverOwnerName;
        return this;
    }
    public String getHandoverOwnerName() {
        return this.handoverOwnerName;
    }

    public DriveLogDetail setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DriveLogDetail setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DriveLogDetail setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public DriveLogDetail setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public DriveLogDetail setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public DriveLogDetail setUpdateTo(DriveLogDetailUpdateTo updateTo) {
        this.updateTo = updateTo;
        return this;
    }
    public DriveLogDetailUpdateTo getUpdateTo() {
        return this.updateTo;
    }

    public static class DriveLogDetailUpdateTo extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("owner_id")
        public String ownerId;

        @NameInMap("owner_name")
        public String ownerName;

        @NameInMap("owner_type")
        public String ownerType;

        @NameInMap("total_size")
        public Long totalSize;

        public static DriveLogDetailUpdateTo build(java.util.Map<String, ?> map) throws Exception {
            DriveLogDetailUpdateTo self = new DriveLogDetailUpdateTo();
            return TeaModel.build(map, self);
        }

        public DriveLogDetailUpdateTo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DriveLogDetailUpdateTo setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public DriveLogDetailUpdateTo setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public DriveLogDetailUpdateTo setOwnerType(String ownerType) {
            this.ownerType = ownerType;
            return this;
        }
        public String getOwnerType() {
            return this.ownerType;
        }

        public DriveLogDetailUpdateTo setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
