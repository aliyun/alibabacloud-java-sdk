// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class PodItem extends TeaModel {
    /**
     * <p>The time when the pod was created (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T14:36:01Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The time when the pod was completed (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T15:36:05Z</p>
     */
    @NameInMap("GmtFinishTime")
    public String gmtFinishTime;

    /**
     * <p>The time when the pod was started (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T14:36:05Z</p>
     */
    @NameInMap("GmtStartTime")
    public String gmtStartTime;

    /**
     * <p>The historical pods.</p>
     */
    @NameInMap("HistoryPods")
    public java.util.List<PodItem> historyPods;

    /**
     * <p>Pod Ip</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.1.2</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The name of the compute node where the pod is located.</p>
     * 
     * <strong>example:</strong>
     * <p>i-a</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <p>Pod Id</p>
     * 
     * <strong>example:</strong>
     * <p>dlc-20210126170216-mtl37ge7gkvdz-worker-0</p>
     */
    @NameInMap("PodId")
    public String podId;

    /**
     * <p>The IP address of the pod.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.1.2</p>
     */
    @NameInMap("PodIp")
    public String podIp;

    /**
     * <p>The IP addresses of the pod. For Lingjun AI Computing Service: user VPC net0, management VPC net, and pod-to-pod communication ethx. For general-purpose computing: user VPC eth1 with dedicated gateway default route, management VPC eth0 with public gateway default route, and pod-to-pod communication net eRDMA.</p>
     */
    @NameInMap("PodIps")
    public java.util.List<PodNetworkInterface> podIps;

    /**
     * <p>Pod Uid</p>
     * 
     * <strong>example:</strong>
     * <p>fe846462-af2c-4521-bd6f-96787a57591d</p>
     */
    @NameInMap("PodUid")
    public String podUid;

    /**
     * <p>The status of the pod.</p>
     * 
     * <strong>example:</strong>
     * <p>Stopped</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The substatus of the pod.</p>
     * 
     * <strong>example:</strong>
     * <p>Restarting</p>
     */
    @NameInMap("SubStatus")
    public String subStatus;

    /**
     * <p>The type of the pod.</p>
     * 
     * <strong>example:</strong>
     * <p>Worker</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The list of supported profiling types, separated by commas, such as sysom. An empty string indicates that profiling is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>sysom</p>
     */
    @NameInMap("supportedProfilingTypes")
    public String supportedProfilingTypes;

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

    public PodItem setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public PodItem setPodId(String podId) {
        this.podId = podId;
        return this;
    }
    public String getPodId() {
        return this.podId;
    }

    public PodItem setPodIp(String podIp) {
        this.podIp = podIp;
        return this;
    }
    public String getPodIp() {
        return this.podIp;
    }

    public PodItem setPodIps(java.util.List<PodNetworkInterface> podIps) {
        this.podIps = podIps;
        return this;
    }
    public java.util.List<PodNetworkInterface> getPodIps() {
        return this.podIps;
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

    public PodItem setSubStatus(String subStatus) {
        this.subStatus = subStatus;
        return this;
    }
    public String getSubStatus() {
        return this.subStatus;
    }

    public PodItem setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public PodItem setSupportedProfilingTypes(String supportedProfilingTypes) {
        this.supportedProfilingTypes = supportedProfilingTypes;
        return this;
    }
    public String getSupportedProfilingTypes() {
        return this.supportedProfilingTypes;
    }

}
