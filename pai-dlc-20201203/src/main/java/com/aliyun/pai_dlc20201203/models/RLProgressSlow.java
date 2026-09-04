// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLProgressSlow extends TeaModel {
    /**
     * <p>慢推理明细，最多 20 条</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Elapsed&quot;:42.5,&quot;Time&quot;:1787474487,&quot;Message&quot;:&quot;rollout generation slow&quot;,&quot;Rank&quot;:0,&quot;Pod&quot;:&quot;dlc193cpaitk8eny-master-0&quot;,&quot;WorkerPid&quot;:12345,&quot;Ip&quot;:&quot;192.168.0.12&quot;,&quot;Rid&quot;:&quot;req-8f3a2c1d&quot;,&quot;TokenizerPid&quot;:&quot;12360&quot;,&quot;Ipc&quot;:&quot;ipc://worker-0&quot;,&quot;IsPause&quot;:&quot;false&quot;,&quot;StatePresent&quot;:&quot;true&quot;,&quot;OutQueue&quot;:&quot;3&quot;}]</p>
     */
    @NameInMap("Details")
    public java.util.List<RLProgressSlowDetail> details;

    /**
     * <p>最慢一条的已耗时（秒）</p>
     * 
     * <strong>example:</strong>
     * <p>42.5</p>
     */
    @NameInMap("Elapsed")
    public Double elapsed;

    /**
     * <p>最慢一条的日志时间（unix 秒）</p>
     * 
     * <strong>example:</strong>
     * <p>1787474487</p>
     */
    @NameInMap("Time")
    public Long time;

    public static RLProgressSlow build(java.util.Map<String, ?> map) throws Exception {
        RLProgressSlow self = new RLProgressSlow();
        return TeaModel.build(map, self);
    }

    public RLProgressSlow setDetails(java.util.List<RLProgressSlowDetail> details) {
        this.details = details;
        return this;
    }
    public java.util.List<RLProgressSlowDetail> getDetails() {
        return this.details;
    }

    public RLProgressSlow setElapsed(Double elapsed) {
        this.elapsed = elapsed;
        return this;
    }
    public Double getElapsed() {
        return this.elapsed;
    }

    public RLProgressSlow setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

}
