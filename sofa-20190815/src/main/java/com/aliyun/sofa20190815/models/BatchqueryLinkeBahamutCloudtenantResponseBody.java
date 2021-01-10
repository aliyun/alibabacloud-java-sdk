// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryLinkeBahamutCloudtenantResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Result")
    public java.util.List<BatchqueryLinkeBahamutCloudtenantResponseBodyResult> result;

    public static BatchqueryLinkeBahamutCloudtenantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryLinkeBahamutCloudtenantResponseBody self = new BatchqueryLinkeBahamutCloudtenantResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchqueryLinkeBahamutCloudtenantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchqueryLinkeBahamutCloudtenantResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchqueryLinkeBahamutCloudtenantResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchqueryLinkeBahamutCloudtenantResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public BatchqueryLinkeBahamutCloudtenantResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchqueryLinkeBahamutCloudtenantResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryLinkeBahamutCloudtenantResponseBody setResult(java.util.List<BatchqueryLinkeBahamutCloudtenantResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<BatchqueryLinkeBahamutCloudtenantResponseBodyResult> getResult() {
        return this.result;
    }

    public static class BatchqueryLinkeBahamutCloudtenantResponseBodyResult extends TeaModel {
        @NameInMap("LinkETenant")
        public String linkETenant;

        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("StationName")
        public String stationName;

        @NameInMap("AccessSecret")
        public String accessSecret;

        @NameInMap("Token")
        public String token;

        @NameInMap("TenantName")
        public String tenantName;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("CustomerId")
        public String customerId;

        @NameInMap("Created")
        public Long created;

        @NameInMap("EndPoint")
        public String endPoint;

        @NameInMap("Id")
        public String id;

        @NameInMap("TenantId")
        public String tenantId;

        public static BatchqueryLinkeBahamutCloudtenantResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            BatchqueryLinkeBahamutCloudtenantResponseBodyResult self = new BatchqueryLinkeBahamutCloudtenantResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public BatchqueryLinkeBahamutCloudtenantResponseBodyResult setLinkETenant(String linkETenant) {
            this.linkETenant = linkETenant;
            return this;
        }
        public String getLinkETenant() {
            return this.linkETenant;
        }

        public BatchqueryLinkeBahamutCloudtenantResponseBodyResult setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public BatchqueryLinkeBahamutCloudtenantResponseBodyResult setStationName(String stationName) {
            this.stationName = stationName;
            return this;
        }
        public String getStationName() {
            return this.stationName;
        }

        public BatchqueryLinkeBahamutCloudtenantResponseBodyResult setAccessSecret(String accessSecret) {
            this.accessSecret = accessSecret;
            return this;
        }
        public String getAccessSecret() {
            return this.accessSecret;
        }

        public BatchqueryLinkeBahamutCloudtenantResponseBodyResult setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public BatchqueryLinkeBahamutCloudtenantResponseBodyResult setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public BatchqueryLinkeBahamutCloudtenantResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public BatchqueryLinkeBahamutCloudtenantResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public BatchqueryLinkeBahamutCloudtenantResponseBodyResult setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public BatchqueryLinkeBahamutCloudtenantResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public BatchqueryLinkeBahamutCloudtenantResponseBodyResult setEndPoint(String endPoint) {
            this.endPoint = endPoint;
            return this;
        }
        public String getEndPoint() {
            return this.endPoint;
        }

        public BatchqueryLinkeBahamutCloudtenantResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public BatchqueryLinkeBahamutCloudtenantResponseBodyResult setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
