// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinktProjectmodulesResponseBody extends TeaModel {
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
    public java.util.List<ListLinkeLinktProjectmodulesResponseBodyData> data;

    public static ListLinkeLinktProjectmodulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinktProjectmodulesResponseBody self = new ListLinkeLinktProjectmodulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinktProjectmodulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLinkeLinktProjectmodulesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLinkeLinktProjectmodulesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLinkeLinktProjectmodulesResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public ListLinkeLinktProjectmodulesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListLinkeLinktProjectmodulesResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ListLinkeLinktProjectmodulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListLinkeLinktProjectmodulesResponseBody setData(java.util.List<ListLinkeLinktProjectmodulesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListLinkeLinktProjectmodulesResponseBodyData> getData() {
        return this.data;
    }

    public static class ListLinkeLinktProjectmodulesResponseBodyData extends TeaModel {
        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("Name")
        public String name;

        @NameInMap("Owners")
        public String owners;

        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("ProjectSign")
        public String projectSign;

        @NameInMap("Region")
        public String region;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        public static ListLinkeLinktProjectmodulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeLinktProjectmodulesResponseBodyData self = new ListLinkeLinktProjectmodulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLinkeLinktProjectmodulesResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public ListLinkeLinktProjectmodulesResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListLinkeLinktProjectmodulesResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ListLinkeLinktProjectmodulesResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListLinkeLinktProjectmodulesResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListLinkeLinktProjectmodulesResponseBodyData setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListLinkeLinktProjectmodulesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLinkeLinktProjectmodulesResponseBodyData setOwners(String owners) {
            this.owners = owners;
            return this;
        }
        public String getOwners() {
            return this.owners;
        }

        public ListLinkeLinktProjectmodulesResponseBodyData setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public ListLinkeLinktProjectmodulesResponseBodyData setProjectSign(String projectSign) {
            this.projectSign = projectSign;
            return this;
        }
        public String getProjectSign() {
            return this.projectSign;
        }

        public ListLinkeLinktProjectmodulesResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListLinkeLinktProjectmodulesResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
