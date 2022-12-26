// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAgentInstallStatusResponseBody extends TeaModel {
    @NameInMap("AegisClientInvokeStatusResponseList")
    public java.util.List<DescribeAgentInstallStatusResponseBodyAegisClientInvokeStatusResponseList> aegisClientInvokeStatusResponseList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAgentInstallStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgentInstallStatusResponseBody self = new DescribeAgentInstallStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAgentInstallStatusResponseBody setAegisClientInvokeStatusResponseList(java.util.List<DescribeAgentInstallStatusResponseBodyAegisClientInvokeStatusResponseList> aegisClientInvokeStatusResponseList) {
        this.aegisClientInvokeStatusResponseList = aegisClientInvokeStatusResponseList;
        return this;
    }
    public java.util.List<DescribeAgentInstallStatusResponseBodyAegisClientInvokeStatusResponseList> getAegisClientInvokeStatusResponseList() {
        return this.aegisClientInvokeStatusResponseList;
    }

    public DescribeAgentInstallStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAgentInstallStatusResponseBodyAegisClientInvokeStatusResponseList extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("ResuleCode")
        public String resuleCode;

        @NameInMap("Result")
        public Integer result;

        @NameInMap("Uuid")
        public String uuid;

        public static DescribeAgentInstallStatusResponseBodyAegisClientInvokeStatusResponseList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAgentInstallStatusResponseBodyAegisClientInvokeStatusResponseList self = new DescribeAgentInstallStatusResponseBodyAegisClientInvokeStatusResponseList();
            return TeaModel.build(map, self);
        }

        public DescribeAgentInstallStatusResponseBodyAegisClientInvokeStatusResponseList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeAgentInstallStatusResponseBodyAegisClientInvokeStatusResponseList setResuleCode(String resuleCode) {
            this.resuleCode = resuleCode;
            return this;
        }
        public String getResuleCode() {
            return this.resuleCode;
        }

        public DescribeAgentInstallStatusResponseBodyAegisClientInvokeStatusResponseList setResult(Integer result) {
            this.result = result;
            return this;
        }
        public Integer getResult() {
            return this.result;
        }

        public DescribeAgentInstallStatusResponseBodyAegisClientInvokeStatusResponseList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
