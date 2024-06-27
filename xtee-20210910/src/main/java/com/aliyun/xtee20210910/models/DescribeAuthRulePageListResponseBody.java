// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAuthRulePageListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("currentPage")
    public Long currentPage;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("resultObject")
    public java.util.List<DescribeAuthRulePageListResponseBodyResultObject> resultObject;

    @NameInMap("totalItem")
    public Long totalItem;

    @NameInMap("totalPage")
    public Long totalPage;

    public static DescribeAuthRulePageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuthRulePageListResponseBody self = new DescribeAuthRulePageListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAuthRulePageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAuthRulePageListResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAuthRulePageListResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeAuthRulePageListResponseBody setResultObject(java.util.List<DescribeAuthRulePageListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeAuthRulePageListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeAuthRulePageListResponseBody setTotalItem(Long totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Long getTotalItem() {
        return this.totalItem;
    }

    public DescribeAuthRulePageListResponseBody setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeAuthRulePageListResponseBodyResultObject extends TeaModel {
        @NameInMap("consoleRuleId")
        public Long consoleRuleId;

        @NameInMap("createType")
        public String createType;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("memo")
        public String memo;

        @NameInMap("ruleId")
        public String ruleId;

        @NameInMap("ruleName")
        public String ruleName;

        @NameInMap("ruleVersionId")
        public Long ruleVersionId;

        @NameInMap("status")
        public String status;

        @NameInMap("version")
        public Long version;

        public static DescribeAuthRulePageListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeAuthRulePageListResponseBodyResultObject self = new DescribeAuthRulePageListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeAuthRulePageListResponseBodyResultObject setConsoleRuleId(Long consoleRuleId) {
            this.consoleRuleId = consoleRuleId;
            return this;
        }
        public Long getConsoleRuleId() {
            return this.consoleRuleId;
        }

        public DescribeAuthRulePageListResponseBodyResultObject setCreateType(String createType) {
            this.createType = createType;
            return this;
        }
        public String getCreateType() {
            return this.createType;
        }

        public DescribeAuthRulePageListResponseBodyResultObject setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeAuthRulePageListResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeAuthRulePageListResponseBodyResultObject setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public DescribeAuthRulePageListResponseBodyResultObject setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeAuthRulePageListResponseBodyResultObject setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeAuthRulePageListResponseBodyResultObject setRuleVersionId(Long ruleVersionId) {
            this.ruleVersionId = ruleVersionId;
            return this;
        }
        public Long getRuleVersionId() {
            return this.ruleVersionId;
        }

        public DescribeAuthRulePageListResponseBodyResultObject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAuthRulePageListResponseBodyResultObject setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
