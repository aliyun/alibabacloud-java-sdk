// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class ListSparkStatementsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C2AB7692-B9EF-4A50-BCFF-0DC5B6F080E8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Statements")
    public java.util.List<ListSparkStatementsResponseBodyStatements> statements;

    public static ListSparkStatementsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSparkStatementsResponseBody self = new ListSparkStatementsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSparkStatementsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSparkStatementsResponseBody setStatements(java.util.List<ListSparkStatementsResponseBodyStatements> statements) {
        this.statements = statements;
        return this;
    }
    public java.util.List<ListSparkStatementsResponseBodyStatements> getStatements() {
        return this.statements;
    }

    public static class ListSparkStatementsResponseBodyStatements extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>print(2 + 2)</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>1623033200754</p>
         */
        @NameInMap("CompletedTime")
        public Long completedTime;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;status\&quot;:\&quot;ok\&quot;,\&quot;execution_count\&quot;:1,\&quot;data\&quot;:{\&quot;text/plain\&quot;:\&quot;4\&quot;}}</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Progress")
        public Float progress;

        /**
         * <strong>example:</strong>
         * <p>1623033200750</p>
         */
        @NameInMap("StartedTime")
        public Long startedTime;

        /**
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("State")
        public String state;

        public static ListSparkStatementsResponseBodyStatements build(java.util.Map<String, ?> map) throws Exception {
            ListSparkStatementsResponseBodyStatements self = new ListSparkStatementsResponseBodyStatements();
            return TeaModel.build(map, self);
        }

        public ListSparkStatementsResponseBodyStatements setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListSparkStatementsResponseBodyStatements setCompletedTime(Long completedTime) {
            this.completedTime = completedTime;
            return this;
        }
        public Long getCompletedTime() {
            return this.completedTime;
        }

        public ListSparkStatementsResponseBodyStatements setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListSparkStatementsResponseBodyStatements setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public ListSparkStatementsResponseBodyStatements setProgress(Float progress) {
            this.progress = progress;
            return this;
        }
        public Float getProgress() {
            return this.progress;
        }

        public ListSparkStatementsResponseBodyStatements setStartedTime(Long startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public Long getStartedTime() {
            return this.startedTime;
        }

        public ListSparkStatementsResponseBodyStatements setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
