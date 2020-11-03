// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uisplus20200707.models;

import com.aliyun.tea.*;

public class DescribeUissResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Page")
    @Validation(required = true)
    public Long page;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("Uiss")
    @Validation(required = true)
    public java.util.List<DescribeUissResponseUiss> uiss;

    public static DescribeUissResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUissResponse self = new DescribeUissResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUissResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUissResponse setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public DescribeUissResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeUissResponse setUiss(java.util.List<DescribeUissResponseUiss> uiss) {
        this.uiss = uiss;
        return this;
    }
    public java.util.List<DescribeUissResponseUiss> getUiss() {
        return this.uiss;
    }

    public static class DescribeUissResponseUiss extends TeaModel {
        @NameInMap("UisId")
        @Validation(required = true)
        public String uisId;

        @NameInMap("UisName")
        @Validation(required = true)
        public String uisName;

        @NameInMap("Spec")
        @Validation(required = true)
        public String spec;

        @NameInMap("State")
        @Validation(required = true)
        public String state;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        public static DescribeUissResponseUiss build(java.util.Map<String, ?> map) throws Exception {
            DescribeUissResponseUiss self = new DescribeUissResponseUiss();
            return TeaModel.build(map, self);
        }

        public DescribeUissResponseUiss setUisId(String uisId) {
            this.uisId = uisId;
            return this;
        }
        public String getUisId() {
            return this.uisId;
        }

        public DescribeUissResponseUiss setUisName(String uisName) {
            this.uisName = uisName;
            return this;
        }
        public String getUisName() {
            return this.uisName;
        }

        public DescribeUissResponseUiss setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeUissResponseUiss setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeUissResponseUiss setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeUissResponseUiss setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeUissResponseUiss setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeUissResponseUiss setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
