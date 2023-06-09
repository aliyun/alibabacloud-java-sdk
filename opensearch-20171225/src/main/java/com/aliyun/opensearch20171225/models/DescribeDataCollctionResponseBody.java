// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeDataCollctionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The details of the data collection task.</p>
     */
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
        /**
         * <p>The time when the data collection task was created.</p>
         */
        @NameInMap("created")
        public Integer created;

        /**
         * <p>The type of the data that is collected by the task. Valid values:</p>
         * <br>
         * <p>*   behavior: behavioral data</p>
         * <p>*   item_info: project data</p>
         * <p>*   industry_specific: industry-specific data</p>
         */
        @NameInMap("dataCollectionType")
        public String dataCollectionType;

        /**
         * <p>The ID of the data collection task.</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The industry to which the data collection task applies. Valid values:</p>
         * <br>
         * <p>*   general</p>
         * <p>*   ecommerce</p>
         */
        @NameInMap("industryName")
        public String industryName;

        /**
         * <p>The name of the data collection task.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The status of the data collection task. Valid values:</p>
         * <br>
         * <p>*   0: disabled</p>
         * <p>*   1: being enabled</p>
         * <p>*   2: enabled</p>
         * <p>*   3: failed to be enabled</p>
         */
        @NameInMap("status")
        public Integer status;

        /**
         * <p>The ID of the sundial.</p>
         */
        @NameInMap("sundialId")
        public String sundialId;

        /**
         * <p>The type of the data source. Valid values:</p>
         * <br>
         * <p>*   server</p>
         * <br>
         * <p>*   web</p>
         * <br>
         * <p>*   app</p>
         * <br>
         * <p>    Note: Only server is supported.</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The time when the data collection task was updated.</p>
         */
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
