// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class CheckUuidValidResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CheckUuidValidResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckUuidValidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckUuidValidResponseBody self = new CheckUuidValidResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckUuidValidResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckUuidValidResponseBody setData(CheckUuidValidResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckUuidValidResponseBodyData getData() {
        return this.data;
    }

    public CheckUuidValidResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckUuidValidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CheckUuidValidResponseBodyData extends TeaModel {
        @NameInMap("NewUpgrade")
        public Boolean newUpgrade;

        public static CheckUuidValidResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckUuidValidResponseBodyData self = new CheckUuidValidResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckUuidValidResponseBodyData setNewUpgrade(Boolean newUpgrade) {
            this.newUpgrade = newUpgrade;
            return this;
        }
        public Boolean getNewUpgrade() {
            return this.newUpgrade;
        }

    }

}
