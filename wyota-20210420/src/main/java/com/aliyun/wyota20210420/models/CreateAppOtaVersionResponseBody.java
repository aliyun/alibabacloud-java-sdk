// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class CreateAppOtaVersionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateAppOtaVersionResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateAppOtaVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppOtaVersionResponseBody self = new CreateAppOtaVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppOtaVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAppOtaVersionResponseBody setData(CreateAppOtaVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAppOtaVersionResponseBodyData getData() {
        return this.data;
    }

    public CreateAppOtaVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAppOtaVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAppOtaVersionResponseBodyData extends TeaModel {
        @NameInMap("VersionUid")
        public String versionUid;

        public static CreateAppOtaVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAppOtaVersionResponseBodyData self = new CreateAppOtaVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAppOtaVersionResponseBodyData setVersionUid(String versionUid) {
            this.versionUid = versionUid;
            return this;
        }
        public String getVersionUid() {
            return this.versionUid;
        }

    }

}
