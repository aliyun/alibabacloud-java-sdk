// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SaveVideoSummaryTaskVideoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SaveVideoSummaryTaskVideoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveVideoSummaryTaskVideoResponseBody self = new SaveVideoSummaryTaskVideoResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveVideoSummaryTaskVideoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SaveVideoSummaryTaskVideoResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SaveVideoSummaryTaskVideoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SaveVideoSummaryTaskVideoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
