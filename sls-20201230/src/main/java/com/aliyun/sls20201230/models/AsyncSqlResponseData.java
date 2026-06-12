// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class AsyncSqlResponseData extends TeaModel {
    /**
     * <p>The metadata of the SQL query.</p>
     */
    @NameInMap("AsyncSqlMetaPB")
    public AsyncSqlResponseDataAsyncSqlMetaPB asyncSqlMetaPB;

    /**
     * <p>If the SQL query fails to execute, this parameter contains the specific error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidQuery</p>
     */
    @NameInMap("error_code")
    public String errorCode;

    /**
     * <p>If the SQL query fails to execute, this parameter contains the specific error message.</p>
     * 
     * <strong>example:</strong>
     * <p>line 37:14: Column \&quot;xyz\&quot; cannot be resolved</p>
     */
    @NameInMap("error_message")
    public String errorMessage;

    /**
     * <p>The ID of the asynchronous SQL query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>690C4F2A16FBD65C40000484_14</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <p>The SQL result. Each element in the array is also an array that corresponds to a specific row of the result.</p>
     */
    @NameInMap("rows")
    public java.util.List<java.util.List<String>> rows;

    /**
     * <p>The current execution state of the asynchronous SQL query. Valid values are:</p>
     * <ul>
     * <li><p>RUNNING</p>
     * </li>
     * <li><p>FINISHED</p>
     * </li>
     * <li><p>FAILED</p>
     * </li>
     * <li><p>CANCELLED</p>
     * </li>
     * </ul>
     * <p>RUNNING is a temporary state that indicates the SQL query is still running. You can read the results only when the state is FINISHED. The error_code and error_message parameters are valid only when the state is FAILED.</p>
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
         * <p>The number of CPU cores used.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("cpu_cores")
        public Integer cpuCores;

        /**
         * <p>The total CPU time consumed in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("cpu_sec")
        public Double cpuSec;

        /**
         * <p>The SQL query running time in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30000</p>
         */
        @NameInMap("elapsed_milli")
        public Long elapsedMilli;

        /**
         * <p>The names of the columns in the SQL result. The keys correspond one-to-one with the fields in the SELECT statement.</p>
         */
        @NameInMap("keys")
        public java.util.List<String> keys;

        /**
         * <p>The number of raw data rows processed.</p>
         * 
         * <strong>example:</strong>
         * <p>10000000</p>
         */
        @NameInMap("processed_rows")
        public Long processedRows;

        /**
         * <p>Indicates whether the SQL result is accurate. Valid values are:</p>
         * <ul>
         * <li><p>Complete: The result is accurate.</p>
         * </li>
         * <li><p>Incomplete: The result is not accurate.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Complete</p>
         */
        @NameInMap("progress")
        public String progress;

        /**
         * <p>The total number of rows in the result. When you read the results, the offset value must not exceed this value.</p>
         * 
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
