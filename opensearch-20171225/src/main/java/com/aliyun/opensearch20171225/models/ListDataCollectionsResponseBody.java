// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListDataCollectionsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>959D8782-B130-95EB-86CC-1F6ED447981F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The details of the data collection task.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/173605.html">DataCollection</a>.</p>
     */
    @NameInMap("result")
    public java.util.List<ListDataCollectionsResponseBodyResult> result;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListDataCollectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataCollectionsResponseBody self = new ListDataCollectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataCollectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataCollectionsResponseBody setResult(java.util.List<ListDataCollectionsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListDataCollectionsResponseBodyResult> getResult() {
        return this.result;
    }

    public ListDataCollectionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDataCollectionsResponseBodyResult extends TeaModel {
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
         * <p>The data collection ID.</p>
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
         * <li>app</li>
         * </ul>
         * <p>Only server is supported.</p>
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

        public static ListDataCollectionsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDataCollectionsResponseBodyResult self = new ListDataCollectionsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDataCollectionsResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public ListDataCollectionsResponseBodyResult setDataCollectionType(String dataCollectionType) {
            this.dataCollectionType = dataCollectionType;
            return this;
        }
        public String getDataCollectionType() {
            return this.dataCollectionType;
        }

        public ListDataCollectionsResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDataCollectionsResponseBodyResult setIndustryName(String industryName) {
            this.industryName = industryName;
            return this;
        }
        public String getIndustryName() {
            return this.industryName;
        }

        public ListDataCollectionsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataCollectionsResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListDataCollectionsResponseBodyResult setSundialId(String sundialId) {
            this.sundialId = sundialId;
            return this;
        }
        public String getSundialId() {
            return this.sundialId;
        }

        public ListDataCollectionsResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListDataCollectionsResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

    }

}
