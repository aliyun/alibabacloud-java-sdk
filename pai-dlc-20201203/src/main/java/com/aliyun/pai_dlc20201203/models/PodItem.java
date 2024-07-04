// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class PodItem extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2021-01-12T14:36:01Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <strong>example:</strong>
     * <p>2021-01-12T15:36:05Z</p>
     */
    @NameInMap("GmtFinishTime")
    public String gmtFinishTime;

    /**
     * <strong>example:</strong>
     * <p>2021-01-12T14:36:05Z</p>
     */
    @NameInMap("GmtStartTime")
    public String gmtStartTime;

    @NameInMap("HistoryPods")
    public java.util.List<PodItem> historyPods;

    /**
     * <strong>example:</strong>
     * <p>10.0.1.2</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <strong>example:</strong>
     * <p>dlc-20210126170216-mtl37ge7gkvdz-worker-0</p>
     */
    @NameInMap("PodId")
    public String podId;

    /**
     * <strong>example:</strong>
     * <p>fe846462-af2c-4521-bd6f-96787a57591d</p>
     */
    @NameInMap("PodUid")
    public String podUid;

    /**
     * <strong>example:</strong>
     * <p>Stopped</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>Worker</p>
     */
    @NameInMap("Type")
    public String type;

    public static PodItem build(java.util.Map<String, ?> map) throws Exception {
        PodItem self = new PodItem();
        return TeaModel.build(map, self);
    }

    public PodItem setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public PodItem setGmtFinishTime(String gmtFinishTime) {
        this.gmtFinishTime = gmtFinishTime;
        return this;
    }
    public String getGmtFinishTime() {
        return this.gmtFinishTime;
    }

    public PodItem setGmtStartTime(String gmtStartTime) {
        this.gmtStartTime = gmtStartTime;
        return this;
    }
    public String getGmtStartTime() {
        return this.gmtStartTime;
    }

    public PodItem setHistoryPods(java.util.List<PodItem> historyPods) {
        this.historyPods = historyPods;
        return this;
    }
    public java.util.List<PodItem> getHistoryPods() {
        return this.historyPods;
    }

    public PodItem setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public PodItem setPodId(String podId) {
        this.podId = podId;
        return this;
    }
    public String getPodId() {
        return this.podId;
    }

    public PodItem setPodUid(String podUid) {
        this.podUid = podUid;
        return this;
    }
    public String getPodUid() {
        return this.podUid;
    }

    public PodItem setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PodItem setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
