// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListAlgorithmNamesByDeviceIdsResponseBody extends TeaModel {
    // 返回结果编码  200：获取成功  Failed：获取失败  Retry：按需拉流模式，正在建立取流连接，请稍后重试
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAlgorithmNamesByDeviceIdsResponseBodyData> data;

    // 返回结果消息
    @NameInMap("Message")
    public String message;

    // 请求ID
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
        // 设备ID对应呗计算的算法名称集合
        @NameInMap("AlgorithmNames")
        public java.util.List<String> algorithmNames;

        // 设备ID
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
