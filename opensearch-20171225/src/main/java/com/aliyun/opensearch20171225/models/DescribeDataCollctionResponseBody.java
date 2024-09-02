// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeDataCollctionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>72FAD77B-83F9-F393-BA8E-5834E2427BF8</p>
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
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1581065837</p>
         */
        @NameInMap("created")
        public Integer created;

        /**
         * <p>The type of data collected. Valid values:</p>
         * <ul>
         * <li>behavior: behavioral data.</li>
         * <li>item_info: project information.</li>
         * <li>industry_specific: industry-specific data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BEHAVIOR</p>
         */
        @NameInMap("dataCollectionType")
        public String dataCollectionType;

        /**
         * <p>The ID of the data collection task.</p>
         * 
         * <strong>example:</strong>
         * <p>286</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The industry name. Valid values:</p>
         * <ul>
         * <li>general</li>
         * <li>ecommerce</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GENERAL</p>
         */
        @NameInMap("industryName")
        public String industryName;

        /**
         * <p>The name of the data collection task.</p>
         * 
         * <strong>example:</strong>
         * <p>os_function_test_v1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The status of the data collection feature. Valid values:</p>
         * <ul>
         * <li>0: The feature is disabled.</li>
         * <li>1: The feature is being enabled.</li>
         * <li>2: The feature is enabled.</li>
         * <li>3: The feature failed to be enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("status")
        public Integer status;

        /**
         * <p>The sundial ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1755</p>
         */
        @NameInMap("sundialId")
        public String sundialId;

        /**
         * <p>The type of the source from which data was collected. Valid values:</p>
         * <ul>
         * <li>server</li>
         * <li>web</li>
         * <li>app Note: Only server is supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>server</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The time when the data collection task was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1581065904</p>
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
