// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class GetEntityRouteListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetEntityRouteListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetEntityRouteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEntityRouteListResponseBody self = new GetEntityRouteListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEntityRouteListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEntityRouteListResponseBody setData(GetEntityRouteListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEntityRouteListResponseBodyData getData() {
        return this.data;
    }

    public GetEntityRouteListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEntityRouteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEntityRouteListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetEntityRouteListResponseBodyDataEntityRouteList extends TeaModel {
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
        public String groupId;

        @NameInMap("ServiceId")
        public String serviceId;

        @NameInMap("UniqueId")
        public Long uniqueId;

        public static GetEntityRouteListResponseBodyDataEntityRouteList build(java.util.Map<String, ?> map) throws Exception {
            GetEntityRouteListResponseBodyDataEntityRouteList self = new GetEntityRouteListResponseBodyDataEntityRouteList();
            return TeaModel.build(map, self);
        }

        public GetEntityRouteListResponseBodyDataEntityRouteList setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public String getDepartmentId() {
            return this.departmentId;
        }

        public GetEntityRouteListResponseBodyDataEntityRouteList setEntityBizCode(String entityBizCode) {
            this.entityBizCode = entityBizCode;
            return this;
        }
        public String getEntityBizCode() {
            return this.entityBizCode;
        }

        public GetEntityRouteListResponseBodyDataEntityRouteList setEntityBizCodeType(String entityBizCodeType) {
            this.entityBizCodeType = entityBizCodeType;
            return this;
        }
        public String getEntityBizCodeType() {
            return this.entityBizCodeType;
        }

        public GetEntityRouteListResponseBodyDataEntityRouteList setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public GetEntityRouteListResponseBodyDataEntityRouteList setEntityName(String entityName) {
            this.entityName = entityName;
            return this;
        }
        public String getEntityName() {
            return this.entityName;
        }

        public GetEntityRouteListResponseBodyDataEntityRouteList setEntityRelationNumber(String entityRelationNumber) {
            this.entityRelationNumber = entityRelationNumber;
            return this;
        }
        public String getEntityRelationNumber() {
            return this.entityRelationNumber;
        }

        public GetEntityRouteListResponseBodyDataEntityRouteList setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public GetEntityRouteListResponseBodyDataEntityRouteList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetEntityRouteListResponseBodyDataEntityRouteList setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public GetEntityRouteListResponseBodyDataEntityRouteList setUniqueId(Long uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public Long getUniqueId() {
            return this.uniqueId;
        }

    }

    public static class GetEntityRouteListResponseBodyData extends TeaModel {
        @NameInMap("EntityRouteList")
        public java.util.List<GetEntityRouteListResponseBodyDataEntityRouteList> entityRouteList;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Long total;

        public static GetEntityRouteListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEntityRouteListResponseBodyData self = new GetEntityRouteListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEntityRouteListResponseBodyData setEntityRouteList(java.util.List<GetEntityRouteListResponseBodyDataEntityRouteList> entityRouteList) {
            this.entityRouteList = entityRouteList;
            return this;
        }
        public java.util.List<GetEntityRouteListResponseBodyDataEntityRouteList> getEntityRouteList() {
            return this.entityRouteList;
        }

        public GetEntityRouteListResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public GetEntityRouteListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetEntityRouteListResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
