// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutOpengetlterationbytimeResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeBahamutOpengetlterationbytimeResponseBodyResult> result;

    public static GetLinkeBahamutOpengetlterationbytimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutOpengetlterationbytimeResponseBody self = new GetLinkeBahamutOpengetlterationbytimeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutOpengetlterationbytimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutOpengetlterationbytimeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutOpengetlterationbytimeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutOpengetlterationbytimeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutOpengetlterationbytimeResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutOpengetlterationbytimeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutOpengetlterationbytimeResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutOpengetlterationbytimeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutOpengetlterationbytimeResponseBody setResult(java.util.List<GetLinkeBahamutOpengetlterationbytimeResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutOpengetlterationbytimeResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutOpengetlterationbytimeResponseBodyResult extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("Finished")
        public Boolean finished;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("ReleaseId")
        public String releaseId;

        @NameInMap("TenantPath")
        public String tenantPath;

        @NameInMap("Type")
        public String type;

        @NameInMap("Apps")
        public java.util.List<String> apps;

        public static GetLinkeBahamutOpengetlterationbytimeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutOpengetlterationbytimeResponseBodyResult self = new GetLinkeBahamutOpengetlterationbytimeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutOpengetlterationbytimeResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetLinkeBahamutOpengetlterationbytimeResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetLinkeBahamutOpengetlterationbytimeResponseBodyResult setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public GetLinkeBahamutOpengetlterationbytimeResponseBodyResult setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public GetLinkeBahamutOpengetlterationbytimeResponseBodyResult setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetLinkeBahamutOpengetlterationbytimeResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeBahamutOpengetlterationbytimeResponseBodyResult setReleaseId(String releaseId) {
            this.releaseId = releaseId;
            return this;
        }
        public String getReleaseId() {
            return this.releaseId;
        }

        public GetLinkeBahamutOpengetlterationbytimeResponseBodyResult setTenantPath(String tenantPath) {
            this.tenantPath = tenantPath;
            return this;
        }
        public String getTenantPath() {
            return this.tenantPath;
        }

        public GetLinkeBahamutOpengetlterationbytimeResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetLinkeBahamutOpengetlterationbytimeResponseBodyResult setApps(java.util.List<String> apps) {
            this.apps = apps;
            return this;
        }
        public java.util.List<String> getApps() {
            return this.apps;
        }

    }

}
