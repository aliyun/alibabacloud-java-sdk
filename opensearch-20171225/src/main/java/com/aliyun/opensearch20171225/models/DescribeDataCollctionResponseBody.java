// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeDataCollctionResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public DescribeDataCollctionResponseBodyResult result;

    public static DescribeDataCollctionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataCollctionResponseBody self = new DescribeDataCollctionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataCollctionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataCollctionResponseBody setResult(DescribeDataCollctionResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeDataCollctionResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeDataCollctionResponseBodyResult extends TeaModel {
        @NameInMap("created")
        public Integer created;

        @NameInMap("dataCollectionType")
        public String dataCollectionType;

        @NameInMap("id")
        public String id;

        @NameInMap("industryName")
        public String industryName;

        @NameInMap("name")
        public String name;

        @NameInMap("status")
        public Integer status;

        @NameInMap("sundialId")
        public String sundialId;

        @NameInMap("type")
        public String type;

        @NameInMap("updated")
        public Integer updated;

        public static DescribeDataCollctionResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataCollctionResponseBodyResult self = new DescribeDataCollctionResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeDataCollctionResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public DescribeDataCollctionResponseBodyResult setDataCollectionType(String dataCollectionType) {
            this.dataCollectionType = dataCollectionType;
            return this;
        }
        public String getDataCollectionType() {
            return this.dataCollectionType;
        }

        public DescribeDataCollctionResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDataCollctionResponseBodyResult setIndustryName(String industryName) {
            this.industryName = industryName;
            return this;
        }
        public String getIndustryName() {
            return this.industryName;
        }

        public DescribeDataCollctionResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDataCollctionResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeDataCollctionResponseBodyResult setSundialId(String sundialId) {
            this.sundialId = sundialId;
            return this;
        }
        public String getSundialId() {
            return this.sundialId;
        }

        public DescribeDataCollctionResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDataCollctionResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

    }

}
