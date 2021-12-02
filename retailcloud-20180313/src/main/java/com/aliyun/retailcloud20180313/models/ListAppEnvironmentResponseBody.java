// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListAppEnvironmentResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListAppEnvironmentResponseBodyData> data;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAppEnvironmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppEnvironmentResponseBody self = new ListAppEnvironmentResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppEnvironmentResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListAppEnvironmentResponseBody setData(java.util.List<ListAppEnvironmentResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAppEnvironmentResponseBodyData> getData() {
        return this.data;
    }

    public ListAppEnvironmentResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListAppEnvironmentResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppEnvironmentResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppEnvironmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppEnvironmentResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAppEnvironmentResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public Long appId;

        @NameInMap("AppSchemaId")
        public Long appSchemaId;

        @NameInMap("EnvId")
        public Long envId;

        @NameInMap("EnvName")
        public String envName;

        @NameInMap("EnvType")
        public Integer envType;

        @NameInMap("EnvTypeName")
        public String envTypeName;

        @NameInMap("Region")
        public String region;

        public static ListAppEnvironmentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAppEnvironmentResponseBodyData self = new ListAppEnvironmentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAppEnvironmentResponseBodyData setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public ListAppEnvironmentResponseBodyData setAppSchemaId(Long appSchemaId) {
            this.appSchemaId = appSchemaId;
            return this;
        }
        public Long getAppSchemaId() {
            return this.appSchemaId;
        }

        public ListAppEnvironmentResponseBodyData setEnvId(Long envId) {
            this.envId = envId;
            return this;
        }
        public Long getEnvId() {
            return this.envId;
        }

        public ListAppEnvironmentResponseBodyData setEnvName(String envName) {
            this.envName = envName;
            return this;
        }
        public String getEnvName() {
            return this.envName;
        }

        public ListAppEnvironmentResponseBodyData setEnvType(Integer envType) {
            this.envType = envType;
            return this;
        }
        public Integer getEnvType() {
            return this.envType;
        }

        public ListAppEnvironmentResponseBodyData setEnvTypeName(String envTypeName) {
            this.envTypeName = envTypeName;
            return this;
        }
        public String getEnvTypeName() {
            return this.envTypeName;
        }

        public ListAppEnvironmentResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
