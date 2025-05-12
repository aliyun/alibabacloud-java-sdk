// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpdateFuncSwitchRecordRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("channel")
    public String channel;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("params")
    public UpdateFuncSwitchRecordRequestParams params;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>livetrace</p>
     */
    @NameInMap("service_name")
    public String serviceName;

    public static UpdateFuncSwitchRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFuncSwitchRecordRequest self = new UpdateFuncSwitchRecordRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFuncSwitchRecordRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public UpdateFuncSwitchRecordRequest setParams(UpdateFuncSwitchRecordRequestParams params) {
        this.params = params;
        return this;
    }
    public UpdateFuncSwitchRecordRequestParams getParams() {
        return this.params;
    }

    public UpdateFuncSwitchRecordRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public static class UpdateFuncSwitchRecordRequestParamsArgs extends TeaModel {
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

        @NameInMap("duration")
        public Integer duration;

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

        @NameInMap("pid")
        public Integer pid;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("system_profiling")
        public String systemProfiling;

        public static UpdateFuncSwitchRecordRequestParamsArgs build(java.util.Map<String, ?> map) throws Exception {
            UpdateFuncSwitchRecordRequestParamsArgs self = new UpdateFuncSwitchRecordRequestParamsArgs();
            return TeaModel.build(map, self);
        }

        public UpdateFuncSwitchRecordRequestParamsArgs setAddCmd(String addCmd) {
            this.addCmd = addCmd;
            return this;
        }
        public String getAddCmd() {
            return this.addCmd;
        }

        public UpdateFuncSwitchRecordRequestParamsArgs setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public UpdateFuncSwitchRecordRequestParamsArgs setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public UpdateFuncSwitchRecordRequestParamsArgs setJavaStorePath(String javaStorePath) {
            this.javaStorePath = javaStorePath;
            return this;
        }
        public String getJavaStorePath() {
            return this.javaStorePath;
        }

        public UpdateFuncSwitchRecordRequestParamsArgs setLocks(String locks) {
            this.locks = locks;
            return this;
        }
        public String getLocks() {
            return this.locks;
        }

        public UpdateFuncSwitchRecordRequestParamsArgs setLoop(Integer loop) {
            this.loop = loop;
            return this;
        }
        public Integer getLoop() {
            return this.loop;
        }

        public UpdateFuncSwitchRecordRequestParamsArgs setMem(String mem) {
            this.mem = mem;
            return this;
        }
        public String getMem() {
            return this.mem;
        }

        public UpdateFuncSwitchRecordRequestParamsArgs setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public UpdateFuncSwitchRecordRequestParamsArgs setSystemProfiling(String systemProfiling) {
            this.systemProfiling = systemProfiling;
            return this;
        }
        public String getSystemProfiling() {
            return this.systemProfiling;
        }

    }

    public static class UpdateFuncSwitchRecordRequestParams extends TeaModel {
        @NameInMap("args")
        public UpdateFuncSwitchRecordRequestParamsArgs args;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mullprof</p>
         */
        @NameInMap("function_name")
        public String functionName;

        /**
         * <strong>example:</strong>
         * <p>i-2zei55fwj8nnu31h3z46</p>
         */
        @NameInMap("instance")
        public String instance;

        /**
         * <strong>example:</strong>
         * <p>restart</p>
         */
        @NameInMap("op")
        public String op;

        @NameInMap("region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>1664516888213680</p>
         */
        @NameInMap("uid")
        public String uid;

        public static UpdateFuncSwitchRecordRequestParams build(java.util.Map<String, ?> map) throws Exception {
            UpdateFuncSwitchRecordRequestParams self = new UpdateFuncSwitchRecordRequestParams();
            return TeaModel.build(map, self);
        }

        public UpdateFuncSwitchRecordRequestParams setArgs(UpdateFuncSwitchRecordRequestParamsArgs args) {
            this.args = args;
            return this;
        }
        public UpdateFuncSwitchRecordRequestParamsArgs getArgs() {
            return this.args;
        }

        public UpdateFuncSwitchRecordRequestParams setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public UpdateFuncSwitchRecordRequestParams setInstance(String instance) {
            this.instance = instance;
            return this;
        }
        public String getInstance() {
            return this.instance;
        }

        public UpdateFuncSwitchRecordRequestParams setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

        public UpdateFuncSwitchRecordRequestParams setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public UpdateFuncSwitchRecordRequestParams setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
