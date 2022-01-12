// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetDepartmentalLatitudeAgentStatusResponseBody extends TeaModel {
    // 错误编码
    @NameInMap("Code")
    public String code;

    // 数据
    @NameInMap("Data")
    public GetDepartmentalLatitudeAgentStatusResponseBodyData data;

    // 错误描述
    @NameInMap("Message")
    public String message;

    // 请求ID，用于跟踪错误原因
    @NameInMap("RequestId")
    public String requestId;

    // 接口调用是否成功
    @NameInMap("Success")
    public Boolean success;

    public static GetDepartmentalLatitudeAgentStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDepartmentalLatitudeAgentStatusResponseBody self = new GetDepartmentalLatitudeAgentStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDepartmentalLatitudeAgentStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDepartmentalLatitudeAgentStatusResponseBody setData(GetDepartmentalLatitudeAgentStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDepartmentalLatitudeAgentStatusResponseBodyData getData() {
        return this.data;
    }

    public GetDepartmentalLatitudeAgentStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDepartmentalLatitudeAgentStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDepartmentalLatitudeAgentStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDepartmentalLatitudeAgentStatusResponseBodyData extends TeaModel {
        // 当前页数
        @NameInMap("PageNum")
        public Integer pageNum;

        // 每页的数量
        @NameInMap("PageSize")
        public Integer pageSize;

        // 信息为list<map>类型的json字符串
        @NameInMap("Rows")
        public String rows;

        // 总共记录数
        @NameInMap("TotalNum")
        public Integer totalNum;

        public static GetDepartmentalLatitudeAgentStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDepartmentalLatitudeAgentStatusResponseBodyData self = new GetDepartmentalLatitudeAgentStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDepartmentalLatitudeAgentStatusResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetDepartmentalLatitudeAgentStatusResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetDepartmentalLatitudeAgentStatusResponseBodyData setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public GetDepartmentalLatitudeAgentStatusResponseBodyData setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

    }

}
