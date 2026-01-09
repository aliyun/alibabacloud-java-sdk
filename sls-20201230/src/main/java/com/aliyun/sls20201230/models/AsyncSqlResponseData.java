// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class AsyncSqlResponseData extends TeaModel {
    @NameInMap("AsyncSqlMetaPB")
    public AsyncSqlResponseDataAsyncSqlMetaPB asyncSqlMetaPB;

    /**
     * <strong>example:</strong>
     * <p>InvalidQuery</p>
     */
    @NameInMap("error_code")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>line 37:14: Column &quot;xyz&quot; cannot be resolved</p>
     */
    @NameInMap("error_message")
    public String errorMessage;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>690C4F2A16FBD65C40000484_14</p>
     */
    @NameInMap("id")
    public String id;

    @NameInMap("rows")
    public java.util.List<java.util.List<String>> rows;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FINISHED</p>
     */
    @NameInMap("state")
    public String state;

    public static AsyncSqlResponseData build(java.util.Map<String, ?> map) throws Exception {
        AsyncSqlResponseData self = new AsyncSqlResponseData();
        return TeaModel.build(map, self);
    }

    public AsyncSqlResponseData setAsyncSqlMetaPB(AsyncSqlResponseDataAsyncSqlMetaPB asyncSqlMetaPB) {
        this.asyncSqlMetaPB = asyncSqlMetaPB;
        return this;
    }
    public AsyncSqlResponseDataAsyncSqlMetaPB getAsyncSqlMetaPB() {
        return this.asyncSqlMetaPB;
    }

    public AsyncSqlResponseData setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AsyncSqlResponseData setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AsyncSqlResponseData setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AsyncSqlResponseData setRows(java.util.List<java.util.List<String>> rows) {
        this.rows = rows;
        return this;
    }
    public java.util.List<java.util.List<String>> getRows() {
        return this.rows;
    }

    public AsyncSqlResponseData setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public static class AsyncSqlResponseDataAsyncSqlMetaPB extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("cpu_cores")
        public Integer cpuCores;

        /**
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("cpu_sec")
        public Double cpuSec;

        /**
         * <strong>example:</strong>
         * <p>30000</p>
         */
        @NameInMap("elapsed_milli")
        public Long elapsedMilli;

        @NameInMap("keys")
        public java.util.List<String> keys;

        /**
         * <strong>example:</strong>
         * <p>10000000</p>
         */
        @NameInMap("processed_rows")
        public Long processedRows;

        /**
         * <strong>example:</strong>
         * <p>Complete</p>
         */
        @NameInMap("progress")
        public String progress;

        /**
         * <strong>example:</strong>
         * <p>12000</p>
         */
        @NameInMap("result_rows")
        public Integer resultRows;

        public static AsyncSqlResponseDataAsyncSqlMetaPB build(java.util.Map<String, ?> map) throws Exception {
            AsyncSqlResponseDataAsyncSqlMetaPB self = new AsyncSqlResponseDataAsyncSqlMetaPB();
            return TeaModel.build(map, self);
        }

        public AsyncSqlResponseDataAsyncSqlMetaPB setCpuCores(Integer cpuCores) {
            this.cpuCores = cpuCores;
            return this;
        }
        public Integer getCpuCores() {
            return this.cpuCores;
        }

        public AsyncSqlResponseDataAsyncSqlMetaPB setCpuSec(Double cpuSec) {
            this.cpuSec = cpuSec;
            return this;
        }
        public Double getCpuSec() {
            return this.cpuSec;
        }

        public AsyncSqlResponseDataAsyncSqlMetaPB setElapsedMilli(Long elapsedMilli) {
            this.elapsedMilli = elapsedMilli;
            return this;
        }
        public Long getElapsedMilli() {
            return this.elapsedMilli;
        }

        public AsyncSqlResponseDataAsyncSqlMetaPB setKeys(java.util.List<String> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<String> getKeys() {
            return this.keys;
        }

        public AsyncSqlResponseDataAsyncSqlMetaPB setProcessedRows(Long processedRows) {
            this.processedRows = processedRows;
            return this;
        }
        public Long getProcessedRows() {
            return this.processedRows;
        }

        public AsyncSqlResponseDataAsyncSqlMetaPB setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public AsyncSqlResponseDataAsyncSqlMetaPB setResultRows(Integer resultRows) {
            this.resultRows = resultRows;
            return this;
        }
        public Integer getResultRows() {
            return this.resultRows;
        }

    }

}
