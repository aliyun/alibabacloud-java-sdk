// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAoneinternaldailyreleasesResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeBahamutAoneinternaldailyreleasesResponseBodyResult> result;

    public static GetLinkeBahamutAoneinternaldailyreleasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAoneinternaldailyreleasesResponseBody self = new GetLinkeBahamutAoneinternaldailyreleasesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAoneinternaldailyreleasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutAoneinternaldailyreleasesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutAoneinternaldailyreleasesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutAoneinternaldailyreleasesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutAoneinternaldailyreleasesResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutAoneinternaldailyreleasesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutAoneinternaldailyreleasesResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutAoneinternaldailyreleasesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutAoneinternaldailyreleasesResponseBody setResult(java.util.List<GetLinkeBahamutAoneinternaldailyreleasesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutAoneinternaldailyreleasesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutAoneinternaldailyreleasesResponseBodyResult extends TeaModel {
        @NameInMap("CreatedDate")
        public String createdDate;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("PortalUrl")
        public String portalUrl;

        @NameInMap("RecordUniqueId")
        public String recordUniqueId;

        @NameInMap("RecordUniqueType")
        public String recordUniqueType;

        @NameInMap("StatusName")
        public String statusName;

        @NameInMap("Summary")
        public String summary;

        public static GetLinkeBahamutAoneinternaldailyreleasesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutAoneinternaldailyreleasesResponseBodyResult self = new GetLinkeBahamutAoneinternaldailyreleasesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutAoneinternaldailyreleasesResponseBodyResult setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public GetLinkeBahamutAoneinternaldailyreleasesResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetLinkeBahamutAoneinternaldailyreleasesResponseBodyResult setPortalUrl(String portalUrl) {
            this.portalUrl = portalUrl;
            return this;
        }
        public String getPortalUrl() {
            return this.portalUrl;
        }

        public GetLinkeBahamutAoneinternaldailyreleasesResponseBodyResult setRecordUniqueId(String recordUniqueId) {
            this.recordUniqueId = recordUniqueId;
            return this;
        }
        public String getRecordUniqueId() {
            return this.recordUniqueId;
        }

        public GetLinkeBahamutAoneinternaldailyreleasesResponseBodyResult setRecordUniqueType(String recordUniqueType) {
            this.recordUniqueType = recordUniqueType;
            return this;
        }
        public String getRecordUniqueType() {
            return this.recordUniqueType;
        }

        public GetLinkeBahamutAoneinternaldailyreleasesResponseBodyResult setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

        public GetLinkeBahamutAoneinternaldailyreleasesResponseBodyResult setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

}
