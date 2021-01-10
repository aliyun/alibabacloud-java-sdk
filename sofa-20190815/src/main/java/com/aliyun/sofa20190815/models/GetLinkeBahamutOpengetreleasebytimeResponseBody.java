// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutOpengetreleasebytimeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<GetLinkeBahamutOpengetreleasebytimeResponseBodyResult> result;

    public static GetLinkeBahamutOpengetreleasebytimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutOpengetreleasebytimeResponseBody self = new GetLinkeBahamutOpengetreleasebytimeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutOpengetreleasebytimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutOpengetreleasebytimeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutOpengetreleasebytimeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutOpengetreleasebytimeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutOpengetreleasebytimeResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutOpengetreleasebytimeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutOpengetreleasebytimeResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutOpengetreleasebytimeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutOpengetreleasebytimeResponseBody setResult(java.util.List<GetLinkeBahamutOpengetreleasebytimeResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutOpengetreleasebytimeResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutOpengetreleasebytimeResponseBodyResult extends TeaModel {
        @NameInMap("Attachable")
        public Boolean attachable;

        @NameInMap("BetaRelease")
        public Boolean betaRelease;

        @NameInMap("Created")
        public Long created;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("ReleaseDate")
        public Long releaseDate;

        @NameInMap("Status")
        public String status;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Ticket")
        public String ticket;

        @NameInMap("Type")
        public String type;

        @NameInMap("Managers")
        public java.util.List<String> managers;

        public static GetLinkeBahamutOpengetreleasebytimeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutOpengetreleasebytimeResponseBodyResult self = new GetLinkeBahamutOpengetreleasebytimeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutOpengetreleasebytimeResponseBodyResult setAttachable(Boolean attachable) {
            this.attachable = attachable;
            return this;
        }
        public Boolean getAttachable() {
            return this.attachable;
        }

        public GetLinkeBahamutOpengetreleasebytimeResponseBodyResult setBetaRelease(Boolean betaRelease) {
            this.betaRelease = betaRelease;
            return this;
        }
        public Boolean getBetaRelease() {
            return this.betaRelease;
        }

        public GetLinkeBahamutOpengetreleasebytimeResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public GetLinkeBahamutOpengetreleasebytimeResponseBodyResult setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public GetLinkeBahamutOpengetreleasebytimeResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public GetLinkeBahamutOpengetreleasebytimeResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeBahamutOpengetreleasebytimeResponseBodyResult setReleaseDate(Long releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }
        public Long getReleaseDate() {
            return this.releaseDate;
        }

        public GetLinkeBahamutOpengetreleasebytimeResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLinkeBahamutOpengetreleasebytimeResponseBodyResult setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetLinkeBahamutOpengetreleasebytimeResponseBodyResult setTicket(String ticket) {
            this.ticket = ticket;
            return this;
        }
        public String getTicket() {
            return this.ticket;
        }

        public GetLinkeBahamutOpengetreleasebytimeResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetLinkeBahamutOpengetreleasebytimeResponseBodyResult setManagers(java.util.List<String> managers) {
            this.managers = managers;
            return this;
        }
        public java.util.List<String> getManagers() {
            return this.managers;
        }

    }

}
