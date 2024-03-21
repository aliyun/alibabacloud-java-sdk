// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class CheckDuplicateTrademarkResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DuplicateTrademark")
    public String duplicateTrademark;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Type")
    public String type;

    public static CheckDuplicateTrademarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckDuplicateTrademarkResponseBody self = new CheckDuplicateTrademarkResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckDuplicateTrademarkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckDuplicateTrademarkResponseBody setDuplicateTrademark(String duplicateTrademark) {
        this.duplicateTrademark = duplicateTrademark;
        return this;
    }
    public String getDuplicateTrademark() {
        return this.duplicateTrademark;
    }

    public CheckDuplicateTrademarkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckDuplicateTrademarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckDuplicateTrademarkResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
