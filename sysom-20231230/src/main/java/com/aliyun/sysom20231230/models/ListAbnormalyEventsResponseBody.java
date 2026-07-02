// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListAbnormalyEventsResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <ul>
     * <li><code>code == Success</code> indicates that the authorization was successful.</li>
     * <li>Other status codes indicate that the authorization failed. Check the <code>message</code> field for the detailed fault information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("data")
    public java.util.List<ListAbnormalyEventsResponseBodyData> data;

    /**
     * <p>The error code description. This value is empty if no error occurred.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListAbnormalyEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAbnormalyEventsResponseBody self = new ListAbnormalyEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAbnormalyEventsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAbnormalyEventsResponseBody setData(java.util.List<ListAbnormalyEventsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAbnormalyEventsResponseBodyData> getData() {
        return this.data;
    }

    public ListAbnormalyEventsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAbnormalyEventsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListAbnormalyEventsResponseBodyDataOptsResult extends TeaModel {
        /**
         * <p>The diagnostic status.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The URL of the diagnostic details.</p>
         * 
         * <strong>example:</strong>
         * <p>/diagnose/result/PhfFg456</p>
         */
        @NameInMap("url")
        public String url;

        public static ListAbnormalyEventsResponseBodyDataOptsResult build(java.util.Map<String, ?> map) throws Exception {
            ListAbnormalyEventsResponseBodyDataOptsResult self = new ListAbnormalyEventsResponseBodyDataOptsResult();
            return TeaModel.build(map, self);
        }

        public ListAbnormalyEventsResponseBodyDataOptsResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAbnormalyEventsResponseBodyDataOptsResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListAbnormalyEventsResponseBodyDataOpts extends TeaModel {
        /**
         * <p>The operation type.</p>
         * 
         * <strong>example:</strong>
         * <p>diagnose</p>
         */
        @NameInMap("label")
        public String label;

        /**
         * <p>The diagnostic result of the anomaly item.</p>
         */
        @NameInMap("result")
        public ListAbnormalyEventsResponseBodyDataOptsResult result;

        /**
         * <p>The diagnostic type.</p>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("type")
        public String type;

        public static ListAbnormalyEventsResponseBodyDataOpts build(java.util.Map<String, ?> map) throws Exception {
            ListAbnormalyEventsResponseBodyDataOpts self = new ListAbnormalyEventsResponseBodyDataOpts();
            return TeaModel.build(map, self);
        }

        public ListAbnormalyEventsResponseBodyDataOpts setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListAbnormalyEventsResponseBodyDataOpts setResult(ListAbnormalyEventsResponseBodyDataOptsResult result) {
            this.result = result;
            return this;
        }
        public ListAbnormalyEventsResponseBodyDataOptsResult getResult() {
            return this.result;
        }

        public ListAbnormalyEventsResponseBodyDataOpts setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAbnormalyEventsResponseBodyDataRawMetrics extends TeaModel {
        /**
         * <p>The end time.</p>
         * 
         * <strong>example:</strong>
         * <p>1761814928</p>
         */
        @NameInMap("end_time")
        public Float endTime;

        /**
         * <p>The list of metric values.</p>
         */
        @NameInMap("metrics")
        public java.util.List<String> metrics;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>1761814928</p>
         */
        @NameInMap("start_time")
        public Float startTime;

        public static ListAbnormalyEventsResponseBodyDataRawMetrics build(java.util.Map<String, ?> map) throws Exception {
            ListAbnormalyEventsResponseBodyDataRawMetrics self = new ListAbnormalyEventsResponseBodyDataRawMetrics();
            return TeaModel.build(map, self);
        }

        public ListAbnormalyEventsResponseBodyDataRawMetrics setEndTime(Float endTime) {
            this.endTime = endTime;
            return this;
        }
        public Float getEndTime() {
            return this.endTime;
        }

        public ListAbnormalyEventsResponseBodyDataRawMetrics setMetrics(java.util.List<String> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<String> getMetrics() {
            return this.metrics;
        }

        public ListAbnormalyEventsResponseBodyDataRawMetrics setStartTime(Float startTime) {
            this.startTime = startTime;
            return this;
        }
        public Float getStartTime() {
            return this.startTime;
        }

    }

    public static class ListAbnormalyEventsResponseBodyData extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1725801090000</p>
         */
        @NameInMap("created_at")
        public Long createdAt;

        /**
         * <p>The detailed description of the anomaly item.</p>
         * 
         * <strong>example:</strong>
         * <p>节点发生OOM, 可查看OOM发生原因</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The diagnostic status. Valid values:</p>
         * <ul>
         * <li>1: diagnosis ready.</li>
         * <li>2: diagnosis in progress.</li>
         * <li>3: diagnosis completed.</li>
         * <li>4: not diagnosable.</li>
         * <li>5: diagnosis failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("diag_status")
        public Integer diagStatus;

        /**
         * <p>The end time of the anomaly event.</p>
         * 
         * <strong>example:</strong>
         * <p>1725797727754</p>
         */
        @NameInMap("end_at")
        public Long endAt;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-wz9d00ut2ska3mlyhn6j</p>
         */
        @NameInMap("instance")
        public String instance;

        /**
         * <p>The name of the anomaly item.</p>
         * 
         * <strong>example:</strong>
         * <p>节点CPU使用率检测</p>
         */
        @NameInMap("item")
        public String item;

        /**
         * <p>The level of the anomaly item.</p>
         * 
         * <strong>example:</strong>
         * <p>potential</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>The namespace of the pod.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>The list of operations for the anomaly item.</p>
         */
        @NameInMap("opts")
        public java.util.List<ListAbnormalyEventsResponseBodyDataOpts> opts;

        /**
         * <p>The pod name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-pod</p>
         */
        @NameInMap("pod")
        public String pod;

        /**
         * <p>The raw metrics.</p>
         */
        @NameInMap("raw_metrics")
        public ListAbnormalyEventsResponseBodyDataRawMetrics rawMetrics;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("region_id")
        public String regionId;

        /**
         * <p>The type of the anomaly item.</p>
         * 
         * <strong>example:</strong>
         * <p>saturation</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The UUID of the anomaly event.</p>
         * 
         * <strong>example:</strong>
         * <p>43f05b46-1034-42e8-a528-6e5ca1108277</p>
         */
        @NameInMap("uuid")
        public String uuid;

        public static ListAbnormalyEventsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAbnormalyEventsResponseBodyData self = new ListAbnormalyEventsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAbnormalyEventsResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public ListAbnormalyEventsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAbnormalyEventsResponseBodyData setDiagStatus(Integer diagStatus) {
            this.diagStatus = diagStatus;
            return this;
        }
        public Integer getDiagStatus() {
            return this.diagStatus;
        }

        public ListAbnormalyEventsResponseBodyData setEndAt(Long endAt) {
            this.endAt = endAt;
            return this;
        }
        public Long getEndAt() {
            return this.endAt;
        }

        public ListAbnormalyEventsResponseBodyData setInstance(String instance) {
            this.instance = instance;
            return this;
        }
        public String getInstance() {
            return this.instance;
        }

        public ListAbnormalyEventsResponseBodyData setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public ListAbnormalyEventsResponseBodyData setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListAbnormalyEventsResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListAbnormalyEventsResponseBodyData setOpts(java.util.List<ListAbnormalyEventsResponseBodyDataOpts> opts) {
            this.opts = opts;
            return this;
        }
        public java.util.List<ListAbnormalyEventsResponseBodyDataOpts> getOpts() {
            return this.opts;
        }

        public ListAbnormalyEventsResponseBodyData setPod(String pod) {
            this.pod = pod;
            return this;
        }
        public String getPod() {
            return this.pod;
        }

        public ListAbnormalyEventsResponseBodyData setRawMetrics(ListAbnormalyEventsResponseBodyDataRawMetrics rawMetrics) {
            this.rawMetrics = rawMetrics;
            return this;
        }
        public ListAbnormalyEventsResponseBodyDataRawMetrics getRawMetrics() {
            return this.rawMetrics;
        }

        public ListAbnormalyEventsResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListAbnormalyEventsResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAbnormalyEventsResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
