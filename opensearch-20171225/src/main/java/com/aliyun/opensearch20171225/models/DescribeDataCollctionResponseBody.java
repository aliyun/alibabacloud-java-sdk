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
     * <p>The data collection information.</p>
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
         * <p>The time when the data collection was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1581065837</p>
         */
        @NameInMap("created")
        public Integer created;

        /**
         * <p>The type of the data collection.</p>
         * <ul>
         * <li><p>behavior: User behavior data.</p>
         * </li>
         * <li><p>item_info: Item information.</p>
         * </li>
         * <li><p>industry_specific: Industry-specific attributes.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BEHAVIOR</p>
         */
        @NameInMap("dataCollectionType")
        public String dataCollectionType;

        /**
         * <p>The ID of the data collection.</p>
         * 
         * <strong>example:</strong>
         * <p>286</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The name of the industry.</p>
         * <ul>
         * <li><p>general: General</p>
         * </li>
         * <li><p>ecommerce: E-commerce</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GENERAL</p>
         */
        @NameInMap("industryName")
        public String industryName;

        /**
         * <p>The name of the data collection.</p>
         * 
         * <strong>example:</strong>
         * <p>os_function_test_v1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The status.</p>
         * <ul>
         * <li><p>0: The data collection is not enabled.</p>
         * </li>
         * <li><p>1: The data collection is being enabled.</p>
         * </li>
         * <li><p>2: The data collection is enabled.</p>
         * </li>
         * <li><p>3: The data collection failed to be enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("status")
        public Integer status;

        /**
         * <p>The ID of the sundial.</p>
         * 
         * <strong>example:</strong>
         * <p>1755</p>
         */
        @NameInMap("sundialId")
        public String sundialId;

        /**
         * <p>The type of the data collection client.</p>
         * <ul>
         * <li><p>server</p>
         * </li>
         * <li><p>web</p>
         * </li>
         * <li><p>app
         * Only server is supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>server</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The time when the data collection was last updated.</p>
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
