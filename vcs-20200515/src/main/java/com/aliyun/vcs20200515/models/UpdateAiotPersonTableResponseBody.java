// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateAiotPersonTableResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PersonTable")
    public UpdateAiotPersonTableResponseBodyPersonTable personTable;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAiotPersonTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiotPersonTableResponseBody self = new UpdateAiotPersonTableResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAiotPersonTableResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateAiotPersonTableResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateAiotPersonTableResponseBody setPersonTable(UpdateAiotPersonTableResponseBodyPersonTable personTable) {
        this.personTable = personTable;
        return this;
    }
    public UpdateAiotPersonTableResponseBodyPersonTable getPersonTable() {
        return this.personTable;
    }

    public UpdateAiotPersonTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateAiotPersonTableResponseBodyPersonTable extends TeaModel {
        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("FaceNum")
        public Long faceNum;

        @NameInMap("LastChange")
        public String lastChange;

        @NameInMap("Name")
        public String name;

        @NameInMap("PersonNum")
        public Long personNum;

        @NameInMap("PersonTableId")
        public String personTableId;

        @NameInMap("TotalPersonNum")
        public Long totalPersonNum;

        @NameInMap("Type")
        public Long type;

        @NameInMap("VerificationModelList")
        public java.util.List<Long> verificationModelList;

        public static UpdateAiotPersonTableResponseBodyPersonTable build(java.util.Map<String, ?> map) throws Exception {
            UpdateAiotPersonTableResponseBodyPersonTable self = new UpdateAiotPersonTableResponseBodyPersonTable();
            return TeaModel.build(map, self);
        }

        public UpdateAiotPersonTableResponseBodyPersonTable setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public UpdateAiotPersonTableResponseBodyPersonTable setFaceNum(Long faceNum) {
            this.faceNum = faceNum;
            return this;
        }
        public Long getFaceNum() {
            return this.faceNum;
        }

        public UpdateAiotPersonTableResponseBodyPersonTable setLastChange(String lastChange) {
            this.lastChange = lastChange;
            return this;
        }
        public String getLastChange() {
            return this.lastChange;
        }

        public UpdateAiotPersonTableResponseBodyPersonTable setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateAiotPersonTableResponseBodyPersonTable setPersonNum(Long personNum) {
            this.personNum = personNum;
            return this;
        }
        public Long getPersonNum() {
            return this.personNum;
        }

        public UpdateAiotPersonTableResponseBodyPersonTable setPersonTableId(String personTableId) {
            this.personTableId = personTableId;
            return this;
        }
        public String getPersonTableId() {
            return this.personTableId;
        }

        public UpdateAiotPersonTableResponseBodyPersonTable setTotalPersonNum(Long totalPersonNum) {
            this.totalPersonNum = totalPersonNum;
            return this;
        }
        public Long getTotalPersonNum() {
            return this.totalPersonNum;
        }

        public UpdateAiotPersonTableResponseBodyPersonTable setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public UpdateAiotPersonTableResponseBodyPersonTable setVerificationModelList(java.util.List<Long> verificationModelList) {
            this.verificationModelList = verificationModelList;
            return this;
        }
        public java.util.List<Long> getVerificationModelList() {
            return this.verificationModelList;
        }

    }

}
