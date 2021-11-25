// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class CreateEntityIvrRouteRequest extends TeaModel {
    @NameInMap("DepartmentId")
    public String departmentId;

    @NameInMap("EntityBizCode")
    public String entityBizCode;

    @NameInMap("EntityBizCodeType")
    public String entityBizCodeType;

    @NameInMap("EntityId")
    public String entityId;

    @NameInMap("EntityName")
    public String entityName;

    @NameInMap("EntityRelationNumber")
    public String entityRelationNumber;

    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ServiceId")
    public Long serviceId;

    public static CreateEntityIvrRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEntityIvrRouteRequest self = new CreateEntityIvrRouteRequest();
        return TeaModel.build(map, self);
    }

    public CreateEntityIvrRouteRequest setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public String getDepartmentId() {
        return this.departmentId;
    }

    public CreateEntityIvrRouteRequest setEntityBizCode(String entityBizCode) {
        this.entityBizCode = entityBizCode;
        return this;
    }
    public String getEntityBizCode() {
        return this.entityBizCode;
    }

    public CreateEntityIvrRouteRequest setEntityBizCodeType(String entityBizCodeType) {
        this.entityBizCodeType = entityBizCodeType;
        return this;
    }
    public String getEntityBizCodeType() {
        return this.entityBizCodeType;
    }

    public CreateEntityIvrRouteRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public CreateEntityIvrRouteRequest setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

    public CreateEntityIvrRouteRequest setEntityRelationNumber(String entityRelationNumber) {
        this.entityRelationNumber = entityRelationNumber;
        return this;
    }
    public String getEntityRelationNumber() {
        return this.entityRelationNumber;
    }

    public CreateEntityIvrRouteRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public CreateEntityIvrRouteRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public CreateEntityIvrRouteRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateEntityIvrRouteRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

}
