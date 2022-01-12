// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetSeatInformationResponseBody extends TeaModel {
    // 错误编码
    @NameInMap("Code")
    public String code;

    // data
    @NameInMap("Data")
    public GetSeatInformationResponseBodyData data;

    // 错误描述
    @NameInMap("Message")
    public String message;

    // 请求ID，用于跟踪错误原因
    @NameInMap("RequestId")
    public String requestId;

    // 调用接口是否成功
    @NameInMap("Success")
    public String success;

    public static GetSeatInformationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSeatInformationResponseBody self = new GetSeatInformationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSeatInformationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSeatInformationResponseBody setData(GetSeatInformationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSeatInformationResponseBodyData getData() {
        return this.data;
    }

    public GetSeatInformationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSeatInformationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSeatInformationResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetSeatInformationResponseBodyData extends TeaModel {
        // 当前页数
        @NameInMap("PageNum")
        public Integer pageNum;

        // 页大小
        @NameInMap("PageSize")
        public Integer pageSize;

        // 信息为list<map>类型的json字符串
        @NameInMap("Rowr")
        public String rowr;

        // 总记录数
        @NameInMap("TotalNum")
        public Integer totalNum;

        public static GetSeatInformationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSeatInformationResponseBodyData self = new GetSeatInformationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSeatInformationResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetSeatInformationResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetSeatInformationResponseBodyData setRowr(String rowr) {
            this.rowr = rowr;
            return this;
        }
        public String getRowr() {
            return this.rowr;
        }

        public GetSeatInformationResponseBodyData setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

    }

}
