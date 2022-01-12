// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetSkillGroupLatitudeStateResponseBody extends TeaModel {
    // 错误编码
    @NameInMap("Code")
    public String code;

    // data
    @NameInMap("Data")
    public GetSkillGroupLatitudeStateResponseBodyData data;

    // 错误描述
    @NameInMap("Message")
    public String message;

    // 请求ID，用于跟踪错误原因
    @NameInMap("RequestId")
    public String requestId;

    // 接口调用是否成功
    @NameInMap("Success")
    public String success;

    public static GetSkillGroupLatitudeStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSkillGroupLatitudeStateResponseBody self = new GetSkillGroupLatitudeStateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSkillGroupLatitudeStateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSkillGroupLatitudeStateResponseBody setData(GetSkillGroupLatitudeStateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSkillGroupLatitudeStateResponseBodyData getData() {
        return this.data;
    }

    public GetSkillGroupLatitudeStateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSkillGroupLatitudeStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSkillGroupLatitudeStateResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetSkillGroupLatitudeStateResponseBodyData extends TeaModel {
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

        public static GetSkillGroupLatitudeStateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSkillGroupLatitudeStateResponseBodyData self = new GetSkillGroupLatitudeStateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSkillGroupLatitudeStateResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetSkillGroupLatitudeStateResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetSkillGroupLatitudeStateResponseBodyData setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public GetSkillGroupLatitudeStateResponseBodyData setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

    }

}
