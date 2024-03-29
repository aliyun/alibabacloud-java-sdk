// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeQosesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Qoses")
    public DescribeQosesResponseBodyQoses qoses;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeQosesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeQosesResponseBody self = new DescribeQosesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeQosesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeQosesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeQosesResponseBody setQoses(DescribeQosesResponseBodyQoses qoses) {
        this.qoses = qoses;
        return this;
    }
    public DescribeQosesResponseBodyQoses getQoses() {
        return this.qoses;
    }

    public DescribeQosesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeQosesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeQosesResponseBodyQosesQos extends TeaModel {
        @NameInMap("QosDescription")
        public String qosDescription;

        @NameInMap("QosId")
        public String qosId;

        @NameInMap("QosName")
        public String qosName;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SagCount")
        public String sagCount;

        @NameInMap("SmartAGIds")
        public String smartAGIds;

        public static DescribeQosesResponseBodyQosesQos build(java.util.Map<String, ?> map) throws Exception {
            DescribeQosesResponseBodyQosesQos self = new DescribeQosesResponseBodyQosesQos();
            return TeaModel.build(map, self);
        }

        public DescribeQosesResponseBodyQosesQos setQosDescription(String qosDescription) {
            this.qosDescription = qosDescription;
            return this;
        }
        public String getQosDescription() {
            return this.qosDescription;
        }

        public DescribeQosesResponseBodyQosesQos setQosId(String qosId) {
            this.qosId = qosId;
            return this;
        }
        public String getQosId() {
            return this.qosId;
        }

        public DescribeQosesResponseBodyQosesQos setQosName(String qosName) {
            this.qosName = qosName;
            return this;
        }
        public String getQosName() {
            return this.qosName;
        }

        public DescribeQosesResponseBodyQosesQos setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeQosesResponseBodyQosesQos setSagCount(String sagCount) {
            this.sagCount = sagCount;
            return this;
        }
        public String getSagCount() {
            return this.sagCount;
        }

        public DescribeQosesResponseBodyQosesQos setSmartAGIds(String smartAGIds) {
            this.smartAGIds = smartAGIds;
            return this;
        }
        public String getSmartAGIds() {
            return this.smartAGIds;
        }

    }

    public static class DescribeQosesResponseBodyQoses extends TeaModel {
        @NameInMap("Qos")
        public java.util.List<DescribeQosesResponseBodyQosesQos> qos;

        public static DescribeQosesResponseBodyQoses build(java.util.Map<String, ?> map) throws Exception {
            DescribeQosesResponseBodyQoses self = new DescribeQosesResponseBodyQoses();
            return TeaModel.build(map, self);
        }

        public DescribeQosesResponseBodyQoses setQos(java.util.List<DescribeQosesResponseBodyQosesQos> qos) {
            this.qos = qos;
            return this;
        }
        public java.util.List<DescribeQosesResponseBodyQosesQos> getQos() {
            return this.qos;
        }

    }

}
