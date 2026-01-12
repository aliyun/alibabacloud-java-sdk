// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class ListWorkflowResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListWorkflowResponseBodyData data;

    @NameInMap("HttpCode")
    public Long httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowResponseBody self = new ListWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkflowResponseBody setData(ListWorkflowResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListWorkflowResponseBodyData getData() {
        return this.data;
    }

    public ListWorkflowResponseBody setHttpCode(Long httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Long getHttpCode() {
        return this.httpCode;
    }

    public ListWorkflowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkflowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListWorkflowResponseBodyDataHumanPose extends TeaModel {
        @NameInMap("BizUsage")
        public String bizUsage;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("ObjectType")
        public String objectType;

        @NameInMap("Status")
        public Long status;

        public static ListWorkflowResponseBodyDataHumanPose build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowResponseBodyDataHumanPose self = new ListWorkflowResponseBodyDataHumanPose();
            return TeaModel.build(map, self);
        }

        public ListWorkflowResponseBodyDataHumanPose setBizUsage(String bizUsage) {
            this.bizUsage = bizUsage;
            return this;
        }
        public String getBizUsage() {
            return this.bizUsage;
        }

        public ListWorkflowResponseBodyDataHumanPose setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListWorkflowResponseBodyDataHumanPose setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWorkflowResponseBodyDataHumanPose setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public ListWorkflowResponseBodyDataHumanPose setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

    public static class ListWorkflowResponseBodyDataMannequins extends TeaModel {
        @NameInMap("BizUsage")
        public String bizUsage;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("ObjectType")
        public String objectType;

        @NameInMap("Status")
        public Long status;

        public static ListWorkflowResponseBodyDataMannequins build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowResponseBodyDataMannequins self = new ListWorkflowResponseBodyDataMannequins();
            return TeaModel.build(map, self);
        }

        public ListWorkflowResponseBodyDataMannequins setBizUsage(String bizUsage) {
            this.bizUsage = bizUsage;
            return this;
        }
        public String getBizUsage() {
            return this.bizUsage;
        }

        public ListWorkflowResponseBodyDataMannequins setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListWorkflowResponseBodyDataMannequins setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWorkflowResponseBodyDataMannequins setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public ListWorkflowResponseBodyDataMannequins setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

    public static class ListWorkflowResponseBodyDataObject extends TeaModel {
        @NameInMap("BizUsage")
        public String bizUsage;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("ObjectType")
        public String objectType;

        @NameInMap("Status")
        public Long status;

        public static ListWorkflowResponseBodyDataObject build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowResponseBodyDataObject self = new ListWorkflowResponseBodyDataObject();
            return TeaModel.build(map, self);
        }

        public ListWorkflowResponseBodyDataObject setBizUsage(String bizUsage) {
            this.bizUsage = bizUsage;
            return this;
        }
        public String getBizUsage() {
            return this.bizUsage;
        }

        public ListWorkflowResponseBodyDataObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListWorkflowResponseBodyDataObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWorkflowResponseBodyDataObject setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public ListWorkflowResponseBodyDataObject setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

    public static class ListWorkflowResponseBodyDataObjectGeneration extends TeaModel {
        @NameInMap("BizUsage")
        public String bizUsage;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("ObjectType")
        public String objectType;

        @NameInMap("Status")
        public Long status;

        public static ListWorkflowResponseBodyDataObjectGeneration build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowResponseBodyDataObjectGeneration self = new ListWorkflowResponseBodyDataObjectGeneration();
            return TeaModel.build(map, self);
        }

        public ListWorkflowResponseBodyDataObjectGeneration setBizUsage(String bizUsage) {
            this.bizUsage = bizUsage;
            return this;
        }
        public String getBizUsage() {
            return this.bizUsage;
        }

        public ListWorkflowResponseBodyDataObjectGeneration setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListWorkflowResponseBodyDataObjectGeneration setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWorkflowResponseBodyDataObjectGeneration setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public ListWorkflowResponseBodyDataObjectGeneration setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

    public static class ListWorkflowResponseBodyDataScene extends TeaModel {
        @NameInMap("BizUsage")
        public String bizUsage;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("ObjectType")
        public String objectType;

        @NameInMap("Status")
        public Long status;

        public static ListWorkflowResponseBodyDataScene build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowResponseBodyDataScene self = new ListWorkflowResponseBodyDataScene();
            return TeaModel.build(map, self);
        }

        public ListWorkflowResponseBodyDataScene setBizUsage(String bizUsage) {
            this.bizUsage = bizUsage;
            return this;
        }
        public String getBizUsage() {
            return this.bizUsage;
        }

        public ListWorkflowResponseBodyDataScene setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListWorkflowResponseBodyDataScene setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWorkflowResponseBodyDataScene setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public ListWorkflowResponseBodyDataScene setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

    public static class ListWorkflowResponseBodyData extends TeaModel {
        @NameInMap("HumanPose")
        public java.util.List<ListWorkflowResponseBodyDataHumanPose> humanPose;

        @NameInMap("Mannequins")
        public java.util.List<ListWorkflowResponseBodyDataMannequins> mannequins;

        @NameInMap("Object")
        public java.util.List<ListWorkflowResponseBodyDataObject> object;

        @NameInMap("ObjectGeneration")
        public java.util.List<ListWorkflowResponseBodyDataObjectGeneration> objectGeneration;

        @NameInMap("Scene")
        public java.util.List<ListWorkflowResponseBodyDataScene> scene;

        public static ListWorkflowResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowResponseBodyData self = new ListWorkflowResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListWorkflowResponseBodyData setHumanPose(java.util.List<ListWorkflowResponseBodyDataHumanPose> humanPose) {
            this.humanPose = humanPose;
            return this;
        }
        public java.util.List<ListWorkflowResponseBodyDataHumanPose> getHumanPose() {
            return this.humanPose;
        }

        public ListWorkflowResponseBodyData setMannequins(java.util.List<ListWorkflowResponseBodyDataMannequins> mannequins) {
            this.mannequins = mannequins;
            return this;
        }
        public java.util.List<ListWorkflowResponseBodyDataMannequins> getMannequins() {
            return this.mannequins;
        }

        public ListWorkflowResponseBodyData setObject(java.util.List<ListWorkflowResponseBodyDataObject> object) {
            this.object = object;
            return this;
        }
        public java.util.List<ListWorkflowResponseBodyDataObject> getObject() {
            return this.object;
        }

        public ListWorkflowResponseBodyData setObjectGeneration(java.util.List<ListWorkflowResponseBodyDataObjectGeneration> objectGeneration) {
            this.objectGeneration = objectGeneration;
            return this;
        }
        public java.util.List<ListWorkflowResponseBodyDataObjectGeneration> getObjectGeneration() {
            return this.objectGeneration;
        }

        public ListWorkflowResponseBodyData setScene(java.util.List<ListWorkflowResponseBodyDataScene> scene) {
            this.scene = scene;
            return this;
        }
        public java.util.List<ListWorkflowResponseBodyDataScene> getScene() {
            return this.scene;
        }

    }

}
