// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetServiceFuncStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetServiceFuncStatusResponseBodyData data;

    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetServiceFuncStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceFuncStatusResponseBody self = new GetServiceFuncStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceFuncStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetServiceFuncStatusResponseBody setData(GetServiceFuncStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetServiceFuncStatusResponseBodyData getData() {
        return this.data;
    }

    public GetServiceFuncStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetServiceFuncStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetServiceFuncStatusResponseBodyDataArgs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>java</p>
         */
        @NameInMap("add_cmd")
        public String addCmd;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("cpu")
        public String cpu;

        /**
         * <strong>example:</strong>
         * <p>/tmp/sysom/java-profiler</p>
         */
        @NameInMap("java_store_path")
        public String javaStorePath;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("locks")
        public String locks;

        /**
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("loop")
        public Integer loop;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("mem")
        public String mem;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("system_profiling")
        public String systemProfiling;

        public static GetServiceFuncStatusResponseBodyDataArgs build(java.util.Map<String, ?> map) throws Exception {
            GetServiceFuncStatusResponseBodyDataArgs self = new GetServiceFuncStatusResponseBodyDataArgs();
            return TeaModel.build(map, self);
        }

        public GetServiceFuncStatusResponseBodyDataArgs setAddCmd(String addCmd) {
            this.addCmd = addCmd;
            return this;
        }
        public String getAddCmd() {
            return this.addCmd;
        }

        public GetServiceFuncStatusResponseBodyDataArgs setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public GetServiceFuncStatusResponseBodyDataArgs setJavaStorePath(String javaStorePath) {
            this.javaStorePath = javaStorePath;
            return this;
        }
        public String getJavaStorePath() {
            return this.javaStorePath;
        }

        public GetServiceFuncStatusResponseBodyDataArgs setLocks(String locks) {
            this.locks = locks;
            return this;
        }
        public String getLocks() {
            return this.locks;
        }

        public GetServiceFuncStatusResponseBodyDataArgs setLoop(Integer loop) {
            this.loop = loop;
            return this;
        }
        public Integer getLoop() {
            return this.loop;
        }

        public GetServiceFuncStatusResponseBodyDataArgs setMem(String mem) {
            this.mem = mem;
            return this;
        }
        public String getMem() {
            return this.mem;
        }

        public GetServiceFuncStatusResponseBodyDataArgs setSystemProfiling(String systemProfiling) {
            this.systemProfiling = systemProfiling;
            return this;
        }
        public String getSystemProfiling() {
            return this.systemProfiling;
        }

    }

    public static class GetServiceFuncStatusResponseBodyData extends TeaModel {
        @NameInMap("args")
        public GetServiceFuncStatusResponseBodyDataArgs args;

        public static GetServiceFuncStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceFuncStatusResponseBodyData self = new GetServiceFuncStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetServiceFuncStatusResponseBodyData setArgs(GetServiceFuncStatusResponseBodyDataArgs args) {
            this.args = args;
            return this;
        }
        public GetServiceFuncStatusResponseBodyDataArgs getArgs() {
            return this.args;
        }

    }

}
