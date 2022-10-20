// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetSkillGroupLatitudeStateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSkillGroupLatitudeStateResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Rows")
        public String rows;

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
