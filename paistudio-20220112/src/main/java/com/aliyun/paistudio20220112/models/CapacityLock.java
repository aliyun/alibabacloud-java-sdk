// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class CapacityLock extends TeaModel {
    @NameInMap("availableCount")
    public Integer availableCount;

    @NameInMap("crsReservationId")
    public String crsReservationId;

    @NameInMap("description")
    public String description;

    @NameInMap("expireTime")
    public String expireTime;

    @NameInMap("gmtCreated")
    public String gmtCreated;

    @NameInMap("gmtModified")
    public String gmtModified;

    @NameInMap("id")
    public String id;

    @NameInMap("instanceType")
    public String instanceType;

    @NameInMap("lastReconcileAttemptTime")
    public String lastReconcileAttemptTime;

    @NameInMap("lastSyncTime")
    public String lastSyncTime;

    @NameInMap("lockProvider")
    public String lockProvider;

    @NameInMap("lockedCount")
    public Integer lockedCount;

    @NameInMap("operator")
    public String operator;

    @NameInMap("paymentType")
    public String paymentType;

    @NameInMap("privatePoolId")
    public String privatePoolId;

    @NameInMap("requestedCount")
    public Integer requestedCount;

    @NameInMap("status")
    public String status;

    @NameInMap("tenantId")
    public String tenantId;

    @NameInMap("usedCount")
    public Integer usedCount;

    @NameInMap("zoneId")
    public String zoneId;

    public static CapacityLock build(java.util.Map<String, ?> map) throws Exception {
        CapacityLock self = new CapacityLock();
        return TeaModel.build(map, self);
    }

    public CapacityLock setAvailableCount(Integer availableCount) {
        this.availableCount = availableCount;
        return this;
    }
    public Integer getAvailableCount() {
        return this.availableCount;
    }

    public CapacityLock setCrsReservationId(String crsReservationId) {
        this.crsReservationId = crsReservationId;
        return this;
    }
    public String getCrsReservationId() {
        return this.crsReservationId;
    }

    public CapacityLock setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CapacityLock setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public CapacityLock setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    public CapacityLock setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public CapacityLock setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CapacityLock setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CapacityLock setLastReconcileAttemptTime(String lastReconcileAttemptTime) {
        this.lastReconcileAttemptTime = lastReconcileAttemptTime;
        return this;
    }
    public String getLastReconcileAttemptTime() {
        return this.lastReconcileAttemptTime;
    }

    public CapacityLock setLastSyncTime(String lastSyncTime) {
        this.lastSyncTime = lastSyncTime;
        return this;
    }
    public String getLastSyncTime() {
        return this.lastSyncTime;
    }

    public CapacityLock setLockProvider(String lockProvider) {
        this.lockProvider = lockProvider;
        return this;
    }
    public String getLockProvider() {
        return this.lockProvider;
    }

    public CapacityLock setLockedCount(Integer lockedCount) {
        this.lockedCount = lockedCount;
        return this;
    }
    public Integer getLockedCount() {
        return this.lockedCount;
    }

    public CapacityLock setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public CapacityLock setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public CapacityLock setPrivatePoolId(String privatePoolId) {
        this.privatePoolId = privatePoolId;
        return this;
    }
    public String getPrivatePoolId() {
        return this.privatePoolId;
    }

    public CapacityLock setRequestedCount(Integer requestedCount) {
        this.requestedCount = requestedCount;
        return this;
    }
    public Integer getRequestedCount() {
        return this.requestedCount;
    }

    public CapacityLock setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CapacityLock setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CapacityLock setUsedCount(Integer usedCount) {
        this.usedCount = usedCount;
        return this;
    }
    public Integer getUsedCount() {
        return this.usedCount;
    }

    public CapacityLock setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
