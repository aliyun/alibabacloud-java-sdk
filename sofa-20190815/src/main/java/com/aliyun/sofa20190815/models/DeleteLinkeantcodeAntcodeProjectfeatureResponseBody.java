// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeProjectfeatureResponseBody extends TeaModel {
    @NameInMap("FeatureType")
    public String featureType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("SourceId")
    public Long sourceId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("FeatureValue")
    public String featureValue;

    @NameInMap("UpdatedAt")
    public String updatedAt;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DeleteLinkeantcodeAntcodeProjectfeatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeProjectfeatureResponseBody self = new DeleteLinkeantcodeAntcodeProjectfeatureResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeProjectfeatureResponseBody setFeatureType(String featureType) {
        this.featureType = featureType;
        return this;
    }
    public String getFeatureType() {
        return this.featureType;
    }

    public DeleteLinkeantcodeAntcodeProjectfeatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteLinkeantcodeAntcodeProjectfeatureResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public DeleteLinkeantcodeAntcodeProjectfeatureResponseBody setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public DeleteLinkeantcodeAntcodeProjectfeatureResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public DeleteLinkeantcodeAntcodeProjectfeatureResponseBody setSourceId(Long sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public Long getSourceId() {
        return this.sourceId;
    }

    public DeleteLinkeantcodeAntcodeProjectfeatureResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteLinkeantcodeAntcodeProjectfeatureResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DeleteLinkeantcodeAntcodeProjectfeatureResponseBody setFeatureValue(String featureValue) {
        this.featureValue = featureValue;
        return this;
    }
    public String getFeatureValue() {
        return this.featureValue;
    }

    public DeleteLinkeantcodeAntcodeProjectfeatureResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public DeleteLinkeantcodeAntcodeProjectfeatureResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
