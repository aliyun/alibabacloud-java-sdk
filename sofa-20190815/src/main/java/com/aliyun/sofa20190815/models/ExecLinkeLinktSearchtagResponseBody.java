// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinktSearchtagResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Data")
    public java.util.List<ExecLinkeLinktSearchtagResponseBodyData> data;

    @NameInMap("ErrorCode")
    public Long errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    public static ExecLinkeLinktSearchtagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinktSearchtagResponseBody self = new ExecLinkeLinktSearchtagResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinktSearchtagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecLinkeLinktSearchtagResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ExecLinkeLinktSearchtagResponseBody setData(java.util.List<ExecLinkeLinktSearchtagResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ExecLinkeLinktSearchtagResponseBodyData> getData() {
        return this.data;
    }

    public ExecLinkeLinktSearchtagResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public ExecLinkeLinktSearchtagResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ExecLinkeLinktSearchtagResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExecLinkeLinktSearchtagResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ExecLinkeLinktSearchtagResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class ExecLinkeLinktSearchtagResponseBodyData extends TeaModel {
        @NameInMap("Color")
        public String color;

        @NameInMap("Region")
        public String region;

        @NameInMap("ProjectSign")
        public String projectSign;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("Content")
        public String content;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Creator")
        public String creator;

        public static ExecLinkeLinktSearchtagResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeLinktSearchtagResponseBodyData self = new ExecLinkeLinktSearchtagResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecLinkeLinktSearchtagResponseBodyData setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public ExecLinkeLinktSearchtagResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ExecLinkeLinktSearchtagResponseBodyData setProjectSign(String projectSign) {
            this.projectSign = projectSign;
            return this;
        }
        public String getProjectSign() {
            return this.projectSign;
        }

        public ExecLinkeLinktSearchtagResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public ExecLinkeLinktSearchtagResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ExecLinkeLinktSearchtagResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public ExecLinkeLinktSearchtagResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ExecLinkeLinktSearchtagResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ExecLinkeLinktSearchtagResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

    }

}
