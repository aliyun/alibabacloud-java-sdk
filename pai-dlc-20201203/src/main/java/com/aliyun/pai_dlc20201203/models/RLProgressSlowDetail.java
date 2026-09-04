// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLProgressSlowDetail extends TeaModel {
    /**
     * <p>The elapsed time of the request, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>42.5</p>
     */
    @NameInMap("Elapsed")
    public Double elapsed;

    /**
     * <p>worker IP</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.12</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The IPC channel identifier, which corresponds to the ipc field in the log.</p>
     * 
     * <strong>example:</strong>
     * <p>ipc://worker-0</p>
     */
    @NameInMap("Ipc")
    public String ipc;

    /**
     * <p>Indicates whether the request is paused. This is the raw value of the is_pause field in the log.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsPause")
    public String isPause;

    /**
     * <p>The log message, truncated to 700 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>CUDA out of memory. Tried to allocate 2.00 GiB</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The output queue length. This is the raw value of the out_queue field in the log.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("OutQueue")
    public String outQueue;

    /**
     * <p>The name of the pod.</p>
     * 
     * <strong>example:</strong>
     * <p>dlc193cpaitk8eny-master-0</p>
     */
    @NameInMap("Pod")
    public String pod;

    /**
     * <p>The training rank.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Rank")
    public Integer rank;

    /**
     * <p>The inference request ID, which corresponds to the rid field in the log.</p>
     * 
     * <strong>example:</strong>
     * <p>req-8f3a2c1d</p>
     */
    @NameInMap("Rid")
    public String rid;

    /**
     * <p>Indicates whether the state is present. This is the raw value of the state_present field in the log.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("StatePresent")
    public String statePresent;

    /**
     * <p>The log time, in UNIX seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1787474487</p>
     */
    @NameInMap("Time")
    public Long time;

    /**
     * <p>The tokenizer process ID, which corresponds to the pid field in the log.</p>
     * 
     * <strong>example:</strong>
     * <p>12360</p>
     */
    @NameInMap("TokenizerPid")
    public String tokenizerPid;

    /**
     * <p>The worker process ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("WorkerPid")
    public Integer workerPid;

    public static RLProgressSlowDetail build(java.util.Map<String, ?> map) throws Exception {
        RLProgressSlowDetail self = new RLProgressSlowDetail();
        return TeaModel.build(map, self);
    }

    public RLProgressSlowDetail setElapsed(Double elapsed) {
        this.elapsed = elapsed;
        return this;
    }
    public Double getElapsed() {
        return this.elapsed;
    }

    public RLProgressSlowDetail setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public RLProgressSlowDetail setIpc(String ipc) {
        this.ipc = ipc;
        return this;
    }
    public String getIpc() {
        return this.ipc;
    }

    public RLProgressSlowDetail setIsPause(String isPause) {
        this.isPause = isPause;
        return this;
    }
    public String getIsPause() {
        return this.isPause;
    }

    public RLProgressSlowDetail setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RLProgressSlowDetail setOutQueue(String outQueue) {
        this.outQueue = outQueue;
        return this;
    }
    public String getOutQueue() {
        return this.outQueue;
    }

    public RLProgressSlowDetail setPod(String pod) {
        this.pod = pod;
        return this;
    }
    public String getPod() {
        return this.pod;
    }

    public RLProgressSlowDetail setRank(Integer rank) {
        this.rank = rank;
        return this;
    }
    public Integer getRank() {
        return this.rank;
    }

    public RLProgressSlowDetail setRid(String rid) {
        this.rid = rid;
        return this;
    }
    public String getRid() {
        return this.rid;
    }

    public RLProgressSlowDetail setStatePresent(String statePresent) {
        this.statePresent = statePresent;
        return this;
    }
    public String getStatePresent() {
        return this.statePresent;
    }

    public RLProgressSlowDetail setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

    public RLProgressSlowDetail setTokenizerPid(String tokenizerPid) {
        this.tokenizerPid = tokenizerPid;
        return this;
    }
    public String getTokenizerPid() {
        return this.tokenizerPid;
    }

    public RLProgressSlowDetail setWorkerPid(Integer workerPid) {
        this.workerPid = workerPid;
        return this;
    }
    public Integer getWorkerPid() {
        return this.workerPid;
    }

}
