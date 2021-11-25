// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListAlgorithmNamesByDeviceIdsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAlgorithmNamesByDeviceIdsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListAlgorithmNamesByDeviceIdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlgorithmNamesByDeviceIdsResponseBody self = new ListAlgorithmNamesByDeviceIdsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlgorithmNamesByDeviceIdsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAlgorithmNamesByDeviceIdsResponseBody setData(java.util.List<ListAlgorithmNamesByDeviceIdsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAlgorithmNamesByDeviceIdsResponseBodyData> getData() {
        return this.data;
    }

    public ListAlgorithmNamesByDeviceIdsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAlgorithmNamesByDeviceIdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlgorithmNamesByDeviceIdsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAlgorithmNamesByDeviceIdsResponseBodyData extends TeaModel {
        @NameInMap("AlgorithmNames")
        public java.util.List<String> algorithmNames;

        @NameInMap("GbId")
        public String gbId;

        public static ListAlgorithmNamesByDeviceIdsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAlgorithmNamesByDeviceIdsResponseBodyData self = new ListAlgorithmNamesByDeviceIdsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAlgorithmNamesByDeviceIdsResponseBodyData setAlgorithmNames(java.util.List<String> algorithmNames) {
            this.algorithmNames = algorithmNames;
            return this;
        }
        public java.util.List<String> getAlgorithmNames() {
            return this.algorithmNames;
        }

        public ListAlgorithmNamesByDeviceIdsResponseBodyData setGbId(String gbId) {
            this.gbId = gbId;
            return this;
        }
        public String getGbId() {
            return this.gbId;
        }

    }

}
