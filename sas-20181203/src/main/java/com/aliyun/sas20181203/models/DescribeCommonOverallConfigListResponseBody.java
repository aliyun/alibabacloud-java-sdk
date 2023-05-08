// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCommonOverallConfigListResponseBody extends TeaModel {
    @NameInMap("OverallList")
    public java.util.List<DescribeCommonOverallConfigListResponseBodyOverallList> overallList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCommonOverallConfigListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommonOverallConfigListResponseBody self = new DescribeCommonOverallConfigListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCommonOverallConfigListResponseBody setOverallList(java.util.List<DescribeCommonOverallConfigListResponseBodyOverallList> overallList) {
        this.overallList = overallList;
        return this;
    }
    public java.util.List<DescribeCommonOverallConfigListResponseBodyOverallList> getOverallList() {
        return this.overallList;
    }

    public DescribeCommonOverallConfigListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCommonOverallConfigListResponseBodyOverallList extends TeaModel {
        @NameInMap("Config")
        public String config;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Type")
        public String type;

        public static DescribeCommonOverallConfigListResponseBodyOverallList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommonOverallConfigListResponseBodyOverallList self = new DescribeCommonOverallConfigListResponseBodyOverallList();
            return TeaModel.build(map, self);
        }

        public DescribeCommonOverallConfigListResponseBodyOverallList setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public DescribeCommonOverallConfigListResponseBodyOverallList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeCommonOverallConfigListResponseBodyOverallList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
