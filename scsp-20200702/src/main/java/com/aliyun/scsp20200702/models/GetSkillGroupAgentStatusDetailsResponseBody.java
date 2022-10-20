// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetSkillGroupAgentStatusDetailsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSkillGroupAgentStatusDetailsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetSkillGroupAgentStatusDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSkillGroupAgentStatusDetailsResponseBody self = new GetSkillGroupAgentStatusDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSkillGroupAgentStatusDetailsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSkillGroupAgentStatusDetailsResponseBody setData(GetSkillGroupAgentStatusDetailsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSkillGroupAgentStatusDetailsResponseBodyData getData() {
        return this.data;
    }

    public GetSkillGroupAgentStatusDetailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSkillGroupAgentStatusDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSkillGroupAgentStatusDetailsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetSkillGroupAgentStatusDetailsResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Rows")
        public String rows;

        @NameInMap("TotalNum")
        public Long totalNum;

        public static GetSkillGroupAgentStatusDetailsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSkillGroupAgentStatusDetailsResponseBodyData self = new GetSkillGroupAgentStatusDetailsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSkillGroupAgentStatusDetailsResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public GetSkillGroupAgentStatusDetailsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetSkillGroupAgentStatusDetailsResponseBodyData setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public GetSkillGroupAgentStatusDetailsResponseBodyData setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

    }

}
