// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class DescribeIndustryListResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeIndustryListResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeIndustryListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIndustryListResponseBody self = new DescribeIndustryListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIndustryListResponseBody setData(java.util.List<DescribeIndustryListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeIndustryListResponseBodyData> getData() {
        return this.data;
    }

    public DescribeIndustryListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIndustryListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeIndustryListResponseBodyData extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("IndustryId")
        public String industryId;

        @NameInMap("Name")
        public String name;

        public static DescribeIndustryListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeIndustryListResponseBodyData self = new DescribeIndustryListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeIndustryListResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeIndustryListResponseBodyData setIndustryId(String industryId) {
            this.industryId = industryId;
            return this;
        }
        public String getIndustryId() {
            return this.industryId;
        }

        public DescribeIndustryListResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
