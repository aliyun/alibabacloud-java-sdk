// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktNextreachablestatusesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorCode")
    public Long errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public java.util.List<QueryLinkeLinktNextreachablestatusesResponseBodyData> data;

    public static QueryLinkeLinktNextreachablestatusesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktNextreachablestatusesResponseBody self = new QueryLinkeLinktNextreachablestatusesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktNextreachablestatusesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeLinktNextreachablestatusesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeLinktNextreachablestatusesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeLinktNextreachablestatusesResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public QueryLinkeLinktNextreachablestatusesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeLinktNextreachablestatusesResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeLinktNextreachablestatusesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeLinktNextreachablestatusesResponseBody setData(java.util.List<QueryLinkeLinktNextreachablestatusesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryLinkeLinktNextreachablestatusesResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryLinkeLinktNextreachablestatusesResponseBodyData extends TeaModel {
        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProjectSign")
        public String projectSign;

        @NameInMap("Region")
        public String region;

        @NameInMap("Stage")
        public Long stage;

        @NameInMap("StageName")
        public String stageName;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        public static QueryLinkeLinktNextreachablestatusesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeLinktNextreachablestatusesResponseBodyData self = new QueryLinkeLinktNextreachablestatusesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkeLinktNextreachablestatusesResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeLinktNextreachablestatusesResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public QueryLinkeLinktNextreachablestatusesResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkeLinktNextreachablestatusesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeLinktNextreachablestatusesResponseBodyData setProjectSign(String projectSign) {
            this.projectSign = projectSign;
            return this;
        }
        public String getProjectSign() {
            return this.projectSign;
        }

        public QueryLinkeLinktNextreachablestatusesResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryLinkeLinktNextreachablestatusesResponseBodyData setStage(Long stage) {
            this.stage = stage;
            return this;
        }
        public Long getStage() {
            return this.stage;
        }

        public QueryLinkeLinktNextreachablestatusesResponseBodyData setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public QueryLinkeLinktNextreachablestatusesResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
