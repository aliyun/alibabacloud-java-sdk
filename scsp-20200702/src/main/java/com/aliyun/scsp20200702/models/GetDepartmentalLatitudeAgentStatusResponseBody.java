// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetDepartmentalLatitudeAgentStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDepartmentalLatitudeAgentStatusResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Rows")
        public String rows;

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
