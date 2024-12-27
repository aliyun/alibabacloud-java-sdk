// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListAbnormalyEventsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1808078950770264</p>
     */
    @NameInMap("cluster")
    public String cluster;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("current")
    public Integer current;

    /**
     * <strong>example:</strong>
     * <p>1725801327754</p>
     */
    @NameInMap("end")
    public Float end;

    /**
     * <strong>example:</strong>
     * <p>i-wz9d00ut2ska3mlyhn6j</p>
     */
    @NameInMap("instance")
    public String instance;

    /**
     * <strong>example:</strong>
     * <p>potential</p>
     */
    @NameInMap("level")
    public String level;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>test-pod</p>
     */
    @NameInMap("pod")
    public String pod;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("showPod")
    public Integer showPod;

    /**
     * <strong>example:</strong>
     * <p>1725797727754</p>
     */
    @NameInMap("start")
    public Float start;

    public static ListAbnormalyEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAbnormalyEventsRequest self = new ListAbnormalyEventsRequest();
        return TeaModel.build(map, self);
    }

    public ListAbnormalyEventsRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public ListAbnormalyEventsRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ListAbnormalyEventsRequest setEnd(Float end) {
        this.end = end;
        return this;
    }
    public Float getEnd() {
        return this.end;
    }

    public ListAbnormalyEventsRequest setInstance(String instance) {
        this.instance = instance;
        return this;
    }
    public String getInstance() {
        return this.instance;
    }

    public ListAbnormalyEventsRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public ListAbnormalyEventsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListAbnormalyEventsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAbnormalyEventsRequest setPod(String pod) {
        this.pod = pod;
        return this;
    }
    public String getPod() {
        return this.pod;
    }

    public ListAbnormalyEventsRequest setShowPod(Integer showPod) {
        this.showPod = showPod;
        return this;
    }
    public Integer getShowPod() {
        return this.showPod;
    }

    public ListAbnormalyEventsRequest setStart(Float start) {
        this.start = start;
        return this;
    }
    public Float getStart() {
        return this.start;
    }

}
