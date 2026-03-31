// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeCommonLogFieldsResponseBody extends TeaModel {
    @NameInMap("LogFieldList")
    public java.util.List<DescribeCommonLogFieldsResponseBodyLogFieldList> logFieldList;

    /**
     * <strong>example:</strong>
     * <p>AB0775EB-2594-598A-97E1-51B1*******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeCommonLogFieldsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommonLogFieldsResponseBody self = new DescribeCommonLogFieldsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCommonLogFieldsResponseBody setLogFieldList(java.util.List<DescribeCommonLogFieldsResponseBodyLogFieldList> logFieldList) {
        this.logFieldList = logFieldList;
        return this;
    }
    public java.util.List<DescribeCommonLogFieldsResponseBodyLogFieldList> getLogFieldList() {
        return this.logFieldList;
    }

    public DescribeCommonLogFieldsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCommonLogFieldsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCommonLogFieldsResponseBodyLogFieldList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsRequired")
        public Boolean isRequired;

        /**
         * <strong>example:</strong>
         * <p>final_action</p>
         */
        @NameInMap("LogKey")
        public String logKey;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Boolean status;

        public static DescribeCommonLogFieldsResponseBodyLogFieldList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommonLogFieldsResponseBodyLogFieldList self = new DescribeCommonLogFieldsResponseBodyLogFieldList();
            return TeaModel.build(map, self);
        }

        public DescribeCommonLogFieldsResponseBodyLogFieldList setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeCommonLogFieldsResponseBodyLogFieldList setIsRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            return this;
        }
        public Boolean getIsRequired() {
            return this.isRequired;
        }

        public DescribeCommonLogFieldsResponseBodyLogFieldList setLogKey(String logKey) {
            this.logKey = logKey;
            return this;
        }
        public String getLogKey() {
            return this.logKey;
        }

        public DescribeCommonLogFieldsResponseBodyLogFieldList setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

    }

}
