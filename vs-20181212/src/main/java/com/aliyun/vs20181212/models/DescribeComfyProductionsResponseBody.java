// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeComfyProductionsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Productions")
    public java.util.List<DescribeComfyProductionsResponseBodyProductions> productions;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribeComfyProductionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeComfyProductionsResponseBody self = new DescribeComfyProductionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeComfyProductionsResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeComfyProductionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeComfyProductionsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeComfyProductionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeComfyProductionsResponseBody setProductions(java.util.List<DescribeComfyProductionsResponseBodyProductions> productions) {
        this.productions = productions;
        return this;
    }
    public java.util.List<DescribeComfyProductionsResponseBodyProductions> getProductions() {
        return this.productions;
    }

    public DescribeComfyProductionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeComfyProductionsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeComfyProductionsResponseBodyProductions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>6c8234f4-d1e1-4cea-b08b-7926fbdea144</p>
         */
        @NameInMap("ComfyTaskId")
        public String comfyTaskId;

        /**
         * <strong>example:</strong>
         * <p>2026-02-06T20:20:26+08:00</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <strong>example:</strong>
         * <p>1755051607877.mp4</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>3e5bda20-5cd4-4d55-8d23-88d624a18caa</p>
         */
        @NameInMap("ProductionId")
        public String productionId;

        /**
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>1773707865</p>
         */
        @NameInMap("UpdatedTime")
        public String updatedTime;

        public static DescribeComfyProductionsResponseBodyProductions build(java.util.Map<String, ?> map) throws Exception {
            DescribeComfyProductionsResponseBodyProductions self = new DescribeComfyProductionsResponseBodyProductions();
            return TeaModel.build(map, self);
        }

        public DescribeComfyProductionsResponseBodyProductions setComfyTaskId(String comfyTaskId) {
            this.comfyTaskId = comfyTaskId;
            return this;
        }
        public String getComfyTaskId() {
            return this.comfyTaskId;
        }

        public DescribeComfyProductionsResponseBodyProductions setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeComfyProductionsResponseBodyProductions setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DescribeComfyProductionsResponseBodyProductions setProductionId(String productionId) {
            this.productionId = productionId;
            return this;
        }
        public String getProductionId() {
            return this.productionId;
        }

        public DescribeComfyProductionsResponseBodyProductions setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeComfyProductionsResponseBodyProductions setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

    }

}
