// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetAbnormalEventsCountRequest extends TeaModel {
    /**
     * <p>Cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2ijff4be-bf24-4070-89ca-c47c879b0g32</p>
     */
    @NameInMap("cluster")
    public String cluster;

    /**
     * <p>End time.</p>
     * 
     * <strong>example:</strong>
     * <p>1725801327754</p>
     */
    @NameInMap("end")
    public Float end;

    /**
     * <p>Instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i-wz9d00ut2ska3mlyhn6j</p>
     */
    @NameInMap("instance")
    public String instance;

    /**
     * <p>Level of abnormal events.</p>
     * 
     * <strong>example:</strong>
     * <p>potential</p>
     */
    @NameInMap("level")
    public String level;

    /**
     * <p>The namespace where the Pod resides.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>Pod name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-pod</p>
     */
    @NameInMap("pod")
    public String pod;

    /**
     * <p>Whether to display Pod abnormal events.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("showPod")
    public Integer showPod;

    /**
     * <p>Start time.</p>
     * 
     * <strong>example:</strong>
     * <p>1725797727754</p>
     */
    @NameInMap("start")
    public Float start;

    public static GetAbnormalEventsCountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAbnormalEventsCountRequest self = new GetAbnormalEventsCountRequest();
        return TeaModel.build(map, self);
    }

    public GetAbnormalEventsCountRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public GetAbnormalEventsCountRequest setEnd(Float end) {
        this.end = end;
        return this;
    }
    public Float getEnd() {
        return this.end;
    }

    public GetAbnormalEventsCountRequest setInstance(String instance) {
        this.instance = instance;
        return this;
    }
    public String getInstance() {
        return this.instance;
    }

    public GetAbnormalEventsCountRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public GetAbnormalEventsCountRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetAbnormalEventsCountRequest setPod(String pod) {
        this.pod = pod;
        return this;
    }
    public String getPod() {
        return this.pod;
    }

    public GetAbnormalEventsCountRequest setShowPod(Integer showPod) {
        this.showPod = showPod;
        return this;
    }
    public Integer getShowPod() {
        return this.showPod;
    }

    public GetAbnormalEventsCountRequest setStart(Float start) {
        this.start = start;
        return this;
    }
    public Float getStart() {
        return this.start;
    }

}
