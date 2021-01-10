// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryLinkeLinktSimpleprojectsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Data")
    public java.util.List<BatchqueryLinkeLinktSimpleprojectsResponseBodyData> data;

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

    public static BatchqueryLinkeLinktSimpleprojectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryLinkeLinktSimpleprojectsResponseBody self = new BatchqueryLinkeLinktSimpleprojectsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchqueryLinkeLinktSimpleprojectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchqueryLinkeLinktSimpleprojectsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public BatchqueryLinkeLinktSimpleprojectsResponseBody setData(java.util.List<BatchqueryLinkeLinktSimpleprojectsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<BatchqueryLinkeLinktSimpleprojectsResponseBodyData> getData() {
        return this.data;
    }

    public BatchqueryLinkeLinktSimpleprojectsResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public BatchqueryLinkeLinktSimpleprojectsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchqueryLinkeLinktSimpleprojectsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public BatchqueryLinkeLinktSimpleprojectsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchqueryLinkeLinktSimpleprojectsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class BatchqueryLinkeLinktSimpleprojectsResponseBodyData extends TeaModel {
        @NameInMap("Link")
        public String link;

        @NameInMap("Archive")
        public Boolean archive;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Url")
        public String url;

        @NameInMap("AsPublic")
        public Boolean asPublic;

        @NameInMap("ParentSign")
        public String parentSign;

        @NameInMap("SignPath")
        public String signPath;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Description")
        public String description;

        @NameInMap("Sign")
        public String sign;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        public static BatchqueryLinkeLinktSimpleprojectsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchqueryLinkeLinktSimpleprojectsResponseBodyData self = new BatchqueryLinkeLinktSimpleprojectsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchqueryLinkeLinktSimpleprojectsResponseBodyData setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public BatchqueryLinkeLinktSimpleprojectsResponseBodyData setArchive(Boolean archive) {
            this.archive = archive;
            return this;
        }
        public Boolean getArchive() {
            return this.archive;
        }

        public BatchqueryLinkeLinktSimpleprojectsResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public BatchqueryLinkeLinktSimpleprojectsResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public BatchqueryLinkeLinktSimpleprojectsResponseBodyData setAsPublic(Boolean asPublic) {
            this.asPublic = asPublic;
            return this;
        }
        public Boolean getAsPublic() {
            return this.asPublic;
        }

        public BatchqueryLinkeLinktSimpleprojectsResponseBodyData setParentSign(String parentSign) {
            this.parentSign = parentSign;
            return this;
        }
        public String getParentSign() {
            return this.parentSign;
        }

        public BatchqueryLinkeLinktSimpleprojectsResponseBodyData setSignPath(String signPath) {
            this.signPath = signPath;
            return this;
        }
        public String getSignPath() {
            return this.signPath;
        }

        public BatchqueryLinkeLinktSimpleprojectsResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public BatchqueryLinkeLinktSimpleprojectsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public BatchqueryLinkeLinktSimpleprojectsResponseBodyData setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public BatchqueryLinkeLinktSimpleprojectsResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public BatchqueryLinkeLinktSimpleprojectsResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public BatchqueryLinkeLinktSimpleprojectsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public BatchqueryLinkeLinktSimpleprojectsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
