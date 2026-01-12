// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class QueryLocationServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryLocationServiceResponseBodyData data;

    @NameInMap("ErrorName")
    public String errorName;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryLocationServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLocationServiceResponseBody self = new QueryLocationServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLocationServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryLocationServiceResponseBody setData(QueryLocationServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLocationServiceResponseBodyData getData() {
        return this.data;
    }

    public QueryLocationServiceResponseBody setErrorName(String errorName) {
        this.errorName = errorName;
        return this;
    }
    public String getErrorName() {
        return this.errorName;
    }

    public QueryLocationServiceResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public QueryLocationServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLocationServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLocationServiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryLocationServiceResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ImageId")
        public Long imageId;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("Name")
        public String name;

        @NameInMap("Note")
        public String note;

        @NameInMap("Qps")
        public Long qps;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("SvcDeployStatus")
        public String svcDeployStatus;

        @NameInMap("SvcState")
        public String svcState;

        @NameInMap("TreeConfig")
        public String treeConfig;

        @NameInMap("UuidLogMap")
        public String uuidLogMap;

        public static QueryLocationServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLocationServiceResponseBodyData self = new QueryLocationServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLocationServiceResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryLocationServiceResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public QueryLocationServiceResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryLocationServiceResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryLocationServiceResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLocationServiceResponseBodyData setImageId(Long imageId) {
            this.imageId = imageId;
            return this;
        }
        public Long getImageId() {
            return this.imageId;
        }

        public QueryLocationServiceResponseBodyData setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public QueryLocationServiceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLocationServiceResponseBodyData setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public QueryLocationServiceResponseBodyData setQps(Long qps) {
            this.qps = qps;
            return this;
        }
        public Long getQps() {
            return this.qps;
        }

        public QueryLocationServiceResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryLocationServiceResponseBodyData setSvcDeployStatus(String svcDeployStatus) {
            this.svcDeployStatus = svcDeployStatus;
            return this;
        }
        public String getSvcDeployStatus() {
            return this.svcDeployStatus;
        }

        public QueryLocationServiceResponseBodyData setSvcState(String svcState) {
            this.svcState = svcState;
            return this;
        }
        public String getSvcState() {
            return this.svcState;
        }

        public QueryLocationServiceResponseBodyData setTreeConfig(String treeConfig) {
            this.treeConfig = treeConfig;
            return this;
        }
        public String getTreeConfig() {
            return this.treeConfig;
        }

        public QueryLocationServiceResponseBodyData setUuidLogMap(String uuidLogMap) {
            this.uuidLogMap = uuidLogMap;
            return this;
        }
        public String getUuidLogMap() {
            return this.uuidLogMap;
        }

    }

}
