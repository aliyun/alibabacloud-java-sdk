// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListProbeTaskRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the probe task.</p>
     * 
     * <strong>example:</strong>
     * <p>probe-****</p>
     */
    @NameInMap("ProbeTaskId")
    public String probeTaskId;

    /**
     * <p>The protocol of the probe task. Valid values:</p>
     * <ul>
     * <li><strong>ICMP</strong></li>
     * <li><strong>TCP</strong></li>
     * <li><strong>HTTP</strong></li>
     * </ul>
     * <blockquote>
     * <p> Tasks that probe private networks support only ICMP and TCP.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ICMP</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The region ID of the SAG instance.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/69813.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the SAG instance.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-****</p>
     */
    @NameInMap("SagId")
    public String sagId;

    /**
     * <p>The name of the SAG instance.</p>
     * 
     * <strong>example:</strong>
     * <p>shanghai-office</p>
     */
    @NameInMap("SagName")
    public String sagName;

    /**
     * <p>The serial number of the SAG device.</p>
     * 
     * <strong>example:</strong>
     * <p>sag****</p>
     */
    @NameInMap("Sn")
    public String sn;

    /**
     * <p>The name of the probe task.</p>
     * 
     * <strong>example:</strong>
     * <p>test-ping</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static ListProbeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProbeTaskRequest self = new ListProbeTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListProbeTaskRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProbeTaskRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProbeTaskRequest setProbeTaskId(String probeTaskId) {
        this.probeTaskId = probeTaskId;
        return this;
    }
    public String getProbeTaskId() {
        return this.probeTaskId;
    }

    public ListProbeTaskRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public ListProbeTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListProbeTaskRequest setSagId(String sagId) {
        this.sagId = sagId;
        return this;
    }
    public String getSagId() {
        return this.sagId;
    }

    public ListProbeTaskRequest setSagName(String sagName) {
        this.sagName = sagName;
        return this;
    }
    public String getSagName() {
        return this.sagName;
    }

    public ListProbeTaskRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public ListProbeTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
