// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class EditEntityRouteRequest extends TeaModel {
    @NameInMap("EntityId")
    public String entityId;

    @NameInMap("EntityName")
    public String entityName;

    @NameInMap("EntityBizCode")
    public String entityBizCode;

    @NameInMap("EntityBizCodeType")
    public String entityBizCodeType;

    @NameInMap("EntityRelationNumber")
    public String entityRelationNumber;

    @NameInMap("DepartmentId")
    public String departmentId;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("ServiceId")
    public Long serviceId;

    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UniqueId")
    public Long uniqueId;

    public static EditEntityRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        EditEntityRouteRequest self = new EditEntityRouteRequest();
        return TeaModel.build(map, self);
    }

    public EditEntityRouteRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public EditEntityRouteRequest setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

    public EditEntityRouteRequest setEntityBizCode(String entityBizCode) {
        this.entityBizCode = entityBizCode;
        return this;
    }
    public String getEntityBizCode() {
        return this.entityBizCode;
    }

    public EditEntityRouteRequest setEntityBizCodeType(String entityBizCodeType) {
        this.entityBizCodeType = entityBizCodeType;
        return this;
    }
    public String getEntityBizCodeType() {
        return this.entityBizCodeType;
    }

    public EditEntityRouteRequest setEntityRelationNumber(String entityRelationNumber) {
        this.entityRelationNumber = entityRelationNumber;
        return this;
    }
    public String getEntityRelationNumber() {
        return this.entityRelationNumber;
    }

    public EditEntityRouteRequest setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public String getDepartmentId() {
        return this.departmentId;
    }

    public EditEntityRouteRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public EditEntityRouteRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public EditEntityRouteRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public EditEntityRouteRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EditEntityRouteRequest setUniqueId(Long uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public Long getUniqueId() {
        return this.uniqueId;
    }

}
