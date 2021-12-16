// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetEntityRouteResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetEntityRouteResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetEntityRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEntityRouteResponseBody self = new GetEntityRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEntityRouteResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEntityRouteResponseBody setData(GetEntityRouteResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEntityRouteResponseBodyData getData() {
        return this.data;
    }

    public GetEntityRouteResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEntityRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEntityRouteResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetEntityRouteResponseBodyData extends TeaModel {
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

        @NameInMap("ServiceId")
        public Long serviceId;

        @NameInMap("UniqueId")
        public Long uniqueId;

        public static GetEntityRouteResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEntityRouteResponseBodyData self = new GetEntityRouteResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEntityRouteResponseBodyData setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public String getDepartmentId() {
            return this.departmentId;
        }

        public GetEntityRouteResponseBodyData setEntityBizCode(String entityBizCode) {
            this.entityBizCode = entityBizCode;
            return this;
        }
        public String getEntityBizCode() {
            return this.entityBizCode;
        }

        public GetEntityRouteResponseBodyData setEntityBizCodeType(String entityBizCodeType) {
            this.entityBizCodeType = entityBizCodeType;
            return this;
        }
        public String getEntityBizCodeType() {
            return this.entityBizCodeType;
        }

        public GetEntityRouteResponseBodyData setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public GetEntityRouteResponseBodyData setEntityName(String entityName) {
            this.entityName = entityName;
            return this;
        }
        public String getEntityName() {
            return this.entityName;
        }

        public GetEntityRouteResponseBodyData setEntityRelationNumber(String entityRelationNumber) {
            this.entityRelationNumber = entityRelationNumber;
            return this;
        }
        public String getEntityRelationNumber() {
            return this.entityRelationNumber;
        }

        public GetEntityRouteResponseBodyData setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public GetEntityRouteResponseBodyData setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public GetEntityRouteResponseBodyData setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public GetEntityRouteResponseBodyData setUniqueId(Long uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public Long getUniqueId() {
            return this.uniqueId;
        }

    }

}
