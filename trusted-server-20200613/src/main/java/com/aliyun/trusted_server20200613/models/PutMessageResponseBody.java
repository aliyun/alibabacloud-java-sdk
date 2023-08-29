// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trusted_server20200613.models;

import com.aliyun.tea.*;

public class PutMessageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public PutMessageResponseBodyData data;

    public static PutMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutMessageResponseBody self = new PutMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public PutMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PutMessageResponseBody setData(PutMessageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PutMessageResponseBodyData getData() {
        return this.data;
    }

    public static class PutMessageResponseBodyDataKmoduleVerificationResult extends TeaModel {
        @NameInMap("code")
        public String code;

        @NameInMap("status")
        public Integer status;

        public static PutMessageResponseBodyDataKmoduleVerificationResult build(java.util.Map<String, ?> map) throws Exception {
            PutMessageResponseBodyDataKmoduleVerificationResult self = new PutMessageResponseBodyDataKmoduleVerificationResult();
            return TeaModel.build(map, self);
        }

        public PutMessageResponseBodyDataKmoduleVerificationResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public PutMessageResponseBodyDataKmoduleVerificationResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class PutMessageResponseBodyDataPolicyProcResult extends TeaModel {
        @NameInMap("code")
        public String code;

        @NameInMap("procData")
        public String procData;

        public static PutMessageResponseBodyDataPolicyProcResult build(java.util.Map<String, ?> map) throws Exception {
            PutMessageResponseBodyDataPolicyProcResult self = new PutMessageResponseBodyDataPolicyProcResult();
            return TeaModel.build(map, self);
        }

        public PutMessageResponseBodyDataPolicyProcResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public PutMessageResponseBodyDataPolicyProcResult setProcData(String procData) {
            this.procData = procData;
            return this;
        }
        public String getProcData() {
            return this.procData;
        }

    }

    public static class PutMessageResponseBodyDataProgramVerificationResult extends TeaModel {
        @NameInMap("code")
        public String code;

        @NameInMap("status")
        public Integer status;

        public static PutMessageResponseBodyDataProgramVerificationResult build(java.util.Map<String, ?> map) throws Exception {
            PutMessageResponseBodyDataProgramVerificationResult self = new PutMessageResponseBodyDataProgramVerificationResult();
            return TeaModel.build(map, self);
        }

        public PutMessageResponseBodyDataProgramVerificationResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public PutMessageResponseBodyDataProgramVerificationResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class PutMessageResponseBodyDataSystemVerificationResult extends TeaModel {
        @NameInMap("code")
        public String code;

        @NameInMap("status")
        public Integer status;

        public static PutMessageResponseBodyDataSystemVerificationResult build(java.util.Map<String, ?> map) throws Exception {
            PutMessageResponseBodyDataSystemVerificationResult self = new PutMessageResponseBodyDataSystemVerificationResult();
            return TeaModel.build(map, self);
        }

        public PutMessageResponseBodyDataSystemVerificationResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public PutMessageResponseBodyDataSystemVerificationResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class PutMessageResponseBodyData extends TeaModel {
        @NameInMap("kmoduleVerificationResult")
        public PutMessageResponseBodyDataKmoduleVerificationResult kmoduleVerificationResult;

        @NameInMap("nextClientIMAIndex")
        public Long nextClientIMAIndex;

        @NameInMap("policyProcResult")
        public PutMessageResponseBodyDataPolicyProcResult policyProcResult;

        @NameInMap("programVerificationResult")
        public PutMessageResponseBodyDataProgramVerificationResult programVerificationResult;

        @NameInMap("systemVerificationResult")
        public PutMessageResponseBodyDataSystemVerificationResult systemVerificationResult;

        public static PutMessageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PutMessageResponseBodyData self = new PutMessageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PutMessageResponseBodyData setKmoduleVerificationResult(PutMessageResponseBodyDataKmoduleVerificationResult kmoduleVerificationResult) {
            this.kmoduleVerificationResult = kmoduleVerificationResult;
            return this;
        }
        public PutMessageResponseBodyDataKmoduleVerificationResult getKmoduleVerificationResult() {
            return this.kmoduleVerificationResult;
        }

        public PutMessageResponseBodyData setNextClientIMAIndex(Long nextClientIMAIndex) {
            this.nextClientIMAIndex = nextClientIMAIndex;
            return this;
        }
        public Long getNextClientIMAIndex() {
            return this.nextClientIMAIndex;
        }

        public PutMessageResponseBodyData setPolicyProcResult(PutMessageResponseBodyDataPolicyProcResult policyProcResult) {
            this.policyProcResult = policyProcResult;
            return this;
        }
        public PutMessageResponseBodyDataPolicyProcResult getPolicyProcResult() {
            return this.policyProcResult;
        }

        public PutMessageResponseBodyData setProgramVerificationResult(PutMessageResponseBodyDataProgramVerificationResult programVerificationResult) {
            this.programVerificationResult = programVerificationResult;
            return this;
        }
        public PutMessageResponseBodyDataProgramVerificationResult getProgramVerificationResult() {
            return this.programVerificationResult;
        }

        public PutMessageResponseBodyData setSystemVerificationResult(PutMessageResponseBodyDataSystemVerificationResult systemVerificationResult) {
            this.systemVerificationResult = systemVerificationResult;
            return this;
        }
        public PutMessageResponseBodyDataSystemVerificationResult getSystemVerificationResult() {
            return this.systemVerificationResult;
        }

    }

}
