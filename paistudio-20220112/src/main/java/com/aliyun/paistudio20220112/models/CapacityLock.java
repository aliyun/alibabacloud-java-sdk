// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class CapacityLock extends TeaModel {
    /**
     * <p>The number of available instances.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("availableCount")
    public Integer availableCount;

    /**
     * <p>The ID of the capacity reservation.</p>
     */
    @NameInMap("crsReservationId")
    public String crsReservationId;

    /**
     * <p>The description of the capacity reservation.</p>
     * 
     * <strong>example:</strong>
     * <p>Test capacity reservation</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The expiration time of the capacity reservation.</p>
     */
    @NameInMap("expireTime")
    public String expireTime;

    /**
     * <p>The creation time.</p>
     */
    @NameInMap("gmtCreated")
    public String gmtCreated;

    /**
     * <p>The modification time.</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <p>The ID of the capacity reservation lock record.</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <p>The instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>ml.gp7vf.16.40xlarge</p>
     */
    @NameInMap("instanceType")
    public String instanceType;

    /**
     * <p>The time of the last reconciliation attempt.</p>
     */
    @NameInMap("lastReconcileAttemptTime")
    public String lastReconcileAttemptTime;

    /**
     * <p>The last synchronization time.</p>
     */
    @NameInMap("lastSyncTime")
    public String lastSyncTime;

    /**
     * <p>The lock service provider.</p>
     */
    @NameInMap("lockProvider")
    public String lockProvider;

    /**
     * <p>The number of locked instances.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("lockedCount")
    public Integer lockedCount;

    /**
     * <p>The operator.</p>
     */
    @NameInMap("operator")
    public String operator;

    /**
     * <p>The billing method.</p>
     */
    @NameInMap("paymentType")
    public String paymentType;

    /**
     * <p>The ID of the private pool.</p>
     */
    @NameInMap("privatePoolId")
    public String privatePoolId;

    /**
     * <p>The number of requested instances.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("requestedCount")
    public Integer requestedCount;

    /**
     * <p>The status.</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The ID of the tenant.</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The number of used instances.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("usedCount")
    public Integer usedCount;

    /**
     * <p>The zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu-a</p>
     */
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
