// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ListUnionMediaIndustryResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListUnionMediaIndustryResponseBodyData> data;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListUnionMediaIndustryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUnionMediaIndustryResponseBody self = new ListUnionMediaIndustryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUnionMediaIndustryResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListUnionMediaIndustryResponseBody setData(java.util.List<ListUnionMediaIndustryResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListUnionMediaIndustryResponseBodyData> getData() {
        return this.data;
    }

    public ListUnionMediaIndustryResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListUnionMediaIndustryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUnionMediaIndustryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListUnionMediaIndustryResponseBodyData extends TeaModel {
        @NameInMap("IndustryCode")
        public String industryCode;

        @NameInMap("IndustryName")
        public String industryName;

        @NameInMap("Level")
        public String level;

        @NameInMap("ParentIndustryCode")
        public String parentIndustryCode;

        @NameInMap("UsedFlag")
        public Boolean usedFlag;

        public static ListUnionMediaIndustryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUnionMediaIndustryResponseBodyData self = new ListUnionMediaIndustryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUnionMediaIndustryResponseBodyData setIndustryCode(String industryCode) {
            this.industryCode = industryCode;
            return this;
        }
        public String getIndustryCode() {
            return this.industryCode;
        }

        public ListUnionMediaIndustryResponseBodyData setIndustryName(String industryName) {
            this.industryName = industryName;
            return this;
        }
        public String getIndustryName() {
            return this.industryName;
        }

        public ListUnionMediaIndustryResponseBodyData setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListUnionMediaIndustryResponseBodyData setParentIndustryCode(String parentIndustryCode) {
            this.parentIndustryCode = parentIndustryCode;
            return this;
        }
        public String getParentIndustryCode() {
            return this.parentIndustryCode;
        }

        public ListUnionMediaIndustryResponseBodyData setUsedFlag(Boolean usedFlag) {
            this.usedFlag = usedFlag;
            return this;
        }
        public Boolean getUsedFlag() {
            return this.usedFlag;
        }

    }

}
