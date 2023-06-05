// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeAiotPersonTablesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PersonTableList")
    public java.util.List<DescribeAiotPersonTablesResponseBodyPersonTableList> personTableList;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAiotPersonTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiotPersonTablesResponseBody self = new DescribeAiotPersonTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAiotPersonTablesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAiotPersonTablesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAiotPersonTablesResponseBody setPersonTableList(java.util.List<DescribeAiotPersonTablesResponseBodyPersonTableList> personTableList) {
        this.personTableList = personTableList;
        return this;
    }
    public java.util.List<DescribeAiotPersonTablesResponseBodyPersonTableList> getPersonTableList() {
        return this.personTableList;
    }

    public DescribeAiotPersonTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAiotPersonTablesResponseBodyPersonTableList extends TeaModel {
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

        public static DescribeAiotPersonTablesResponseBodyPersonTableList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAiotPersonTablesResponseBodyPersonTableList self = new DescribeAiotPersonTablesResponseBodyPersonTableList();
            return TeaModel.build(map, self);
        }

        public DescribeAiotPersonTablesResponseBodyPersonTableList setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public DescribeAiotPersonTablesResponseBodyPersonTableList setFaceNum(Long faceNum) {
            this.faceNum = faceNum;
            return this;
        }
        public Long getFaceNum() {
            return this.faceNum;
        }

        public DescribeAiotPersonTablesResponseBodyPersonTableList setLastChange(String lastChange) {
            this.lastChange = lastChange;
            return this;
        }
        public String getLastChange() {
            return this.lastChange;
        }

        public DescribeAiotPersonTablesResponseBodyPersonTableList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAiotPersonTablesResponseBodyPersonTableList setPersonNum(Long personNum) {
            this.personNum = personNum;
            return this;
        }
        public Long getPersonNum() {
            return this.personNum;
        }

        public DescribeAiotPersonTablesResponseBodyPersonTableList setPersonTableId(String personTableId) {
            this.personTableId = personTableId;
            return this;
        }
        public String getPersonTableId() {
            return this.personTableId;
        }

        public DescribeAiotPersonTablesResponseBodyPersonTableList setTotalPersonNum(Long totalPersonNum) {
            this.totalPersonNum = totalPersonNum;
            return this;
        }
        public Long getTotalPersonNum() {
            return this.totalPersonNum;
        }

        public DescribeAiotPersonTablesResponseBodyPersonTableList setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public DescribeAiotPersonTablesResponseBodyPersonTableList setVerificationModelList(java.util.List<Long> verificationModelList) {
            this.verificationModelList = verificationModelList;
            return this;
        }
        public java.util.List<Long> getVerificationModelList() {
            return this.verificationModelList;
        }

    }

}
