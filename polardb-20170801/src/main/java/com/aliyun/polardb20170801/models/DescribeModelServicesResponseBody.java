// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeModelServicesResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeModelServicesResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>24A1990B-4F6E-482B-B8CB-75C612******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeModelServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelServicesResponseBody self = new DescribeModelServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeModelServicesResponseBody setItems(java.util.List<DescribeModelServicesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeModelServicesResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeModelServicesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeModelServicesResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeModelServicesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeModelServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeModelServicesResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeModelServicesResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxxxxx">https://xxxxxx</a></p>
         */
        @NameInMap("BaseUrl")
        public String baseUrl;

        /**
         * <strong>example:</strong>
         * <p>2026-03-31T14:40:48Z</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("InputCostPointsPerMillion")
        public String inputCostPointsPerMillion;

        /**
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("ModelCategory")
        public String modelCategory;

        /**
         * <strong>example:</strong>
         * <p>ms-xxxxxx</p>
         */
        @NameInMap("ModelServiceId")
        public String modelServiceId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("OutputCostPointsPerMillion")
        public String outputCostPointsPerMillion;

        /**
         * <strong>example:</strong>
         * <p>openai</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RequestCostPoints")
        public String requestCostPoints;

        /**
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Vendor")
        public String vendor;

        public static DescribeModelServicesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeModelServicesResponseBodyItems self = new DescribeModelServicesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeModelServicesResponseBodyItems setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public DescribeModelServicesResponseBodyItems setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }
        public String getBaseUrl() {
            return this.baseUrl;
        }

        public DescribeModelServicesResponseBodyItems setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeModelServicesResponseBodyItems setInputCostPointsPerMillion(String inputCostPointsPerMillion) {
            this.inputCostPointsPerMillion = inputCostPointsPerMillion;
            return this;
        }
        public String getInputCostPointsPerMillion() {
            return this.inputCostPointsPerMillion;
        }

        public DescribeModelServicesResponseBodyItems setModelCategory(String modelCategory) {
            this.modelCategory = modelCategory;
            return this;
        }
        public String getModelCategory() {
            return this.modelCategory;
        }

        public DescribeModelServicesResponseBodyItems setModelServiceId(String modelServiceId) {
            this.modelServiceId = modelServiceId;
            return this;
        }
        public String getModelServiceId() {
            return this.modelServiceId;
        }

        public DescribeModelServicesResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeModelServicesResponseBodyItems setOutputCostPointsPerMillion(String outputCostPointsPerMillion) {
            this.outputCostPointsPerMillion = outputCostPointsPerMillion;
            return this;
        }
        public String getOutputCostPointsPerMillion() {
            return this.outputCostPointsPerMillion;
        }

        public DescribeModelServicesResponseBodyItems setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeModelServicesResponseBodyItems setRequestCostPoints(String requestCostPoints) {
            this.requestCostPoints = requestCostPoints;
            return this;
        }
        public String getRequestCostPoints() {
            return this.requestCostPoints;
        }

        public DescribeModelServicesResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeModelServicesResponseBodyItems setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

}
