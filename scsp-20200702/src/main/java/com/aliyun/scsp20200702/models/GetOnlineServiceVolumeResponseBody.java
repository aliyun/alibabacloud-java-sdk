// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetOnlineServiceVolumeResponseBody extends TeaModel {
    // 错误编码
    @NameInMap("Code")
    public String code;

    // data
    @NameInMap("Data")
    public GetOnlineServiceVolumeResponseBodyData data;

    // 错误描述
    @NameInMap("Message")
    public String message;

    // 请求ID，用于跟踪错误原因
    @NameInMap("RequestId")
    public String requestId;

    // 调用接口是否成功
    @NameInMap("Success")
    public String success;

    public static GetOnlineServiceVolumeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOnlineServiceVolumeResponseBody self = new GetOnlineServiceVolumeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOnlineServiceVolumeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOnlineServiceVolumeResponseBody setData(GetOnlineServiceVolumeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOnlineServiceVolumeResponseBodyData getData() {
        return this.data;
    }

    public GetOnlineServiceVolumeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOnlineServiceVolumeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOnlineServiceVolumeResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetOnlineServiceVolumeResponseBodyData extends TeaModel {
        // 当前页数
        @NameInMap("PageNum")
        public Integer pageNum;

        // 页大小
        @NameInMap("PageSize")
        public Integer pageSize;

        // 信息为list<map>类型的json字符串
        @NameInMap("Rows")
        public String rows;

        // 总记录数
        @NameInMap("TotalNum")
        public Integer totalNum;

        public static GetOnlineServiceVolumeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOnlineServiceVolumeResponseBodyData self = new GetOnlineServiceVolumeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOnlineServiceVolumeResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetOnlineServiceVolumeResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetOnlineServiceVolumeResponseBodyData setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public GetOnlineServiceVolumeResponseBodyData setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

    }

}
