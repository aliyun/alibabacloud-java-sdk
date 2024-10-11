// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class GetSparkStatementResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetSparkStatementResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>C5DB60E0-6EB3-493C-8956-DA0D3A2EE656</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetSparkStatementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSparkStatementResponseBody self = new GetSparkStatementResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSparkStatementResponseBody setData(GetSparkStatementResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSparkStatementResponseBodyData getData() {
        return this.data;
    }

    public GetSparkStatementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSparkStatementResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>print(2+2)</p>
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
         * <p>1</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <strong>example:</strong>
         * <p>&quot;{\&quot;status\&quot;:\&quot;ok\&quot;,\&quot;execution_count\&quot;:1,\&quot;data\&quot;:{\&quot;text/plain\&quot;:\&quot;4\&quot;}}&quot;</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Process")
        public Float process;

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

        public static GetSparkStatementResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSparkStatementResponseBodyData self = new GetSparkStatementResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSparkStatementResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetSparkStatementResponseBodyData setCompletedTime(Long completedTime) {
            this.completedTime = completedTime;
            return this;
        }
        public Long getCompletedTime() {
            return this.completedTime;
        }

        public GetSparkStatementResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public GetSparkStatementResponseBodyData setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public GetSparkStatementResponseBodyData setProcess(Float process) {
            this.process = process;
            return this;
        }
        public Float getProcess() {
            return this.process;
        }

        public GetSparkStatementResponseBodyData setStartedTime(Long startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public Long getStartedTime() {
            return this.startedTime;
        }

        public GetSparkStatementResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
