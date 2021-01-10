// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktProjectongoingiterationsResponseBody extends TeaModel {
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
    public QueryLinkeLinktProjectongoingiterationsResponseBodyData data;

    public static QueryLinkeLinktProjectongoingiterationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktProjectongoingiterationsResponseBody self = new QueryLinkeLinktProjectongoingiterationsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktProjectongoingiterationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeLinktProjectongoingiterationsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeLinktProjectongoingiterationsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeLinktProjectongoingiterationsResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public QueryLinkeLinktProjectongoingiterationsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeLinktProjectongoingiterationsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeLinktProjectongoingiterationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeLinktProjectongoingiterationsResponseBody setData(QueryLinkeLinktProjectongoingiterationsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLinkeLinktProjectongoingiterationsResponseBodyData getData() {
        return this.data;
    }

    public static class QueryLinkeLinktProjectongoingiterationsResponseBodyData extends TeaModel {
        @NameInMap("BeginDate")
        public Long beginDate;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("EndDate")
        public Long endDate;

        @NameInMap("FinishWorkItem")
        public Long finishWorkItem;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Locked")
        public Boolean locked;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("Name")
        public String name;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("ProjectSign")
        public String projectSign;

        @NameInMap("Sign")
        public String sign;

        @NameInMap("TotalWorkItem")
        public Long totalWorkItem;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        public static QueryLinkeLinktProjectongoingiterationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeLinktProjectongoingiterationsResponseBodyData self = new QueryLinkeLinktProjectongoingiterationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkeLinktProjectongoingiterationsResponseBodyData setBeginDate(Long beginDate) {
            this.beginDate = beginDate;
            return this;
        }
        public Long getBeginDate() {
            return this.beginDate;
        }

        public QueryLinkeLinktProjectongoingiterationsResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeLinktProjectongoingiterationsResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryLinkeLinktProjectongoingiterationsResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public QueryLinkeLinktProjectongoingiterationsResponseBodyData setEndDate(Long endDate) {
            this.endDate = endDate;
            return this;
        }
        public Long getEndDate() {
            return this.endDate;
        }

        public QueryLinkeLinktProjectongoingiterationsResponseBodyData setFinishWorkItem(Long finishWorkItem) {
            this.finishWorkItem = finishWorkItem;
            return this;
        }
        public Long getFinishWorkItem() {
            return this.finishWorkItem;
        }

        public QueryLinkeLinktProjectongoingiterationsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkeLinktProjectongoingiterationsResponseBodyData setLocked(Boolean locked) {
            this.locked = locked;
            return this;
        }
        public Boolean getLocked() {
            return this.locked;
        }

        public QueryLinkeLinktProjectongoingiterationsResponseBodyData setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public QueryLinkeLinktProjectongoingiterationsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeLinktProjectongoingiterationsResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public QueryLinkeLinktProjectongoingiterationsResponseBodyData setProjectSign(String projectSign) {
            this.projectSign = projectSign;
            return this;
        }
        public String getProjectSign() {
            return this.projectSign;
        }

        public QueryLinkeLinktProjectongoingiterationsResponseBodyData setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public QueryLinkeLinktProjectongoingiterationsResponseBodyData setTotalWorkItem(Long totalWorkItem) {
            this.totalWorkItem = totalWorkItem;
            return this;
        }
        public Long getTotalWorkItem() {
            return this.totalWorkItem;
        }

        public QueryLinkeLinktProjectongoingiterationsResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
