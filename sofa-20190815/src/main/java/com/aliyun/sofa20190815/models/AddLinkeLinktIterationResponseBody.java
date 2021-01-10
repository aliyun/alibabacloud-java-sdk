// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeLinktIterationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Data")
    public AddLinkeLinktIterationResponseBodyData data;

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

    public static AddLinkeLinktIterationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeLinktIterationResponseBody self = new AddLinkeLinktIterationResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLinkeLinktIterationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddLinkeLinktIterationResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public AddLinkeLinktIterationResponseBody setData(AddLinkeLinktIterationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddLinkeLinktIterationResponseBodyData getData() {
        return this.data;
    }

    public AddLinkeLinktIterationResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public AddLinkeLinktIterationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddLinkeLinktIterationResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AddLinkeLinktIterationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddLinkeLinktIterationResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class AddLinkeLinktIterationResponseBodyData extends TeaModel {
        @NameInMap("Owner")
        public String owner;

        @NameInMap("EndDate")
        public Long endDate;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("BeginDate")
        public Long beginDate;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("FinishWorkItem")
        public Long finishWorkItem;

        @NameInMap("Sign")
        public String sign;

        @NameInMap("TotalWorkItem")
        public Long totalWorkItem;

        @NameInMap("ProjectSign")
        public String projectSign;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Locked")
        public Boolean locked;

        public static AddLinkeLinktIterationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddLinkeLinktIterationResponseBodyData self = new AddLinkeLinktIterationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddLinkeLinktIterationResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public AddLinkeLinktIterationResponseBodyData setEndDate(Long endDate) {
            this.endDate = endDate;
            return this;
        }
        public Long getEndDate() {
            return this.endDate;
        }

        public AddLinkeLinktIterationResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public AddLinkeLinktIterationResponseBodyData setBeginDate(Long beginDate) {
            this.beginDate = beginDate;
            return this;
        }
        public Long getBeginDate() {
            return this.beginDate;
        }

        public AddLinkeLinktIterationResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public AddLinkeLinktIterationResponseBodyData setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public AddLinkeLinktIterationResponseBodyData setFinishWorkItem(Long finishWorkItem) {
            this.finishWorkItem = finishWorkItem;
            return this;
        }
        public Long getFinishWorkItem() {
            return this.finishWorkItem;
        }

        public AddLinkeLinktIterationResponseBodyData setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public AddLinkeLinktIterationResponseBodyData setTotalWorkItem(Long totalWorkItem) {
            this.totalWorkItem = totalWorkItem;
            return this;
        }
        public Long getTotalWorkItem() {
            return this.totalWorkItem;
        }

        public AddLinkeLinktIterationResponseBodyData setProjectSign(String projectSign) {
            this.projectSign = projectSign;
            return this;
        }
        public String getProjectSign() {
            return this.projectSign;
        }

        public AddLinkeLinktIterationResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public AddLinkeLinktIterationResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public AddLinkeLinktIterationResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddLinkeLinktIterationResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public AddLinkeLinktIterationResponseBodyData setLocked(Boolean locked) {
            this.locked = locked;
            return this;
        }
        public Boolean getLocked() {
            return this.locked;
        }

    }

}
