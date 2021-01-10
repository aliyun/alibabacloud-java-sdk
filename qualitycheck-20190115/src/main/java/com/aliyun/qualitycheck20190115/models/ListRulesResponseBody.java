// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Data")
    public java.util.List<ListRulesResponseBodyData> data;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ListRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRulesResponseBody self = new ListRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRulesResponseBody setData(java.util.List<ListRulesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListRulesResponseBodyData> getData() {
        return this.data;
    }

    public ListRulesResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListRulesResponseBodyData extends TeaModel {
        @NameInMap("Type")
        public Integer type;

        @NameInMap("RuleType")
        public Integer ruleType;

        @NameInMap("BusinessCategoryNameList")
        public java.util.List<String> businessCategoryNameList;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Comments")
        public String comments;

        @NameInMap("TypeName")
        public String typeName;

        @NameInMap("Name")
        public String name;

        @NameInMap("Rid")
        public Long rid;

        public static ListRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyData self = new ListRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ListRulesResponseBodyData setRuleType(Integer ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public Integer getRuleType() {
            return this.ruleType;
        }

        public ListRulesResponseBodyData setBusinessCategoryNameList(java.util.List<String> businessCategoryNameList) {
            this.businessCategoryNameList = businessCategoryNameList;
            return this;
        }
        public java.util.List<String> getBusinessCategoryNameList() {
            return this.businessCategoryNameList;
        }

        public ListRulesResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListRulesResponseBodyData setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public ListRulesResponseBodyData setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

        public ListRulesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRulesResponseBodyData setRid(Long rid) {
            this.rid = rid;
            return this;
        }
        public Long getRid() {
            return this.rid;
        }

    }

}
