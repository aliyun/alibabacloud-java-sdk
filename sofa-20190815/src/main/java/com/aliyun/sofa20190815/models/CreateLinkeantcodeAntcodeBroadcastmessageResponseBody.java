// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeBroadcastmessageResponseBody extends TeaModel {
    @NameInMap("EndsAt")
    public String endsAt;

    @NameInMap("StartsAt")
    public String startsAt;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Color")
    public String color;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("Id")
    public Long id;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("UpdatedAt")
    public String updatedAt;

    @NameInMap("Font")
    public String font;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CreateLinkeantcodeAntcodeBroadcastmessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeBroadcastmessageResponseBody self = new CreateLinkeantcodeAntcodeBroadcastmessageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeBroadcastmessageResponseBody setEndsAt(String endsAt) {
        this.endsAt = endsAt;
        return this;
    }
    public String getEndsAt() {
        return this.endsAt;
    }

    public CreateLinkeantcodeAntcodeBroadcastmessageResponseBody setStartsAt(String startsAt) {
        this.startsAt = startsAt;
        return this;
    }
    public String getStartsAt() {
        return this.startsAt;
    }

    public CreateLinkeantcodeAntcodeBroadcastmessageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateLinkeantcodeAntcodeBroadcastmessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLinkeantcodeAntcodeBroadcastmessageResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CreateLinkeantcodeAntcodeBroadcastmessageResponseBody setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return this.color;
    }

    public CreateLinkeantcodeAntcodeBroadcastmessageResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CreateLinkeantcodeAntcodeBroadcastmessageResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateLinkeantcodeAntcodeBroadcastmessageResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLinkeantcodeAntcodeBroadcastmessageResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public CreateLinkeantcodeAntcodeBroadcastmessageResponseBody setFont(String font) {
        this.font = font;
        return this;
    }
    public String getFont() {
        return this.font;
    }

    public CreateLinkeantcodeAntcodeBroadcastmessageResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
